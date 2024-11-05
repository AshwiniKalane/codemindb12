package javapractices;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapImpl {

	public static void main(String[] args) {
		
		HashMap<Integer,String> empDetails= new HashMap<Integer,String>();
		empDetails.put(1, "Ashwini");
		empDetails.put(2, "Bhushan");
		empDetails.put(null, "Bhushan");
		empDetails.put(3, null);
		empDetails.put(4, null);
		
		empDetails.put(1, "Ashu");
		
		Set<Entry<Integer, String>>set= empDetails.entrySet();
		 for(Entry <Integer, String> e: set)
		 {
			 System.out.println(e.getKey()+":"+ e.getValue());
			 
		 }
		

	}

}
