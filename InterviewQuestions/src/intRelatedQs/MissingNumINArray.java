package intRelatedQs;

public class MissingNumINArray {

	public static void main(String[] args) {

		int[]num = {1, 2, 3, 5, 6, 7, 8, 9, 10}; //specific range
		int sum =0;
		int expectedSum =0;
		
		//count all the given num
		for(int i=0; i<num.length; i++) {
			sum+= num[i];
		}
		//count the range 
		for(int i = 1; i<=10; i++) {
			expectedSum+= i;
		}
		//the subtract 
		System.out.println("The missing num in array is: "+ (expectedSum - sum));
	}

}
