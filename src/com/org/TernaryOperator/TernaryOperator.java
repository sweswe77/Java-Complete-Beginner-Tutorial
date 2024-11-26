package com.org.TernaryOperator;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		String result= (num%2==0)? "Even" : "Odd";
		System.out.println("The result is "+ result);

	}

}
