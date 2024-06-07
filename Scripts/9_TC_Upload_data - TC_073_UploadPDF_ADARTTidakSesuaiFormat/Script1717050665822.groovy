import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.Alert as Alert
import org.openqa.selenium.WebDriver as WebDriver

//WebUI.uploadFile(findTestObject('Object Repository/BNI CSO/Page_BNIDirect/img'),'E:\2024\POC BNI\Find XPath in IE Browser.pdf'')
WebUI.delay(5)

WebUI.takeFullPageScreenshotAsCheckpoint('uploadImageBefore')

WebUI.delay(5)

CustomKeywords.'upload_File.upload_file.uploadTidakSesuaiFormat'('C:\\Users\\1556\\Downloads\\Error Upload\\tidakSesuaiFormat.txt', 
    findTestObject('SCXO_No_OTP/Page_Onboarding/img_ADART'))

// WebUI.verifyTextPresent('File tidak valid. Mohon unggah file PDF.', false)
// Creating an instance o
WebUI.delay(5)

