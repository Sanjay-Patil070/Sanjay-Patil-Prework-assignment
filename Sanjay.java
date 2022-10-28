import java.util.Scanner;

public class Sanjay {
	Scanner sc=new Scanner(System.in);
	//program to print palindrome
	public void checkPalindrome() {
		System.out.println("enter number to check palindrome:");
		int int1 = sc.nextInt();
		int digit=0;
		int y=int1;
		while(int1>0) {
			digit=(digit*10)+int1%10;
			int1=int1/10;
		}
		if (digit==y) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
	
	//program to print pattern
	public void reversePattern() {
		System.out.println("enter number to print pattern:");
		int int1 = sc.nextInt();
		for (int i = 1; i <=int1; i++) {
			for (int j = i; j <=int1; j++) {
				System.out.print(" *");
			}
				System.out.println();
			}
		
		
	}
	//program to print prime
	public void primeNumber() {
	System.out.println("enter number to check prime or not:");	
	int int1 = sc.nextInt();
	int count=0;
	for (int i = 1; i <=int1; i++) {
		if (int1%i==0) {
			count++;
		}
		
	}
	if (count==2) {
		System.out.println("prime");
	} else {
		System.out.println("not a prime");
	}
	}
	
	//program to find fibonacci series
	public void fibonacci() {
		System.out.println("enter number to print fibonacci:");
		int i = sc.nextInt();
		int f=0;
		int s=1;
		System.out.println(f);
		System.out.println(s);
		for (int j = 1; j <i; j++) {
			int t=f+s;
			System.out.println(t);
			f=s;
			s=t;
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Sanjay s=new Sanjay();
		int key;
		Scanner sc= new Scanner(System.in);
do {
	System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

	+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

	+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

	System.out.println();
	 key = sc.nextInt();
switch (key) {
case 0:
	key=0;
	System.out.println();
	break ;
		
case 1:
	s.checkPalindrome();
	System.out.println();
	break;

case 2:{
	s.reversePattern();
	System.out.println();
	break;
}
case 3:{
	s.primeNumber();
	System.out.println();
	break;
	}

case 4:{
	s.fibonacci();
	System.out.println();
	break;
}
default:{
	System.out.println("invalid choice");
	System.out.println();
	break;
}
}
	
		} while (key!=0);
System.out.println("exited successfully");
sc.close();
				
	}

	

}
