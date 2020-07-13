package patterns;

public class ReversString {

	public static void main(String[] args) {

		
 
		
		String s = "hello";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		
		System.out.println("___________________________________reverse String ____________________________");	
		
		String str = "mom";
		String rev = "";
		for(int i = str.length()-1; i>=0;i--) {
			rev= rev +str.charAt(i);
			System.out.println(rev);
		}
		
		String rev1= "";
		for(int i = str.length()-1; i>=1; i--) {
			rev1= rev1+ str.substring(i-1, i);
			System.out.println(rev1);
		}
		
	}

}
