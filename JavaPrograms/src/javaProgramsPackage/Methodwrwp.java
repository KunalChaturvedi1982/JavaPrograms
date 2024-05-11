package javaProgramsPackage;

import java.util.Scanner;

public class Methodwrwp {

	public void sum()
	{
		int a,b,sum=0;
		System.out.println("Enter first number:");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter second number:");
		b=sc.nextInt();
		sum=a+b;
		System.out.println("Sum of two numbers " + a +" and "+ b + " is: " + sum);
	}
	public static void main(String[] args) {
		Methodwrwp obj = new Methodwrwp();
		obj.sum();

	}

}
