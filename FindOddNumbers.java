package week1.day1;

public class FindOddNumbers {
    public static void main(String[] args) {
       
    	// Declare a variable to define the maximum range
        
    	int maxRange = 10;

       // Iterate from 1 to maxRange
    
    	for (int i = 1; i <= maxRange; i++) {
      
    		// Check if the number is odd
            
    	if (i % 2 != 0) {
        
    		// Print the odd number
            
    		System.out.println(i);
            }
        }
    }
}