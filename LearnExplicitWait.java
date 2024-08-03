package weekDay;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {
	
	public static void main(String[] args) {
		
                // Launch the browser
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Load the URL
		
		driver.get("https://leafground.com/waits.xhtml");
		
		driver.manage().window().maximize();
		
		//Instantiate the WebDriverWait
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(10)) ;
		
		//Write the Explicitwait  for the element to be clickable in the clickable condition
		WebElement firstElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click']")));
		
		//If the button is clickable as mentioned in the above line -->then click the element 
		firstElement.click();
		
		//check the element displayed or not-->here chcecking the visibility of click button
		boolean iAmHere  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']"))).isDisplayed();
		
		System.out.println("The visibilty of an element "+iAmHere);
		
		System.out.println("------------------------------------------------------------");
		
		WebElement secondElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Click'])[2]")));
	
		secondElement.click();
		
		//Write teh Explicit for the element to be invisible
		
		Boolean invisibleWE = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
		
		System.out.println("The invisibility of an element: " +   invisibleWE);
		
		System.out.println("------------------------------------------------------------");
		
		//Window
		
		driver.get("https://leafground.com/window.xhtml");
		
		//Write the Explicitwait  for the element to be clickable in the clickable condition
		
		WebElement multipleWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Open Multiple']")));
		
		multipleWindow.click();
		
		//to chk how many windows are opened
		
		Boolean windowsValue = wait.until(ExpectedConditions.numberOfWindowsToBe(3));

		System.out.println(windowsValue);
		
		System.out.println("------------------------------------------------------------");
		
			
	}
	
}
