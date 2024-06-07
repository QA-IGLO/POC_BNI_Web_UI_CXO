import javax.mail.BodyPart as BodyPart
import javax.mail.Folder as Folder
import javax.mail.Message as Message
import javax.mail.Session as Session
import javax.mail.Store as Store
import javax.mail.internet.MimeMultipart as MimeMultipart
import org.jsoup.Jsoup

import groovy.console.ui.SystemOutputInterceptor

import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
import internal.GlobalVariable as GlobalVariable

String mailFolderName = 'INBOX'

String emailSubjectContent = 'Registrasi Giro BNI Kode OTP'

String emailContent = 'Registrasi Giro BNI Kode OTP'

int lengthOfOTP = 5

String hostName = 'outlook.office365.com' //change it according to your mail

//String username = 'Aseplamri12@outlook.com' //username

//String password = 'Aseplamri_12'

String username = 'indocyber.katalon@outlook.com' //username

String password = 'Iglo@123'

String searchText = null

Properties sysProps = new Properties()

sysProps.put('mail.store.protocol', 'imaps')

sysProps.put('mail.imaps.socketFactory.class', 'javax.net.ssl.SSLSocketFactory')

sysProps.put('mail.imaps.socketFactory.fallback', 'false')

sysProps.put('mail.imaps.port', '993')

sysProps.put('mail.imaps.socketFactory.port', '993')

Session session = Session.getDefaultInstance(sysProps, null)

//session.setDebug(true)
Store store = session.getStore('imaps')

store.connect(hostName, username, password)

Folder emailFolder = store.getFolder('INBOX')

emailFolder.open(Folder.READ_ONLY)

// retrieve the messages from the folder in an array and print it
Message[] messages = emailFolder.getMessages()

System.out.println('messages.length---' + messages.length)

int msglen = messages.length - 1

for (int i = msglen; i >= 0; i--) {
    Message message = messages[i]

    System.out.println('---------------------------------')

    //System.out.println('Email Number ' + (i + 1))
    //System.out.println('Subject: ' + message.getSubject())
    //System.out.println('From: ' + (message.getFrom()[0]))
    Object content = message.getContent()
	System.out.println("isi content" + content);

    if (message.getSubject().startsWith('Registrasi Giro BNI Kode OTP')) {
        if (content instanceof String) {
            System.out.println('Email Number ' + (i + 1))

            System.out.println('Subject: ' + message.getSubject())

            System.out.println('From: ' + (message.getFrom()[0]))

            System.out.println('Text: ' + content)

            break
        } else if (content instanceof MimeMultipart) {
            System.out.println('Email Number ' + (i + 1))

            System.out.println('Subject: ' + message.getSubject())

            System.out.println('From: ' + (message.getFrom()[0]))

            System.out.println('Text: ' + getMutipartMessage(content))

            intOTP = extractOTP(getMutipartMessage(content))

            System.out.println('OTP from Outlook is: ' + intOTP)
			
			GlobalVariable.otp = intOTP
			
            break
        }
    }
}

//close the store and folder objects
emailFolder.close(false)

store.close()

def getMutipartMessage(MimeMultipart mimeMultipart) {
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

def extractOTP(String msgcontent) {
    Pattern p1 = Pattern.compile('Kode Anda adalah: ([0-9]+)')

    Matcher m1 = p1.matcher(msgcontent)

    if (m1.find()) {
        return m1.group(1)
    }
}

