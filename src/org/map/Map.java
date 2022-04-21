package org.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
//	java.util.Map<Integer, String> mp=new HashMap<>();
//	mp.put(10, "Chintu");
//	mp.put(20, "Gobari");
//	mp.put(30, "bobby");
//	mp.put(40, "banesh");
//	mp.put(50, "chanu");
//	mp.put(60, "hari");
//	Set<Entry<Integer, String>> entrySet = mp.entrySet();
////	System.out.println(entrySet);
//	for (Entry<Integer, String> entry : entrySet) {
////		String value = entry.getValue();
////		System.out.println(value);
//		System.out.println("*****");
//		Integer key = entry.getKey();
//		System.out.println(key);
//		
//		
//	}Collection<String> values = mp.values();
//	System.out.println(values);
		HashSet<Integer> s = new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(90);
		s.add(10);
		s.add(10);
		s.add(40);
		s.add(50);
		HashSet<Integer> s1 = new HashSet<>();
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		s1.add(80);
		
//		s1.retainAll(s);
//		System.out.println(s1);
//		System.out.println("*****");
		s1.removeAll(s);
		System.out.println(s1);

	}

}
