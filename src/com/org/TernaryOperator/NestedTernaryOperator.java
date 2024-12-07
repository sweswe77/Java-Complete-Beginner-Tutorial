package com.org.TernaryOperator;

import java.util.Scanner;

public class NestedTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your mark: ");
		int mark=sc.nextInt();
		// 35, 40, 50, 65, 89,90,75
		String result= (mark>50)? ((mark>65)? ((mark>80)? ("D"): ("C")): ("Pass")) : ("Faile");
		System.out.println("Result: "+ result);

	}

}
