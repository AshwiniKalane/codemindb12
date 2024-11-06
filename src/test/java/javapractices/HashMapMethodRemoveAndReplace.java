package javapractices;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMethodRemoveAndReplace {

	public static void main(String[] args) {
		HashMap<Integer,String> empDetails= new HashMap<Integer,String>();
		empDetails.put(1, "Ashwini");
		empDetails.put(2, "Bhushan");
		empDetails.put(null, "Bhushan");
		empDetails.put(3, null);
		empDetails.put(4, null);
		
		 System.out.println("*******Replace Method******");
		
		 empDetails.replace(1, "Ashu");
		 
		 Set<Entry<Integer,String>> a=empDetails.entrySet();
		 for(Entry<Integer, String> a1: a)
		 {
			 System.out.println(a1.getKey() + " : " + a1.getValue());
		 }
			
			 
			 System.out.println("******Remove Method******");
			 
			 empDetails.remove(3);
			 
			
			 Set<Entry<Integer,String>> a2=empDetails.entrySet();
			 for(Entry<Integer, String> a3: a)
			 {
				 System.out.println(a3.getKey() + " : " + a3.getValue());
			 }
			 
			

			 
	}

}
