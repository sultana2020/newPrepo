package intRelatedQs;

import java.util.HashSet;
import java.util.Set;

public class FindDupUsingHashSet {

	public static void main(String[] args) {

		int[]num = {6, 4, 2, 3, 7, 9, 3, 5, 6};
		//call the method
		FindDupUsingHashSet.findDupUsingSet(num);
		
		//allow unique value no duplicate
		Set <Integer>hs1 = new HashSet<Integer>();
		for(Integer s : num) {
			if(!hs1.add(s)) {
				System.out.println(s);
			}
		}
		//Time complexity is o(n)
	}
	
	private static void findDupUsingSet(int []arr) {
		Set<Integer> hs = new HashSet<Integer>();
		for(Integer x :arr) {
			if(!hs.add(x)){
				System.out.println("The duplicate element is: "+ x);
			}
		}
	}

}
