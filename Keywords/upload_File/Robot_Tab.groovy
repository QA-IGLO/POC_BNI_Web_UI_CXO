
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

import internal.GlobalVariable

import java.awt.Robot
import java.awt.Toolkit
import java.awt.event.KeyEvent

import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory



public class Robot_Tab {

	@Keyword
	def actionTab(){
		Robot robot = new Robot();

		WebUI.delay(2)

		robot.keyPress(KeyEvent.VK_ENTER);

		robot.delay(1000); //Millisecond 1 second delay only if needed

		robot.keyRelease(KeyEvent.VK_ENTER);

		robot.delay(1000);

		robot.keyPress(KeyEvent.VK_TAB);

		robot.delay(1000); //Millisecond 1 second delay only if needed

		robot.keyRelease(KeyEvent.VK_TAB);

		WebUI.delay(2)
	}
	@Keyword
	def scrollTermCondition(String xpath) {


		// Get the WebDriver instance
		def driver = DriverFactory.getWebDriver()

		// Specify the attribute name and value to target the element
		def path = xpath
		

		// Execute JavaScript to scroll the element with the specified attribute into view
		((JavascriptExecutor) driver).executeScript("document.evaluate('${path}', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.scrollTop += 200")
		
	}
}
