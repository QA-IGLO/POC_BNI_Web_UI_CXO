package upload_File

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import java.awt.Robot
import java.awt.Toolkit
import java.awt.event.KeyEvent
import java.awt.datatransfer.StringSelection
import internal.GlobalVariable

import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory


public class upload_file {

	WebDriver driver = DriverFactory.getWebDriver()

	@Keyword
	def uploadFileImage(String path){

		StringSelection ss = new StringSelection(path);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot robot = new Robot();

		WebUI.delay(5)

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(1000); //Millisecond 1 second delay only if needed
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(1000); //Millisecond 1 second delay only if needed
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		WebUI.delay(5)
	}


	@Keyword
	def uploadFileKosong(String path){

		StringSelection ss = new StringSelection(path);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot robot = new Robot();

		WebUI.delay(5)

		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		robot.delay(1000); //Millisecond 1 second delay only if needed

		WebUI.delay(2)
	}


	@Keyword
	def verifyAlert(String expected) {

		// 'Getting the text from the alert and storing it in Variable'
		String AlertText = driver.switchTo().alert().getText()
		println("alert:" + AlertText)
		// 'Verifying the Actual and Expected text from Alert'
		WebUI.verifyEqual(AlertText, expected)
	}
}
