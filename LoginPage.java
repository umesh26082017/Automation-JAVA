package com.ast.pages;
 
import java.util.List;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
 
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.nio.file.Paths;
 
//reporting
 
 
 
public class LoginPage {
 
	private WebDriver driver;
 
	// Locators
	private By emailInputLocator = By.xpath("//input[@id='username']");
	private By passwordInputLocator = By.xpath("//input[@id='password']");
	private By loginButtonLocator = By.xpath("//input[@type='submit']");
	private By LoginApplicationLocator = By.xpath("//button[@name='LoginToNetworkAsUser']");
	private By siteuserLocator = By.xpath("//span[text()='udaoch']");
	/* &&&&
	private By seedLinkLocator = By.xpath("//div[contains(@class, 'comm-tile-menu__item-title') and text()='Seed']");
	private By seedsampleLinkkLocator = By.xpath("//div[contains(@class, 'comm-tile-menu__item-title') and text()='Seed Sample Application']");
	private By continueseedLinkLocator = By.xpath("//span[@aria-label='Continue']");
	private By seednextbuttonLocator = By.xpath("//span[text()='Next']");
	private By seedcontactnextbuttonLocator = By.xpath("//span[@aria-label='Next' and text()='Next']");
	private By seedaccountnextbuttonLocator = By.xpath("//span[@aria-label='Next' and text()='Next']");
	private By seedaccountbnextbuttonLocator = By.xpath("//span[text()='Next']");
	private By seedsamplenextbuttonLocator = By.xpath("//span[@aria-label='Next']");
	private By seedsamplebnextbuttonLocator = By.xpath("//button[@aria-label='Next']");
	private By homepagebuttonLocator = By.xpath("//a[@role='menuitem' and text()='Home']");
	&&& */
	/*private By couriertypeLocator = By.xpath("//input[@role='combobox' and @aria-expanded='false']");
	private By couriertypeOptionvalue = By.xpath("//input[@data-value='FedEx']");
	private By capturesignseedbuttonLocator = By.xpath("//button[@title='Clear Signature']");
	private By signednameseedtextLocator = By.xpath("//input[@id='input677-3263']");
	private By jobtitleseedtextLocator = By.xpath("//input[@id='input679-3265']");
	private By signnextbuttonsLocator = By.xpath("//span[@aria-label='Next']");
	*/
	/* &&&&&
	private By weedLinkLocator = By.xpath("//div[@class='lwc-rfo3qhj7u4 comm-tile-menu__item-title vertical-padding slds-text-align_center' and contains(text(), 'Weed Free')]");
	private By weedfreeLinkLocator = By.xpath("//div[@class='lwc-rfo3qhj7u4 comm-tile-menu__item-title vertical-padding slds-text-align_center' and contains(text(), 'Weed Free Inspection')]");
	private By continueweedbuttonLocator = By.xpath("//button[@aria-label='Continue' and contains(@class, 'slds-button_brand')]");
	private By weednextbuttonLocator = By.xpath("//span[@aria-label='Next' and text()='Next']");
	private By weedcontactnextbuttonLocator = By.xpath("//span[@aria-label='Next' and text()='Next']");
	private By weedaccountnextbuttonLocator = By.xpath("//span[@aria-label='Next' and text()='Next']");
	private By weedaccountbnextbuttonLocator = By.xpath("//span[@aria-label='Next' and text()='Next']");
	private By home1pagebuttonLocator = By.xpath("//a[@role='menuitem' and text()='Home']");
	*/
	
	/*
	private By fieldyesradiobuttonLocator = By.xpath("//label[@for='vlocity-radio-20-0-2065']//span[contains(text(), 'Yes')]");
	private By datefieldbuttonLocator = By.xpath("//input[@id='date-input-461']");
	private By datebuttonLocator = By.xpath("//span[@aria-label='Fri Feb 28 2025' and text()='28']");
	private By fieldnextbuttonLocator = By.xpath("//button[@aria-label='Next' and contains(@class, 'slds-button_brand')]");
	private By capturesignbuttonLocator = By.xpath("//button[text()='Capture Signature' and @title='Clear Signature']");
	private By signedname1textLocator = By.xpath("//input[contains(@class, 'slds-input') and @type='text']");
	private By jobtitle1textLocator = By.xpath("//input[contains(@class, 'vlocity-input') and @type='text']");
	private By confirmnextbuttonLocator = By.xpath("//span[@aria-label='Next' and text()='Next']");	
	
	private By pesticideLocator = By.xpath("//div[@class='lwc-rfo3qhj7u4 comm-tile-menu__item-title vertical-padding slds-text-align_center' and text()='Pesticide']");
	private By RUPDealerLocator= By.xpath("//div[@class='lwc-rfo3qhj7u4 comm-tile-menu__item-title vertical-padding slds-text-align_center' and text()='RUP Dealer Sales']");
	private By continuebuttonLocator = By.xpath("//span[@class='btnLabel' and @aria-label='Continue' and text()='Continue'][1]");
	private By ApplicationNextLoactor = By.xpath("(//span[text()='Next'])[1]");
	private By Contactnextlocator = By.xpath("(//span[text()='Next'])[1]");
	private By accountinfonextLocator = By.xpath("(//span[text()='Next'])[1]");
	private By LicenseNumberLocator = By.xpath("(//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right'])[1]");
    private By SignedbyLocator = By.xpath("//*[@id='input51-386' and @aria-invalid='true' and @type='text']");
    private By JobTitleLocator = By.xpath("//*[@id='input53-388' and @type='text' and @aria-invalid='true']");
    private By capturesignLocator = By.xpath("//button[@class='slds-button slds-button_success']");
	private By nextbuttonLocator = By.xpath("(//button[@class='vlocity-btn slds-button slds-button_brand slds-size_1-of-1 slds-p-horizontal_none slds-text-align_center'])[1]");
	private By home3buttonLocator = By.xpath("//a[@aria-current='page' and text()='Home']");
	*/
	/* &&&&
	private By kratomLinkLocator = By.xpath("//div[contains(@class, 'comm-tile-menu__item-title') and text()='Kratom']");
	private By continuekratomLinkLocator = By.xpath("//span[@aria-label='Continue']");
	private By newapplicationkLinkLocator = By.xpath("//span[contains(@class, 'slds-radio_faux')]");
	private By kratomnextbuttonLinkLocator = By.xpath("//button[@aria-label='Next']");
	private By kratomaccountnextbuttonLinkLocator = By.xpath("//button[span[text()='Next']]");
	private By kratomaccountbnextbuttonLocator = By.xpath("//span[@aria-label='Next']");
	private By home2buttonLocator = By.xpath("//a[@role='menuitem' and text()='Home']");
	*/
	
	/*private By productnoLinkLocator = By.xpath("//label[span[text()='No']]");
	private By addproductbuttonLinkLocator = By.xpath("//button[text()='Add Products']");
	private By kratomnametextLocator = By.xpath("//input[@type='text' and @aria-describedby='errorMessageBlock-2203']");
	private By rawleafLinkLocator = By.xpath("//input[@id='vlocity-radio-23-0-2216']");
	private By lotbatchtextLocator = By.xpath("//input[@id='input496-2219']");
	private By directiontextLocator = By.xpath("//input[@id='input498-2221']");
	private By massvolumetextLocator = By.xpath("//input[@id='input500-2223']");
	private By uploadfilesbuttonLocator = By.xpath("//span[text()='Upload Files']");
	private By DonebuttonLocator = By.xpath("//span[text()='Done']");
	private By coayesLinkLocator = By.xpath("//span[@class='slds-radio_faux']");
	private By labnametextLocator = By.xpath("//input[@id='input139-681']");
	private By isoyesLinkLocator = By.xpath("//span[@class='slds-radio_faux']");
	private By uploadcoafilesbuttonLocator = By.xpath("//span[contains(@class, 'slds-file-selector__button') and contains(@class, 'slds-button') and contains(@class, 'slds-button_neutral')]");
	private By Done1buttonLocator = By.xpath("//span[text()='Done']");
	private By level7textLocator = By.xpath("//input[@id='input150-713']");
	private By totalaerobictextLocator = By.xpath("//input[@id='input152-715']");
	private By totalcombtextLocator = By.xpath("//input[@id='input154-717']");
	private By totalbiletextLocator = By.xpath("//input[@id='input156-719']");
	private By salmonellatextLocator = By.xpath("//input[@id='input158-721']");
	private By ecolitextLocator = By.xpath("//input[@id='input160-723']");
	private By arsenictextLocator = By.xpath("//input[@id='input162-725']");
	private By leadtextLocator = By.xpath("//input[@id='input164-727']");
	private By cadmiumtextLocator = By.xpath("//input[@id='input166-729']");
	private By mercurytextLocator = By.xpath("//input[@id='input168-731']");
	private By savebuttonLocator = By.xpath("//button[text()='Save']");
	private By productnextbuttonLocator = By.xpath("//span[@aria-label='Next']");
	private By capturesignkbuttonLocator = By.xpath("//button[text()='Capture Signature']");
	private By signedname1ktextLocator = By.xpath("//input[@id='input170-785']");
	private By jobtitle1ktextLocator = By.xpath("//input[@id='input172-787']");
	private By confirmnextbuttonkLocator = By.xpath("//button[@aria-label='Submit']");
	private By offlinepaymentLocator = By.xpath("//span[@class='slds-radio_faux']");
	private By CashbuttonLocator = By.xpath("//span[@omnistudio-radiogroup_radiogroup_slds='']");
	private By confirmationNextButtonLocator = By.xpath("//button[@aria-label='Next']");
	private By finishButtonLocator = By.xpath("//button[span[@aria-label='Finish']]");
	*/
	/* &&&&
	private By nurseryLinkLocator = By.xpath("//div[contains(@class, 'comm-tile-menu__item-title') and text()='Nursery']");
	private By continuenurseryLinkLocator = By.xpath("//span[contains(@class, 'btnLabel') and text()='Continue']");
	private By acknowledgecheckboxLinkLocator = By.xpath("//span[@class='slds-checkbox_faux']");
	private By continueacknowLinkLocator = By.xpath("//button[@aria-label='Next']");
	private By newapplicationnurLinkLocator = By.xpath("//span[@class='slds-radio_faux']");
	private By nurserymanLinkLocator = By.xpath("//span[@class='slds-form-element__label slds-p-top_none' and text()='1801 - Nurseryman']");
	private By nurseryaccnextbuttonLocator = By.xpath("//span[@aria-label='Next' and text()='Next']");
	private By nurserydbanextbuttonLocator = By.xpath("//button[@aria-label='Next']");
	private By nurserycontactnextbuttonLocator = By.xpath("//span[@aria-label='Next' and text()='Next']");
	private By nurseryacc1nextbuttonLocator = By.xpath("//button[@aria-label='Next']");
	private By nurseryacc2nextbuttonLocator = By.xpath("//button[@aria-label='Next']");
	private By noofgrowertextLocator = By.xpath("//input[@id='input162-1094']");
	private By greenhousetextLocator = By.xpath("//input[@id='input163-1100']");
	private By generalnurseryLinkLocator = By.xpath("//span[@class='slds-checkbox_faux']");
	private By exportyesLinkLocator = By.xpath("//span[@class='slds-radio_faux']");
	private By licensenextbuttonLocator = By.xpath("//span[@aria-label='Next']");
	private By capturesignnurseryLinkLocator = By.xpath("//button[@class='slds-button slds-button_success']");
	private By signnamenurserytextLocator = By.xpath("//input[@id='input75-648']");
	private By jobnurserytextLocator = By.xpath("//input[@id='input77-650']");
	private By confirmnextbuttonnurseryLinkLocator = By.xpath("//button[@class='vlocity-btn slds-button slds-button_brand slds-size_1-of-1 slds-p-horizontal_none slds-text-align_center']");
	
	*/
	
