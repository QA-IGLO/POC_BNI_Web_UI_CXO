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

CustomKeywords.'upload_File.screenshoot.screenshotPage'('RingkasanPengajuanBefore')

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('RingPeng1')

WebUI.delay(5)

CustomKeywords.'upload_File.screenshoot.screenshotPage'('RingkasanPengajuanBefore')

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('RingPeng1')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/12.1_click_ProfilOrangYgBerwenang'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('Profil Orang Yang berwenang_RP')

WebUI.delay(3)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/12.2_click_DetailPerusahaan'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Detail Perusahaan_RP')

WebUI.delay(3)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/12.3_click_AlamatPerusahaan'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Alamat Perusahaan_RP')

WebUI.delay(3)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/12.4_click_AktePerijinan'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Akte Perijinan_RP')

WebUI.delay(3)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/12.5_click_DokumenPerusahaan'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Dokumen Perusahaan_RP')

WebUI.delay(3)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/12.6_click_KebutuhanPengguna'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Kebutuhan Pengguna_RP')

WebUI.delay(3)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/12.7_click_SystemAdministrationRegistration'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('System Adminitrator Registration_RP')

WebUI.delay(3)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/12.8_click_CabangPendaftaran'))

WebUI.delay(3)

CustomKeywords.'upload_File.screenshoot.screenshotPage'('RingkasanPengajuanAfter')

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Rp1')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

