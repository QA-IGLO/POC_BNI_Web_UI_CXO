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

WebUI.navigateToUrl('http://192.168.139.47/ui-onboarding/')

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/label_Syarat dan Ketentuan e-Form pada new _ff272b'))

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/div_Belum Memiliki Giro  Tabungan Bisnis'))

WebUI.selectOptionByValue(findTestObject('Object Repository/error_upload/Page_Onboarding/select_Pilih Tujuan Pembukaan RekeningInves_a44001'), 
    'Investasi', true)

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/div_Giro Rupiah'))

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/div_ADART'))

WebUI.setText(findTestObject('Object Repository/error_upload/Page_Onboarding/input_Nama Orang Yang Berwenang_onboardDto._e0a54b'), 
    'indra')

WebUI.setText(findTestObject('Object Repository/error_upload/Page_Onboarding/input_Nomor Handphone_onboardDto.authPersonPhone'), 
    '081234567890')

WebUI.setText(findTestObject('Object Repository/error_upload/Page_Onboarding/input_Email Personal_onboardDto.authPersonEmail'), 
    'sylvia@ekreasi.com')

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/button_Selanjutnya'))

WebUI.selectOptionByValue(findTestObject('Object Repository/error_upload/Page_Onboarding/select_Pilih Bentuk Badan UsahaPTBankKopera_6d3d37'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/img'))

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/div_Klik untuk upload atau drag and dropFor_408759'))

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/div_Klik untuk upload atau drag and dropFor_408759'))

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/div_Klik untuk upload atau drag and dropFor_408759'))

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/div_Klik untuk upload atau drag and dropFor_408759'))

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/div_Klik untuk upload atau drag and dropFor_408759'))

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/div_Klik untuk upload atau drag and dropFor_408759'))

WebUI.click(findTestObject('Object Repository/error_upload/Page_Onboarding/div_Klik untuk upload atau drag and dropFor_408759'))