	private By apiaryLinkLocator = By.xpath("//div[@class='lwc-rfo3qhj7u4 comm-tile-menu__item-title vertical-padding slds-text-align_center' and text()='Apiary/Beekeeper']");
	private By apiarylicenseLinkLocator = By.xpath("//div[@class='lwc-rfo3qhj7u4 comm-tile-menu__item-title vertical-padding slds-text-align_center' and text()='Apiary/Beekeeper License Application']");
	private By continueapiaryLinkLocator = By.xpath("//button[contains(@class, 'slds-button') and @aria-label='Continue']");
	private By newapplicationapiaryLinkLocator = By.xpath("//span[@class='slds-form-element__label' and text()='New Application']");
	private By beekeeperLinkLocator = By.xpath("//span[@class='slds-form-element__label slds-p-top_none' and text()='1201-Beekeeper']");
	private By apiarynextbuttonLocator = By.xpath("//button[contains(@class, 'slds-button') and @aria-label='Next']/span[contains(@class, 'btnLabel') and text()='Next']");
	private By apiarydbanextbuttonLocator = By.xpath("//span[@class='btnLabel' and text()='Next']");
	private By apiarycontactnextbuttonLocator = By.xpath("//span[@class='btnLabel' and @aria-label='Next' and text()='Next']");
	private By apiaryacc1nextbuttonLocator = By.xpath("//span[@class='btnLabel' and @aria-label='Next' and text()='Next']");
	private By apiaryacc2nextbuttonLocator = By.xpath("//button[contains(@class, 'slds-button') and @aria-label='Next']/span[contains(@class, 'btnLabel') and text()='Next']");
	private By hivestextLocator = By.xpath("//input[contains(@class, 'vlocity-input') and @type='text']");
	private By emailLinkLocator = By.xpath("//span[@class='slds-form-element__label slds-p-top_none' and text()='Email']");
	private By beekeepernextbuttonLocator = By.xpath("//span[@aria-label='Next']");
	private By capturesignapiarybuttonLocator = By.xpath("//button[@title='Clear Signature']");
	private By signnameapiarytextLocator = By.xpath("//input[@id='input62-476' and @class='vlocity-input slds-input']");
	private By jobapiarytextLocator = By.xpath("//input[@id='input64-478' and @class='vlocity-input slds-input']");
	private By confirmnextapiarybuttonLocator = By.xpath("//span[@aria-label='Next']");
	private By home3buttonLocator = By.xpath("//a[@role='menuitem' and text()='Home']");
	private By apiary1LinkLocator = By.xpath("//div[@class='lwc-rfo3qhj7u4 comm-tile-menu__item-title vertical-padding slds-text-align_center' and text()='Apiary/Beekeeper']");
	private By apiarysampleLinkLocator = By.xpath("//div[contains(@class, 'lwc-rfo3qhj7u4') and contains(text(), 'Apiary Sample Submission Application')]");
	private By continuesampleLinkLocator = By.xpath("//span[@class='btnLabel' and text()='Continue']");
	private By acknowapisampleLinkLocator = By.xpath("//span[@class='slds-checkbox_faux']");
	private By apisamplenextbuttonLocator = By.xpath("//span[@class='btnLabel' and text()='Next']");
	private By applicationnextbuttonLocator = By.xpath("//button[@aria-label='Next' and .//span[text()='Next']]");
	private By apisamplecontactnextbuttonLocator = By.xpath("//span[@class='btnLabel' and text()='Next']");
	private By apisampleacc1nextbuttonLocator = By.xpath("//button[@aria-label='Next' and .//span[text()='Next']]");
	private By apisampleacc2nextbuttonLocator = By.xpath("//span[@aria-label='Next' and text()='Next']");
	private By myselfradiobuttonLocator = By.xpath("//span[@class='slds-form-element__label slds-p-top_none' and text()='Myself']");
	private By stateyesLinkLocator = By.xpath("//span[@class='slds-form-element__label slds-p-top_none' and text()='Yes']");
	private By udafnoLinkLocator = By.xpath("//label[@class='slds-radio__label' and @for='vlocity-radio-12-1-987' and @data-index='1']/span[@class='slds-form-element__label slds-p-top_none' and contains(text(), 'No')]");
	private By beekeepsamplenextbuttonLocator = By.xpath("//span[@class='btnLabel' and text()='Next']");
	private By beekeepercheckLinkLocator = By.xpath("//span[@class='slds-form-element__label slds-p-top_none' and text()='Beekeeper']");
	private By emailcheckLinkLocator = By.xpath("//span[@class='slds-form-element__label slds-p-top_none' and text()='Email']");
	private By contactsamplenextbuttonLocator = By.xpath("//span[@class='btnLabel' and text()='Next']");
	private By beecontactextbuttonLocator = By.xpath("//span[@class='btnLabel' and text()='Next']");
	private By addsamplebuttonLocator = By.xpath("//button[@class='slds-button slds-button_brand slds-button_stretch editblock-new' and text()='Add Sample']");
	private By samplenametextLocator = By.xpath("//input[@id='input129-713']");
	private By samplelocationtextLocator = By.xpath("//input[@id='lookupId-714']");
	private By broodLinkLocator = By.xpath("//span[@class='slds-form-element__label slds-p-top_none' and text()='Brood pathogens']");
	private By apisavebuttonLocator = By.xpath("//button[@omnistudio-omniscripteditblock_omniscripteditblock='' and text()='Save']");
	private By brrodsamplenextbuttonLocator = By.xpath("//span[@class='btnLabel' and text()='Next']");
	private By PhysicalsubmissionLinkLocator = By.xpath("//label[@class='slds-radio__label' and //span[text()='Physical submission']]");
	private By uspsLinkLocator = By.xpath("//label[@class='slds-radio__label' and //span[text()='USPS']]");
	private By submissionnextbuttonLocator = By.xpath("//button[@aria-label='Next' and //span[text()='Next']]");
	private By capturesignsamplebuttonLocator = By.xpath("//button[@class='slds-button slds-button_success' and text()='Capture Signature']");
	private By signnamesampletextLocator = By.xpath("//input[@class='vlocity-input slds-input' and @aria-invalid='true']");
	private By jobsampletextLocator = By.xpath("//input[@id='input147-806']");
	private By confirmnextbuttonapisampleLocator = By.xpath("//span[@class='btnLabel' and @aria-label='Next']");
	private By home4buttonLocator = By.xpath("//a[@role='menuitem' and text()='Home']");
	private By industrialhempLinkLocator = By.xpath("//div[@class='lwc-rfo3qhj7u4 comm-tile-menu__item-title vertical-padding slds-text-align_center' and text()='Industrial Hemp']");
	private By hempprocessorLinkLocator = By.xpath("//div[@class='lwc-rfo3qhj7u4 comm-tile-menu__item-title vertical-padding slds-text-align_center' and text()='Processor Application']");
	private By continueprocessorLinkLocator = By.xpath("//span[@class='btnLabel' and @aria-label='Continue']");
	private By agreementyesLinkLocator = By.xpath("//label[@class='slds-radio__label' and .//span[text()='Yes']]");
	private By agreementnextbuttonLocator = By.xpath("//button[@aria-label='Next' and .//span[text()='Next']]");
	private By newappprocessorLinkLocator = By.xpath("//span[@class='slds-form-element__label slds-p-top_none' and text()='New Application']");
	private By appliprocessornextbuttonLocator = By.xpath("//button[@aria-label='Next' and .//span[text()='Next']]");
	private By proselectallsectionsLinkLocator = By.xpath("//button[@aria-disabled='false' and .//span[@aria-label='Select All Sections']]");
	private By accountprocessornextbuttonLocator = By.xpath("//button[@aria-label='Next' and .//span[text()='Next']]");
	private By dbaprocessornextbuttonLocator = By.xpath("//span[@class='btnLabel' and text()='Next']");
	private By licenseuploadbuttonLocator = By.xpath("//span[@class='slds-file-selector__button slds-button slds-button_neutral' and text()='Upload Files']");
	private By done11buttonLocator = By.xpath("//button[@aria-label='' and .//span[text()='Done']]");
	private By license1nextbuttonLocator = By.xpath("//button[@aria-label='Next' and .//span[text()='Next']]");
	private By accprocessornextbuttonLocator = By.xpath("//button[@aria-label='Next' and .//span[text()='Next']]");
	private By accountuploadbuttonLocator = By.xpath("//span[@class='slds-file-selector__button slds-button slds-button_neutral' and text()='Upload Files']");
	private By done12buttonLocator = By.xpath("//span[@class='label bBody' and text()='Done']");
	private By acc1processornextbuttonLocator = By.xpath("//span[@class='btnLabel' and text()='Next']");
	private By extractingbiomassLocator = By.xpath("//span[@class='slds-form-element__label slds-p-top_none' and text()='Extracting Biomass']");
	private By tier1buttonLocator = By.xpath("//label[@data-index='0' and .//span[text()='Tier 1']]");
	private By operationalnextbuttonLocator = By.xpath("//button[contains(@class, 'vlocity-btn') and .//span[text()='Next']]");
	private By operationalradiono1Locator = By.xpath("//input[@id='vlocity-radio-8-1-914' and @type='radio']");
	private By operationalradiono2Locator = By.xpath("//input[@id='vlocity-radio-9-1-926' and @type='radio']");
	private By operationalradiono3Locator = By.xpath("//input[@id='vlocity-radio-10-1-958' and @type='radio']");
	private By operationalagreeLocator = By.xpath("//label[@class='slds-checkbox__label' and @for='input156-983']");
	private By disposalplantextLocator = By.xpath("//textarea[@id='textareaId-1004' and @class='slds-textarea']");
	private By operational1nextbuttonLocator = By.xpath("//button[@aria-label='Next']");
	private By intendedcheckboxLocator = By.xpath("//span[@class='slds-form-element__label slds-p-top_none' and text()='Intended for human consumption']");
	private By materialstoredtextLocator = By.xpath("//textarea[@id='textareaId-1022' and @class='slds-textarea']");
	private By containmentcheckboxLocator = By.xpath("//span[@class='slds-form-element__label slds-p-top_none' and text()='Containment Walls']");
	private By capturesignprocessorLocator = By.xpath("//button[@class='slds-button slds-button_success' and @title='Clear Signature' and text()='Capture Signature']");
	private By signnameprocessortextLocator = By.xpath("//input[@id='input164-1056' and @class='vlocity-input slds-input' and @type='text']");
	private By confirmnextbuttonprocessorLocator = By.xpath("//span[@aria-label='Next' and text()='Next']");
	private By home5buttonLocator = By.xpath("//a[@role='menuitem' and text()='Home']");
	private By hempretailLinkLocator = By.xpath("//div[@class='lwc-rfo3qhj7u4 comm-tile-menu__item-title vertical-padding slds-text-align_center' and text()='Retail Application']");
	private By continueretailLinkLocator = By.xpath("//span[@aria-label='Continue']");
	private By retailagreeyesLinkLocator = By.xpath("//label//span[text()='Yes']");
	private By retailagreenextbuttonLocator = By.xpath("//span[@aria-label='Next']");
	private By newapppretailLinkLocator = By.xpath("//span[@class='slds-form-element__label slds-p-top_none' and text()='New Application']");
	private By appliretailnextbuttonLocator = By.xpath("//span[@aria-label='Next']");
	private By dbaretailnextbuttonLocator = By.xpath("//span[@aria-label='Next']");
	private By permitretailnextbuttonLocator = By.xpath("//span[@aria-label='Next']");
	private By acc1tretailnextbuttonLocator = By.xpath("//button[@role='button' and @aria-label='Next']");
	private By capturesignretailLocator = By.xpath("//button[@title='Clear Signature']");
	private By signnameretailtextLocator = By.xpath("//input[@class='vlocity-input slds-input' and @type='text' and @id='input70-456']");
	private By confirmnextbuttonretailLocator = By.xpath("//span[@aria-label='Next']");
	private By offlinepaymentretailLinkLocator = By.xpath("//span[@class='slds-form-element__label slds-p-top_none' and text()='Offline Payment']");
	private By CashbuttonretailLocator = By.xpath("//span[@class='slds-form-element__label slds-p-top_none' and text()='Cash']");
	private By retailconfNextbuttonLocator = By.xpath("//button[@role='button' and @aria-label='Next']");
	private By retailfinishbuttonLocator = By.xpath("//button//span[text()='Finish']");
	
	
	
	
	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
 
