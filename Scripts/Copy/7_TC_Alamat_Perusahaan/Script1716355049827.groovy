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

WebUI.scrollToElement(findTestObject('Object Repository/BNI CSO/Page_BNIDirect/button_Selanjutnya'), 5)

WebUI.delay(5)

WebUI.takeFullPageScreenshotAsCheckpoint('AlamatPerusahaanBefore')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/7.1_select_Pilih NegaraIndonesia'), 
    '1', true)

WebUI.delay(5)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('SCXO_No_OTP/Page_Onboarding/7.2_select_Pilih ProvinsiKalimantan SelatanKali_d34dfd - Copy'), 
    '6', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('SCXO_No_OTP/Page_Onboarding/7.3_select_Pilih KotaKepulauan SeribuJakarta Pu_905aab'), 
    '298', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('SCXO_No_OTP/Page_Onboarding/7.4_select_Pilih KecamatanJohar BaruSawah Besar_704bf6'), 
    '1612', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('SCXO_No_OTP/Page_Onboarding/7.5_select_Pilih KelurahanBungurKenariKramatKwi_7e0e84'), 
    '92353', true)

WebUI.delay(2)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/7.9_textarea_Jl. Pembangunan Raya No.78 Blok AJ_ccb805'), 'Jl. Pembangunan Raya No.78 Blok AJ RT10 RW06')

WebUI.delay(2)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/7_10_input_Nomor Telepon Perusahaan'), '08123456789876')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BNI CSO/Page_BNIDirect/label_Alamat Email Perusahaan'))

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/7_11.input_Alamat Email Perusahaan_onboardDto.compEmail'), 
    'sylvia@ekreasi.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/7.12_input_Alamat Website Perusahaan'), 'www.cahayausaharakyat.com')

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/BNI CSO/Page_BNIDirect/button_Selanjutnya'), 5)

WebUI.delay(5)

WebUI.takeFullPageScreenshotAsCheckpoint('AlamatPerusahaanAfter')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

