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

WebUI.delay(2)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/8.16_input_Nomor Izin Usaha NIB_onboardPermitsD_df6ad9'), '12345678901234')

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('SCXO_No_OTP/Page_Onboarding/negative_TC_070_NIBMaxDigit'), 5)

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('SCXO_No_OTP/Page_Onboarding/negative_TC_070_NIBMaxDigit'), 5)

WebUI.delay(5)

WebUI.takeElementScreenshotAsCheckpoint('NIBMax13Digit', findTestObject('SCXO_No_OTP/Page_Onboarding/negative_TC_070_NIBMaxDigit'))

WebUI.delay(10)

WebUI.takeFullPageScreenshotAsCheckpoint('NIBMax13Digit')

WebUI.delay(5)

