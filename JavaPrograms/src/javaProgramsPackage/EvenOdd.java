package javaProgramsPackage;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter any number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Number " + num + " is Even.");
		}
		else
		{
			System.out.println("Number " + num + " is Odd.");
		}

	}

}
