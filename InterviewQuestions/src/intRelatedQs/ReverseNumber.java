package intRelatedQs;

public class ReverseNumber {

	public static void main(String[] args) {

		int a = 1234;
		//output 4321
		
		int rev=0;
		
		while(a>0) {
			rev= rev *10+ a%10;
			a= a/10;
		}
		System.out.println(rev);
		//////////////////////////////////////////////////////////////////////////
		//call the method
		System.out.println(ReverseNumber.revNum(567));
		 
		
	}

	
	public static int revNum(int num) {
		int rev1=0;
		while(num>0) {
			rev1= rev1*10 + num%10;
			num = num/10;
		 
		}
		return rev1;
		 
	}
}
