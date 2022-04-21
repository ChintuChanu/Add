package org.com;

import java.io.IOException;


public class A {
	
	public static void main(String[] args) {
		
		String str="Ram@Kr1shna";
		String s="ramakrishna";
		String s1="Anoop";
		String s2="rush";
		int up=0,lo=0,num=0,spe=0;
		String rev="";
		int i = str.length();
		System.out.println(i);
		System.out.println("**********");
		for (int j = 0; j < str.length(); j++) {
			char c = str.charAt(j);
			if (Character.isUpperCase(c)) {
				up++;
				
			}else if(Character.isLowerCase(c)){
				lo++;
			}else if(Character.isDigit(c)) {
			    num++;
			}
			else {
				spe++;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}System.out.println(up);
		
		System.out.println(lo);
		System.out.println(num);
		System.out.println(spe);
		System.out.println("*********");
		
		for (int j = str.length()-1; j >=0; j--) {
			char c = str.charAt(j);
			rev=rev+c;
			
		
		}if (str.equals(rev)) {
			
		System.out.println("pALINDROME");
		}
		else {
			System.out.println("not palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("******");
//		String case1 = str.toLowerCase();
//		System.out.println(case1);
//		System.out.println("*****");
//		String case2 = str.toUpperCase();
//		System.out.println(case2);
//		boolean b = str.contains("j");
//		System.out.println(b);
//		boolean c = str.startsWith("R");
//		System.out.println(c);
//		boolean d = str.endsWith("a");
//		System.out.println(d);
//		System.out.println("*****");
//		int j = str.compareTo(s1);
//		System.out.println(j);
//		boolean e = str.equalsIgnoreCase(s);
//		System.out.println(e);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int a=12;
//		String str="Kumar";
//		
//		try {
//		System.out.println(a/0);
//		}
//		catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
//		finally {
//			System.out.println("continue");
//		}
//		System.out.println("vizag");
//		System.out.println("im good");
//		
//		try {
//		System.out.println(str.charAt(7));
//	}
//		catch (StringIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}
//		finally {
//			System.out.println("Updating");
//		}
//

	
	
	}
}
	


