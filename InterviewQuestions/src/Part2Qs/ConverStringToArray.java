package Part2Qs;

import java.util.Arrays;

public class ConverStringToArray {

	public static void main(String[] args) {

		//Q. how to conver string to array?
		
		String str = "Welcome to java"; //test data
		
		//conver it to an Array
		//String is basically an Array of chars
		char[] array = str.toCharArray(); //returns a new array of chars using the value of string
		for(int i =0; i<array.length; i++) {
			 System.out.println(array[i]);
		}
		 
		System.out.println("*****************************converting array to stirng*****************************");
		
		String [] s = {"Jack", "Mak", "Sam", "Bam"};
		
		// usig toStirng()
		String test = Arrays.toString(s);
		System.out.println(test);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//our own method
		String testS = mytoString(s);
		System.out.println(testS);
	}

	  private static String mytoString(String[] theAray) {
	      StringBuilder sb = new StringBuilder();
	      sb.append("[");
	      for (int i = 0; i < theAray.length; i++) {
	         if (i > 0) {
	            sb.append(",");
	         }
	         String item = theAray[i];
	         sb.append(item);
	      }
	      sb.append("]");
	      return sb.toString();
	   }
	
}
