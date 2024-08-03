package testcase;
import java.time.Duration;
import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

        public class TC_001CreateLead  extends BaseClass
           {
				/*
				 * @Test -->to run the testcases In a class the execution starts at main method
				 * sameway this particular @Test is also used to execute or run the
				 * testcases-->we dont want to have @Test a nd main method also doing same
				 * process so annotate@Test above normal method and remove the main method
				 */        	
        	
	/*
	 * When we run the testcase only method name will be in the report. (Thus give a
	 * meaningful method name releavant to the funstionality)
	 */	
        		@Test 	
        	public  void runCreateLead()  
   {
	     driver.findElement(By.linkText ("Create Lead")).click();
		driver.findElement(By.id ("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id ("createLeadForm_firstName")).sendKeys("Komalavalli");
		driver.findElement(By.id ("createLeadForm_lastName")).sendKeys("Namamrutha");
		driver.findElement(By.name ("submitButton")).click();
	    
}
}
        