	// Methods
	public void enterEmail(String email) {
		addDelay(5000L);
		WebElement emailInput = driver.findElement(emailInputLocator);
		emailInput.sendKeys(email);
	}
 
	public void enterPassword(String password) {
		WebElement passwordInput = driver.findElement(passwordInputLocator);
		passwordInput.sendKeys(password);
	}
 
	public void clickLoginButton() {
		WebElement loginButton = driver.findElement(loginButtonLocator);
		loginButton.click();
		addDelay(15000L);
	}
 
	public boolean verifyHomePage() {
		return driver.findElement(LoginApplicationLocator).isDisplayed();
	}
 
	
	public void LoginExperienceLink() {
		WebElement LoginExperienceLink = driver.findElement(LoginApplicationLocator);
		LoginExperienceLink.click();
		addDelay(5000L);
	}
	
	public void siteuserLink() {
		WebElement siteuserLink = driver.findElement(siteuserLocator);
		siteuserLink.click();
		addDelay(10000L);
	}
	
	/* &&&&
	public void seedLink() {
		WebElement seedLink = driver.findElement(seedLinkLocator);
		seedLink.click();
		addDelay(5000L);
	}
	public void seedsampleLink() {
		WebElement seedsampleLink = driver.findElement(seedsampleLinkkLocator);
		seedsampleLink.click();
		addDelay(9000L);
	}
	public void continueseedLink() {
		WebElement continueseedLink = driver.findElement(continueseedLinkLocator);
		continueseedLink.click();
		addDelay(15000L);
	}
	
	public void seednextbutton() {
		WebElement seednextbutton = driver.findElement(seednextbuttonLocator);
		seednextbutton.click();
		addDelay(9000L);
	}
	public void seedcontactnextbutton() {
		WebElement seedcontactnextbutton = driver.findElement(seedcontactnextbuttonLocator);
		seedcontactnextbutton.click();
		addDelay(15000L);
	}
	public void seedaccountnextbutton() {
		WebElement seedaccountnextbutton = driver.findElement(seedaccountnextbuttonLocator);
		seedaccountnextbutton.click();
		addDelay(15000L);
	}
	public void seedaccountbnextbutton() {
		WebElement seedaccountbnextbutton = driver.findElement(seedaccountbnextbuttonLocator);
		seedaccountbnextbutton.click();
		addDelay(15000L);
	}
	public void seedsamplenextbutton() {
		WebElement seedsamplenextbutton = driver.findElement(seedsamplenextbuttonLocator);
		seedsamplenextbutton.click();
		addDelay(15000L);
	}
	public void seedsamplebnextbutton() {
		WebElement seedsamplebnextbutton = driver.findElement(seedsamplebnextbuttonLocator);
		seedsamplebnextbutton.click();
		addDelay(15000L);
	}
	&&&& */
	
	
	/*
	public void couriertypeOption() {
		WebElement couriertypedropdown = driver.findElement(couriertypeLocator);
		couriertypedropdown.click();
		addDelay(8000L);
		
		List<WebElement> couriertypeOption = driver.findElements(couriertypeOptionvalue);
		couriertypeOption.get(0).click();
		addDelay(8000L);                
     }
	public void capturesignseedbutton() {
		WebElement capturesignseedbutton = driver.findElement(capturesignseedbuttonLocator);
		capturesignseedbutton.click();
		addDelay(8000L);
	}
	public void signednameseedtext(String signednameseed) {
		WebElement emailInput1 = driver.findElement(signednameseedtextLocator);
		emailInput1.sendKeys(signednameseed);
		addDelay(8000L);
	}
	public void jobtitleseedtext(String jobtitleseed) {
		WebElement emailInput1 = driver.findElement(jobtitleseedtextLocator);
		emailInput1.sendKeys(jobtitleseed);
		addDelay(8000L);
	}
	public void signnextbuttons() {
		WebElement signnextbuttons = driver.findElement(signnextbuttonsLocator);
		signnextbuttons.click();
		addDelay(8000L);
	}
	*/
	
