package emailUtility

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import javax.mail.BodyPart as BodyPart
import javax.mail.Folder as Folder
import javax.mail.Message as Message
import javax.mail.Session as Session
import javax.mail.Store as Store
import javax.mail.internet.MimeMultipart as MimeMultipart
import org.jsoup.Jsoup as Jsoup
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import internal.GlobalVariable
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.mail.search.*;

public class Utils {

	private static String configFilePath = "Include/config/properties.json"
	private static ObjectMapper mapper = new ObjectMapper()


	//load properties
	//select strategy
	//
	@Keyword
	public static String fetchOTPfromEmail(String username,String password, String emailService) {
		String OTP=''
		Properties properties = new Properties()
		String subjectEmail
		String hostName
		String folder

		try {
			JsonNode emailProp = mapper.readTree(new File(configFilePath))
			hostName=emailProp.get(emailService).get("host").asText()
			subjectEmail=emailProp.get(emailService).get("subject").asText()
			folder=emailProp.get(emailService).get("folder").asText()
			emailProp.get(emailService).get("properties").fields().each{ prop ->
				properties.put(prop.key, prop.value)
			}
		} catch (IOException e) {
			e.printStackTrace()
		}


		Session session = Session.getDefaultInstance(properties, null)
		Store store = session.getStore('imaps')
		store.connect(hostName, username, password)

		Folder emailFolder = store.getFolder(folder)

		emailFolder.open(Folder.READ_ONLY)
		SearchTerm searchTerm = new SubjectTerm(subjectEmail);
		Message message = emailFolder.search(searchTerm)[emailFolder.search(searchTerm).length-1]
		Object content = message.getContent()
		if (content instanceof String) {
			OTP = extractOTP(content)
		} else if (content instanceof MimeMultipart) {
			OTP = extractOTP(getMutipartMessage(content))
		}

		return(OTP)
	}


	@Keyword
	def static getMutipartMessage(MimeMultipart mimeMultipart) {
		String result = ''
		System.out.println()
		int count = mimeMultipart.getCount()

		for (def j : (0..count - 1)) {
			BodyPart bodyPart = mimeMultipart.getBodyPart(j)
			if (bodyPart.isMimeType('text/plain')) {
				result = ((result + '\n') + bodyPart.getContent())

				break
			} else if (bodyPart.isMimeType('text/html')) {
				String html = ((bodyPart.getContent()) as String)

				result = ((result + '\n') + Jsoup.parse(html).text())
			} else if (bodyPart.getContent() instanceof MimeMultipart){
				result = getMutipartMessage((MimeMultipart)bodyPart.getContent());
			}
			return result;
		}

		return result
	}

	@Keyword
	def static extractOTP(String msgcontent) {
		Pattern p1 = Pattern.compile('Kode Anda adalah: ([0-9]+)')

		Matcher m1 = p1.matcher(msgcontent)

		if (m1.find()) {
			return m1.group(1)
		}
	}
}
