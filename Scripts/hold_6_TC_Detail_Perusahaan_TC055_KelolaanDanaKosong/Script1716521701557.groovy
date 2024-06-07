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

WebUI.selectOptionByValue(findTestObject('SCXO_No_OTP/Page_Onboarding/6.1_select_Pilih Bentuk Badan UsahaPTInstansi'), '1', 
    true)

WebUI.delay(3)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/6.2_input_Nama Perusahaan'), 'Sinar Cahaya Abadi')

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC0011/Page_Onboarding/select_Pilih BidangSektor UsahaAIRBEARER CO_896bdf'), 
    '3100', true)

WebUI.delay(3)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/6.4_input_Tempat Usaha Berdiri'), 'Bekasi')

WebUI.delay(3)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/6.5_input_Tanggal Usaha Berdiri'), '2020-02-06')

WebUI.delay(3)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/6.5.1_div_13_tanggalBerdiri'))

WebUI.delay(3)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/6.6_input_Jumlah Karyawan'), '1000')

WebUI.delay(2)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/6.7_button_Indonesia'))

WebUI.delay(3)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/6.8_div_Tidak'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('SCXO_No_OTP/Page_Onboarding/6.9_select_Pilih Kelolaan Dana Pertahun Rp100 j_ced9d8'), 
    '', true)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('SCXO_No_OTP/Page_Onboarding/negative_TC_055_KelolaDanaKosong'), 5)

WebUI.delay(10)

WebUI.takeScreenshotAsCheckpoint('Detail Perusahaan1')

WebUI.delay(5)

