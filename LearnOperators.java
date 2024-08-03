package week1.day2;

public class LearnOperators {

	//to run -> shortcut key -> ctrl+f11
	
	public static void main(String[] args) {
		
		//Arithmetic Operators
		
		int a=10;
		int b=5;
		System.out.println("addition is:" + (a+b));
		System.out.println("subtraction is:" +(a-b));
		System.out.println("Multiplication"+ (a*b));
		System.out.println("Division:"+ (a/b));
		System.out.println("Reminder :"+ (a%b));
	
				//Comparison operators
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println("next starts with the *logical operators*");
		
		//Logical operators
		
		System.out.println("a>b is:"+(a>b));
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a>b && a<b); //AND operator
		System.out.println(a>b || a<b); //OR operator
		
	//post - increment operator --> a++
		
		System.out.println("The post increment of a =10 is :" + (a++));
		System.out.println(a);
		
		//Pre -increment operator
		
		System.out.println("The Pre increment of a =10 is :" + (++a));
		
		//post-decrement operator
		
		System.out.println("The post decrement operator is"+(a--));
		
		System.out.println();
		
		//pre-decrement operator
		
		System.out.println();
		
		System.out.println();
	}
	
		}
