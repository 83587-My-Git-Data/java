package com.q2;

import java.util.*;

public class StringWordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String- ");
		String string = sc.nextLine();
		int count=0;
	
//		String trimmed = string.trim();
//		String arr[] = trimmed.split(" ");
//		for(int i = 0; i<arr.length; i++) {
//			if(arr[i].length()>0) {
//				count++;
//			}
//			
//		}
//		System.out.println(count);	
		
		StringTokenizer s = new StringTokenizer(string,"., ");
		while(s.hasMoreTokens()) {
			count++;
			s.nextToken();
		}
		System.out.println(count);
	}

}
