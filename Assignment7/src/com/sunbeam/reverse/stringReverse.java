package com.q1;

import java.util.Scanner;

public class stringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String- ");
		String string = sc.nextLine();
		
		for(int i = string.length()-1; i>=0; i--) {
			System.out.print(string.charAt(i));
		}
		
	}
}
