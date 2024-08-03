package week1.day1;

public class W1_D1_Fibonacci {
	
	public static void main(String[] args) {

		int firstNum = 0, secNum = 1, sum ;
	
		System.out.println(firstNum);

		System.out.println(secNum);
		
		int i;
		
		for (i = 0; i <=8; i++) {
		
			sum = firstNum + secNum;
			
			firstNum = secNum;  
		
	   		secNum = sum;
			
			System.out.println(sum);
			
					}
				}       
	}
