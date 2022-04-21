package org.met;

public class StaticAndNonStaticVariables {
	int d=70;
	static int a=15;
	public void A() {
		System.out.println("Hello");
		
		int k=21;
		System.out.println(k);
//		System.out.println(a);
//		B();
		System.out.println(d);
	}
	public static void B() {
		System.out.println("Goodmorning");
		System.out.println(a);
		StaticAndNonStaticVariables j=new StaticAndNonStaticVariables();
		j.A();
		
		
	}
	public static void main(String[] args) {
		B();
		
//		StaticAndNonStaticVariables z=new StaticAndNonStaticVariables();
//		z.A();
		
		
	}

}
