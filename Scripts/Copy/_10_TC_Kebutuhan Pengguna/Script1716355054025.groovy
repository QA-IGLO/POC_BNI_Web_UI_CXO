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

WebUI.scrollToElement(findTestObject('Object Repository/BNI CSO/Page_BNIDirect/button_Selanjutnya'), 5)

WebUI.delay(5)

WebUI.takeFullPageScreenshotAsCheckpoint('KebutuhanPenggunaBefore')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/_10.1_button_Inquiry'))

WebUI.delay(2)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/_10.2_button_Tidak'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'), 5)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.delay(3)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

WebUI.delay(5)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/_10.3_input_BusinessID'), 'Idaw311')

WebUI.delay(5)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/_10.4_input_User ID Maker_usersDto.makerDto.0.userId'), 'IDAW901')

WebUI.delay(2)

WebUI.setText(findTestObject('SCXO_No_OTP/Page_Onboarding/_10.5_input_Nama User Maker_usersDto.makerDto.0.userName'), 'Ida Wasida')

WebUI.delay(2)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/_10.6_div_Nomor Handphone'))

WebUI.delay(2)

WebUI.setText(findTestObject('TC0011/Page_Onboarding/input_Nomor Handphone_usersDto.makerDto.0.p_729376'), '08234567896789')

WebUI.delay(2)

WebUI.setText(findTestObject('TC0011/Page_Onboarding/input_Alamat Email_usersDto.makerDto.0.email'), 'ida.wasida@gmail.com')

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/BNI CSO/Page_BNIDirect/button_Selanjutnya'), 5)

WebUI.delay(5)

WebUI.takeFullPageScreenshotAsCheckpoint('KebutuhanPenggunaAfter')

WebUI.delay(5)

WebUI.click(findTestObject('SCXO_No_OTP/Page_Onboarding/button_Selanjutnya - Bawah'))

