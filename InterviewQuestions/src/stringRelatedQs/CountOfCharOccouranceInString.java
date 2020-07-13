package stringRelatedQs;

public class CountOfCharOccouranceInString {

	public static void main(String[] args) {

		String str = "Selenium is an automation tool in software programming";
		
		//find the count of occurance of 'm'
		//output should be int
		
		String replace = str.replaceAll("a", ""); //give us a string with less length then the original one
		int result = str.length()-replace.length();// by substraction we get the count of occourance of that char
		System.out.println(result);
		System.out.println(replace);
		
	}

}
