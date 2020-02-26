import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import java.util.Random
import java.util.ArrayList


WebUI.openBrowser('https://picdevweb.vnetcloud.com/styles/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/input_Type your username and password_inputEmail'), "stylesadmin")

WebUI.setText(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/input_Type your username and password_inputPassword'), "Password1!")

//WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/button_Sign In'));
'Pakai ENTER Keyboard'
WebUI.sendKeys(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/button_Sign In'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/a_Menu'))

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/a_ Whats On'))

//WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_InActive/button_Look'))

//def z = ["a", "b", "c", "d", "e"]
//Random rnd = new Random()
// 
//for (i=0; i < 10; i++) {
//   println(z[rnd.nextInt(z.size)])
//}

//int optionListLength = 10
//Random rand = new Random()
//int index = rand.nextInt(optionListLength + 1)
//
//WebUI.selectOptionByIndex(findTestObject('Object Repository/Object_WhatsOn/Page_InActive/button_Look'), rand)
//
//if (rand == true){
//	WebUI.executeJavaScript('alert("Sukses Testing")', null)
//}

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_InActive/button_'))

//new_btn = WebUI.modifyObjectProperty(findTestObject('Object Repository/Object_WhatsOn/Page_InActive/button_Inactive'), 'num', 'equals', "1", true)
//
//WebUI.click(new_btn)
//
//WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_InActive/button_Inactive'))
//
//WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_InActive/button_Ok'))

WebUI.delay(10)

WebUI.closeBrowser()

