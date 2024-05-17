package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LearnAutomation {
	
	public static void main(String[] args) {
		
		//Launch the browser window
		
		ChromeDriver driver = new ChromeDriver();
		
		//Load the webpage in the current web browser window			

		driver.get("https://leaftaps.com/opentaps/contol/main");
		
		//maximize the window
		
		driver.manage().window().maximize();
		
		//get the title of the current page
		
		driver.getTitle();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("company");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("fnlead");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("lnlead");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}

}
