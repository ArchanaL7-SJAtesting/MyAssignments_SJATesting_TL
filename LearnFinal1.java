   package week3.day1;

   public final class LearnFinal1 {
	
   public final void finalMethod() 
	{
	
	   System.out.println("Final method");

	}

   public static void main(String[] args) {
		
		int number=21;
		final int number1 =7;
		int number2 = number1 +20;
		
		//num=num+20;
		//Final variable cannot be changed
		 System.out.println(number );
		 System.out.println(number1);
		 System.out.println(number2);
LearnFinal1 lF1=new LearnFinal1();
lF1.finalMethod();
	}

}