	/* &&&&&&
	 
	 
	public void homepagebutton() {
		WebElement homepagebutton = driver.findElement(homepagebuttonLocator);
		homepagebutton.click();
		addDelay(7000L);
	}
	
	public void weedLink() {
		WebElement weedLink = driver.findElement(weedLinkLocator);
		weedLink.click();
		addDelay(20000L);
	}
	public void weedfreeLink() {
		WebElement weedfreeLink = driver.findElement(weedfreeLinkLocator);
		weedfreeLink.click();
		addDelay(20000L);
	}
	
	public void continueweedbutton() {
		WebElement continueweedbutton = driver.findElement(continueweedbuttonLocator);
		continueweedbutton.click();
		addDelay(10000L);
	}
	public void weednextbutton() {
		WebElement weednextbutton = driver.findElement(weednextbuttonLocator);
		weednextbutton.click();
		addDelay(10000L);
	}
	public void weedcontactnextbutton() {
		WebElement weedcontactnextbutton = driver.findElement(weedcontactnextbuttonLocator);
		weedcontactnextbutton.click();
		addDelay(10000L);
	}
	public void weedaccountnextbutton() {
		WebElement weedaccountnextbutton = driver.findElement(weedaccountnextbuttonLocator);
		weedaccountnextbutton.click();
		addDelay(10000L);
	}
	public void weedaccountbnextbutton() {
		WebElement weedaccountbnextbutton = driver.findElement(weedaccountbnextbuttonLocator);
		weedaccountbnextbutton.click();
		addDelay(10000L);
	}
	&&& */
	
	/*
	public void fieldyesradiobutton() {
		WebElement fieldyesradiobutton = driver.findElement(fieldyesradiobuttonLocator);
		fieldyesradiobutton.click();
		addDelay(9000L);
	}
	
	
	public void datefieldbutton() {
		WebElement datefieldbutton = driver.findElement(datefieldbuttonLocator);
		datefieldbutton.click();
		addDelay(5000L);
	}
	public void datebutton() {
		WebElement datebutton = driver.findElement(datebuttonLocator);
		datebutton.click();
		addDelay(5000L);
	}
	public void fieldnextbutton() {
		WebElement fieldnextbutton = driver.findElement(fieldnextbuttonLocator);
		fieldnextbutton.click();
		addDelay(5000L);
	}
	public void capturesignbutton() {
		WebElement capturesignbutton = driver.findElement(capturesignbuttonLocator);
		capturesignbutton.click();
		addDelay(5000L);
	}
	public void signedname1text(String signedname1) {
		WebElement emailInput1 = driver.findElement(signedname1textLocator);
		emailInput1.sendKeys(signedname1);
		addDelay(3000L);
	}
	public void jobtitle1text(String jobtitle1) {
		WebElement emailInput1 = driver.findElement(jobtitle1textLocator);
		emailInput1.sendKeys(jobtitle1);
		addDelay(3000L);
	}
	public void confirmnextbutton() {
		WebElement confirmnextbutton = driver.findElement(confirmnextbuttonLocator);
		confirmnextbutton.click();
		addDelay(5000L);
	}
	*/
	/* &&&
	public void home1pagebutton() {
		WebElement home1pagebutton = driver.findElement(home1pagebuttonLocator);
		home1pagebutton.click();
		addDelay(10000L);
	}
	&&& */
	/*
	public void pesticideLink() {
		WebElement pesticideLink = driver.findElement(pesticideLocator);
		pesticideLink.click();
		addDelay(5000L);
	}
	
	public void RUPDealer() {
		WebElement RUPDealer= driver.findElement(RUPDealerLocator);
		RUPDealer.click();
		addDelay(15000L);
	}
	
	public void continuebutton() {
		WebElement continuebutton = driver.findElement(continuebuttonLocator);
		continuebutton.click();
		addDelay(5000L);
	}
	
	public void ApplicationTypenextbutton() {
		WebElement ApplicationTypenextbutton = driver.findElement(ApplicationNextLoactor);
		ApplicationTypenextbutton.click();
		addDelay(5000L);
	}
	
	public void ContactInformationnextbutton() {
		WebElement ContactInformationnextbutton = driver.findElement(Contactnextlocator);
		ContactInformationnextbutton.click();
		addDelay(7000L);
	}
	
	public void section1accountinformationnext() {
		WebElement section1accountinformationnext = driver.findElement(accountinfonextLocator);
		section1accountinformationnext.click();
		addDelay(8000L);
	}
	
	
	public void LicenseNumber11() {
		WebElement LicenseNumber11 = driver.findElement(LicenseNumberLocator);
		LicenseNumber11.click();
		addDelay(10000L);
	}
	
		
     public void Signedtext(String signedbyname) {
       WebElement Signed = driver.findElement(SignedbyLocator);
		Signed.sendKeys(signedbyname);
		addDelay(10000L);
	}
     
	public void jobtitle(String jobtitle){
		WebElement JobTitle1 = driver.findElement(JobTitleLocator);
		JobTitle1.sendKeys(jobtitle);
		addDelay(10000L);
	}
	
	public void Capture() {
		WebElement Capture = driver.findElement(capturesignLocator);
		Capture.click();
		addDelay(7000L);
	}
	
	
	public void nextbutton() {
		WebElement nextbutton = driver.findElement(nextbuttonLocator);
		nextbutton.click();
		addDelay(7000L);
	}
	
	
	*/
	/* &&&&&
	
	public void kratomLink() {
		WebElement kratomLink = driver.findElement(kratomLinkLocator);
		kratomLink.click();
		addDelay(10000L);
	}
	public void continuekratomLink() {
		WebElement continuekratomLink = driver.findElement(continuekratomLinkLocator);
		continuekratomLink.click();
		addDelay(15000L);
	}
	
	public void newapplicationkLink() {
		WebElement newapplicationkLink = driver.findElement(newapplicationkLinkLocator);
		newapplicationkLink.click();
		addDelay(5000L);
	}
	public void kratomnextbuttonLink() {
		WebElement kratomnextbuttonLink = driver.findElement(kratomnextbuttonLinkLocator);
		kratomnextbuttonLink.click();
		addDelay(10000L);
	}
	public void kratomaccountnextbuttonLink() {
		WebElement kratomaccountnextbuttonLink = driver.findElement(kratomaccountnextbuttonLinkLocator);
		kratomaccountnextbuttonLink.click();
		addDelay(10000L);
	}
	public void kratomaccountbnextbutton() {
		WebElement kratomaccountbnextbutton = driver.findElement(kratomaccountbnextbuttonLocator);
		kratomaccountbnextbutton.click();
		addDelay(10000L);
	}
	public void home2button() {
		WebElement home2button = driver.findElement(home2buttonLocator);
		home2button.click();
		addDelay(7000L);
	}
	&&& */
	
