package intRelatedQs;

import java.util.HashMap;
import java.util.Map;

public class FindDupInArrayUsingHashMap {

	public static void main(String[] args) {

		int[]num = {6, 4, 2, 7, 9, 3, 5, 6};
		
		FindDupInArrayUsingHashMap.findDupUsingHashMap(num);
	}
	
	
	private static void findDupUsingHashMap(int[]arr) {
		//hashmap based on key and value pair
		//in this example key would be the array element and value would be the count of occurance of the array element
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer x : arr) {
			if(!map.containsKey(x)) {
				map.put(x, 1);
			} else {
				map.put(x, map.get(x)+1);
			}
		}
		for(Integer x : map.keySet()) {
			if(map.get(x)>1) {
				System.out.println("Duplicate element is: "+x);
			}
		}
		// Time Complexity is 0(n) 
	}

}
