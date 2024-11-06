package javapractices;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapImpl {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> empdatils = new LinkedHashMap<Integer, String>();
		empdatils.put(23, "Monika");
		empdatils.put(54, "Sanika");
		empdatils.put(55, "Sonal");
		empdatils.put(21, "Sirish");

		Set<Entry<Integer, String>> s = empdatils.entrySet();
		for (Entry<Integer, String> e : s) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}

}
