import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stamkaart.nvm.nl')

WebUI.delay(4)

WebUI.getWindowTitle()

assert WebUI.getWindowTitle() == 'NVM'

WebUI.click(findTestObject('Object Repository/NVM inlog LEDEN/Page_NVM/input_NVM-leden_username'))

WebUI.setText(findTestObject('Object Repository/NVM inlog LEDEN/Page_NVM/input_NVM-leden_username'), 'Q.Delft')

WebUI.click(findTestObject('Object Repository/NVM inlog LEDEN/Page_NVM/input_NVM-leden_password'))

WebUI.setText(findTestObject('Object Repository/NVM inlog LEDEN/Page_NVM/input_NVM-leden_password'), 'prodQD010')

WebUI.click(findTestObject('Object Repository/NVM inlog LEDEN/Page_NVM/button_Login'))

WebUI.delay(4)

WebUI.getWindowTitle()

assert WebUI.getWindowTitle() == 'NVM Stamkaart - Business'

WebUI.click(findTestObject('Object Repository/NVM inlog STAMKAART/Page_NVM Stamkaart - Business/button_Uitgebreid zoeken_btnLo'))

WebUI.getWindowTitle()

assert WebUI.getWindowTitle() == 'NVM Stamkaart'

WebUI.closeBrowser()