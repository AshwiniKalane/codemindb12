package javapractices;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapMethodClear {

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

		System.out.println("**** Clear Method HashMap***");
		AdharDetails.clear();
		Set<Entry<Integer, String>> set1 = AdharDetails.entrySet();
		for (Entry<Integer, String> e1 : set1) {
			System.out.println("HashMap is cleared:"+ e1.getKey() + ":" + e1.getValue());

		}

		System.out.println("HashMap is cleared:");
	}

}
