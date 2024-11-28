package com.org.TernaryOperator;

import java.util.Scanner;

public class NestedTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a subject'score: ");
		int score=sc.nextInt();
		
		String result="";
		result= (score>50)? (score>=65)? (score>=80)? "D" : "C" :"Pass" : "Fail";
		System.out.println(result);

	}

}
