package org.exp;



public class Class4  {
	public static void main(String[] args) {
	int i=142;int rev=0;int temp=i;
	while (i>0) {
		int n=i%10;
		rev=(rev*10)+n;
		i=i/10;
	}if (rev==temp) {
			System.out.println("palindrome");
			
		}else {
			System.out.println("not palindrome");
		}
		
//	}System.out.println(rev);
		
	}
	}

	
	
	
	
	

	
	
	

	

	
	



	

