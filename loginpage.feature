Feature: Login Functionality for Salesforce Website
 
  As a user of the Salesforce website
  I want to be able to log in with my account
  So that I can access my account-related features and manage my orders
 
  Background:
    Given I am on the Salesforce login page
 
  Scenario Outline: Successful login with valid credentials
    Given I have entered a valid "<username>" and "<password>"
    When I click on the login button
    Then I should be logged in successfully
    	And I should be able to select LoginExperience
    	And I should be able to select siteuser
    	And I should be able to select apiary
    	And I should be able to select apiary license application
    	And I should be able to select continueapiary
    	And I should be able to select newapplicationapiary
    	And I should be able to select beekeeper
    	And I should be able to click apiarynextbutton
    	And I should be able to click apiarydbanextbutton
    	And I should be able to click apiarycontactnextbutton
    	And I should be able to click apiaryacc1nextbutton
    	And I should be able to click apiaryacc2nextbutton
    	And I should be able to enter55 hives
    	And I should be able to select email
    	And I should be able to click beekeepernextbutton
    	And I should be able to click capturesignapiary
    	And I should be able to enter56 signnameapiary
    	And I should be able to enter57 jobapiary
    	And I should be able to click confirmnextbuttonapiary
    	And I should be able to click home3  
    	And I should be able to select apiary1
    	And I should be able to select apiary sample application
    	And I should be able to select continueapisample
    	And I should be able to select acknowledgeapi checkbox
    	And I should be able to click apisamplenextbutton
    	And I should be able to click applicationnextbutton
    	And I should be able to click apisamplecontactnextbutton
    	And I should be able to click apisampleacc1nextbutton
    	And I should be able to click apisampleacc2nextbutton
    	And I should be able to select myself radio button
    	And I should be able to select stateyes
    	And I should be able to select udafno	
        And I should be able to click beekeepsamplenextbutton
        And I should be able to select beekeeper checkbox
    	And I should be able to select email checkbox
    	And I should be able to click contactsamplenextbutton  
    	And I should be able to click beecontactextbutton
    	And I should be able to click addsamplebutton
    	And I should be able to enter58 samplename
    	And I should be able to enter59 samplelocation
    	And I should be able to select brood
    	And I should be able to click apisavebutton
    	And I should be able to click brrodsamplenextbutton
    	And I should be able to select Physical submission
    	And I should be able to select usps
    	And I should be able to click submissionnextbutton      	
    	And I should be able to click capturesignsample
    	And I should be able to enter60 signnamesample
    	And I should be able to enter61 jobsample
    	And I should be able to click confirmnextbuttonapisample
    	And I should be able to click home4
    	And I should be able to select industrial hemp
    	And I should be able to select processor application
    	And I should be able to select continueprocessor
    	And I should be able to select agreementyes
    	And I should be able to click agreementnextbutton
    	And I should be able to select newappprocessor
    	And I should be able to click appliprocessornextbutton
    	And I should be able to select proselectallsections
    	And I should be able to click accountprocessornextbutton
    	And I should be able to click dbaprocessornextbutton
    	And I should be able to click licenseuploadbutton
    	And I should be able to click done11button
    	And I should be able to click license1nextbutton
    	And I should be able to click accprocessornextbutton
    	And I should be able to click accountuploadbutton
    	And I should be able to click done12button
    	And I should be able to click acc1processornextbutton
    	And I should be able to select extractingbiomass
    	And I should be able to select tier1
    	And I should be able to click operationalnextbutton
    	And I should be able to select operationalradiono1
    	And I should be able to select operationalradiono2
    	And I should be able to select operationalradiono3
    	And I should be able to select operationalagree
    	And I should be able to enter70 disposalplan
    	And I should be able to click operational1nextbutton
    	And I should be able to select intendedcheckbox
    	And I should be able to enter71 materialstored
    	And I should be able to select containmentcheckbox
    	And I should be able to click capturesignprocessor
    	And I should be able to enter72 signnameprocessor
    	And I should be able to click confirmnextbuttonprocessor
    	And I should be able to click home5
    	And I should be able to select retail application
    	And I should be able to select continueretail
    	And I should be able to select retailagreeyes
    	And I should be able to click retailagreenextbutton
    	And I should be able to select newapppretail
    	And I should be able to click appliretailnextbutton
    	And I should be able to click dbaretailnextbutton
    	And I should be able to click permitretailnextbutton
    	And I should be able to click acc1tretailnextbutton
    	And I should be able to click capturesignretail
    	And I should be able to enter75 signnameretail
    	And I should be able to click confirmnextbuttonretail
    	And I should be able to select offlinepaymentretail
    	And I should be able to select Cashbuttonretail
    	And I should be able to click retailconfNext button
    	And I should be able to click retailfinish button
    	  
    	
    	
    	
    	
 
    	
    
   Examples:
      | username          | password        |   signednameseed  |  jobtitleseed  |  signedname1  |  jobtitle1  |  date  |name  |  email  |  kratomname  |  lotbatch  |  direction  |  massvolume  |  labname  |  level7  |  totalaerobic  |  totalcomb  |  totalbile  |  salmonella  |  ecoli  |  arsenic  |  lead  |  cadmium  |  mercury  |  signedname1k  |  jobtitle1k  |
      | cbodduluru@astcorporation.com.uat	  	| Choudary@123 	|  umtest1  |  accountant  |  umesh  |  test  |  03-03-2025  |  umesh  |  uandh@astcorporation.com   |  Test UAT Prod  |  test22  |  211  |  25  |  testlab  |  testlevel  |  10  |  20  |  30  |  40  |  45  |  50  |  55  |  60  |  65  |  Umtest  |  testqa  |  