package org.met;

import java.util.Scanner;

public class PrimeNumber {
	

	public static void main(String[] args) {
		int c=0;
		
	Scanner s= new Scanner(System.in);

	System.out.println("Enter number");
	int a = s.nextInt();

	for (int i = 1; i <= 7; i++) {
		
	if (a%a==0 && a%i!=0) {
			System.out.println("Prime");
		
			
		}
		
		else {
			System.out.println("Not Prime");
			
		}
	}

		
	}

	}


