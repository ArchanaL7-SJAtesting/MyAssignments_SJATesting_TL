package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount{
	
	public static void main(String[] args) {
		
//Launch the Chrome browser
		
		ChromeDriver driver = new ChromeDriver();
		
//Load the URL ->get() - > Load a new web page in the current browser window
		
		driver.get("http://leaftaps.com/opentaps/control/main");

//To maximixe the window
			
		driver.manage().window().maximize();		

//Locate the Username text field
//class.variable name =instance of SelWD.loacte\find an element(by using id value as username) 
		
		WebElement eleUsername=driver.findElement(By.id("username"));
	
//Perform the action On the WebElement
		
		eleUsername.sendKeys("Demosalesmanager");
	
//Locate the Password text field
		
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
//Click on the Login button
	
driver.findElement(By.className("decorativeSubmit")).click();


//Click on CRM/SFA link

driver.findElement(By.partialLinkText("SFA")).click();


//Click on the Accounts tab

driver.findElement(By.linkText("Accounts")).click();


//Click on the Create Account button

driver.findElement(By.linkText("Create Account")).click();

//Enter an account name

driver.findElement(By.id("accountName")).sendKeys("ArchanaSELJV");

//Enter an description as "Selenium Automation tester"

driver.findElement(By.name("description")).sendKeys("Selenium Automation tester");

//Locate the Industry dropdown

WebElement IndDD = driver.findElement(By.name("industryEnumId"));

//Instantiate the Select class

Select IndustryDropDown = new Select(IndDD);

//Select industry as Computer software -> to select the dropdown options use select classs methods

IndustryDropDown.selectByIndex(3);


//Locate the Ownership dropdown

WebElement OwnDD1 = driver.findElement(By.name("ownershipEnumId"));
	

//Instantiate the select class 

Select OwnerDropDown1 = new Select(OwnDD1);

//select option by visible text

OwnerDropDown1.selectByVisibleText("S-Corporation");


//Locate the source dropdown

WebElement sourceDD = driver.findElement(By.id("dataSourceId"));

//Instantiate the source dropdown

Select SDD = new Select(sourceDD);

//Select the option by Select by value

SDD.selectByValue("LEAD_EMPLOYEE");

//Locate the Marketing Campaign dropdown

WebElement MarketCampaign = driver.findElement(By.id("marketingCampaignId"));

//Instantiate the Select class

Select MarketCampDropDown = new Select(MarketCampaign);

//to select the dropdown options use select classs methods

MarketCampDropDown.selectByIndex(6);

//Locate the state/province dropdown

WebElement stateprovince = driver.findElement(By.name("generalStateProvinceGeoId"));

//Instantiate the Select class

Select stateprovDD = new Select(stateprovince);
		
//to select the dropdown options use select classs methods

stateprovDD.selectByValue("TX");

		
//Click on the create account button

driver.findElement(By.className("smallSubmit")).click();

////Verify that the account name is displayed correctly

WebElement accountNameElement = driver.findElement(By.xpath("//span[contains(text(),'ArchanaSELJV')]"));

boolean isDisplayed = accountNameElement.isDisplayed();

if (isDisplayed) {
    System.out.println("Account name is displayed correctly.");
} else {
    System.out.println("Account name is not displayed correctly.");
}

//TO close the browser

//driver.quit();

	
	}
	

}
