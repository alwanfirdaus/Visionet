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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver
 

WebUI.openBrowser('https://picdevweb.vnetcloud.com/styles/');

WebUI.maximizeWindow();

WebUI.setText(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/input_Type your username and password_inputEmail'), 'stylesadmin');

WebUI.setText(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/input_Type your username and password_inputPassword'), 'Password1!');

//WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/button_Sign In'));
'Pakai ENTER Keyboard'
WebUI.sendKeys(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/button_Sign In'), Keys.chord(Keys.ENTER));

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/a_Menu'));

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/a_ Whats On'));

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/a_MenampilkandariHalaman Totaldata_AddNew'));

WebUI.uploadFile(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/input_Choose Image_ImageBase64'), 'C:\\Users\\Lenovo\\Downloads\\Lippo Mall Puri.jpeg');

WebUI.setText(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/input__WhatsOnName'), "Testing Whats On Automated");

WebUI.setText(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/input__PhoneNumber'), "08888888888888888888888888888888888888888888888888");

WebUI.selectOptionByLabel(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/select_Mall'), "Bandung Indah Plaza", false);
 
'Verifying the Option is Selected by Index option' 
WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/select_Mall'), "Bandung Indah Plaza", false, 30);

WebUI.selectOptionByLabel(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/select_Tenant'), "Manzone", false);

WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/select_Tenant'), "Manzone", false, 30);

WebUI.selectOptionByLabel(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/select_Promotions                                                Event'), "Event", false);

WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/select_Promotions                                                Event'), "Event", false, 30);

WebUI.selectOptionByLabel(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/select_Books Toys  HobbiesHealth  Beauty'), "Sports", false);

WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/select_Books Toys  HobbiesHealth  Beauty'), "Sports", false, 30);

//WebUI.click(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/div_End Date_input-group-text'));

CustomKeywords.'framework.component.handleDatepicker'(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/div_End Date_input-group-text'), '31', '12', '2019')



//<input type="text" class="form-control form-control-sm datetimepicker-input" data-toggle="datetimepicker" data-target="#EndDate">



WebUI.takeScreenshot();

//WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/button_Save'));

WebUI.closeBrowser();