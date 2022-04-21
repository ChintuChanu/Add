package org.use;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class UserDefinedList {

	public static void main(String[] args) {
		UserDefined ud=new UserDefined();
		ud.setId(70);
		ud.setName("Bala");
		UserDefined ud1=new UserDefined();
		ud1.setId(65);
		ud1.setName("gobari");
		UserDefined ud2=new UserDefined();
		ud2.setId(66);
		ud2.setName("chanu");
		LinkedHashSet<UserDefined> hs = new LinkedHashSet<>();
		hs.add(ud);
		hs.add(ud1);
		hs.add(ud2);
		for (UserDefined us : hs) {
			int id = us.getId();
			System.out.println(id);
			String name = us.getName();
			System.out.println(name);
			
		}
		
		
		
		
		
		
		
		
		
		
		//1.List
//		ArrayList<UserDefined> al = new ArrayList<>();
//		al.add(ud);
//		al.add(ud1);
//		al.add(ud2);
//		for (int i = 0; i < al.size(); i++) {
//			int id = al.get(i).getId();
//			System.out.println(id);
//			String name = al.get(i).getName();
//			System.out.println(name);
//			
//		}
//		

	}

}
