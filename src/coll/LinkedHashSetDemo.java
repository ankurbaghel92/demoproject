package coll;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
		
		lh.add(70);
		lh.add(87);
		lh.add(99);
		lh.add(55);
		lh.add(77);
		
		for(Integer i : lh)
		{
			System.out.println(i);
		}
		
		System.out.println("Saerching if 99 present in the Linked HashSet or not:-  "+lh.contains(99));
	}

}
