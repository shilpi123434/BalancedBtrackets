package com.balancedbrackets.main;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner( System .in);
		Balancedbrackets bb = new Balancedbrackets();
		
		System.out.println("Enter the string of brackets:");
		
		String str= sc.nextLine();
		
		
		if(bb.areBracketsBalanced(str))
			System.out.println("The entered string has balanced brackets");
		else {
			System.out.println("The entered string do not contain balanced brackets");
			
			sc.close();
		}
			
	}
	
	

	

}
