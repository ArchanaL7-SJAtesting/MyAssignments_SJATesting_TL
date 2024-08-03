package week4.day2;
import org.testng.annotations.Test;

public class GmailFunctionality {
	@Test(priority=4,enabled=false)
	public void addAttachement()
	{
		System.out.println("Attachement added");
	}
	
	@Test(priority=-1)
	public void login()
	{
System.out.println("Logged in");
}

	@Test(priority=3)
	public void addReceipient()
	{
		System.out.println("Receipient added");
	}
	@Test(priority=5)
	public void clickSend()
	{
		System.out.println("clicked");
	}
	@Test(priority=-2)
	public void composeMail()
	{
		System.out.println("GMail Composed");

	}
}