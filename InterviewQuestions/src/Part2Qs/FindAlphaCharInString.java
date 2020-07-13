package Part2Qs;

public class FindAlphaCharInString {

	public static void main(String[] args) {

		//find out how many alpha character we have in this String
		
		String data = "fskjfowru9384-qikflmfiwu0129-tejf8s7kclfwir=!@#hdfkjf$%";
		
		//replace the alpha with nothing
		String replaced = data.replaceAll("[a-zA-Z]", "");
		
		System.out.println(data);
		System.out.println(replaced);
		
		//fine out the total number of chars
		int alphaChars = data.length()-replaced.length();
		
		System.out.println(alphaChars);
		
		//use bytewise sign ^ to have all alphas
		String replaced1 = data.replaceAll("[^a-zA-Z]", "");
		System.out.println(replaced1);
	}

}
