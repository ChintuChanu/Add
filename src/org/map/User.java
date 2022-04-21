package org.map;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class User {

	public static void main(String[] args) {
		LinkedMap lm=new LinkedMap();
		lm.setName("Prashant");
		lm.setId(50);
		lm.setPhn(8297787623l);
		lm.setGender("M");
		LinkedMap lm1=new LinkedMap();
		lm1.setName("Mahesh");
		lm1.setId(60);
		lm1.setPhn(8179965421l);
		lm1.setGender("M");
		LinkedMap lm2=new LinkedMap();
		lm2.setName("Chanakya");
		lm2.setId(80);
		lm2.setPhn(95333500721l);
		lm2.setGender("M");
		Set<LinkedMap> s=new HashSet();
//		s.add(lm);
//		s.add(lm1);
//		s.add(lm2);
		for (LinkedMap linkedMap : s) {
			System.out.println(linkedMap.getName());
			System.out.println(linkedMap.getId());
			System.out.println(linkedMap.getPhn());
			System.out.println(linkedMap.getGender());
			
		}
			
		}

	}


