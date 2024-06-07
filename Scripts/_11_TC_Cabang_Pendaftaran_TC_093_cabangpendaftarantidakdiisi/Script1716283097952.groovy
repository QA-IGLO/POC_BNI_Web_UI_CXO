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

WebUI.takeFullPageScreenshotAsCheckpoint('KantorCabangKosong')

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_PilihCabang'))

WebUI.delay(2)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/input_KantorCabangKosong'), '')

WebUI.delay(4)

CustomKeywords.'upload_File.Robot_Tab.actionTab'()

WebUI.delay(4)

WebUI.waitForElementPresent(findTestObject('SCXO_No_OTP/Page_Onboarding/negative_TC_093_cabangHarusdipilih'), 8)

WebUI.delay(10)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/input_Pilih Jadwal Kunjungan_onboardDto.visitDate'))

WebUI.delay(4)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/div_22'))

WebUI.delay(4)

WebUI.takeFullPageScreenshotAsCheckpoint('KantorCabangKosong')

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

