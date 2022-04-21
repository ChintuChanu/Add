package org.exp;

public class Class1 extends Class2  {
	
	public  Class1() {
		super(500);
		
		System.out.println("Employee name is Prashant");
		
	}
	public Class1(String city) {
		this(53007);
		System.out.println(city);
	}
	
	public Class1(int pin) {
		
		System.out.println(pin);
		
	}
	public static void main(String[] args) {
		Class1 c1=new Class1();
		Class2 c2=new Class2();
	}
	
	
}
