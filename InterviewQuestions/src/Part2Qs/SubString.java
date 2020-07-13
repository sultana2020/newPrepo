package Part2Qs;

public class SubString {

	public static void main(String[] args) {

		//find out substring from a string
		
		String str = "I like java";
		
		System.out.println(str.substring(2)); // return a substring that strars from the specific index number and extends to the end of this string
		
		System.out.println(str.substring(6, 10));// return a substring that start from specific begin index no and extends to endIndex no(ednIndex is not included)
		
		//if the string is long we have see if we can split it by space or characters
		String [] words = str.split(" ");
		System.out.println(words.length);
		
		for(String s:words) {
			System.out.println(s);
		}
		
		String name = "I have my java_and SQL_interview on Saturday";
		
		String[] word = name.split("_");
		System.out.println(word.length);
		
		for(String subS : word) {
			System.out.println(subS);
		}
		
				
//		System.out.println(name.substring(12));
//		System.out.println(name.substring(10, 20));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
