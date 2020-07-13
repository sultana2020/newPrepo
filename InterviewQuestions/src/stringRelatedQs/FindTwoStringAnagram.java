package stringRelatedQs;

import java.util.Arrays;

public class FindTwoStringAnagram {

	public static void main(String[] args) {

		//below strings are anagram // same characters and lengths
		String str1 = "stop";
		String str2 = "pots";
		
		char []arr1 = str1.toLowerCase().toCharArray();
		char [] arr2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Given Strings are Anagram");
		} else {
			System.out.println("not anagram");
		}
	}

}
