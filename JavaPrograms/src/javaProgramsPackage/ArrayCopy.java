package javaProgramsPackage;

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		int a[] = new int[5];
		int i;
		int b[] = new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of array:");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Elements of array entered are:");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println("\nElements of array copied are:");
		for(i=0;i<a.length;i++)
		{
			b[i] = a[i];
			System.out.print(b[i] + " ");
		}

		

	}

}
