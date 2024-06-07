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

WebUI.takeScreenshotAsCheckpoint('SK')

WebUI.delay(3)

CustomKeywords.'upload_File.screenshoot.screenshotPage'('SyaratKetentuanBefore')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/13.1_span_Syarat Ketentuan_chakra-checkbox__con_842773'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('SK1')

WebUI.delay(4)

CustomKeywords.'upload_File.screenshoot.screenshotPage'('SyaratKetentuan')

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('SK2')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/13.2_span_Syarat Ketentuan_CashManagement'))

WebUI.delay(4)

CustomKeywords.'upload_File.screenshoot.screenshotPage'('SyaratKetentuanCashManagement')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/13.3_span_Syarat dan Ketentuan_chakra-checkbox___de1f61'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('SK3')

WebUI.delay(3)

CustomKeywords.'upload_File.screenshoot.screenshotPage'('SyaratKetentuanAfter')

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('SK4')

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

