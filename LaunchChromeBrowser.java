package week2.day3;//polymorphism

public class LaunchChromeBrowser extends LaunchEdgeBrowser{
	
	
	public void launchBrowser() {
		System.out.println("Chrome browser launched successfully");

	}
	
		public static void main(String[] args) {
		LaunchChromeBrowser chrm=new LaunchChromeBrowser();
		chrm.launchBrowser();
		
		LaunchEdgeBrowser edge=new LaunchEdgeBrowser();
		edge.launchBrowser();
		
	}
	

}
