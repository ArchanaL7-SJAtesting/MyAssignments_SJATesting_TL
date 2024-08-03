package week1.day3;

public class LearnMethods {
	
	//Types of method
	//main method - to run the program
	//normal method - to perform a task
	
	//syntax for creating method
	// Access modifier  returntype  methodName
	      public    void     makeCall(String mailing) 
	   {
		System.out.println("Learn Sending GmailMethods");
		}
	   public static void main(String[] args) 
           {
	LearnMethods mthd=new LearnMethods(); 
	mthd.makeCall("send");
	mthd.makeCall("gmail");
}

	}
