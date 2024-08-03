package weekDay;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Learn Simple Alert

public class W1SimpleAlert {

	public static void main(String[] args) throws InterruptedException  {

		//open the chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL

	driver.get("https://leafground.com/alert.xhtml");
	
				//maximise the window
	
	driver.manage().window().maximize();
	
	//add implicit wait
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("(//span[text()='Show']")).click();
	
		//transfer the driver focus to alert box
	
	Alert simpleAlert = driver.switchTo().alert();
	
	Thread.sleep(2000);
	
	simpleAlert.accept();
		
	//driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
	}

}
