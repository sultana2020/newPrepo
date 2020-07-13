package patterns;

public class MaxInArray {

	public static void main(String[] args) {
 
		int [] arr = {23, 56, 78, 34};
		int max= arr[0];
		
		for(int i =0; i<=arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
				break;
				 		 
			}
			System.out.println(max); 
		}
		 
	}

}
