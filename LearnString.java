package week1.day4;

public class LearnString {

	public static void main(String[] args) {
		
		//Declaration
		//Literal
		
	String str1=new String("MayBatch2024");
		
		//Instantiation
		
	String str2 =new String("MayBatch");
		
		
		//Methods of String
		
		//  ==      -> compares the reference address
		// equals   -> Compares the content
		
		//By literal
		String st1= "TestLeaf";
		String st2="TestLeaf";
		
		System.out.println(st1==st2);
		
		//By instantiation
		String st3=new String("Testleaf");
		System.out.println(st1==st3);
		System.out.println(st2==st3);
		System.out.println("-------------------");
		
		//equals method
		
	    System.out.println(st1.equals(st3));
		System.out.println(st2.equals(st3));
		
		//equalsIgnoreCase
		
		System.out.println(st1.equalsIgnoreCase(st3));
		System.out.println(st2.equalsIgnoreCase(st3));
		
		System.out.println("------------------");
		
		//contains  - it can used to compare partial value
		
		System.out.println(st1.contains("Test"));
		System.out.println(st1.contains("et"));
		
		
		//To find length of the string
		
		String str="MAYbatch 2024";
		
		int length = str.length();
		
		System.out.println(length);
		
		//toUpperCase - converts the String to uppercase
		
		String upperCase = str.toUpperCase();
		
		System.out.println(upperCase);
		
		//toLowerCase  - converts the String to lowercase
		
		String lowerCase = str.toLowerCase();
		System.out.println(lowerCase);
		
		//toCharArray
		//convert string to Character array
		
		String s="Hello";
		//press chtrl+2 to set the  to local variable after ex: s..toCharArray();  
		// H e l l o
		// 0 1 2 3 4 ->Based on index value
		 char[] charArray = s.toCharArray(); // toCharArray() method is used to convert string into character array 
		 System.out.println(charArray[1]);
		int charLength = charArray.length; //length of the array is printed.
		System.out.println(charLength);
				
		//charAt
		
		System.out.println("The charAt "+s.charAt(3));
	}

}
