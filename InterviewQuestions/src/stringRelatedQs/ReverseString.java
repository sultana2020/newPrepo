package stringRelatedQs;

public class ReverseString {

	public static void main(String[] args) {

		//reverse it
		String str = "java";
		
		// using stringbuffer class
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		//without using StringBuffer
		
		for(int i= str.length()-1; i>=0; i--) {
			char result = str.charAt(i);
			System.out.println(result);
		}
	}

}
