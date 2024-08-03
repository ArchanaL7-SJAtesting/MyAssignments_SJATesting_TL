package weekDay;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfDlgAlert {

	public static void main(String[] args) throws InterruptedException {

	       // Learn  ConfirmDialo gAlert

		//open the chrome browser
				ChromeDriver driver = new ChromeDriver();

				// Load the URL

			driver.get("https://leafground.com/alert.xhtml");
			
				
				//maximise the window
			
			driver.manage().window().maximize();
			
			//add implicit wait
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		
		    driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		    
		    Alert confirmDialogAlert = driver.switchTo().alert();
		    
		    String confirmAlertText = confirmDialogAlert.getText();
		    
		    System.out.println("The text in the confirmDialogAlert is"+confirmAlertText);
		    		   	     
		    Thread.sleep(1000);
		    
		   confirmDialogAlert.dismiss();  
	}

}
