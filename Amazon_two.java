package marathonIT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_two {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags for boys", Keys.ENTER);
		// Select the first 2 brands in the left menu
		WebElement element1 = driver.findElement(By.xpath("//div[@id='brandsRefinements']//following::input[1]"));
		driver.executeScript("arguments[0].click();", element1);

// Select the first 2 brands in the left menu
		WebElement element2 = driver.findElement(By.xpath("//div[@id='brandsRefinements']//following::input[1]"));
		driver.executeScript("arguments[0].click();", element2);
		Thread.sleep(500);
		WebElement clc = driver.findElement(By.xpath("//div[@id='brandsRefinements']//following::input[2]"));
		driver.executeScript("arguments[0].click();", clc);
// Choose New Arrivals (Sort)
		WebElement sortMenu = driver
				.findElement(By.xpath("//span[@class='a-button a-button-dropdown a-button-small']"));
		sortMenu.click();
		WebElement newArrivalsOption = driver.findElement(By.xpath("//a[text()='Newest Arrivals']"));
		newArrivalsOption.click();
		Thread.sleep(3000);
// Print the first resulting bag info (name, discounted price)
		WebElement firstBagName = driver.findElement(By.xpath("(//div[contains(@class,'a-section a-spacing')])[5]"));
		System.out.println("First Bag Name: " + firstBagName.getText());
		WebElement firstBagPrice = driver.findElement(By.xpath(
				"//span[@class='a-price-whole']"));
		System.out.println("First Bag Discounted Price: " + firstBagPrice.getText());
// Verify the page title and close the browser�
		String expectedTitle = "Amazon.in : Bags";
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Page title verified: " + actualTitle);
		} else {
			System.out.println("Page title not verified: " + actualTitle);
		}
	}

}
