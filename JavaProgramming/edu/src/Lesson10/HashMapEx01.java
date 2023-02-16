package Lesson10;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "a");
		hm.put(2, "b");
		hm.put(10, "q");
		hm.put(3, "c");
		
		
		System.out.println(hm);
		Set<Integer> ks = hm.keySet();
		for(int k : ks) {
			System.out.println(k + "-" + hm.get(k));
		}

	}

}
