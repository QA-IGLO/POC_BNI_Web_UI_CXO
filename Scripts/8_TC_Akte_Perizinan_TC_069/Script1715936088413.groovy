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

WebUI.setText(findTestObject('Object Repository/SCXO_No_OTP/Page_Onboarding/8.1_input_NPWP_onboardPermitsDto.npwp'), '123456789012345')

WebUI.verifyElementPresent(findTestObject('SCXO_No_OTP/Page_Onboarding/negative_TC_067_NPWP_harusmemiliki16digit'), 3)

WebUI.delay(2)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/8.2_label_Tempat Dikeluarkan Identitas'))

WebUI.delay(2)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/8.3_input_Tempat Dikeluarkan Identitas_onboardP_54807e'), 'Bekasi')

WebUI.delay(2)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/8.4_input_Nomor Akte Pengesahan_onboardPermitsD_8b3cf4'), '5678998765456789')

WebUI.delay(2)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/8.5_input_Tanggal Pengesahan_onboardPermitsDto._add01d'), '2020-06-06')

WebUI.delay(2)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/8.6_div_29'))

WebUI.delay(2)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/8.7_input_Nomor Akte PendirianAnggaran Dasar_on_3c9837'), '5678987656789')

WebUI.delay(2)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/8.8_input_Tanggal Pendirian_onboardPermitsDto.f_4006f0'), '2020-10-14')

WebUI.delay(2)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/8.9_div_15'))

WebUI.delay(2)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/8.11_input_Tempat Akte Dibuat_onboardPermitsDto._2e8135'), 'Bekasi')

WebUI.delay(2)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/8.12_input_Nomor Akte Perubahan_onboardPermitsDt_da252c'), '5678987656789')

WebUI.delay(2)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/8.10_input_Nama Notaris_onboardPermitsDto.notaryName'), 'Sena')

WebUI.delay(2)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/8.13_input_Tanggal Perubahan_onboardPermitsDto.a_a78d82'), '2020-10-06')

WebUI.delay(2)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/_8.14_div_30'))

WebUI.delay(2)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/8.15_input_Notaris_onboardPermitsDto.notaris'), 'Seno')

WebUI.delay(2)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/8.16_input_Nomor Izin Usaha NIB_onboardPermitsD_df6ad9'), '')

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('SCXO_No_OTP/Page_Onboarding/negative_TC_069_NIBKosong'), 10)

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('SCXO_No_OTP/Page_Onboarding/negative_TC_069_NIBKosong'), 5)

WebUI.delay(10)

WebUI.takeScreenshotAsCheckpoint('NIB Tidak diisi')

WebUI.delay(10)

