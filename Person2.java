package week1.day3;

     public class Person2 {
	
	            public void sendBankAccountNumber() {
		System.out.println("SB AccountNumber");

	}

	public static void main(String[] args) 
	{
		//Person2 pr2=new Person2();
		Person1 pr1=new Person1();
		pr1.sendMoney();
		//Cannot able to call atmPin method since it is private method
	}
	
	

}
