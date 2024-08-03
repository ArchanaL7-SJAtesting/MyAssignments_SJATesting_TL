package week1.day2;

public class LearnSwitchCase2 {
	
			            /* *********************************************** */
		/*
		 * if wanted to use String objects like String browser="opera"; --> Upgrade Java
		 * Version: Upgrade your Java Development Kit (JDK) to Java 7 or later. This
		 * will enable you to use String values in a switch statement.
		 */
		             /* *********************************************** */
	/*	
		 * Use if-else Statements: If upgrading Java is not feasible, you can use a
		 * series of if-else statements to achieve the same functionality. Here's how
		 * you could rewrite your code using if-else: package week1.day2;
		 *   */
		  
		  public static void main(String[] args)
		  {
		  
		  String browser = "opera";
		 
		 if ("chrome".equals(browser)) 
		 {
		 System.out.println("Chrome browser should be opened"); 
		 }
		 else if
		 ("firefox".equals(browser))
		 { 
			 System.out.println("Firefox should be opened");
		 }
		 else
		 {
			 System.out.println("Unsupported browser: " + browser); 
			 }
		 }
		  }
		 
		 

		/*char browser = 'c';
				
		switch(browser)
		
		{
			case 'c':
				System.out.println("Chrome browser should be opened");
			
			break;
			
			case 'f':
				
				System.out.println("Firefox should be opened");
				break;
				
				default:
					System.out.println("unsupported broswer"+browser);
                      break;
		}
	}

}
*/