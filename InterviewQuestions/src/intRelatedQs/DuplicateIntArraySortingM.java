package intRelatedQs;

import java.util.Arrays;

public class DuplicateIntArraySortingM {

	public static void main(String[] args) {
	
	
	int[]num = {6, 4, 2, 3, 7, 9, 3, 5, 6};
	
	
	DuplicateIntArraySortingM.findDupUsingSortM(num);
	
	}
	
	
	
	private static void findDupUsingSortM(int[]arr) {
		Arrays.sort(arr);
		for(int i = 0; i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println("Duplicate element found is: " + arr[i]);
			}
		}
	}
	//Time complexity is : o(n) + o(nlogn)
}
