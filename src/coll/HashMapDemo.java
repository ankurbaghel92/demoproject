package coll;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("ankur", "9796375371");
		hm.put("Ramesh", "9423247100");
		hm.put("ap", "9527678268");
		hm.put("balance", "*123#");
		hm.put("police", "100");
		
		for(Map.Entry<String, String> entry : hm.entrySet())
		{
			System.out.println(entry.getKey() +" : " +entry.getValue() );
		}
	}

}
