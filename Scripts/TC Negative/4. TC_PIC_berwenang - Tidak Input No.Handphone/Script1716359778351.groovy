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

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/BNI CSO/Page_BNIDirect/button_Selanjutnya'), 5)

WebUI.delay(5)

CustomKeywords.'upload_File.screenshoot.screenshotPage'('PICBerwenangBefore')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/4.1_div_ADART'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/4.2_input_Nama Orang Yang Berwenang_onboardDto._e0a54b'), 
    'Amrudin Effendi Putra')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/4.4_input_Email Personal_onboardDto.authPersonEmail'), 
    'sylvia@ekreasi.com')

WebUI.delay(5)

CustomKeywords.'upload_File.screenshoot.screenshotPage'('PICBerwenangAfter')

WebUI.delay(5)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