	/*
	public void productnoLink() {
		WebElement productnoLink = driver.findElement(productnoLinkLocator);
		productnoLink.click();
		addDelay(5000L);
	}
	public void addproductbuttonLink() {
		WebElement addproductbuttonLink = driver.findElement(addproductbuttonLinkLocator);
		addproductbuttonLink.click();
		addDelay(5000L);
	}
	public void kratomnametext(String kratomname) {
		WebElement emailInput1 = driver.findElement(kratomnametextLocator);
		emailInput1.sendKeys(kratomname);
		addDelay(5000L);
	}
	public void rawleafLink() {
		WebElement rawleafLink = driver.findElement(rawleafLinkLocator);
		rawleafLink.click();
		addDelay(5000L);
	}
	public void home2button() {
		WebElement home2button = driver.findElement(home2buttonLocator);
		home2button.click();
		addDelay(7000L);
	}
	public void lotbatchtext(String lotbatch) {
		WebElement emailInput1 = driver.findElement(lotbatchtextLocator);
		emailInput1.sendKeys(lotbatch);
		addDelay(5000L);
	}
	public void directiontext(String direction) {
		WebElement emailInput1 = driver.findElement(directiontextLocator);
		emailInput1.sendKeys(direction);
		addDelay(3000L);
	}
	public void massvolumetext(String massvolume) {
		WebElement emailInput1 = driver.findElement(massvolumetextLocator);
		emailInput1.sendKeys(massvolume);
		addDelay(3000L);
	}
	public void uploadfilesbutton() {
		WebElement uploadfilesbutton =driver.findElement(uploadfilesbuttonLocator);
		uploadfilesbutton.click();
		addDelay(5000L);
		String filePath = "C:\\Users\\uandh\\Downloads\\Renewal Lease Application.pdf";
		WebElement fileInput = driver.findElement(By.xpath("//span[text()='Upload Files']"));
        fileInput.sendKeys(filePath);
        addDelay(15000L);
	
    
	 try {
         // Use Robot to simulate pressing the "Escape" key to close the file dialog
         Robot robot = new Robot();
         robot.keyPress(KeyEvent.VK_ESCAPE);
         robot.keyRelease(KeyEvent.VK_ESCAPE);
 
 
     } catch (Exception e) {
         e.printStackTrace();
     }
	
	}
	
	public void Donebutton() {
		WebElement Donebutton = driver.findElement(DonebuttonLocator);
		Donebutton.click();
		addDelay(10000L);
	}
	public void coayesLink() {
		WebElement coayesLink = driver.findElement(coayesLinkLocator);
		coayesLink.click();
		addDelay(5000L);
	}
	public void labnametext(String labname) {
		WebElement emailInput1 = driver.findElement(labnametextLocator);
		emailInput1.sendKeys(labname);
		addDelay(3000L);
	}
	public void isoyesLink() {
		WebElement isoyesLink = driver.findElement(isoyesLinkLocator);
		isoyesLink.click();
		addDelay(5000L);
	}
	public void uploadcoafilesbuttonbutton() {
		WebElement uploadcoafilesbuttonbutton =driver.findElement(uploadcoafilesbuttonLocator);
		uploadcoafilesbuttonbutton.click();
		addDelay(2000L);
		String filePath = "C:\\Users\\uandh\\Downloads\\Renewal Lease Application.pdf";
		WebElement fileInput = driver.findElement(By.xpath("//span[contains(@class, 'slds-file-selector__button') and contains(@class, 'slds-button') and contains(@class, 'slds-button_neutral')]"));
        fileInput.sendKeys(filePath);
        addDelay(15000L);
	
    
	 try {
         // Use Robot to simulate pressing the "Escape" key to close the file dialog
         Robot robot = new Robot();
         robot.keyPress(KeyEvent.VK_ESCAPE);
         robot.keyRelease(KeyEvent.VK_ESCAPE);
 
 
     } catch (Exception e) {
         e.printStackTrace();
     }
	
	}
	public void Done1button() {
		WebElement Done1button = driver.findElement(Done1buttonLocator);
		Done1button.click();
		addDelay(10000L);
	}
	public void level7text(String level7) {
		WebElement emailInput1 = driver.findElement(level7textLocator);
		emailInput1.sendKeys(level7);
		addDelay(3000L);
	}
	public void totalaerobictext(String totalaerobic) {
		WebElement emailInput1 = driver.findElement(totalaerobictextLocator);
		emailInput1.sendKeys(totalaerobic);
		addDelay(3000L);
	}
	public void totalcombtext(String totalcomb) {
		WebElement emailInput1 = driver.findElement(totalcombtextLocator);
		emailInput1.sendKeys(totalcomb);
		addDelay(3000L);
	}
	public void totalbiletext(String totalbile) {
		WebElement emailInput1 = driver.findElement(totalbiletextLocator);
		emailInput1.sendKeys(totalbile);
		addDelay(3000L);
	}
	public void salmonellatext(String salmonella) {
		WebElement emailInput1 = driver.findElement(salmonellatextLocator);
		emailInput1.sendKeys(salmonella);
		addDelay(3000L);
	}
	public void ecolitext(String ecoli) {
		WebElement emailInput1 = driver.findElement(ecolitextLocator);
		emailInput1.sendKeys(ecoli);
		addDelay(3000L);
	}
	public void arsenictext(String arsenic) {
		WebElement emailInput1 = driver.findElement(arsenictextLocator);
		emailInput1.sendKeys(arsenic);
		addDelay(3000L);
	}
	public void leadtext(String lead) {
		WebElement emailInput1 = driver.findElement(leadtextLocator);
		emailInput1.sendKeys(lead);
		addDelay(3000L);
	}
	public void cadmiumtext(String cadmium) {
		WebElement emailInput1 = driver.findElement(cadmiumtextLocator);
		emailInput1.sendKeys(cadmium);
		addDelay(3000L);
	}
	public void mercurytext(String mercury) {
		WebElement emailInput1 = driver.findElement(mercurytextLocator);
		emailInput1.sendKeys(mercury);
		addDelay(3000L);
	}
	public void savebutton() {
		WebElement savebutton = driver.findElement(savebuttonLocator);
		savebutton.click();
		addDelay(5000L);
	}
	public void productnextbutton() {
		WebElement productnextbutton = driver.findElement(productnextbuttonLocator);
		productnextbutton.click();
		addDelay(5000L);
	}
	public void capturesignkbutton() {
		WebElement capturesignkbutton = driver.findElement(capturesignkbuttonLocator);
		capturesignkbutton.click();
		addDelay(5000L);
	}
	public void signedname1ktext(String signedname1k) {
		WebElement emailInput1 = driver.findElement(signedname1ktextLocator);
		emailInput1.sendKeys(signedname1k);
		addDelay(3000L);
	}
	public void jobtitle1ktext(String jobtitle1k) {
		WebElement emailInput1 = driver.findElement(jobtitle1ktextLocator);
		emailInput1.sendKeys(jobtitle1k);
		addDelay(3000L);
	}
	public void confirmnextbuttonk() {
		WebElement confirmnextbuttonk = driver.findElement(confirmnextbuttonkLocator);
		confirmnextbuttonk.click();
		addDelay(5000L);
	}
	public void offlinepayment() {
		WebElement offlinepayment = driver.findElement(offlinepaymentLocator);
		offlinepayment.click();
		addDelay(10000L);
	}
	public void Cashbutton() {
		WebElement Cashbutton = driver.findElement(CashbuttonLocator);
		Cashbutton.click();
		addDelay(10000L);
	}
	public void confirmationNextButton() {
		WebElement confirmationNextButton = driver.findElement(confirmationNextButtonLocator);
		confirmationNextButton.click();
		addDelay(15000L);
	}
	public void finishButton() {
		WebElement finishButton = driver.findElement(finishButtonLocator);
		finishButton.click();
		addDelay(15000L);
	}
	*/
	
