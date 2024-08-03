package week1.day3;

public class BMW {
	
	public void applyBrake() {
	System.out.println("Apply brake");
	}
	   public static void main(String[] args) {
		//Create object for Car class in BMW class
		Car obj=new Car();
		System.out.println(obj.carColour()); 
		/*
		 * System.out.println(obj.carColour()); -- >when the print statement is used in
		 * the code the carColour methods rreturns the value since it is getting
		 * extreaccted from other class which is instead without print statement.
		 */		BMW obj1=new BMW();
		obj1.applyBrake();
		
	         }
        }

