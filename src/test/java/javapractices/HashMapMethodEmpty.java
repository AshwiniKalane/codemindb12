package javapractices;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapMethodEmpty {

	public static void main(String[] args) {
		HashMap<Integer,String> empDetails= new HashMap<Integer,String>();
		empDetails.put(1, "Ashwini");
		empDetails.put(2, "Bhushan");
		empDetails.put(null, "Bhushan");
		empDetails.put(3, null);
		empDetails.put(4, null);
		
		
		
		Set<Entry<Integer, String>>set= empDetails.entrySet();
		 for(Entry <Integer, String> e: set)
		 {
			 System.out.println(e.getKey()+":"+ e.getValue());
			 
		 }
		 System.out.println("**** Not Empty Method ******************************");
			
			 
			// empDetails.clear();
			 System.out.println("HashMap Is empty:" + empDetails.isEmpty());

			 System.out.println("**** Empty Method ******************************");
			 
			// empDetails.clear();
			 System.out.println("HashMap Is empty:" + empDetails.isEmpty());
			 
			 System.out.println("**** Get Method ******************************");
			 System.out.println(empDetails.get(1));
			 

	}

}