	/* &&&
	public void nurseryLink() {
		WebElement nurseryLink = driver.findElement(nurseryLinkLocator);
		nurseryLink.click();
		addDelay(10000L);
	}
	public void continuenurseryLink() {
		WebElement continuenurseryLink = driver.findElement(continuenurseryLinkLocator);
		continuenurseryLink.click();
		addDelay(8000L);
	}
	public void acknowledgecheckboxLink() {
		WebElement acknowledgecheckboxLink = driver.findElement(acknowledgecheckboxLinkLocator);
		acknowledgecheckboxLink.click();
		addDelay(15000L);
	}

	public void continueacknowLink() {
		WebElement continueacknowLink = driver.findElement(continueacknowLinkLocator);
		continueacknowLink.click();
		addDelay(8000L);
	}
	public void newapplicationnurLink() {
		WebElement newapplicationnurLink = driver.findElement(newapplicationnurLinkLocator);
		newapplicationnurLink.click();
		addDelay(15000L);
	}

	public void nurserymanLink() {
		WebElement nurserymanLink = driver.findElement(nurserymanLinkLocator);
		nurserymanLink.click();
		addDelay(8000L);
	}
	public void nurseryaccnextbutton() {
		WebElement nurseryaccnextbutton = driver.findElement(nurseryaccnextbuttonLocator);
		nurseryaccnextbutton.click();
		addDelay(8000L);
	}
	public void nurserydbanextbutton() {
		WebElement nurserydbanextbutton = driver.findElement(nurserydbanextbuttonLocator);
		nurserydbanextbutton.click();
		addDelay(8000L);
	}
	public void nurserycontactnextbutton() {
		WebElement nurserycontactnextbutton = driver.findElement(nurserycontactnextbuttonLocator);
		nurserycontactnextbutton.click();
		addDelay(8000L);
	}
	public void nurseryacc1nextbutton() {
		WebElement nurseryacc1nextbutton = driver.findElement(nurseryacc1nextbuttonLocator);
		nurseryacc1nextbutton.click();
		addDelay(8000L);
	}
	public void nurseryacc2nextbutton() {
		WebElement nurseryacc2nextbutton = driver.findElement(nurseryacc2nextbuttonLocator);
		nurseryacc2nextbutton.click();
		addDelay(8000L);
	}
	public void noofgrowertext(String noofgrower) {
	    WebElement noofgrowertext = driver.findElement(noofgrowertextLocator);
	    noofgrowertext.sendKeys("noofgrower");
			addDelay(8000L);		
	}	  
	public void greenhousetext(String greenhouse){
		WebElement greenhousetext = driver.findElement(greenhousetextLocator);
		greenhousetext.sendKeys("greenhouse");
			addDelay(8000L);
	}
	public void generalnurseryLink() {
		WebElement generalnurseryLink = driver.findElement(generalnurseryLinkLocator);
		generalnurseryLink.click();
		addDelay(8000L);
	}
	public void exportyesLink() {
		WebElement exportyesLink = driver.findElement(exportyesLinkLocator);
		exportyesLink.click();
		addDelay(8000L);
	}
	public void licensenextbutton() {
		WebElement licensenextbutton = driver.findElement(licensenextbuttonLocator);
		licensenextbutton.click();
		addDelay(8000L);
	}
	public void capturesignnurseryLink() {
		WebElement capturesignnurseryLink = driver.findElement(capturesignnurseryLinkLocator);
		capturesignnurseryLink.click();
		addDelay(8000L);
	}
	public void signnamenurserytext(String signnamenursery) {
	    WebElement signnamenurserytext = driver.findElement(signnamenurserytextLocator);
	    signnamenurserytext.sendKeys("um test");
			addDelay(8000L);
		
	}
	  
	public void jobnurserytext(String jobnursery){
		WebElement jobnurserytext = driver.findElement(jobnurserytextLocator);
		jobnurserytext.sendKeys("Testjob");
			addDelay(8000L);
	}
	public void confirmnextbuttonnurseryLink() {
		WebElement confirmnextbuttonnurseryLink = driver.findElement(confirmnextbuttonnurseryLinkLocator);
		confirmnextbuttonnurseryLink.click();
		addDelay(8000L);
	}
	&&& */

	        
	public void apiaryLink() {
		WebElement apiaryLink = driver.findElement(apiaryLinkLocator);
		apiaryLink.click();
		addDelay(8000L);
	}
	public void apiarylicenseLink() {
		WebElement apiarylicenseLink = driver.findElement(apiarylicenseLinkLocator);
		apiarylicenseLink.click();
		addDelay(9000L);
	}
	public void continueapiaryLink() {
		WebElement continueapiaryLink = driver.findElement(continueapiaryLinkLocator);
		continueapiaryLink.click();
		addDelay(8000L);
	}
	public void newapplicationapiaryLink() {
		WebElement newapplicationapiaryLink = driver.findElement(newapplicationapiaryLinkLocator);
		newapplicationapiaryLink.click();
		addDelay(8000L);
	}
	public void beekeeperLink() {
		WebElement beekeeperLink = driver.findElement(beekeeperLinkLocator);
		beekeeperLink.click();
		addDelay(8000L);
	}
	public void apiarynextbutton() {
		WebElement apiarynextbutton = driver.findElement(apiarynextbuttonLocator);
		apiarynextbutton.click();
		addDelay(8000L);
	}
	public void apiarydbanextbutton() {
		WebElement apiarydbanextbutton = driver.findElement(apiarydbanextbuttonLocator);
		apiarydbanextbutton.click();
		addDelay(8000L);
	}
	public void apiarycontactnextbutton() {
		WebElement apiarycontactnextbutton = driver.findElement(apiarycontactnextbuttonLocator);
		apiarycontactnextbutton.click();
		addDelay(8000L);
	}
	public void apiaryacc1nextbutton() {
		WebElement apiaryacc1nextbutton = driver.findElement(apiaryacc1nextbuttonLocator);
		apiaryacc1nextbutton.click();
		addDelay(8000L);
	}
	public void apiaryacc2nextbutton() {
		WebElement apiaryacc2nextbutton = driver.findElement(apiaryacc2nextbuttonLocator);
		apiaryacc2nextbutton.click();
		addDelay(8000L);
	}
	public void hivestext(String hives) {
	    WebElement hivestext = driver.findElement(hivestextLocator);
	    hivestext.click();
	    hivestext.sendKeys(hives);
			addDelay(8000L);
		
	}
	public void emailLink() {
		WebElement emailLink = driver.findElement(emailLinkLocator);
		emailLink.click();
		addDelay(8000L);
	}
	public void beekeepernextbutton() {
		WebElement beekeepernextbutton = driver.findElement(beekeepernextbuttonLocator);
		beekeepernextbutton.click();
		addDelay(8000L);
	}
	public void capturesignapiarybutton() {
		WebElement capturesignapiarybutton = driver.findElement(capturesignapiarybuttonLocator);
		capturesignapiarybutton.click();
		addDelay(8000L);
	}
	public void signnameapiarytext(String signnameapiary) {
	    WebElement signnameapiarytext = driver.findElement(signnameapiarytextLocator);
	    signnameapiarytext.click();
	    signnameapiarytext.sendKeys(signnameapiary);
			addDelay(8000L);
		
	}
	public void jobapiarytext(String jobapiary) {
	    WebElement jobapiarytext = driver.findElement(jobapiarytextLocator);
	    jobapiarytext.click();
	    jobapiarytext.sendKeys(jobapiary);
			addDelay(9000L);
		
	}
	public void confirmnextapiarybutton() {
		WebElement confirmnextapiarybutton = driver.findElement(confirmnextapiarybuttonLocator);
		confirmnextapiarybutton.click();
		addDelay(8000L);
	}
	public void home3button() {
		WebElement home3button = driver.findElement(home3buttonLocator);
		home3button.click();
		addDelay(7000L);
	}
	public void apiary1Link() {
		WebElement apiary1Link = driver.findElement(apiary1LinkLocator);
		apiary1Link.click();
		addDelay(8000L);
	}
	public void apiarysampleLink() {
		WebElement apiarysampleLink = driver.findElement(apiarysampleLinkLocator);
		apiarysampleLink.click();
		addDelay(8000L);
	}
	public void continuesampleLink() {
		WebElement continuesampleLink = driver.findElement(continuesampleLinkLocator);
		continuesampleLink.click();
		addDelay(8000L);
	}
	public void acknowapisampleLink() {
		WebElement acknowapisampleLink = driver.findElement(acknowapisampleLinkLocator);
		acknowapisampleLink.click();
		addDelay(8000L);
	}
	public void apisamplenextbutton() {
		WebElement apisamplenextbutton = driver.findElement(apisamplenextbuttonLocator);
		apisamplenextbutton.click();
		addDelay(8000L);
	}
	public void applicationnextbutton() {
		WebElement applicationnextbutton = driver.findElement(applicationnextbuttonLocator);
		applicationnextbutton.click();
		addDelay(9000L);
	}
	public void apisamplecontactnextbutton() {
		WebElement apisamplecontactnextbutton = driver.findElement(apisamplecontactnextbuttonLocator);
		apisamplecontactnextbutton.click();
		addDelay(9000L);
	}
	public void apisampleacc1nextbutton() {
		WebElement apisampleacc1nextbutton = driver.findElement(apisampleacc1nextbuttonLocator);
		apisampleacc1nextbutton.click();
		addDelay(9000L);
	}
	public void apisampleacc2nextbutton() {
		WebElement apisampleacc2nextbutton = driver.findElement(apisampleacc2nextbuttonLocator);
		apisampleacc2nextbutton.click();
		addDelay(8000L);
	}
	public void myselfradiobutton() {
		WebElement myselfradiobutton = driver.findElement(myselfradiobuttonLocator);
		myselfradiobutton.click();
		addDelay(8000L);
	}
	public void stateyesLink() {
		WebElement stateyesLink = driver.findElement(stateyesLinkLocator);
		stateyesLink.click();
		addDelay(8000L);
	}
	public void udafnoLink() {
		WebElement udafnoLink = driver.findElement(udafnoLinkLocator);
		udafnoLink.click();
		addDelay(8000L);
	}
	public void beekeepsamplenextbutton() {
		WebElement beekeepsamplenextbutton = driver.findElement(beekeepsamplenextbuttonLocator);
		beekeepsamplenextbutton.click();
		addDelay(8000L);
	}
	public void beekeepercheckLink() {
		WebElement beekeepercheckLink = driver.findElement(beekeepercheckLinkLocator);
		beekeepercheckLink.click();
		addDelay(8000L);
	}
	public void emailcheckLink() {
		WebElement emailcheckLink = driver.findElement(emailcheckLinkLocator);
		emailcheckLink.click();
		addDelay(8000L);
	}
	public void contactsamplenextbutton() {
		WebElement contactsamplenextbutton = driver.findElement(contactsamplenextbuttonLocator);
		contactsamplenextbutton.click();
		addDelay(8000L);
	}
	public void beecontactextbutton() {
		WebElement beecontactextbutton = driver.findElement(beecontactextbuttonLocator);
		beecontactextbutton.click();
		addDelay(8000L);
	}
	public void addsamplebutton() {
		WebElement addsamplebutton = driver.findElement(addsamplebuttonLocator);
		addsamplebutton.click();
		addDelay(8000L);
	}
	public void samplenametext(String samplename) {
	    WebElement samplenametext = driver.findElement(samplenametextLocator);
	    samplenametext.click();
	    samplenametext.sendKeys(samplename);
			addDelay(8000L);
		
	}
	public void samplelocationtext(String samplelocation) {
	    WebElement samplelocationtext = driver.findElement(samplelocationtextLocator);
	    samplelocationtext.click();
	    samplelocationtext.sendKeys(samplelocation);
			addDelay(8000L);
		
	}
	public void broodLink() {
		WebElement broodLink = driver.findElement(broodLinkLocator);		
		broodLink.click();
		addDelay(8000L);
	}
	public void apisavebutton() {
		WebElement apisavebutton = driver.findElement(apisavebuttonLocator);
		apisavebutton.click();
		addDelay(8000L);
	}
	public void brrodsamplenextbutton() {
		WebElement brrodsamplenextbutton = driver.findElement(brrodsamplenextbuttonLocator);
		brrodsamplenextbutton.click();
		addDelay(8000L);
	}
	public void PhysicalsubmissionLink() {
		WebElement PhysicalsubmissionLink = driver.findElement(PhysicalsubmissionLinkLocator);
		PhysicalsubmissionLink.click();
		addDelay(8000L);
	}
	public void uspsLink() {
		WebElement uspsLink = driver.findElement(uspsLinkLocator);
		uspsLink.click();
		addDelay(8000L);
	}
	public void submissionnextbutton() {
		WebElement submissionnextbutton = driver.findElement(submissionnextbuttonLocator);
		submissionnextbutton.click();
		addDelay(8000L);
	}
	public void capturesignsamplebutton() {
		WebElement capturesignsamplebutton = driver.findElement(capturesignsamplebuttonLocator);
		capturesignsamplebutton.click();
		addDelay(8000L);
	}
	public void signnamesampletext(String signnamesample) {
	    WebElement signnamesampletext = driver.findElement(signnamesampletextLocator);
	    signnamesampletext.sendKeys("testum");
			addDelay(8000L);
		
	}
	public void jobsampletext(String jobsample) {
	    WebElement jobsampletext = driver.findElement(jobsampletextLocator);
	    jobsampletext.sendKeys("testjob");
			addDelay(8000L);
		
	}
	public void confirmnextbuttonapisample() {
		WebElement confirmnextbuttonapisample = driver.findElement(confirmnextbuttonapisampleLocator);
		confirmnextbuttonapisample.click();
		addDelay(8000L);
	}
	public void home4button() {
		WebElement home4button = driver.findElement(home4buttonLocator);
		home4button.click();
		addDelay(7000L);
	}
	public void industrialhempLink() {
		WebElement industrialhempLink = driver.findElement(industrialhempLinkLocator);
		industrialhempLink.click();
		addDelay(8000L);
	}
	public void hempprocessorLink() {
		WebElement hempprocessorLink = driver.findElement(hempprocessorLinkLocator);
		hempprocessorLink.click();
		addDelay(9000L);
	}
	public void continueprocessorLink() {
		WebElement continueprocessorLink = driver.findElement(continueprocessorLinkLocator);
		continueprocessorLink.click();
		addDelay(5000L);
	}
	public void agreementyesLink() {
		WebElement agreementyesLink = driver.findElement(agreementyesLinkLocator);
		agreementyesLink.click();
		addDelay(5000L);
	}
	public void agreementnextbutton() {
		WebElement agreementnextbutton = driver.findElement(agreementnextbuttonLocator);
		agreementnextbutton.click();
		addDelay(5000L);
	}
	public void newappprocessorLink() {
		WebElement newappprocessorLink = driver.findElement(newappprocessorLinkLocator);
		newappprocessorLink.click();
		addDelay(5000L);
	}
	public void appliprocessornextbutton() {
		WebElement appliprocessornextbutton = driver.findElement(appliprocessornextbuttonLocator);
		appliprocessornextbutton.click();
		addDelay(5000L);
	}
	public void proselectallsectionsLink() {
		WebElement proselectallsectionsLink = driver.findElement(proselectallsectionsLinkLocator);
		proselectallsectionsLink.click();
		addDelay(5000L);
	}
	public void accountprocessornextbutton() {
		WebElement accountprocessornextbutton = driver.findElement(accountprocessornextbuttonLocator);
		accountprocessornextbutton.click();
		addDelay(5000L);
	}
	public void dbaprocessornextbutton() {
		WebElement dbaprocessornextbutton = driver.findElement(dbaprocessornextbuttonLocator);
		dbaprocessornextbutton.click();
		addDelay(5000L);
	}
	public void licenseuploadbutton() {
		WebElement licenseuploadbutton = driver.findElement(licenseuploadbuttonLocator);
		licenseuploadbutton.click();
		addDelay(5000L);
	}
	public void done11button() {
		WebElement done11button = driver.findElement(done11buttonLocator);
		done11button.click();
		addDelay(5000L);
	}
	public void license1nextbutton() {
		WebElement license1nextbutton = driver.findElement(license1nextbuttonLocator);
		license1nextbutton.click();
		addDelay(5000L);
	}
	public void accprocessornextbutton() {
		WebElement accprocessornextbutton = driver.findElement(accprocessornextbuttonLocator);
		accprocessornextbutton.click();
		addDelay(5000L);
	}
	public void accountuploadbutton() {
		WebElement accountuploadbutton = driver.findElement(accountuploadbuttonLocator);
		accountuploadbutton.click();
		addDelay(5000L);
	}
	public void done12button() {
		WebElement done12button = driver.findElement(done12buttonLocator);
		done12button.click();
		addDelay(5000L);
	}
	public void acc1processornextbutton() {
		WebElement acc1processornextbutton = driver.findElement(acc1processornextbuttonLocator);
		acc1processornextbutton.click();
		addDelay(5000L);
	}
	public void extractingbiomass() {
		WebElement extractingbiomass = driver.findElement(extractingbiomassLocator);
		extractingbiomass.click();
		addDelay(5000L);
	}
	public void tier1button() {
		WebElement tier1button = driver.findElement(tier1buttonLocator);
		tier1button.click();
		addDelay(5000L);
	}
	public void operationalnextbutton() {
		WebElement operationalnextbutton = driver.findElement(operationalnextbuttonLocator);
		operationalnextbutton.click();
		addDelay(5000L);
	}
	public void operationalradiono1() {
		WebElement operationalradiono1 = driver.findElement(operationalradiono1Locator);
		operationalradiono1.click();
		addDelay(5000L);
	}
	public void operationalradiono2() {
		WebElement operationalradiono2 = driver.findElement(operationalradiono2Locator);
		operationalradiono2.click();
		addDelay(5000L);
	}
	public void operationalradiono3() {
		WebElement operationalradiono3 = driver.findElement(operationalradiono3Locator);
		operationalradiono3.click();
		addDelay(8000L);
	}
	public void operationalagree() {
		WebElement operationalagree = driver.findElement(operationalagreeLocator);
		operationalagree.click();
		addDelay(8000L);
	}
	public void disposalplantext(String disposalplan) {
	    WebElement disposalplantext = driver.findElement(disposalplantextLocator);
	    disposalplantext.sendKeys("test disposal");
			addDelay(9000L);
		
	}
	public void operational1nextbutton() {
		WebElement operational1nextbutton = driver.findElement(operational1nextbuttonLocator);
		operational1nextbutton.click();
		addDelay(8000L);
	}
	public void intendedcheckbox() {
		WebElement intendedcheckbox = driver.findElement(intendedcheckboxLocator);
		intendedcheckbox.click();
		addDelay(8000L);
	}
	public void materialstoredtext(String materialstored) {
	    WebElement materialstoredtext = driver.findElement(materialstoredtextLocator);
	    materialstoredtext.sendKeys("test material");
			addDelay(9000L);
	}
	public void containmentcheckbox() {
		WebElement containmentcheckbox = driver.findElement(containmentcheckboxLocator);
		containmentcheckbox.click();
		addDelay(8000L);
	}
	public void capturesignprocessor() {
		WebElement capturesignprocessor = driver.findElement(capturesignprocessorLocator);
		capturesignprocessor.click();
		addDelay(8000L);
	}
	public void signnameprocessortext(String signnameprocessor) {
	    WebElement signnameprocessortext = driver.findElement(signnameprocessortextLocator);
	    signnameprocessortext.sendKeys("test sign");
			addDelay(9000L);
	}
	public void confirmnextbuttonprocessor() {
		WebElement confirmnextbuttonprocessor = driver.findElement(confirmnextbuttonprocessorLocator);
		confirmnextbuttonprocessor.click();
		addDelay(8000L);
	}
	public void home5button() {
		WebElement home5button = driver.findElement(home5buttonLocator);
		home5button.click();
		addDelay(7000L);
	}
	public void hempretailLink() {
		WebElement hempretailLink = driver.findElement(hempretailLinkLocator);
		hempretailLink.click();
		addDelay(8000L);
	}
	public void continueretailLink() {
		WebElement continueretailLink = driver.findElement(continueretailLinkLocator);
		continueretailLink.click();
		addDelay(9000L);
	}
	public void retailagreeyesLink() {
		WebElement retailagreeyesLink = driver.findElement(retailagreeyesLinkLocator);
		retailagreeyesLink.click();
		addDelay(5000L);
	}
	public void retailagreenextbutton() {
		WebElement retailagreenextbutton = driver.findElement(retailagreenextbuttonLocator);
		retailagreenextbutton.click();
		addDelay(5000L);
	}
	public void newapppretailLink() {
		WebElement newapppretailLink = driver.findElement(newapppretailLinkLocator);
		newapppretailLink.click();
		addDelay(5000L);
	}
	public void appliretailnextbutton() {
		WebElement appliretailnextbutton = driver.findElement(appliretailnextbuttonLocator);
		appliretailnextbutton.click();
		addDelay(5000L);
	}
	public void dbaretailnextbutton() {
		WebElement dbaretailnextbutton = driver.findElement(dbaretailnextbuttonLocator);
		dbaretailnextbutton.click();
		addDelay(5000L);
	}

