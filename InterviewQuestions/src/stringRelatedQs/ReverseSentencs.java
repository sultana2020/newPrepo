package stringRelatedQs;

public class ReverseSentencs {

	public static void main(String[] args) {

		//how to reverse the whole sentence
		
		String str = "did u go to college?";
		// output= java learning are we
		
		String result = "";
		
		//using split method it give us array of string
		String [] arr = str.split("\\s"); // same as space (" ")
		// iterate through array of string in backward
		for(int i = arr.length-1; i>=0; i--) {
			result= result + arr[i] + " ";
		}
		System.out.println(result);
	}

}
