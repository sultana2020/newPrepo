package stringRelatedQs;

import java.util.HashMap;
import java.util.Map;

public class CountOfOccuranceInString {

	public static void main(String[] args) {

		String str = "I am a a Tek School School Student";
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		String [] array = str.split(" "); //give array of string
		for(int i = 0; i<array.length; i++) {
			int count=1;
			if(!map.containsKey(array[i])) {
				map.put(array[i], count);
				
			}else {
				map.put(array[i], map.get(array[i])+1);
			}
		}
		//print
		for(String s: map.keySet()) { //give set of keys
			System.out.println("The count of words: " + s + " " + map.get(s)); //set of value
		}
	}

}