	public void permitretailnextbutton() {
		WebElement permitretailnextbutton = driver.findElement(permitretailnextbuttonLocator);
		permitretailnextbutton.click();
		addDelay(5000L);
	}

	public void acc1tretailnextbutton() {
		WebElement acc1tretailnextbutton = driver.findElement(acc1tretailnextbuttonLocator);
		acc1tretailnextbutton.click();
		addDelay(5000L);
	}
	public void capturesignretail() {
		WebElement capturesignretail = driver.findElement(capturesignretailLocator);
		capturesignretail.click();
		addDelay(5000L);
	}
	public void signnameretailtext(String signnameretail) {
	    WebElement signnameretailtext = driver.findElement(signnameretailtextLocator);
	    signnameretailtext.sendKeys("test name");
			addDelay(9000L);
	}
	public void confirmnextbuttonretail() {
		WebElement confirmnextbuttonretail = driver.findElement(confirmnextbuttonretailLocator);
		confirmnextbuttonretail.click();
		addDelay(5000L);
	}
	public void offlinepaymentretailLink() {
		WebElement offlinepaymentretailLink = driver.findElement(offlinepaymentretailLinkLocator);
		offlinepaymentretailLink.click();
		addDelay(5000L);
	}
	public void CashbuttonretailLink() {
		WebElement CashbuttonretailLink = driver.findElement(CashbuttonretailLocator);
		CashbuttonretailLink.click();
		addDelay(5000L);
	}
	public void retailconfNextbutton() {
		WebElement retailconfNextbutton = driver.findElement(retailconfNextbuttonLocator);
		retailconfNextbutton.click();
		addDelay(5000L);
	}
	public void retailfinishbutton() {
		WebElement retailfinishbutton = driver.findElement(retailfinishbuttonLocator);
		retailfinishbutton.click();
		addDelay(5000L);
	}




	
	
	

	
	
