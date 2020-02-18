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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.NoAlertPresentException


WebUI.openBrowser('https://picdevweb.vnetcloud.com/styles/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/input_Type your username and password_inputEmail'), "stylesadmin")

WebUI.setText(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/input_Type your username and password_inputPassword'), "Password1!")

//WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/button_Sign In'));
'Pakai ENTER Keyboard'
WebUI.sendKeys(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/button_Sign In'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/a_Menu'))

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/a_ Whats On'))

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/a_MenampilkandariHalaman Totaldata_AddNew'))

WebUI.uploadFile(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/input_Choose Image_ImageBase64'), 'C:\\Users\\Lenovo\\Downloads\\Lippo Mall Puri.jpeg')

WebUI.setText(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/input__WhatsOnName'), "Testing Whats On Automated")

WebUI.setText(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/input__PhoneNumber'), "088888888888888888888889999999999999999999999997897777777777777777777777777777767777777777777777777777778")

WebUI.selectOptionByLabel(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/select_Mall'), "Bandung Indah Plaza", false)

'Verifying the Option is Selected by Index option'
WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/select_Mall'), "Bandung Indah Plaza", false, 30)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/select_Tenant'), "Manzone", false)

WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/select_Tenant'), "Manzone", false, 30)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/select_Promotions                                                Event'), "Event", false)

WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/select_Promotions                                                Event'), "Event", false, 30)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/select_Books Toys  HobbiesHealth  Beauty'), "Sports", false)

WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/select_Books Toys  HobbiesHealth  Beauty'), "Sports", false, 30)

WebUI.uploadFile(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/input_Choose Thumbnail_ImageThumbnailBase64'), 'C:\\Users\\Lenovo\\Downloads\\Lippo Mall Puri.jpeg')

//CustomKeywords.'framework.component.handleDatepicker'(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/div_End Date_input-group-text'), '31', '12', '2019')
WebUI.click(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/div_End Date_input-group-text'))

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/th_February 2020_next'))

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/td_31 (next)'))

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/div_(Choose End Date first)_input-group-text'));

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/th_(Choose End Date first)_prev'));

WebUI.click(findTestObject('Object_WhatsOn/WhatsOn_AddNew/td_31 (prev)'))

WebUI.setText(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/textarea__Description'), "Test deskripsi 500 karakter Test deskripsi 500 karakter Test deskripsi 500 karakter Test deskripsi 500 karakter Test deskripsi 500 karakter Test deskripsi 500 karakter Test deskripsi 500 karakter Test deskripsi 500 karakter Test deskripsi 500 karakter Test deskripsi 500 karakter Test deskripsi 500 karakter Test deskripsi 500 karakter Test deskripsi 500 karakter Test deskripsi 500 karakter Test deskripsi 500 karakter Test deskripsi 500 karakter Test deskripsi 500 karakter Test deskripsi 500 kara!")

WebUI.setText(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/textarea_Tag_Tag'), 'Tag Automated')

//<input type="text" class="form-control form-control-sm datetimepicker-input" data-toggle="datetimepicker" data-target="#EndDate">
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/button_Save'))

//String pesan = WebUI.getAlertText()
//String pesan2 = "xrm_phonenumber%"

//WebDriver driver = DriverFactory.getWebDriver()

//'Getting the text from the alert and storing it in Variable'
//String pesan = driver.switchTo().alert().getText()

//WebUI.verifyEqual(pesan, pesan2)

//if(pesan.equals(pesan)) {
//	WebUI.comment("Validasi maksimal length!")
//} 
//else 
//	WebUI.executeJavaScript("alert('Gagal menyimpan data!')", null)


WebUI.takeScreenshot()

WebUI.closeBrowser()