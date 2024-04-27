package javaProgramsPackage;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		System.out.println("Enter any number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int res=num*i;
			System.out.println(num + " * " + i + " = " + res);
		}
		;

	}

}
