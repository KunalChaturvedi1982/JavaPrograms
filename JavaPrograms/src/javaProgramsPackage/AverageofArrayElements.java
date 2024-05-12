package javaProgramsPackage;

import java.util.Scanner;

public class AverageofArrayElements {

	public static void main(String[] args) {
		int a[] = new int[5];
		int i;
		double sum=0.0;
		System.out.println("Enter the elements of array:");
		Scanner sc= new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Entered elements in array are:");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.println("\nAverage of array elements is:");
		for(i=0;i<a.length;i++)
		{
			sum=a[i]+sum;
		}
		
		double avg = sum/a.length;
		System.out.println(avg);
		
	}

}
