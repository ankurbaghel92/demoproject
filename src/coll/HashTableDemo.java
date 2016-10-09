package coll;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(70, "Ankur");
		ht.put(87, "Sachin");
		ht.put(55, "Rohit");
		ht.put(90, "Sehwag");
		ht.put(50, "Kohli");
		ht.put(66, "Ashwin");
		ht.put(66, "Ashwin");

		System.out.println(ht);
		
		for(Map.Entry m : ht.entrySet())
		{
			System.out.println(m.getKey()+ "    " + m.getValue());
		}
		
		System.out.println("Seraching if Sachin is there in the HashTable or not :- " + ht.containsValue("Sachin"));
				}

}
