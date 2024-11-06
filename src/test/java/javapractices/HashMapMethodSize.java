package javapractices;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapMethodSize {

	public static void main(String[] args) {
		HashMap<Integer,String> empDetails= new HashMap<Integer,String>();
		empDetails.put(1, "Ashwini");
		empDetails.put(2, "Bhushan");
		empDetails.put(null, "Bhushan");
		empDetails.put(3, null);
		empDetails.put(4, null);
		
		 System.out.println("*******Size Method******");
		
			 System.out.println("Size of HashMaP:" +empDetails.size());
			 
			 System.out.println("*******key set******");
			 
			 Set<Integer> empIds = empDetails.keySet();

				for (Integer empId : empIds) {
					System.out.println("emp id = " + empId);
				}
		 }

	}

