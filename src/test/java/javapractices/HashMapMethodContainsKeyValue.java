package javapractices;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapMethodContainsKeyValue {

	public static void main(String[] args) {
		HashMap<Integer, String> AdharDetails = new HashMap<Integer, String>();
		AdharDetails.put(465234563, "Ashwini");
		AdharDetails.put(98567857, "Bhushan");
		AdharDetails.put(94574678, "Bhushan");
		AdharDetails.put(308787878, null);
		AdharDetails.put(4, "Ayush");

		Set<Entry<Integer, String>> set = AdharDetails.entrySet();
		for (Entry<Integer, String> e : set) {
			System.out.println(e.getKey() + ":" + e.getValue());

		}

		System.out.println("**** Contains Key and Values Method HashMap***");
		System.out.println("Contains Key:" + AdharDetails.containsKey(465234563));
		System.out.println("Contains Values:" + AdharDetails.containsValue("Ayush"));
		
		System.out.println("Contains Values:" + AdharDetails.containsValue(null));
		
		
		System.out.println("Contains Key:" + AdharDetails.containsKey(46));
		System.out.println("Contains Values:" + AdharDetails.containsValue("Ayushri"));
	}

}
