package weekDay;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SweetAlertSD{

	
		public static void main(String[] args) throws InterruptedException {

		       // Learn  SweetAlert(SimpleDialog)

			//open the chrome browser
					ChromeDriver driver = new ChromeDriver();

					// Load the URL

				driver.get("https://leafground.com/alert.xhtml");
				
					
					//maximise the window
				
				driver.manage().window().maximize();
				
				//add implicit wait
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			
			    driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
			    
			    //sweet alert can be handled as normal alert
			    
			    driver.findElement(By.xpath("(//span[text()='Dismiss'])")).click();
			   
		}

	}

	
	
	