	//
	public void upload1Button() {
		WebElement upload1Button =driver.findElement(uploadButtonLocator);
		upload1Button.click();
		addDelay(2000L);
		String filePath = "C:\\Users\\uandh\\Downloads\\Renewal Lease Application.pdf";
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file'][2]"));
        fileInput.sendKeys(filePath);
        addDelay(15000L);
	
    
	 try {
         // Use Robot to simulate pressing the "Escape" key to close the file dialog
         Robot robot = new Robot();
         robot.keyPress(KeyEvent.VK_ESCAPE);
         robot.keyRelease(KeyEvent.VK_ESCAPE);
 
 
     } catch (Exception e) {
         e.printStackTrace();
     }
	
	}	
	
	
	
	
	
	public void upload2Button() {
		WebElement upload2Button =driver.findElement(upload2ButtonLocator);
		upload2Button.click();
		addDelay(10000L);
		String filePath = "C:/Users/mjawariyawala/OneDrive - AST Corporation//Desktop/LACRT-UAT Presentation.pptx";
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
        fileInput.sendKeys(filePath);
        addDelay(20000L);
	
    
	 try {
         // Use Robot to simulate pressing the "Escape" key to close the file dialog
         Robot robot = new Robot();
         robot.keyPress(KeyEvent.VK_ESCAPE);
         robot.keyRelease(KeyEvent.VK_ESCAPE);
 
 
     } catch (Exception e) {
         e.printStackTrace();
     }
	
	}
	
	public void Done2Button() {
		WebElement Done2Button = driver.findElement(Done2ButtonLocator);
		Done2Button.click();
		addDelay(12000L);
	}
	
	public void section2NextButton() {
		WebElement section2NextButton = driver.findElement(section2NextButtonLocator);
		section2NextButton.click();
		addDelay(15000L);
	}
	
	
	
	
	
	
	/*
	public void leasetypeOption() {
		WebElement leasetypeDropdown = driver.findElement(leasetypeLocator);
		leasetypeDropdown.click();
		addDelay(5000L);
		
		List<WebElement> leasetypeOption = driver.findElements(leasetypeValues);
		leasetypeOption.get(0).click();
		addDelay(5000L);
                
            }
        
	public void programareatypeOption() {
		WebElement programareatypeDropdown = driver.findElement(programareatypeLocator);
		programareatypeDropdown.click();
		addDelay(2000L);
		
		List<WebElement> programareatypeOption = driver.findElements(programareatypeValues);
		programareatypeOption.get(0).click();
		addDelay(2000L);
                
            }
	
	public void applicationtypeOption() {
		WebElement applicationtypeDropdown = driver.findElement(applicationtypeLocator);
		applicationtypeDropdown.click();
		addDelay(2000L);
		
		List<WebElement> applicationtypeOption = driver.findElements(applicationtypeValues);
		applicationtypeOption.get(0).click();
		addDelay(2000L);
                
            }
		
	public void clickNextButton() {
		WebElement nextButton = driver.findElement(nextButtonLocator);
		nextButton.click();
		addDelay(3000L);
	}
	
	public void uploadButton() {
		WebElement uploadButton =driver.findElement(uploadButtonLocator);
		uploadButton.click();
		addDelay(2000L);
		String filePath = "C:/Users/mjawariyawala/OneDrive - AST Corporation//Desktop/LACRT-UAT Presentation.pptx";
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
        fileInput.sendKeys(filePath);
        addDelay(10000L);
	
    
	 try {
         // Use Robot to simulate pressing the "Escape" key to close the file dialog
         Robot robot = new Robot();
         robot.keyPress(KeyEvent.VK_ESCAPE);
         robot.keyRelease(KeyEvent.VK_ESCAPE);
 
 
     } catch (Exception e) {
         e.printStackTrace();
     }
	
	}
 
	public void paymentmethodButton() {
		WebElement paymentmethodtypeDropdown = driver.findElement(paymentmethodtypeLocator);
		paymentmethodtypeDropdown.click();
		addDelay(10000L);
		
		List<WebElement> paymentmethodtypeOption = driver.findElements(paymentmethodtypeValues);
		paymentmethodtypeOption.get(0).click();
		addDelay(10000L);
                
            }
	
	public void reservedNumberText(String reservedNumber) {
		WebElement emailInput = driver.findElement(reservedNumberLocator);
		emailInput.sendKeys(reservedNumber);
		addDelay(4000L);
	}
 
	
	
	public void submitapplicationbutton() {
		WebElement submitapplicationButton = driver.findElement(submitapplicationButtonLocator);
		submitapplicationButton.click();
		addDelay(4000L);
	}
	
	public void clickviewButton() {
		WebElement viewButton = driver.findElement(viewButtonLocator);
		viewButton.click();
		addDelay(8000L);
	}
	
	public void clickmakepaymentButton() {
		WebElement makepaymentButton = driver.findElement(makepaymentButtonLocator);
		makepaymentButton.click();
		addDelay(20000L);
	}
	
	public void clickcancelButton() {
		WebElement nextButton = driver.findElement(cancelButtonLocator);
		nextButton.click();
		addDelay(5000L);
	}
	
	public void clickhomeButton() {
		WebElement homeButton = driver.findElement(homeButtonLocator);
		homeButton.click();
		addDelay(5000L);
	}
	
	public void clickbillpaymentButton() {
		WebElement billpaymentButton = driver.findElement(billpaymentButtonLocator);
		billpaymentButton.click();
		addDelay(5000L);
	}
	
	public void clickunderbillpaymentButton() {
		WebElement underbillpaymentButton = driver.findElement(underbillpaymentButtonLocator);
		underbillpaymentButton.click();
		addDelay(10000L);
	}
	
	 public void anotherMethod() {
	        // Call clickhomeButton() from another method within the same class
	        clickhomeButton();}
 
	public void emailreceiptnumbertext(String emailreceiptNumber) {
		WebElement emailreceipttnumber = driver.findElement(emailreceiptnumberLocator);
		emailreceipttnumber.sendKeys(emailreceiptNumber);
		addDelay(9000L);
	}
	
	public void creditcardnumberText(String creditcardNumber) {
		WebElement ccInput = driver.findElement(creditcardnumberLocator);
		ccInput.sendKeys(creditcardNumber);
		addDelay(8000L);
	}
	
	public void expmonthButton() {
		WebElement expmonthtypeDropdown = driver.findElement(expmonthtypeLocator);
		expmonthtypeDropdown.click();
		addDelay(2000L);
		
		List<WebElement> expmonthtypeOption = driver.findElements(expmonthtypeValues);
		expmonthtypeOption.get(0).click();
		addDelay(2000L);
                
            }
	
	public void expyearButton() {
		WebElement expyeartypeDropdown = driver.findElement(expyeartypeLocator);
		expyeartypeDropdown.click();
		addDelay(2000L);
		
		List<WebElement> expyeartypeOption = driver.findElements(expyeartypeValues);
		expyeartypeOption.get(0).click();
		addDelay(2000L);
                
            }
	
	public void cvNumberText(String cvNumber) {
		WebElement cvInput = driver.findElement(cvNumberLocator);
		cvInput.sendKeys(cvNumber);
		addDelay(4000L);
	}
	
	public void cardholdernameText(String cardholdername) {
		WebElement cardholderInput = driver.findElement(cardholdernameLocator);
		cardholderInput.sendKeys(cardholdername);
		addDelay(6000L);
	}
	
	public void streetaddressText(String streetaddress) {
		WebElement streetaddressInput = driver.findElement(streetaddressLocator);
		streetaddressInput.sendKeys(streetaddress);
		addDelay(4000L);
	}
	
	public void zipcodeText(String zipcode) {
		WebElement zipcodeInput = driver.findElement(zipcodeLocator);
		zipcodeInput.sendKeys(zipcode);
		addDelay(5000L);
	}
	
	public void clicksubmitButton() {
		WebElement submitButton = driver.findElement(submitButtonLocator);
		submitButton.click();
		addDelay(8000L);
	}
	
	
	public void clickuploadfilesButton1() {
		WebElement uploadButton = driver.findElement(uploadButtonLocator);
		uploadButton.click();
		addDelay(30000L);
	}
	
	private void click() {
		// TODO Auto-generated method stub
		
	}
 
 
 
	
	
 
	
	public void reserveBusinessNameLink() {
		List<WebElement> reserveBusinessNameLink = driver.findElements(reserveBusinessNameLocator);
		reserveBusinessNameLink.get(-1).click();
		addDelay(2000L);
	}
 
	public void basedInHawaiiOption() {
		List<WebElement> basedInHawaiiOption = driver.findElements(basedInHawaiiLocator);
		basedInHawaiiOption.get(5).click();
		addDelay(2000L);
	}
 
	public void businessStructureOption() {
		WebElement businessStructureDropdown = driver.findElement(businessStructureLocator);
		businessStructureDropdown.click();
		addDelay(2000L);
		List<WebElement> businessStructureOption = driver.findElements(businessStructureValues);
		businessStructureOption.get(3).click();
		addDelay(2000L);
	}
 
	public void profitEntityOption() {
		List<WebElement> profitEntityOption = driver.findElements(profitEntityLocator);
		profitEntityOption.get(7).click();
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		addDelay(2000L);
	}
 
	public void clickNextButton1() {
		WebElement nextButton = driver.findElement(nextButtonLocator1);
		nextButton.click();
		addDelay(30000L);
	}
 
	public void reservedNameText(String reservedName) {
		WebElement emailInput = driver.findElement(reservedNameLocator);
		emailInput.sendKeys(reservedName);
	}
 */
	
	
	
	
	
	
	private void addDelay(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}