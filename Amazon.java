package marathonIT;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Amazon {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--guest");
		EdgeDriver driver= new EdgeDriver(opt);
	//	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags for boys", Keys.ENTER);
		// Select the first 2 brands in the left menu
		WebElement element1 = driver.findElement(By.xpath("//div[@id='brandsRefinements']//following::input[1]"));
		driver.executeScript("arguments[0].click();", element1);

	
// Choose New Arrivals (Sort)
		WebElement sortMenu = driver
				.findElement(By.xpath("//span[@class='a-button a-button-dropdown a-button-small']"));
		sortMenu.click();
		WebElement newArrivalsOption = driver.findElement(By.xpath("//a[text()='Newest Arrivals']"));
		newArrivalsOption.click();
		
		driver.findElement(By.xpath("//span[@class='rush-component']//a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		
		
		driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
		String total = driver.findElement(By.xpath("//div[@id='sw-subtotal']")).getText();
		System.out.println(total);
		
		
		
		
	}
}
