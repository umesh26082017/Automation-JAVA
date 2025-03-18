package com.ast.stepdefs;
 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
 
import com.ast.pages.LoginPage;
 
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class LoginStepDefinitions {
 
	private WebDriver driver;
	private LoginPage loginPage;
	private LoginPage login3;
 
	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\uandh\\Downloads\\ast-qa-automation\\ast-qa-automation\\src\\test\\resources\\chromedriver\\chromedriver.exe");
	}
 
	@Before
	public void setup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
	}
 
	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
 
	@Given("I am on the Salesforce login page")
	public void i_am_on_the_sales_force_login_page() {
		driver.get("https://udagims--uat.sandbox.my.salesforce.com/");
		loginPage = new LoginPage(driver);
	}
 
	@Given("I have entered a valid {string} and {string}")
	public void i_have_entered_a_valid_username_and_password(String username, String password) {
		loginPage.enterEmail(username);
		loginPage.enterPassword(password);
	}
 
	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		loginPage.clickLoginButton();
	}
 
	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
		Assert.assertEquals(loginPage.verifyHomePage(), true);
	}
 
	@Then("I should be able to select LoginExperience")
	public void i_should_be_able_to_select_LoginExperience() {
		loginPage.LoginExperienceLink();
	}
 
	@Then("I should be able to select siteuser")
	public void i_should_be_able_to_select_siteuser() {
		loginPage.siteuserLink();
	}
	/* &&&&&&
	@Then("I should be able to select seed")
	public void i_should_be_able_to_select_seed() {
		loginPage.seedLink();
	}
	@Then("I should be able to select seed sample application")
	public void i_should_be_able_to_select_seed_sample_application() {
		loginPage.seedsampleLink();
	}
	@Then("I should be able to select continueseed")
	public void i_should_be_able_to_select_continueseed() {
		loginPage.continueseedLink();
	}
	@Then("I should be able to click seednextbutton")
	public void i_should_be_able_to_click_seednextbutton() {
		loginPage.seednextbutton();
	}
	@Then("I should be able to click seedcontactnextbutton")
	public void i_should_be_able_to_click_seedcontactnextbutton() {
		loginPage.seedcontactnextbutton();
	}
	@Then("I should be able to click seedaccountnextbutton")
	public void i_should_be_able_to_click_seedaccountnextbutton() {
		loginPage.seedaccountnextbutton();
	}
	@Then("I should be able to click seedaccountbnextbutton")
	public void i_should_be_able_to_click_seedaccountbnextbutton() {
		loginPage.seedaccountbnextbutton();
	}
	@Then("I should be able to click seedsamplenextbutton")
	public void i_should_be_able_to_click_seedsamplenextbutton() {
		loginPage.seedsamplenextbutton();
	}
	@Then("I should be able to click seedsamplebnextbutton")
	public void i_should_be_able_to_click_seedsamplebnextbutton() {
		loginPage.seedsamplebnextbutton();
	}
	/* &&&&&&
	
	/*
	@Then("I should be able to select FedEx from courier dropdown")
	public void i_should_be_able_to_select_FedEx_from_courier_dropdown() {
		loginPage.couriertypeOption();
	}
	@Then("I should be able to click capturesignseed")
	public void i_should_be_able_to_click_capturesignseed() {
		loginPage.capturesignseedbutton();
	}
	@Then("I should be able to enter41 {string}")
	public void i_should_be_able_to_enter41(String signednameseed) {
		loginPage.signednameseedtext(signednameseed);
	}
	@Then("I should be able to enter42 {string}")
	public void i_should_be_able_to_enter42(String jobtitleseed) {
		loginPage.jobtitleseedtext(jobtitleseed);
	}
	@Then("I should be able to click signnextbuttons")
	public void i_should_be_able_to_click_signnextbuttons() {
		loginPage.signnextbuttons();
	}
	*/
	
	
	/* &&&&
	 
	@Then("I should be able to click home")
	public void i_should_be_able_to_click_home() {
		loginPage.homepagebutton();
	}
	
	 @Then("I should be able to select weed")
	public void i_should_be_able_to_select_weed() {
		loginPage.weedLink();
	}

	@Then("I should be able to select weed free inspection")
	public void i_should_be_able_to_select_weed_free_inspection() {
		loginPage.weedfreeLink();
	}
	@Then("I should be able to select continueweed")
	public void i_should_be_able_to_select_continueweed() {
		loginPage.continueweedbutton();
	}
	@Then("I should be able to click weednextbutton")
	public void i_should_be_able_to_click_weednextbutton() {
		loginPage.weednextbutton();
	}
	@Then("I should be able to click weedcontactnextbutton")
	public void i_should_be_able_to_click_weedcontactnextbutton() {
		loginPage.weedcontactnextbutton();
	}
	@Then("I should be able to click weedaccountnextbutton")
	public void i_should_be_able_to_click_weedaccountnextbutton() {
		loginPage.weedaccountnextbutton();
	}
	@Then("I should be able to click weedaccountbnextbutton")
	public void i_should_be_able_to_click_weedaccountbnextbutton() {
		loginPage.weedaccountbnextbutton();
	}
	&&&&&& */ 
	
	/*
	@Then("I should be able to select fieldyes")
	public void i_should_be_able_to_select_fieldyes() {
		loginPage.fieldyesradiobutton();
	}
		
	
	@Then("I should be able to select datefield")
	public void i_should_be_able_to_select_datefield() {
		loginPage.datefieldbutton();
	}
	@Then("I should be able to click date")
	public void i_should_be_able_to_click_date() {
		loginPage.datebutton();
	}
	@Then("I should be able to click fieldnextbutton")
	public void i_should_be_able_to_click_fieldnextbutton() {
		loginPage.fieldnextbutton();
	}
	@Then("I should be able to click capturesign")
	public void i_should_be_able_to_click_capturesign() {
		loginPage.capturesignbutton();
	}
	@Then("I should be able to enter1 {string}")
	public void i_should_be_able_to_enter1(String signedname1) {
		loginPage.signedname1text(signedname1);
	}
	@Then("I should be able to enter2 {string}")
	public void i_should_be_able_to_enter2(String jobtitle1) {
		loginPage.jobtitle1text(jobtitle1);
	}
	@Then("I should be able to click confirmnextbutton")
	public void i_should_be_able_to_click_confirmnextbutton() {
		loginPage.confirmnextbutton();
	}
	*/
	
	/* &&&&&&
	@Then("I should be able to click home1")
	public void i_should_be_able_to_click_home1() {
		loginPage.home1pagebutton();
	}
	&&& */
	/*
	@Then("I should be able to select pesticide")
	public void i_should_be_able_to_select_pesticide() {
		loginPage.pesticideLink();
	}
	@Then("I should be able to select RUP Dealer Sales")
	public void i_should_be_able_to_select_RUP_Dealer_Sales() {
		loginPage.RUPDealer();
	}
	@Then("I should be able to select continue")
	public void i_should_be_able_to_select_continue() {
		loginPage.continuebutton();
	}
	
	@Then("I should be able to select ApplicationTypenextbutton")
	public void i_should_be_able_to_select_ApplicationTypenextbutton() {
		loginPage.ApplicationTypenextbutton();
	}
	
	@Then("I should be able to select ContactInformationnextbutton")
		public void i_should_be_able_to_select_ContactInformationnextbutton() {
			loginPage.ContactInformationnextbutton();
		}
	
	@Then("I should be able to select section1accountinformationnext")
	public void i_should_be_able_to_select_section1accountinformationnext() {
		loginPage.section1accountinformationnext();
	}
	
	@Then("I should be able to select License Number")
	public void i_should_be_able_to_select_License_Number() {
		loginPage.LicenseNumber11();
	}
		
	@Then("I should be able to enter3 {string}")
	public void i_should_be_able_to_enter3_signedbyname(String signedbyname) {
		loginPage.Signedtext(signedbyname);
	}
	
	@Then("I should be able to enter4 {string}")
	public void i_should_be_able_to_enter4_jobtitle(String jobtitle) {
		loginPage.jobtitle(jobtitle);
	}
	
	@Then("I should be able to click Capture button")
	public void i_should_be_able_to_click_Capture_button() {
	loginPage.Capture();
	}
	
	@Then("I should be able to click Next button")
	public void i_should_be_able_to_click_Next_button() {
		loginPage.nextbutton();
	}
	@Then("I should be able to click home button")
	public void i_should_be_able_to_click_home_button() {
		loginPage.home3button();
	}
	*/
	
	/* &&&&
	@Then("I should be able to select kratom")
	public void i_should_be_able_to_select_kratom() {
		loginPage.kratomLink();
	}
	@Then("I should be able to select continuekratom")
	public void i_should_be_able_to_select_continuekratom() {
		loginPage.continuekratomLink();
	}
	@Then("I should be able to select newapplicationk")
	public void i_should_be_able_to_select_newapplicationk() {
		loginPage.newapplicationkLink();
	}
	@Then("I should be able to click kratomnextbutton")
	public void i_should_be_able_to_click_kratomnextbutton() {
		loginPage.kratomnextbuttonLink();
	}
	@Then("I should be able to click kratomaccountnextbutton")
	public void i_should_be_able_to_click_kratomaccountnextbutton() {
		loginPage.kratomaccountnextbuttonLink();
	}
	@Then("I should be able to click kratomaccountbnextbutton")
	public void i_should_be_able_to_click_kratomaccountbnextbutton() {
		loginPage.kratomaccountbnextbutton();
	
	}
	@Then("I should be able to click home2")
	public void i_should_be_able_to_click_home2() {
		loginPage.home2button();
	}
	&&&& */
	
	/*
	@Then("I should be able to select productno")
	public void i_should_be_able_to_select_productnok() {
		loginPage.productnoLink();
	}
	@Then("I should be able to click home2 button")
	public void i_should_be_able_to_click_home2_button() {
		loginPage.home2button();
	}
	@Then("I should be able to click addproductbutton")
	public void i_should_be_able_to_click_addproductbutton() {
		loginPage.addproductbuttonLink();
	}
	@Then("I should be able to enter20 {string}")
	public void i_should_be_able_to_enter20_kratomname(String kratomname) {
		loginPage.kratomnametext(kratomname);
	}
	@Then("I should be able to select rawleaf")
	public void i_should_be_able_to_select_rawleaf() {
		loginPage.rawleafLink();
	}
	@Then("I should be able to enter21 {string}")
	public void i_should_be_able_to_enter21_lotbatch(String lotbatch) {
		loginPage.lotbatchtext(lotbatch);
	}
	@Then("I should be able to enter22 {string}")
	public void i_should_be_able_to_enter22_direction(String direction) {
		loginPage.directiontext(direction);
	}
	@Then("I should be able to enter23 {string}")
	public void i_should_be_able_to_enter23_massvolume(String massvolume) {
		loginPage.massvolumetext(massvolume);
	}
	@Then("I should be able to click upload files button")
	public void i_should_be_able_to_click_upload_files_button() {
		loginPage.uploadfilesbutton();
	}
	@Then("I should be able to click Donebutton")
	public void i_should_be_able_to_click_Donebutton() {
		loginPage.Donebutton();
	}
	@Then("I should be able to select coayes")
	public void i_should_be_able_to_select_coayes() {
		loginPage.coayesLink();
	}
	@Then("I should be able to enter24 {string}")
	public void i_should_be_able_to_enter24_labname(String labname) {
		loginPage.labnametext(labname);
	}
	@Then("I should be able to select isoyes")
	public void i_should_be_able_to_select_isoyes() {
		loginPage.isoyesLink();
	}
	@Then("I should be able to click uploadcoa files button")
	public void i_should_be_able_to_click_uploadcoa_files_button() {
		loginPage.uploadcoafilesbuttonbutton();
	}
	@Then("I should be able to click Done1button")
	public void i_should_be_able_to_click_Done1button() {
		loginPage.Done1button();
	}
	@Then("I should be able to enter25 {string}")
	public void i_should_be_able_to_enter25_level7(String level7) {
		loginPage.level7text(level7);
	}
	@Then("I should be able to enter26 {string}")
	public void i_should_be_able_to_enter26_totalaerobic(String totalaerobic) {
		loginPage.totalaerobictext(totalaerobic);
	}
	@Then("I should be able to enter27 {string}")
	public void i_should_be_able_to_enter27_totalcomb(String totalcomb) {
		loginPage.totalcombtext(totalcomb);
	}
	@Then("I should be able to enter28 {string}")
	public void i_should_be_able_to_enter28_totalbile(String totalbile) {
		loginPage.totalbiletext(totalbile);
	}
	@Then("I should be able to enter29 {string}")
	public void i_should_be_able_to_enter29_salmonella(String salmonella) {
		loginPage.salmonellatext(salmonella);
	}
	@Then("I should be able to enter30 {string}")
	public void i_should_be_able_to_enter30_ecoli(String ecoli) {
		loginPage.ecolitext(ecoli);
	}
	@Then("I should be able to enter31 {string}")
	public void i_should_be_able_to_enter31_arsenic(String arsenic) {
		loginPage.arsenictext(arsenic);
	}
	@Then("I should be able to enter32 {string}")
	public void i_should_be_able_to_enter32_lead(String lead) {
		loginPage.leadtext(lead);
	}
	@Then("I should be able to enter33 {string}")
	public void i_should_be_able_to_enter33_cadmium(String cadmium) {
		loginPage.cadmiumtext(cadmium);
	}
	@Then("I should be able to enter34 {string}")
	public void i_should_be_able_to_enter34_mercury(String mercury) {
		loginPage.mercurytext(mercury);
	}
	@Then("I should be able to click save")
	public void i_should_be_able_to_click_save() {
		loginPage.savebutton();
	}
	@Then("I should be able to click productnextbutton")
	public void i_should_be_able_to_click_productnextbutton() {
		loginPage.productnextbutton();
	}
	@Then("I should be able to click capturesignk")
	public void i_should_be_able_to_click_capturesignk() {
		loginPage.capturesignkbutton();
	}
	@Then("I should be able to enter36 {string}")
	public void i_should_be_able_to_enter36_signedname1k(String signedname1k) {
		loginPage.signedname1ktext(signedname1k);
	}
	@Then("I should be able to enter37 {string}")
	public void i_should_be_able_to_enter37_jobtitle1k(String jobtitle1k) {
		loginPage.jobtitle1ktext(jobtitle1k);
	}
	@Then("I should be able to click confirmnextbuttonk")
	public void i_should_be_able_to_click_confirmnextbuttonk() {
		loginPage.confirmnextbuttonk();
	}
	@Then("I should be able to select offlinepayment")
	public void i_should_be_able_to_select_offlinepayment() {
		loginPage.offlinepayment();
	}
	@Then("I should be able to select Cashbutton")
	public void i_should_be_able_to_select_Cashbutton() {
		loginPage.Cashbutton();
	}
	@Then("I should be able to click confirmationNext button")
	public void i_should_be_able_to_click_confirmationNext_button() {
		loginPage.confirmationNextButton();
	}
	@Then("I should be able to click finish button")
	public void i_should_be_able_to_click_finish_button() {
		loginPage.finishButton();
	}
	*/
	
	/* &&&
	
	@Then("I should be able to select nursery")
	public void i_should_be_able_to_select_nursery() {
		loginPage.nurseryLink();
	}

	@Then("I should be able to select continuenursery")
	public void i_should_be_able_to_select_continuenursery() {
		loginPage.continuenurseryLink();
	}
	@Then("I should be able to select acknowledge checkbox")
	public void i_should_be_able_to_select_acknowledge_checkbox() {
		loginPage.acknowledgecheckboxLink();
	}
	@Then("I should be able to select continueacknow")
	public void i_should_be_able_to_select_continueacknow() {
		loginPage.continueacknowLink();
	}
	@Then("I should be able to select newapplicationnur")
	public void i_should_be_able_to_select_newapplicationnur() {
		loginPage.newapplicationnurLink();
	}
	@Then("I should be able to select nurseryman")
	public void i_should_be_able_to_select_nurseryman() {
		loginPage.nurserymanLink();
	}
	@Then("I should be able to click nurseryaccnextbutton")
	public void i_should_be_able_to_click_nurseryaccnextbutton() {
		loginPage.nurseryaccnextbutton();
	}
	@Then("I should be able to click nurserydbanextbutton")
	public void i_should_be_able_to_click_nurserydbanextbutton() {
		loginPage.nurserydbanextbutton();
	}
	@Then("I should be able to click nurserycontactnextbutton")
	public void i_should_be_able_to_click_nurserycontactnextbutton() {
		loginPage.nurserycontactnextbutton();
	}
	@Then("I should be able to click nurseryacc1nextbutton")
	public void i_should_be_able_to_click_nurseryacc1nextbutton() {
		loginPage.nurseryacc1nextbutton();
	}
	@Then("I should be able to click nurseryacc2nextbutton")
	public void i_should_be_able_to_click_nurseryacc2nextbutton() {
		loginPage.nurseryacc2nextbutton();
	}
	@Then("I should be able to enter51 no of grower")
	public void i_should_be_able_to_enter51_no_of_grower() {
		loginPage.noofgrowertext("90");
	}
	@Then("I should be able to enter52 green house")
	public void i_should_be_able_to_enter52_green_house() {
		loginPage.greenhousetext("test green");
	}
	@Then("I should be able to select generalnursery")
	public void i_should_be_able_to_select_generalnursery() {
		loginPage.generalnurseryLink();
	}
	@Then("I should be able to select exportyes")
	public void i_should_be_able_to_select_exportyes() {
		loginPage.exportyesLink();
	}
	@Then("I should be able to click licensenextbutton")
	public void i_should_be_able_to_click_licensenextbutton() {
		loginPage.licensenextbutton();
	}
	@Then("I should be able to click capturesignnursery")
	public void i_should_be_able_to_click_capturesignnursery() {
		loginPage.capturesignnurseryLink();
	}
	@Then("I should be able to enter53 {string}")
	public void i_should_be_able_to_enter53(String signnamenursery) {
		loginPage.signnamenurserytext(signnamenursery);
	}
	@Then("I should be able to enter54 {string}")
	public void i_should_be_able_to_enter54(String jobnursery) {
		loginPage.jobnurserytext(jobnursery);
	}
	
	@Then("I should be able to click confirmnextbuttonnursery")
	public void i_should_be_able_to_click_confirmnextbuttonnursery() {
		loginPage.confirmnextbuttonnurseryLink();
	}
	&&& */
	
	
	@Then("I should be able to select apiary")
	public void i_should_be_able_to_select_apiary() {
		loginPage.apiaryLink();
	}
	@Then("I should be able to select apiary license application")
	public void i_should_be_able_to_select_apiary_license_application() {
		loginPage.apiarylicenseLink();
	}

	@Then("I should be able to select continueapiary")
	public void i_should_be_able_to_select_continueapiary() {
		loginPage.continueapiaryLink();
	}
	@Then("I should be able to select newapplicationapiary")
	public void i_should_be_able_to_select_newapplicationapiary() {
		loginPage.newapplicationapiaryLink();
	}
	@Then("I should be able to select beekeeper")
	public void i_should_be_able_to_select_beekeeper() {
		loginPage.beekeeperLink();
	}
	@Then("I should be able to click apiarynextbutton")
	public void i_should_be_able_to_click_apiarynextbutton() {
		loginPage.apiarynextbutton();
	}
	@Then("I should be able to click apiarydbanextbutton")
	public void i_should_be_able_to_click_apiarydbanextbutton() {
		loginPage.apiarydbanextbutton();
	}
	@Then("I should be able to click apiarycontactnextbutton")
	public void i_should_be_able_to_click_apiarycontactnextbutton() {
		loginPage.apiarycontactnextbutton();
	}
	@Then("I should be able to click apiaryacc1nextbutton")
	public void i_should_be_able_to_click_apiaryacc1nextbutton() {
		loginPage.apiaryacc1nextbutton();
	}
	@Then("I should be able to click apiaryacc2nextbutton")
	public void i_should_be_able_to_click_apiaryacc2nextbutton() {
		loginPage.apiaryacc2nextbutton();
	}
	@Then("I should be able to enter55 hives")
	public void i_should_be_able_to_enter55_hives() {
		loginPage.hivestext("96");
	}
	@Then("I should be able to select email")
	public void i_should_be_able_to_select_email() {
		loginPage.emailLink();
	}
	@Then("I should be able to click beekeepernextbutton")
	public void i_should_be_able_to_click_beekeepernextbutton() {
		loginPage.beekeepernextbutton();
	}
	@Then("I should be able to click capturesignapiary")
	public void i_should_be_able_to_click_capturesignapiary() {
		loginPage.capturesignapiarybutton();
	}
	@Then("I should be able to enter56 signnameapiary")
	public void i_should_be_able_to_enter56_signnameapiary() {
		loginPage.signnameapiarytext("Um Test");
	}
	@Then("I should be able to enter57 jobapiary")
	public void i_should_be_able_to_enter57_jobapiary() {
		loginPage.jobapiarytext("test title");
	}
	@Then("I should be able to click confirmnextbuttonapiary")
	public void i_should_be_able_to_click_confirmnextbuttonapiary() {
		loginPage.confirmnextapiarybutton();
	}
	@Then("I should be able to click home3")
	public void i_should_be_able_to_click_home3() {
		loginPage.home3button();
		}
	
	@Then("I should be able to select apiary1")
	public void i_should_be_able_to_select_apiary1() {
		loginPage.apiary1Link();
	}
	@Then("I should be able to select apiary sample application")
	public void i_should_be_able_to_select_apiary_sample_application() {
		loginPage.apiarysampleLink();
	}

	@Then("I should be able to select continueapisample")
	public void i_should_be_able_to_select_continueapisample() {
		loginPage.continuesampleLink();
	}
	@Then("I should be able to select acknowledgeapi checkbox")
	public void i_should_be_able_to_select_acknowledgeapi_checkbox() {
		loginPage.acknowapisampleLink();
	}
	@Then("I should be able to click apisamplenextbutton")
	public void i_should_be_able_to_click_apisamplenextbutton() {
		loginPage.apisamplenextbutton();
	}
	@Then("I should be able to click applicationnextbutton")
	public void i_should_be_able_to_click_applicationnextbutton() {
		loginPage.applicationnextbutton();
	}
	@Then("I should be able to click apisamplecontactnextbutton")
	public void i_should_be_able_to_click_apisamplecontactnextbutton() {
		loginPage.apisamplecontactnextbutton();
	}
	@Then("I should be able to click apisampleacc1nextbutton")
	public void i_should_be_able_to_click_apisampleacc1nextbutton() {
		loginPage.apisampleacc1nextbutton();
	}
	@Then("I should be able to click apisampleacc2nextbutton")
	public void i_should_be_able_to_click_apisampleacc2nextbutton() {
		loginPage.apisampleacc2nextbutton();
	}
	@Then("I should be able to select myself radio button")
	public void i_should_be_able_to_select_myself_radio_button() {
		loginPage.myselfradiobutton();
	}
	@Then("I should be able to select stateyes")
	public void i_should_be_able_to_select_stateyes() {
		loginPage.stateyesLink();
	}
	@Then("I should be able to select udafno")
	public void i_should_be_able_to_select_udafno() {
		loginPage.udafnoLink();
	}
	@Then("I should be able to click beekeepsamplenextbutton")
	public void i_should_be_able_to_click_beekeepsamplenextbutton() {
		loginPage.beekeepsamplenextbutton();
	}
	@Then("I should be able to select beekeeper checkbox")
	public void i_should_be_able_to_select_beekeeper_checkbox() {
		loginPage.beekeepercheckLink();
	}
	@Then("I should be able to select email checkbox")
	public void i_should_be_able_to_select_email_checkbox() {
		loginPage.emailcheckLink();
	}
	@Then("I should be able to click contactsamplenextbutton")
	public void i_should_be_able_to_click_contactsamplenextbutton() {
		loginPage.contactsamplenextbutton();
	}
	@Then("I should be able to click beecontactextbutton")
	public void i_should_be_able_to_click_beecontactextbutton() {
		loginPage.beecontactextbutton();
	}
	@Then("I should be able to click addsamplebutton")
	public void i_should_be_able_to_click_addsamplebutton() {
		loginPage.addsamplebutton();
	}
	@Then("I should be able to enter58 samplename")
	public void i_should_be_able_to_enter58_samplename() {
		loginPage.samplenametext("um sample");
	}
	@Then("I should be able to enter59 samplelocation")
	public void i_should_be_able_to_enter59_samplelocation() {
		loginPage.samplelocationtext("test,salt lake");
	}
	@Then("I should be able to select brood")
	public void i_should_be_able_to_select_brood() {
		loginPage.broodLink();
	}
	@Then("I should be able to click apisavebutton")
	public void i_should_be_able_to_click_apisavebutton() {
		loginPage.apisavebutton();
	}
	@Then("I should be able to click brrodsamplenextbutton")
	public void i_should_be_able_to_click_brrodsamplenextbutton() {
		loginPage.brrodsamplenextbutton();
	}
	@Then("I should be able to select Physical submission")
	public void i_should_be_able_to_select_Physical_submission() {
		loginPage.PhysicalsubmissionLink();
	}
	@Then("I should be able to select usps")
	public void i_should_be_able_to_select_usps() {
		loginPage.uspsLink();
	}
	@Then("I should be able to click submissionnextbutton")
	public void i_should_be_able_to_click_submissionnextbutton() {
		loginPage.submissionnextbutton();
	}
	@Then("I should be able to click capturesignsample")
	public void i_should_be_able_to_click_capturesignsample() {
		loginPage.capturesignsamplebutton();
	}
	@Then("I should be able to enter60 signnamesample")
	public void i_should_be_able_to_enter60_signnamesample() {
		loginPage.signnamesampletext("Um Test");
	}
	@Then("I should be able to enter61 jobsample")
	public void i_should_be_able_to_enter61_jobsample() {
		loginPage.jobsampletext("Test Job");
	}
	@Then("I should be able to click confirmnextbuttonapisample")
	public void i_should_be_able_to_click_confirmnextbuttonapisample() {
		loginPage.confirmnextbuttonapisample();
	}
	@Then("I should be able to click home4")
	public void i_should_be_able_to_click_home4() {
		loginPage.home4button();
	}
	@Then("I should be able to select industrial hemp")
	public void i_should_be_able_to_select_industrial_hemp() {
		loginPage.industrialhempLink();
	}
	@Then("I should be able to select processor application")
	public void i_should_be_able_to_select_processor_application() {
		loginPage.hempprocessorLink();
	}

	@Then("I should be able to select continueprocessor")
	public void i_should_be_able_to_select_continueprocessor() {
		loginPage.continueprocessorLink();
	}
	@Then("I should be able to select agreementyes")
	public void i_should_be_able_to_select_agreementyes() {
		loginPage.agreementyesLink();
	}
	@Then("I should be able to click agreementnextbutton")
	public void i_should_be_able_to_click_agreementnextbutton() {
		loginPage.agreementnextbutton();
	}
	@Then("I should be able to select newappprocessor")
	public void i_should_be_able_to_select_newappprocessor() {
		loginPage.newappprocessorLink();
	}
	@Then("I should be able to click appliprocessornextbutton")
	public void i_should_be_able_to_click_appliprocessornextbutton() {
		loginPage.appliprocessornextbutton();
	}
	@Then("I should be able to select proselectallsections")
	public void i_should_be_able_to_select_proselectallsections() {
		loginPage.proselectallsectionsLink();
	}
	@Then("I should be able to click accountprocessornextbutton")
	public void i_should_be_able_to_click_accountprocessornextbutton() {
		loginPage.accountprocessornextbutton();
	}
	@Then("I should be able to click dbaprocessornextbutton")
	public void i_should_be_able_to_click_dbaprocessornextbutton() {
		loginPage.dbaprocessornextbutton();
	}
	@Then("I should be able to click licenseuploadbutton")
	public void i_should_be_able_to_click_licenseuploadbutton() {
		loginPage.licenseuploadbutton();
	}
	@Then("I should be able to click done11button")
	public void i_should_be_able_to_click_done11button() {
		loginPage.done11button();
	}
	@Then("I should be able to click license1nextbutton")
	public void i_should_be_able_to_click_license1nextbutton() {
		loginPage.license1nextbutton();
	}
	@Then("I should be able to click accprocessornextbutton")
	public void i_should_be_able_to_click_accprocessornextbutton() {
		loginPage.accprocessornextbutton();
	}
	@Then("I should be able to click accountuploadbutton")
	public void i_should_be_able_to_click_accountuploadbutton() {
		loginPage.accountuploadbutton();
	}
	@Then("I should be able to click done12button")
	public void i_should_be_able_to_click_done12button() {
		loginPage.done12button();
	}
	@Then("I should be able to click acc1processornextbutton")
	public void i_should_be_able_to_click_acc1processornextbutton() {
		loginPage.acc1processornextbutton();
	}
	@Then("I should be able to click extractingbiomass")
	public void i_should_be_able_to_click_extractingbiomass() {
		loginPage.extractingbiomass();
	}
	@Then("I should be able to click tier1")
	public void i_should_be_able_to_click_tier1() {
		loginPage.tier1button();
	}
	@Then("I should be able to click operationalnextbutton")
	public void i_should_be_able_to_click_operationalnextbutton() {
		loginPage.operationalnextbutton();
	}
	@Then("I should be able to click operationalradiono1")
	public void i_should_be_able_to_click_operationalradiono1() {
		loginPage.operationalradiono1();
	}
	@Then("I should be able to click operationalradiono2")
	public void i_should_be_able_to_click_operationalradiono2() {
		loginPage.operationalradiono2();
	}
	@Then("I should be able to click operationalradiono3")
	public void i_should_be_able_to_click_operationalradiono3() {
		loginPage.operationalradiono3();
	}
	@Then("I should be able to click operationalagree")
	public void i_should_be_able_to_click_operationalagree() {
		loginPage.operationalagree();
	}
	@Then("I should be able to enter70 disposalplan")
	public void i_should_be_able_to_enter70_disposalplan() {
		loginPage.disposalplantext("test disposal");
	}
	@Then("I should be able to click operational1nextbutton")
	public void i_should_be_able_to_click_operational1nextbutton() {
		loginPage.operational1nextbutton();
	}
	@Then("I should be able to click intendedcheckbox")
	public void i_should_be_able_to_click_intendedcheckbox() {
		loginPage.intendedcheckbox();
	}
	@Then("I should be able to enter71 materialstored")
	public void i_should_be_able_to_enter71_materialstored() {
		loginPage.materialstoredtext("test material");
	}
	@Then("I should be able to click containmentcheckbox")
	public void i_should_be_able_to_click_containmentcheckbox() {
		loginPage.containmentcheckbox();
	}
	@Then("I should be able to click capturesignprocessor")
	public void i_should_be_able_to_click_capturesignprocessor() {
		loginPage.capturesignprocessor();
	}
	@Then("I should be able to enter72 signnameprocessor")
	public void i_should_be_able_to_enter72_signnameprocessor() {
		loginPage.signnameprocessortext("test sign");
	}
	@Then("I should be able to click confirmnextbuttonprocessor")
	public void i_should_be_able_to_click_confirmnextbuttonprocessor() {
		loginPage.confirmnextbuttonprocessor();
	}
	@Then("I should be able to click home5")
	public void i_should_be_able_to_click_home5() {
		loginPage.home5button();
	}
	
	@Then("I should be able to select retail application")
	public void i_should_be_able_to_select_retail_application() {
		loginPage.hempretailLink();
	}

	@Then("I should be able to select continueretail")
	public void i_should_be_able_to_select_continueretail() {
		loginPage.continueretailLink();
	}
	@Then("I should be able to select retailagreeyes")
	public void i_should_be_able_to_select_retailagreeyes() {
		loginPage.retailagreeyesLink();
	}
	@Then("I should be able to click retailagreenextbutton")
	public void i_should_be_able_to_click_retailagreenextbutton() {
		loginPage.retailagreenextbutton();
	}
	@Then("I should be able to select newapppretail")
	public void i_should_be_able_to_select_newapppretail() {
		loginPage.newapppretailLink();
	}
	@Then("I should be able to click appliretailnextbutton")
	public void i_should_be_able_to_click_appliretailnextbutton() {
		loginPage.appliretailnextbutton();
	}
	@Then("I should be able to click dbaretailnextbutton")
	public void i_should_be_able_to_click_dbaretailnextbutton() {
		loginPage.dbaretailnextbutton();
	}
	@Then("I should be able to click permitretailnextbutton")
	public void i_should_be_able_to_click_permitretailnextbutton() {
		loginPage.permitretailnextbutton();
	}
	@Then("I should be able to click acc1tretailnextbutton")
	public void i_should_be_able_to_click_acc1tretailnextbutton() {
		loginPage.acc1tretailnextbutton();
	}
	@Then("I should be able to click capturesignretail")
	public void i_should_be_able_to_click_capturesignretail() {
		loginPage.capturesignretail();
	}
	@Then("I should be able to enter75 signnameretail")
	public void i_should_be_able_to_enter75_signnameretail() {
		loginPage.signnameretailtext("test name");
	}
	@Then("I should be able to click confirmnextbuttonretail")
	public void i_should_be_able_to_click_confirmnextbuttonretail() {
		loginPage.confirmnextbuttonretail();
	}
	@Then("I should be able to select offlinepaymentretail")
	public void i_should_be_able_to_select_offlinepaymentretail() {
		loginPage.offlinepaymentretailLink();
	}
	@Then("I should be able to select Cashbuttonretail")
	public void i_should_be_able_to_select_Cashbuttonretail() {
		loginPage.CashbuttonretailLink();
	}
	@Then("I should be able to click retailconfNext button")
	public void i_should_be_able_to_click_retailconfNext_button() {
		loginPage.retailconfNextbutton();
	}
	@Then("I should be able to click retailfinish button")
	public void i_should_be_able_to_click_retailfinish_button() {
		loginPage.retailfinishbutton();
	}
	
}
