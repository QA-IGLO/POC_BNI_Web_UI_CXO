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

WebUI.takeFullPageScreenshotAsCheckpoint('Alamat Perusahaan_KelHarusDiisi11')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/7.1_select_Pilih NegaraIndonesia'), 
    '1', true)

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('SCXO_No_OTP/Page_Onboarding/7.2_select_Pilih ProvinsiKalimantan SelatanKali_d34dfd - Copy'), 
    '6', true)

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('SCXO_No_OTP/Page_Onboarding/7.3_select_Pilih KotaKepulauan SeribuJakarta Pu_905aab'), 
    '298', true)

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('SCXO_No_OTP/Page_Onboarding/7.4_select_Pilih KecamatanJohar BaruSawah Besar_704bf6'), 
    '1612', true)

WebUI.delay(10)

WebUI.click(findTestObject('SCXO_No_OTP/Page_OnBoardingNegative/negative_TC_060_Kelurahankosong'))

WebUI.delay(10)

CustomKeywords.'upload_File.Robot_Tab.actionTab'()

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('SCXO_No_OTP/Page_OnBoardingNegative/negative_msg_TC060'), 10)

WebUI.delay(10)

CustomKeywords.'upload_File.Robot_Tab.actionTab'()

WebUI.delay(10)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/7.9_textarea_Jl. Pembangunan Raya No.78 Blok AJ_ccb805'), 'Jl. Pembangunan Raya No.78 Blok AJ RT10 RW06')

WebUI.delay(10)

WebUI.takeFullPageScreenshotAsCheckpoint('Alamat Perusahaan Kel HarusDiisi After')

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

