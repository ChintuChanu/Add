import java.util.Scanner;

public class Sub {

	public static void main(String[] args) {
		// int a,b,c;
		// System.out.println("dispaly sub:");
		// Scanner k = new Scanner(System.in);
		// a=k.nextInt();
		// b=k.nextInt();
		// c=a+b;
		// System.out.println("addition:"+c);

		// String Reversal
		String name = "B@driNadh";
		int up = 0, lo = 0, sp = 0;
		String rev = "";
		int c = name.length();
		for (int i = c - 1; i >= 0; i--) {
			char at = name.charAt(i);
			rev = rev + at;
		}
		if (name.equals(rev)) {
			System.out.println("Palindrome");

		} else {
			System.out.println("Not Palindrome");
			System.out.println("*****");
		}
		System.out.println(rev);
		for (int i = 0; i < name.length(); i++) {
			char d = name.charAt(i);
			if (Character.isUpperCase(d)) {
				up++;

			} else if (Character.isLowerCase(d)) {
				lo++;

			} else {
				sp++;
			}

		}
		System.out.println(up);
		System.out.println(lo);
		System.out.println(sp);
		System.out.println("*******");
		System.out.println("######");
		int a = 24;
		int b = 34;
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
		// int ck=a;
		// a=b;
		// b=ck;
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);
		System.out.println("*******");

		int fact = 1;
		for (int i = 1; i <= 5; i++) {
			fact = fact * i;

		}
		System.out.println(fact);
		System.out.println("******&&&&");

		int num = 141;
		int temp=num;
		int reve = 0;
		while (num > 0) {

			int n = num % 10;
			
			reve = (reve * 10) + n;
			num = num / 10;
		}System.out.println(reve);
		System.out.println("******");
		if (reve==temp) {
				System.out.println("Palindrome");
				
			}else {
				System.out.println("Not palindrome");
			}System.out.println("*********");
			int y=0;
			int z= 1;
			for (int i = 0; i <= 100; i++) {
				int x= y+z;
			if (x<10) {
					System.out.println(x);
			
				
				y=z;
				z=x;
				
			}
			}
		
		
		

		}
		

	}


