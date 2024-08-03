package weekDay;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		// Learn Screenshot
		
        // Launch the browser
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Load the URL
		
		driver.get("https://leafground.com/waits.xhtml");
		
		driver.manage().window().maximize();
		
//Take the screenshot od  the complete page
		
		//Steps to follow:
		
		//step1. getScreenshot method
		
		File sourceFile = driver.getScreenshotAs(OutputType.FILE);
		
		//step2:
		
	//  ./ -->represents the current project name ->here it is Selenium
		
		File DestinationFile = new File("./snap/framepage.png");
		
		FileUtils.copyFile(sourceFile, DestinationFile);
		
		WebElement iamAbtHideWE = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
		
		File sourceWeFl = iamAbtHideWE.getScreenshotAs(OutputType.FILE);
	
		File destinationWeFl = new File("./snap/iAmAbtToHide.png");
     
		FileUtils.copyFile(sourceWeFl, destinationWeFl);
		
				
	
	}

}
