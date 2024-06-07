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

WebUI.takeFullPageScreenshotAsCheckpoint('AlamatLengkapBefore')

WebUI.click(findTestObject('SCXO_No_OTP/Page_OnBoardingNegative/negative_TC_056_NegaraKosong'))

WebUI.delay(2)

CustomKeywords.'upload_File.Robot_Tab.actionTab'()

WebUI.delay(2)

WebUI.click(findTestObject('SCXO_No_OTP/Page_OnBoardingNegative/negative_TC_057_PropinsiKosong'))

CustomKeywords.'upload_File.Robot_Tab.actionTab'()

WebUI.delay(2)

WebUI.click(findTestObject('SCXO_No_OTP/Page_OnBoardingNegative/negative_TC_058_Kotakosong'))

WebUI.delay(2)

CustomKeywords.'upload_File.Robot_Tab.actionTab'()

WebUI.delay(2)

WebUI.click(findTestObject('SCXO_No_OTP/Page_OnBoardingNegative/negative_TC_059_Kecamatankosong'))

WebUI.delay(2)

CustomKeywords.'upload_File.Robot_Tab.actionTab'()

WebUI.delay(2)

WebUI.click(findTestObject('SCXO_No_OTP/Page_OnBoardingNegative/negative_TC_060_Kelurahankosong'))

WebUI.delay(2)

CustomKeywords.'upload_File.Robot_Tab.actionTab'()

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_OnBoardingNegative/negative_TC_062_KodePosKosong'))

WebUI.delay(5)

CustomKeywords.'upload_File.Robot_Tab.actionTab'()

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_OnBoardingNegative/negative_TC_061_AlamatLengkapKosong'))

WebUI.delay(5)

CustomKeywords.'upload_File.Robot_Tab.actionTab'()

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_OnBoardingNegative/negative_TC_063_NoTelpPerusahaanKosong'))

WebUI.delay(5)

CustomKeywords.'upload_File.Robot_Tab.actionTab'()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/BNI CSO/Page_BNIDirect/label_Alamat Email Perusahaan'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/7_11.input_Alamat Email Perusahaan_onboardDto.compEmail'), 
    'sylvia@ekreasi.com')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/7.12_input_Alamat Website Perusahaan'), 'http://www.cahayausaharakyat.com')

WebUI.delay(5)

WebUI.takeFullPageScreenshotAsCheckpoint('AlamatLengkapAfter')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Atas'))

WebUI.delay(5)

