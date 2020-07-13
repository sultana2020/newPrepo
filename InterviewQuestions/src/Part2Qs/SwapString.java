package Part2Qs;

public class SwapString {

	public static void main(String[] args) {

		//how to swap two strings
		
		//first test data
		String str1 = "Hello";
		String str2 = "World";
		System.out.println(str1+ " "+ str2);
		
		// we have print like World Hello
		
		str1 = str1+str2;
		str2= str1.substring(0, str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println(str1+  " " +str2);
		 
		
		
		
	}

}
