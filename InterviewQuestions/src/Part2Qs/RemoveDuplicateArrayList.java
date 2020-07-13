package Part2Qs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) {

		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("java");
		al.add("payton");
		al.add("java");
		al.add("c#");
		al.add("C++");
		al.add("ruby");
		al.add("java"); 
		
		Collections.sort(al);
		
		HashSet hs = new HashSet();
		
		for(int i =0; i< al.size(); i++) {
			System.out.println(al.get(i));
			
			hs.add(al.get(i));
		}
		System.out.println(hs);
	}

}
