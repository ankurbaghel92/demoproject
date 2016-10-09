package coll;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(70);
		hs.add(87);
		hs.add(99);
		hs.add(55);
		hs.add(77);
		
		for(Integer i : hs )
		{
			System.out.println(i);
		}
	}

}
