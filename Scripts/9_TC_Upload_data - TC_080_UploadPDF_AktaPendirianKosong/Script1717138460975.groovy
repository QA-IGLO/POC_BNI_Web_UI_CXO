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

//WebUI.uploadFile(findTestObject('Object Repository/BNI CSO/Page_BNIDirect/img'),'E:\2024\POC BNI\Find XPath in IE Browser.pdf'')
WebUI.delay(5)

WebUI.takeFullPageScreenshotAsCheckpoint('uploadImageBefore')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/img_ADART'))

WebUI.delay(1)

CustomKeywords.'upload_File.upload_file.uploadFileKosong'('')

WebUI.delay(1)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/img_NIB1'))

WebUI.delay(5)

CustomKeywords.'upload_File.upload_file.uploadFileKosong'('')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/img_KTP_Direksi'))

WebUI.delay(5)

CustomKeywords.'upload_File.upload_file.uploadFileKosong'('')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/img_AktePendirian'))

WebUI.delay(5)

CustomKeywords.'upload_File.upload_file.uploadFileKosong'('')

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/img_NPWP'))

WebUI.delay(5)

CustomKeywords.'upload_File.upload_file.uploadFileKosong'('')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/img_AktePerubahanTerakhir'))

WebUI.delay(5)

CustomKeywords.'upload_File.upload_file.uploadFileKosong'('')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/img_KTP'))

WebUI.delay(5)

CustomKeywords.'upload_File.upload_file.uploadFileKosong'('')

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/img_SuratKeteranganDomisili'))

WebUI.delay(5)

CustomKeywords.'upload_File.upload_file.uploadFileKosong'('')

WebUI.delay(2)

WebUI.click(findTestObject('BNI CSO/Page_BNIDirect/img - ttd'))

CustomKeywords.'upload_File.upload_file.uploadFileKosong'('')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/9.1_check_verifyUploadFile'))

WebUI.delay(2)

WebUI.takeFullPageScreenshotAsCheckpoint('UploadDataAfter - Upload Akta Pendirian Kosong')

WebUI.delay(5)

