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

WebUI.callTestCase(findTestCase('1. TC_OpenBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('2. TC_PilihProduk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('3_TC_Giro'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('4. TC_PIC_berwenang'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('5. TC_Verifikasi_email'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Atas'))

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Atas'))

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Atas'))

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Atas'))

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Atas'))

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Atas'))

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.delay(5)

CustomKeywords.'upload_File.Robot_Tab.scrollTermCondition'('/html/body/div[1]/div[2]/div/form/div/div[2]/div[2]/div/div[3]/div/div[1]')

WebUI.delay(5)

WebUI.click(findTestObject('Rec_20052024/Test Handling Alert/check_Term1'))

WebUI.delay(5)

CustomKeywords.'upload_File.Robot_Tab.scrollTermCondition'('/html/body/div[1]/div[2]/div/form/div/div[2]/div[2]/div/div[4]/div/div[1]')

WebUI.delay(5)

WebUI.click(findTestObject('Rec_20052024/Test Handling Alert/check_Term2'))

WebUI.delay(5)

CustomKeywords.'upload_File.Robot_Tab.scrollTermCondition'('/html/body/div[1]/div[2]/div/form/div/div[2]/div[2]/div/div[5]/div/div[1]')

WebUI.delay(5)

WebUI.click(findTestObject('Rec_20052024/Test Handling Alert/check_Term3'))

WebUI.delay(5)

CustomKeywords.'upload_File.Robot_Tab.scrollTermCondition'('/html/body/div[1]/div[2]/div/form/div/div[2]/div[2]/div/div[6]/div/div[1]')

WebUI.delay(5)

WebUI.click(findTestObject('Rec_20052024/Test Handling Alert/check_Term4'))

WebUI.delay(5)

CustomKeywords.'upload_File.Robot_Tab.scrollTermCondition'('/html/body/div[1]/div[2]/div/form/div/div[2]/div[2]/div/div[6]/div/div[1]')

