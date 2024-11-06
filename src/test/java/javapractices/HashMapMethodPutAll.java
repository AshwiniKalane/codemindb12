package javapractices;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapMethodPutAll {

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
		 System.out.println("**** Put All Method ******************************");
			HashMap<Integer,String> empDetails1= new HashMap<Integer,String>();
			empDetails1.put(10, "Aayushri");

			empDetails1.putAll(empDetails);
			Set<Entry<Integer, String>>set1= empDetails1.entrySet();
			 for(Entry <Integer, String> e1: set1)
			 {
				 System.out.println(e1.getKey()+":"+ e1.getValue());
				 
			 }
	}

}
