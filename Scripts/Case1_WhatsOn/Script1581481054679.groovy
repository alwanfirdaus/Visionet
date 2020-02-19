import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.jws.WebService

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.contribution.WebServiceKeywordContributor
import com.kms.katalon.core.webservice.exception.WebServiceException
import com.kms.katalon.core.webservice.helper.WebServiceCommonHelper
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sun.xml.internal.ws.api.WSService

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver
//import org.openqa.selenium.chrome.InternetExplorerDriver
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.RestRequestObjectBuilder
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
 

WebUI.openBrowser('https://picdevweb.vnetcloud.com/styles/');

WebUI.maximizeWindow();

//public class RequestObjectLogin {
// 
//	String endpoint = "https://picdevapi.vnetcloud.com/styles/api/login/do"
//	String requestMethod = "POST"
//	//String authHeader = "whateverYouNeedForAuthentication"
//	
//	 
//	TestObjectProperty header1 = new TestObjectProperty("Cookie", ConditionType.EQUALS, "ASP.NET_SessionId=l5zviu3hy4jlnjqyp5p0n4o1")
//	TestObjectProperty header2 = new TestObjectProperty("Content-Type", ConditionType.EQUALS, "application/json")
//	TestObjectProperty header3 = new TestObjectProperty("Accept", ConditionType.EQUALS, "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
//	ArrayList defaultHeaders = Arrays.asList(header1, header2, header3)
//	 
//	String body = '{"Username": "stylesadmin","Password": "Password1!"}'
//	 
//	/**
//	* POST requests
//	* @return
//	*/
//	public ResponseObject buildPostApiRequest1() {
//		RequestObject ro = new RequestObject("objectId")
//		ro.setRestUrl(endpoint)
//		ro.setHttpHeaderProperties(defaultHeaders)
//		ro.setRestRequestMethod("POST")
//		ro.setBodyContent(new HttpTextBodyContent(body))
//		 
//		ResponseObject respObj = WS.sendRequest(ro)
//		return respObj
//	}
//	 
//	public ResponseObject buildPostApiRequest2() {
//		RequestObject ro = new RestRequestObjectBuilder()
//		.withRestUrl(endpoint)
//		.withHttpHeaders(defaultHeaders)
//		.withRestRequestMethod("POST")
//		.withTextBodyContent(body)
//		.build()
//		 
//		ResponseObject respObj = WS.sendRequest(ro)
//		return respObj
//	}
//}


// Create a new GET object using builder
//def builder = new RestRequestObjectBuilder()
//def requestObject = builder
//	.withRestRequestMethod("GET")
//	.withRestUrl(href)            // here we specify the URL found in the web site
//	.build()
//
//// Send a request'
//def response = WS.sendRequest(requestObject)
//
//// Verify if the response from the URL returns the 200 status code'
//WS.verifyResponseStatusCode(response, 200)
//
//// Get the content string
//def content = response.getResponseBodyContent()
//
//// prepare output directory
//Path projectdir = Paths.get(RunConfiguration.getProjectDir())
//Path outputdir = projectdir.resolve("tmp")
//Files.createDirectories(outputdir)
//Path file = outputdir.resolve("FIFA_World_Cup_Russia_2018.rss.xml")
//
//// save XML into file
//file.toFile().write(content)




WebUI.setText(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/input_Type your username and password_inputEmail'), 'stylesadmin');

WebUI.setText(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/input_Type your username and password_inputPassword'), 'Password1!');

//WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/button_Sign In'));
//Pakai ENTER Keyboard
WebUI.sendKeys(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/button_Sign In'), Keys.chord(Keys.ENTER));

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/a_Menu'));

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/a_ Whats On'));

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/a_MenampilkandariHalaman Totaldata_AddNew'));

WebUI.uploadFile(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/input_Choose Image_ImageBase64'), 'C:\\Users\\Lenovo\\Downloads\\Lippo Mall Puri.jpeg');

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/button_Save'));

WebUI.verifyElementPresent(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/div_Please Insert Images  Thumbnail'), 20);
//enter pakai keyboard
//WebUI.sendKeys(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/button_Save'), Keys.chord(Keys.ENTER));

WebUI.uploadFile(findTestObject('Object Repository/Object_WhatsOn/WhatsOn_AddNew/input_Choose Thumbnail_ImageThumbnailBase64'), 'C:\\Users\\Lenovo\\Downloads\\Lippo Mall Puri.jpeg');

WebUI.click(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/button_Save'));

WebUI.verifyElementPresent(findTestObject('Object Repository/Object_WhatsOn/Page_Styles/div_Please fill empty form'), 20);

WebUI.executeJavaScript("alert('Done test')", null)

WebUI.delay(5)

WebUI.takeScreenshot();

WebUI.closeBrowser();