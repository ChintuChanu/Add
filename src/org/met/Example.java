package org.met;

import java.awt.List;
import java.util.LinkedList;

public class Example {

	public static void main(String[] args) {
//		for (int i = 10; i >= 0; i--) {
//		if (i==3 || i==7) {
//			continue;
//			
//			
//		}System.out.println(i);
		java.util.List<Integer> li=new LinkedList<>();
		li.add(10);
		li.add(9);
		li.add(8);
		li.add(7);
		li.add(6);
		li.add(5);
		li.add(4);
		li.add(3);
		li.add(2);
		li.add(1);
		li.add(0);
//		System.out.print(li);
		for (int i = 10; i >=0; i--) {
			if (i==3|| i==7) {
				continue;
				
			}
			System.out.println(i);
//			li.remove(3);
//			li.remove(7);
//			System.out.println(li);
			
		}
		
		
			
		}

	}


