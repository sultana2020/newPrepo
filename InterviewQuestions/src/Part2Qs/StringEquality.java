package Part2Qs;

public class StringEquality {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "Hello";
		
		//1. we can use if statement with equal()
		if(str1.equals(str2)) {
			System.out.println(str1+" is equal to "+ str2);
		}else {
			System.out.println("not equal");
		}
		
		//2. again if statment with compareTo()
		
		if(str1.compareTo(str2)==0) {
			System.out.println(str1+ " is equal to "+str2);
		}else {
			System.out.println("not equal");
		}
	}

}
