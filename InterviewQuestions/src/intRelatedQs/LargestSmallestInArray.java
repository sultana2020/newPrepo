package intRelatedQs;

import java.util.Arrays;

public class LargestSmallestInArray {

	public static void main(String[] args) {

		int [] arr = {2,45,67,34,1,78,90};
		
		int largest = arr[0];
		int smallest = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]> largest) {
				largest=arr[i];
			} else if(arr[i]< smallest) {
				smallest=arr[i];
			}
		}
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		System.out.println("The largest element is: " +largest);
		System.out.println("The smallest element is: " +smallest);
	}

}
