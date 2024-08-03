package marathonIT;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABHIBUS {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();

		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();

		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		// driver.findElement(By.xpath("//a[text()='Search']")).click();
		String text = driver.findElement(By.xpath("//h5[@class='title']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();

		// WebElement seat = driver.findElement(By.xpath("//button[@class='seat
		// sleeper']"));
		// Thread.sleep(500);
		// driver.executeScript("arguments[0].click();", seat);

		List<WebElement> allseats = driver.findElements(By.xpath("//button[@class='seat sleeper']"));

		for (int i = 0; i < allseats.size(); i++) {

			if (allseats.get(i).isEnabled() == true) {
				String text2 = allseats.get(i).getText();
				System.out.print(text2);
				allseats.get(i).click();
				break;
			}

		}

		String seatno = driver.findElement(By.xpath("(//span[@class='text-primary'])[1]")).getText();
		System.out.println(seatno);
		String fare = driver.findElement(By.xpath("(//span[@class='text-primary'])[2]")).getText();
		System.out.println(fare);
		WebElement drop1 = driver.findElement(By.xpath("//input[@placeholder='Search Boarding Point']"));
		drop1.sendKeys("koyambedu");
		driver.findElement(By.xpath("//p[text()='Koyambedu']")).click();

		WebElement drop2 = driver.findElement(By.xpath("//input[@placeholder='Search Dropping Point']"));
		drop2.sendKeys("Madiwala");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();

		System.out.println(driver.getTitle());

		//driver.close();

	}

}
