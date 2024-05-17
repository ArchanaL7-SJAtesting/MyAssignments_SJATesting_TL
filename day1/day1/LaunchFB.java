package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LaunchFB {


	    
		public static void main(String[] args) {
	    	
	    	// Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Load the URL
	        driver.get("https://en-gb.facebook.com/");

	        // Maximize the browser window
	        driver.manage().window().maximize();

	        // Click on the Create new account button
	    	
	        driver.findElement(By.xpath("//a[text()='Create new account']"));


	        // Fill out the registration form
	        driver.findElement(By.name("firstname")).sendKeys("SAP");
	        driver.findElement(By.name("lastname")).sendKeys("SJTT");
	        driver.findElement(By.name("reg_email__")).sendKeys("SJTT@example.com");
	        driver.findElement(By.name("reg_passwd__")).sendKeys("Password123");

	        // Handle Date of Birth dropdowns
	        Select dayDropdown = new Select(driver.findElement(By.id("day")));
	        dayDropdown.selectByValue("15");

	        Select monthDropdown = new Select(driver.findElement(By.id("month")));
	        monthDropdown.selectByValue("6");

	        Select yearDropdown = new Select(driver.findElement(By.id("year")));
	        yearDropdown.selectByValue("1990");

	        // Select the radio button for Gender
	        driver.findElement(By.xpath("//input[@value='2']")).click();

	        
	        // Close the browser
	        driver.quit();
	    }

		}
	
	
	
	

