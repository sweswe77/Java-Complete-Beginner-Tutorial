package com.org.SwitchCase;

import java.util.Scanner;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter : ");
		char letter = sc.nextLine().charAt(0);
		// letter = 'a'; 'j'
		switch (letter) {
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		}

	}

}
