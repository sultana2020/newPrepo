package intRelatedQs;

public class DuplicateNumArrayBruteForce {

	public static void main(String[] args) {

		//using Brute Force
		int[]num = {8, 4, 6, 2, 7, 6, 9, 11, 4, 5};
		
		
		
		DuplicateNumArrayBruteForce.findDuplicateUsingBruteForce(num);
		 
		}

	private static void findDuplicateUsingBruteForce(int[]arr) {
		for(int i =0; i <arr.length; i++) {
			for(int j =i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate element is fount "+ arr[i]);
				}
			}
		}
	}
	//Time complexity is o(n^2) since we use two for loop
}
