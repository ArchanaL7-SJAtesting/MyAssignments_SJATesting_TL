package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown
{

	
/*confirm whether the dropdown webelement is inside the <select> tag
 * Locate that particular dropdown and assign it to a variable
 * Instantiate Select class and pass the DropDown WebElement 
 * Use the methods of Select class to click the dropdown option 
 *      selectByIndex()
 *      selectByVisibleText()
 *      sele 
 */
	public static void main(String[] args)
	
	{
		//Launch the chrome browser
		
		ChromeDriver driver = new ChromeDriver();
		
	//Load the URL ->get() - > Load a new web page in the current browser window
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//To maximize the window
		
		driver.manage().window().maximize();
		
		//Locate the username text field
		
		WebElement eleUsername=driver.findElement(By.id("username"));
		
      //Perform the action On the WebElement
		
		eleUsername.sendKeys("Demosalesmanager");
		
		//Enter the password in the password field
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");

//Click on the Login button
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
//To get the title -- >getTitle() -->get the title of the current page
		
		System.out.println("Title of the page: "+ driver.getTitle());
		
//Click crmfsa link
		
		driver.findElement(By.partialLinkText("SFA")).click();

//click Leads link
		driver.findElement(By.linkText("Leads")).click();
		
//click createLead Link
		
		driver.findElement(By.linkText("Create Lead")).click();
		
//Enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		//Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("komalavalli");
		
//Enter the lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Archana");

//Locate the Source dropdown
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
//Instantiate the Select class
		Select sourceDropdown = new Select(sourceDD);
				
//To select the dropdown options use select class methods
		
		sourceDropdown.selectByIndex(3);
		
//TO close the browser
		
driver.close();

		
	}
}
