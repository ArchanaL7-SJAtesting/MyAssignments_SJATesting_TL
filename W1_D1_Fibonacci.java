package week1.day1;

public class W1_D1_Fibonacci {
	
	public static void main(String[] args) {

		int firstNum = 0, secNum = 1, sum ;
	
		System.out.println(firstNum);

		System.out.println(secNum);
		
		for (int i = 0; i <=8; i++) {
		
			sum = firstNum + secNum;
			
			firstNum = secNum;  
		
	   		secNum = sum;//2
			
			System.out.println(sum);
			
		
			}
			
		}       
	}


