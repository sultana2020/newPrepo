package intRelatedQs;

public class Fibonacci {

	public static void main(String[] args) {

		//how to fibnocci num 0 1 1 2 3 5 8 13 21 ...
		
		//these are constant first is 0 and second is 1
		int first = 0;
		int second = 1;
		
		// determine the limit 
		int n = 10;
		
//		System.out.print(first+ " ");
//		System.out.print(second+ " ");
		
		for(int i =0; i<=n; i++) {
			
			System.out.print(first + " ");
			int third = first + second;
			first = second;
			second = third;
			//System.out.print(third + " ");
		}
		
	}

}
