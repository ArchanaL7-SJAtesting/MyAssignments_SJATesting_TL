package week1.day2;

import java.util.Arrays;

public class FindMissingElement {
   
	public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 8, 6, 7};
        
        // Sort the array
        Arrays.sort(arr);
        
        int missingElement = findMissing(arr);
        
        System.out.println("The first missing element is: " + missingElement);
    }
    
    public static int findMissing(int[] arr) {
        int n = arr.length;
        
        // Loop through the array
        for (int i = 0; i < n; i++) {
            // Check if the iterator variable is not equal to the array values respectively
            if (arr[i] != i + 1) {
                // Print the missing number
                return i + 1;
            }
        }
        
        // If no missing number is found in the array, return the next number after the last element
        return n + 1;
    }
}
