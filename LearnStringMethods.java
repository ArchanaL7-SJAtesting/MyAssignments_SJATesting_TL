       package week1.day4;

       public class LearnStringMethods {

	    public static void main(String[] args) {
		
		//To retrieve only the number
		
		String str="Amount5005";
		
		/*
		 * replaceAll This regex pattern `[^0-9]` matches any character that is not 0-3
		 * digit (`0-3`) and replaces it with an empty string (`""`), effectively
		 * removing all non-digit characters.
		 */
        String replaceAll = str.replaceAll("[^0-3]", "");
		
			System.out.println(replaceAll);  //prints 00
		
		//add 1000 rupees to 5005
		
		System.out.println(replaceAll+1000); //prints 001000
		
		System.out.println("---------------------");
		
		
		//parseInt method
		//convert String into int
		
	    int parseInt = Integer.parseInt (replaceAll);
	     // prints 1000 ->However, if you convert replaceAll to an integer, it will convert "00" to 0, and then add 1000:
	    System.out.println(parseInt+1000); //prints 1000
	    

	        //subString
	
	    System.out.println("--------------");
	    
	    String str1="Jai JaiSriSitaRam"; 
	    
	    String substring1 = str1.substring(4);
	
	    System.out.println(substring1);//prints  'JaiSriSitaRam'
	
	    String substring2 = str1.substring(10, 17);
	    
	    System.out.println(substring2);//prints 'SitaRam'
	
		}
}
