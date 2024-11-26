package com.org.ConditionalStatements;

import java.util.Scanner;

public class IF_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your mark:");
		int mark=sc.nextInt();
		//mark=40 (40>=50)=>false
		//mark=60 (60>=50) =>true
		//mark=90 (90>=50) =>true
		if (mark>=50) {
			System.out.println("Pass");
			if(mark>=75) {//(90>=75)=>true
				if(mark>=80) {// (90>=80)=> true
					System.out.println("D");
				}else {
					System.out.println("C");
				}
			}
		}else {
			System.out.println();
		}

	}

}
