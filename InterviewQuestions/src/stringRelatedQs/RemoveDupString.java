package stringRelatedQs;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupString {

	public static void main(String[] args) {

		// how to remvoe duplicates in sentence
		String str = "I love love Java Java";
		// output should be: I love Java

		// using split method to have a array of string

		String[] output = str.split(" ");

		// insert elements of string array into set since set does not allowed dup

		Set<String> mySet = new LinkedHashSet<String>();
		// why LinkedHashSet because it grauntees the insertion order

		// to add array element loop through it
		for (String x : output) {
			mySet.add(x);
		}

		// to print set elements iterate it
		Iterator ite = mySet.iterator();
		while (ite.hasNext())
			
		{
			System.out.print(ite.next() + " ");
		}
	}

}
