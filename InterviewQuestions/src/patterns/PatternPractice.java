package patterns;

public class PatternPractice {
	
	static int first=0, second =1, third;  

	public static void main(String[] args) {
//
//		for(int i =1; i<=5; i++) {
//			for(int j =1; j<=i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//		System.out.println("_____________________________next ________________");
//		
		//fibonaci
		int a=0, b=1, count=10;
		int c;
		System.out.print(a+ " "+ b);
		
		for(int i =2; i<count; i++) {
			c=a+b;
			System.out.print(" "+ c);
			a =b;
			b=c;
		}
		  
		 
		System.out.println(first + " "+ second);
		PatternPractice pp= new PatternPractice();
		pp.printFib(15);
	 
	}

	public void printFib(int number) {
		 
		 
		for(int i=0; i<=number; i++) {
			third= first+second;
			System.out.print(" "+ third);
			first=second;
			second=third;
		}
	}
	
	
	
	
	
	
}
