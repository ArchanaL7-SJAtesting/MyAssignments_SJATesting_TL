package week1.day2;

 public class LearnContinueStatement 
{
	public static void main(String[] args) 
	{
		// print numbers from 10 to 1

		// when i find 7 -> Print the number 7 in words and continue
		
         		// i=6; 6>=1-> t

		for (int i = 10; i>=1; i--)
		{
			 // 7==7 -> t
			if(i==7) 
			{
				System.out.println("Seven"); // Seven
				continue;
			}
			System.out.println(i); // 10 9 8 
		}
	}

}