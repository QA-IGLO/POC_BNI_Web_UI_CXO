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

WebUI.callTestCase(findTestCase('6_TC_Detail_Perusahaan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('7_TC_Alamat_Perusahaan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('8_TC_Akte_Perizinan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('9_TC_Upload_data - TC_084_NPWPtidaksesuaiFormat'), [:], FailureHandling.STOP_ON_FAILURE)

