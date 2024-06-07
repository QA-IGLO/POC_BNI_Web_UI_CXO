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

WebUI.takeFullPageScreenshotAsCheckpoint('NoAktePengesahanKosongBefore')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.1_input_NPWP_onboardPermitsDto.npwp'), '1234567890123456')

WebUI.delay(2)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/8.2_label_Tempat Dikeluarkan Identitas'))

WebUI.delay(10)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/8.3_input_Tempat Dikeluarkan Identitas_onboardP_54807e'), 'Bekasi')

WebUI.delay(5)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/8.4_input_Nomor Akte Pengesahan_onboardPermitsD_8b3cf4'), '')

WebUI.delay(10)

CustomKeywords.'upload_File.Robot_Tab.actionTab'()

WebUI.delay(10)

WebUI.click(findTestObject('SCXO_No_OTP/Page_OnBoardingNegative/negative_TC_068_NoAktePengesahan'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

CustomKeywords.'upload_File.Robot_Tab.actionTab'()

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('SCXO_No_OTP/Page_OnBoardingNegative/negative_msg_TC068'), 10)

WebUI.delay(10)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/8.5_input_Tanggal Pengesahan_onboardPermitsDto._add01d'), '2020-06-06')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/8.6_div_29'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('Akte Pengesahan tidak boleh kosong')

WebUI.delay(10)

WebUI.takeFullPageScreenshotAsCheckpoint('NoAktePengesahanKosongAfter')

WebUI.delay(10)

