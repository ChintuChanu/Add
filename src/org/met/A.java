package org.met;

public class A {
	public static void main(String[] args) {
		String s="AneLo@Van123";
		int up=0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				up++;
			}
			
		}System.out.println(up);
		
		
		
		
		
		
		
		
		
		String s1="Nisha";
		String s2="Nisha";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("######");
		String s3=new String("Krishna");
		String s4=new String("Krishna");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		
		
		
		
		
		
		
		
		System.out.println("*********");
		String str="mohom";
			String rev="";
			
			int length = str.length();
			System.out.println(length);
			for (int i = length-1; i >=0; i--) {
				char charAt = str.charAt(i);
				rev=rev+charAt;
				
//				System.out.println(rev);
				
			}if (str.equals(rev)) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not palindrome");
			}
			System.out.println(rev);
//	}
//	static int a=20;
//	static void m2() {
//		System.out.println("Veteran");
		
	int num=153;
	int temp=num;
	int arm=0;
	while (num>0) {
		int n=num%10;
		arm=(n*n*n)+arm;
		num=num/10;}
		if (arm==temp) {
			System.out.println("armstrong");
			
		}else {
			System.out.println("Not Armstrong");
		}
		
		

			
		}
	
	}

	




