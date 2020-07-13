package Part2Qs;

public class SwapInteger {

	public static void main(String[] args) {

		//how to swap int
		
		int x = 5;
		int y = 10;
		
		//1. using arithmatic operations
		
		x = x + y; // x = 15
		y = x-y; // y = 5
		x = x-y; // x = 10
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("_____________________using * and / ___________________________");
		
		int a = 10;
		int b = 20;
		a = a*b; //x = 50
		b = a/b;// y = 10
		a = a/b; // x = 10
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("********************************using ^ **************************************");
		
		int m = 6;
		int n = 5;
		
		m = m^n;
		n = m^n;
		m = m^n;
		
		System.out.println(m);
		System.out.println(n);
		
		System.out.println("##################################### using temp #############################3");
		
		int i = 1;
		 int j = 2;
		 
		 int temp= i;
		 i = j;
		 j = temp;
		 
		 System.out.println(i);
		 System.out.println(j);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
	}

}
