package stringRelatedQs;

public class Palindrome {
	public static void main(String[] args) {
		
		//find the string is palindrom
		
		
		String str = "mom";
		
		//usnign recursion --> calling itself
		//comparing the first to last and go on
		
		boolean result = isPalindrome(str);
		System.out.println(str + " isPalindrome = " + result);
	}

	 public static boolean isPalindrome(String str) {
		 if(str == null) {
			 return false;
		 } if(str.length()<=1) {
			 return true;
		 }
		 String first = str.substring(0, 1);
		 String last = str.substring(str.length()-1, str.length());
		 if(!first.equals(last)) {
			 return false;
		 } else {
			 return isPalindrome(str.substring(1, str.length()-1)); // recursion is a function which calls itself
		 }
	 }
	
	
	
	
	
}
