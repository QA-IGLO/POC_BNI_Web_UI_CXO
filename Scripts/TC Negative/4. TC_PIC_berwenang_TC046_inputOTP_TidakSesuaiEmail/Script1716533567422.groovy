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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://192.168.175.9/ui-dashboard/landing')

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('LandingPage')

WebUI.delay(3)

WebUI.click(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/button_Daftar Sekarang'))

WebUI.click(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/span_Syarat dan Ketentuan'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('LandingPage')

WebUI.delay(3)

WebUI.click(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/button_Selanjutnya'))

WebUI.click(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/button_Belum memiliki Giro'))

WebUI.selectOptionByValue(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/select_Pilih tujuan pembukaan rekeningInves_682d6c'), 
    'Investasi', true)

WebUI.click(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/button_Giro Rupiah'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('LandingPage')

WebUI.delay(3)

WebUI.click(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/button_Selanjutnya'))

WebUI.click(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/button_ADART'))

WebUI.setText(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/input__namaPejabat'), 'Amrudin Effendi Putra')

WebUI.setText(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/input__telepon'), '08854567898')

WebUI.setText(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/input__emailPersonal'), 'wasis.hidayat@indocyber.id')

WebUI.click(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/button_Selanjutnya'))

WebUI.setText(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/input_text'), '1')

WebUI.setText(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/input_text'), '2')

WebUI.setText(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/input_text'), '3')

WebUI.setText(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/input_text'), '4')

WebUI.setText(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/input_text'), '5')

WebUI.setText(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/input_text'), '6')

WebUI.click(findTestObject('SCXO_No_OTP/GB_08/TC_46/Page_BNIDirect/button_Selanjutnya'))

WebUI.takeScreenshotAsCheckpoint('OTPTidaksesuai1')

