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

//WebUI.waitForElementPresent(findTestObject('BNI CSO/Page_BNIDirect/input_text'), 0)
WebUI.verifyElementPresent(findTestObject('BNI CSO/Page_BNIDirect/OTP_Verif/div_otp'), 5)

WebUI.takeFullPageScreenshotAsCheckpoint('Ver1')

WebUI.callTestCase(findTestCase('TC_GET_OTP/from_email/TC_GET_OTP'), [('email') : GlobalVariable.email, ('password') : GlobalVariable.email_password
        , ('email_provider') : GlobalVariable.email_provider], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

String txtOTP = GlobalVariable.otp

WebUI.setText(findTestObject('BNI CSO/Page_BNIDirect/OTP_Verif/input_otp_1'), txtOTP[0])

WebUI.setText(findTestObject('BNI CSO/Page_BNIDirect/OTP_Verif/input_otp_2'), txtOTP[1])

WebUI.setText(findTestObject('BNI CSO/Page_BNIDirect/OTP_Verif/input_otp_3'), txtOTP[2])

WebUI.setText(findTestObject('BNI CSO/Page_BNIDirect/OTP_Verif/input_otp_4'), txtOTP[3])

WebUI.setText(findTestObject('BNI CSO/Page_BNIDirect/OTP_Verif/input_otp_5'), txtOTP[4])

WebUI.setText(findTestObject('BNI CSO/Page_BNIDirect/OTP_Verif/input_otp_6'), txtOTP[5])

WebUI.delay(5)

WebUI.takeFullPageScreenshotAsCheckpoint('Ver2')

WebUI.delay(5)

if (GlobalVariable.is_use_otp == true) {
    WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))
} else {
    WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Atas'))
}

