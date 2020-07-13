package intRelatedQs;

public class Factorial {

	public static void main(String[] args) {
		
		// how to find factorial
		// 5 = 5* 4* 3* 2* 1=
		
		int n = 4;
		int fact = 1;
		
		for(int i =1; i<=n; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of " + n +" is "+ fact);
		
		//call recusion method
		System.out.println(Factorial.findFactorialUsingRecursion(n));
	}
	// find factoril using recursion---- a function calling itself
	
	public static int findFactorialUsingRecursion(int num) {
		
		if(num<=1) {
			return 1;
		} else {
			return num * findFactorialUsingRecursion(num -1); //return type in recursion is the name of the method because it calls itself again and again
		}
		 
	}
	
	
	
	
	
	
	
	
	
	
	
}
