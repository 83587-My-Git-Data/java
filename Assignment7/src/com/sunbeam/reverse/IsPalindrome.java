package com.q2;

import java.util.Scanner;

public class IsPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String- ");
		String string = sc.nextLine();
		
		StringBuilder s = new StringBuilder();
		
		for(int i = string.length()-1; i>=0; i--) {
			s.append(string.charAt(i));
		}
		
		String str = s.toString();
		if(str.equals(string)) {
			System.out.println("The Entered String is Palindrome!");
		}else {
			System.out.println("The Entered String is Not Palindrome!");
		}
		
		
	}
	
	

}
