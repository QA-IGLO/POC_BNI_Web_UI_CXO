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

WebUI.delay(4)

WebUI.takeFullPageScreenshotAsCheckpoint('Dp2')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('SCXO_No_OTP/Page_Onboarding/6.1_select_Pilih Bentuk Badan UsahaPTInstansi'), '1', 
    true)

WebUI.delay(5)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/6.2_input_Nama Perusahaan'), 'Sinar Cahaya Abadi')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('SCXO_No_OTP/Page_Onboarding/6.3_select_Pilih BidangSektor Usaha'), '3100', true)

WebUI.delay(3)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/6.4_input_Tempat Usaha Berdiri'), 'Bekasi')

WebUI.delay(3)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/6.5_LabelTanggalUsahaBerdiri'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('DatePicker/Page_Onboarding/Page_Onboarding/span_2018'))

WebUI.click(findTestObject('DatePicker/Page_Onboarding/Page_Onboarding/div_March 2018'))

WebUI.click(findTestObject('DatePicker/Page_Onboarding/Page_Onboarding/div_5'))

WebUI.delay(3)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/6.5.1_div_13_tanggalBerdiri'))

WebUI.delay(3)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/6.6_input_Jumlah Karyawan'), '1000')

WebUI.delay(2)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/6.7_button_Indonesia'))

WebUI.delay(3)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/6.8_div_Tidak'))

WebUI.delay(15)

WebUI.selectOptionByValue(findTestObject('SCXO_No_OTP/Page_Onboarding/6.9_select_Pilih Kelolaan Dana Pertahun Rp100 j_ced9d8'), 
    '5', true)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('SCXO_No_OTP/Page_Onboarding/6.10_input_penghasilPerthn'), '1000000000')

WebUI.delay(3)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/6.11_input_Jumlah Pelanggan'), '1500')

WebUI.delay(3)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/6.12_input_Persentase Pelanggan Domestik'), '85')

WebUI.delay(5)

WebUI.takeFullPageScreenshotAsCheckpoint('Deper2')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

