package com.org.UsingScanner;

import java.util.Scanner;

public class String_From_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name.");
		String s_sc=sc.nextLine();
		System.out.println("Welcome "+ s_sc+" to this app.");		
		
		boolean b_sc=true;
		while(b_sc) {
			
			System.out.println("Enter a character.");
			char c_sc=sc.next().charAt(0);
			switch(c_sc) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': System.out.println("Vowel");break;
			default : System.out.println("Consonant");	
			}
			
			System.out.println("If you want to continue, please enter true. Otherwse false.");
			sc.reset();
			b_sc=sc.nextBoolean();
		}
						
		
	}

}
