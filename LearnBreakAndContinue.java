package week1.day2;

public class LearnBreakAndContinue {
	
	public static void main(String[] args) {
		
		//Break statement -Breaks the loop and comes out
		
		for(int i=1;i<=10;i++)
		{
		
		if(i==5)
		{
			System.out.println("Break Statement done");
			System.out.println("####################");
			break;
			
		}
		System.out.println(i);
		
		}
		
			//Continue - Skips the current iteration and continue further
		
		//Continue Statement
		System.out.println("Continue Statement Starts");
		System.out.println("####################");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
		continue;

			}
			
System.out.println(i);
		          }
	       }
   }
