package javaProgramsPackage;

import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		System.out.println("Enter any character:");
		Scanner sc = new Scanner (System.in);
		char ch = sc.next().charAt(0);
		
		switch(Character.toLowerCase(ch))
		{
		case 'a':
			System.out.println("Entered character " + ch + " is Vowel." );
			break;
		case 'e':
			System.out.println("Entered character " + ch + " is Vowel." );
			break;
		case 'i':
			System.out.println("Entered character " + ch + " is Vowel." );
			break;
		case 'o':
			System.out.println("Entered character " + ch + " is Vowel." );
			break;
		case 'u':
			System.out.println("Entered character " + ch + " is Vowel." );
			break;
		default:
			System.out.println("Entered character " + ch + " is Consonent." );
			break;
		}

	}

}
