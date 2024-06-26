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

WebUI.delay(5)

WebUI.takeFullPageScreenshotAsCheckpoint('DetPer1')

WebUI.delay(5)

CustomKeywords.'upload_File.Robot_Tab.actionTab'()

WebUI.delay(15)

WebUI.selectOptionByValue(findTestObject('SCXO_No_OTP/Page_Onboarding/6.1_select_Pilih Bentuk Badan UsahaPTInstansi'), '1', 
    true)

WebUI.delay(5)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/6.2_input_Nama Perusahaan'), '')

WebUI.delay(3)

CustomKeywords.'upload_File.Robot_Tab.actionTab'()

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('SCXO_No_OTP/Page_OnBoardingNegative/negative_msg_TC050'), 5)

WebUI.delay(3)

WebUI.takeElementScreenshot(findTestObject('SCXO_No_OTP/Page_OnBoardingNegative/negative_msg_TC050'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.takeFullPageScreenshotAsCheckpoint('NamaPerusahaanKosong')

WebUI.delay(5)

