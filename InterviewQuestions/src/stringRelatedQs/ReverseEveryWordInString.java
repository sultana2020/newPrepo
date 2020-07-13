package stringRelatedQs;

public class ReverseEveryWordInString {

	public static void main(String[] args) {

		//reverse every word but keep the order
		String str = "How are you";
		//output = uoy era woh
		String result = "";
		
		String []arr = str.split(" "); // give us string array
		
		for(String word : arr) { //loop through string of array each word
			String reversWord= "";
			int j = word.length()-1; // find the end index of each word
			while(j>=0) {
				char ch = word.charAt(j);
				reversWord= reversWord + ch;
				j--;
			}
			result = result+reversWord + " ";
		}
		System.out.println(result);
	}

}
