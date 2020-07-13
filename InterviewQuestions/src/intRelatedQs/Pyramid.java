package intRelatedQs;

public class Pyramid {

	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("_______________________________________________");

		//depends how many lines we want to print so give the value to i ex in below for loop i<=5 so we want to print 5 rows/lines
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("***************************************************************");
		int k=1;
		for(int i=1; i<=5; i++) { // this 5 control the number of rows/lines that we want to print
			for(int j=1; j<=k; j++) {
				System.out.print("*");
			}
			k= k+2;  // k will the determine the number of stars printed in each rows
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
