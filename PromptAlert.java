package weekDay;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		
		// Learn PromptAlert
		

				//open the chrome browser
						ChromeDriver driver = new ChromeDriver();

						// Load the URL

					driver.get("https://leafground.com/alert.xhtml");
					
						
						//maximise the window
					
					driver.manage().window().maximize();
					
					//add implicit wait
					
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));					
				 
					driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
				    
				    Alert confirmPromptAlert = driver.switchTo().alert();
				   
				    Thread.sleep(2000);
				    confirmPromptAlert.sendKeys("Archana Aravamudhazhwan");
				    
				    
				    //String promptAlertText = confirmPromptAlert.getText();
				    
				   //System.out.println("The text in the confirmDialogAlert is"+promptAlertText);
				    		   	     
				    Thread.sleep(1000);
				    
				   confirmPromptAlert.accept();  
			}
	

	}


//methods of alert can be used
//accept();
//dismiss();
//getText();
//sendKeys();

//Exceptions

//NoAlertPresentException
//UnHnadledAlertException

