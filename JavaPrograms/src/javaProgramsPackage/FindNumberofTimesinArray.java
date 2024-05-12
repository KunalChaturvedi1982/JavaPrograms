package javaProgramsPackage;

import java.util.Scanner;

public class FindNumberofTimesinArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		int i,count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements of array:");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Entered elements of array are:");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.println("\nEnter the element to search:");
		int n=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("Item found " + count + " times.");
		}
		else
		{
			System.out.println("Item not found......");
		}

	}

}
