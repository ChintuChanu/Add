package org.met;

public class Exp extends Exp1 {
	public Exp() {
//		 this(10, "mcdol");
		super(70,"bala");
		System.out.println("Default cons");

	}

	public Exp(int num, String nume) {
		this("john", "Vizag", 8.28);
		System.out.println("Parametrized cons1");
		System.out.println(num);
		System.out.println(nume);

	}

	public Exp(String name, String city, double gpa) {
		System.out.println("Parametrized cons2");
		System.out.println(name);
		System.out.println(city);
		System.out.println(gpa);

	}

	public static void main(String[] args) {
		Exp e = new Exp();

//		Exp e1 = new Exp(100, "macdol");

//		Exp e2 = new Exp("vicky", "vizag", 8.28);
//		Exp1 ez=new Exp1();
//		Exp1 ez1=new Exp1(70,"bala");

	}

}
