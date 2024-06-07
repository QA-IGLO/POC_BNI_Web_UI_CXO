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

WebUI.takeScreenshotAsCheckpoint('NPWPInputAlphanumeri_Before')

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.1_input_NPWP_onboardPermitsDto.npwp'), 'qwertyuiopsdfghjkl')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_OnBoardingNegative/negative_TC_065_NPWPAlphaNumerik'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

CustomKeywords.'upload_File.Robot_Tab.actionTab'()

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('NPWPAlphaNumerik1')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/8.2_label_Tempat Dikeluarkan Identitas'))

WebUI.delay(5)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/8.3_input_Tempat Dikeluarkan Identitas_onboardP_54807e'), 'Bekasi')

WebUI.delay(10)

WebUI.takeFullPageScreenshotAsCheckpoint('NPWPInputAlphaNumerikAfter')

WebUI.delay(5)

