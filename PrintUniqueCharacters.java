package week3.day4;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
		
		 String str = "babu";
	        char[] charArray = str.toCharArray();
	        
	        Set<Character> uniqueChars = new HashSet<Character>();
	        System.out.println(uniqueChars);
	        Set<Character> duplicateChars = new HashSet<Character>();
	        System.out.println(duplicateChars);
	        for (char c : charArray) {
	            if (!uniqueChars.add(c)) {
	                duplicateChars.add(c);
	            }
	        }
	        
	        uniqueChars.removeAll(duplicateChars);
	        
	        System.out.println(uniqueChars);
			
			
			}



	

}
