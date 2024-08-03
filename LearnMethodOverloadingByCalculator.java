package week2.day3; //polymorphism

public class LearnMethodOverloadingByCalculator {
	
	/*
	 * add functionality of calculator with same method name here as 'add' is kept
	 * same but the input arguments passed are diffrent
	 */
		public void add(int num1,float num2) {
		
		System.out.println(num1+num2);
	}
	
		public void add(int num1,int num2) {
		System.out.println(num1+num2);
		
	}
	
	    public void add(int num1,int num2,int num3) {
    	System.out.println(num1+num2+num3);
		
	}
        
public void add(float num1,float num2) {
		
	System.out.println(num1+num2);
	}

public static void main(String[] args) {
	LearnMethodOverloadingByCalculator calc=new LearnMethodOverloadingByCalculator();
	
	calc.add(4.5F, 5.5F);
	calc.add(7, 1.5F);
	calc.add(10, 10);
	calc.add(12, 12, 6);
}

		}

