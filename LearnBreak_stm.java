package week1.day2;

public class LearnBreak_stm {

 public static void main(String[] args) {
	
			// break,continue  -> Breaks the loop and comes out -->Jump statements
			
			// When i find the number 3 -> print the number 3 in words and stop the iteration
			
		// i=3; 3<=10-> t
		
		for (int i = 1; i <=10; i++)   //1  1<=10   2  2<=10   3  3<=10
		{                                                        
			
			// 3==3 -> t
				
			if(i==3) 
					
					{ 
			
					System.out.println("Three"); // Three
					break;
				}
				System.out.println(i); // 1 2 
				
			}
			System.out.println("Out of the loop");
		}
}


