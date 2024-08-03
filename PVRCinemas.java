package marathonIT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		// Launch the url https://www.pvrcinemas.com/
		driver.get("https://www.pvrcinemas.com/");
		
		//Maximise the window
		driver.manage().window().maximize();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// driver.findElement(By.xpath("//input[@placeholder='Search
		// city']")).sendKeys("Chennai");
		// driver.findElement(By.xpath("//h6[text()='Chennai']")).click();

		// Click on Cinema

		driver.findElement(By.className("cinemas-inactive")).click();

		// Select Cinema

		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();

		driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[2]")).click();

		// Select Date

		driver.findElement(By.xpath("//span[contains(text(), 'Tomorrow')]")).click();

		// Select movie

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[1]")).click();

		// Select show time

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[1]")).click();

		// Click the book button

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Click Accept button

		driver.findElement(By.xpath("//button[text()='Accept']")).click();

		driver.findElement(By.xpath("//button[text()='Accept']")).click();

		// Choose Seat

		driver.findElement(By.xpath("(//span[@class='seat-current-pvr'])")).click();

		// Print summary

		String summary = driver.findElement(By.className("summary-movies-content")).getText();

		System.out.println("Booking summary: " + summary);

		// Print Select seat number

		String seatNo = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();

		System.out.println("Booking Seat No: " + seatNo);

		// Print total amount

		String price = driver.findElement(By.className("grand-prices")).getText();

		System.out.println("Grand Total 1: " + price);

		// Click Proceed button

		driver.findElement(By.xpath("//div[@class='register-btn']/button")).click();

		// Print grand total

		String text = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//following::span")).getText();

		System.out.println(text);

		if (price.contains(text))
		{

			System.out.println("Both are same");

		}

		driver.findElement(By.xpath("(//i[@class='pi pi-times'])")).click();

		System.out.println(driver.getTitle());

		driver.close();

	}

}
