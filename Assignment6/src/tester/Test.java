package tester;

import java.util.Scanner;

import com.sunbeam.exceptions.ExceptionLineTooLong;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		try {
			
			System.out.println("Enter the message");
			String message = sc.nextLine();
			ExceptionLineTooLong e = new ExceptionLineTooLong(message);
		} catch (ExceptionLineTooLong e2) {
			System.out.println("The string is too long");
		}
	}

}
