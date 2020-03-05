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
import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable


WebUI.openBrowser('https://picdevweb.vnetcloud.com/styles/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/input_Type your username and password_inputEmail'), "stylesadmin")

WebUI.setText(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/input_Type your username and password_inputPassword'), "Password1!")

//WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/button_Sign In'));
'Pakai ENTER Keyboard'
WebUI.sendKeys(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/button_Sign In'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/a_Menu'))

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/a_ Whats On'))

button_look = WebUI.modifyObjectProperty(findTestObject('Object Repository/Object_WhatsOn/Page_InActive/button_Look'), "num", "equals", "3", true)

WebUI.click(button_look)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_InActive/button_'))


//'pilihan berdasarkan edit melalui script berdasarkan key method "atribut"'
//new_btn = WebUI.modifyObjectProperty(findTestObject('Object Repository/Object_WhatsOn/Page_InActive/button_Inactive'), 'num', 'equals', "1", true)
//
//WebUI.click(new_btn)
//
//WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_InActive/button_Ok'))



'untuk mengambil object dari elementnya'
TestObject button_InActive = findTestObject('Object Repository/Object_WhatsOn/Page_InActive/button_Inactive')

'fungsi random nya'
int randomInt = new Random().nextInt(5 - 1 + 1) + 1

'Change value of XPATH selector'
button_InActive.setSelectorValue(SelectorMethod.XPATH, "//*[@id=\"WhatsOnAppendList\"]/div["+randomInt+"]/center/div/button[2]")

//dari INSPECT
////*[@id="WhatsOnAppendList"]/div[1]/center/div/button[2]
//ASLI dari spyweb
//(//button[@type='button'])[3]

WebUI.click(button_InActive)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_InActive/button_Ok'))



WebUI.closeBrowser()