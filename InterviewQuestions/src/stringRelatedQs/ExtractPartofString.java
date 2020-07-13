package stringRelatedQs;

public class ExtractPartofString {

	public static void main(String[] args) {

		
		//Find out part of string
		
		String str = "www.facebook.com";
		
		//find 4 first char --> www.
		
		String firstFourChar = str.substring(0, 4);
		System.out.println(firstFourChar);
		
		//find last 4 char
		
		String lastFourChar = str.substring(str.length()-4, str.length());
		System.out.println(lastFourChar);
		
		//find middle part
		
		String middlePart = str.substring(4, str.length()-4);
		System.out.println(middlePart);
	}

}
