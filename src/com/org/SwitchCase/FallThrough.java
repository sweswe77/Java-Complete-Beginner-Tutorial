package com.org.SwitchCase;

import java.util.Scanner;

public class FallThrough {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter : ");
		char letter = sc.nextLine().charAt(0);
		// letter = 'a'; 'j'
		switch (letter) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		}

	}


}
