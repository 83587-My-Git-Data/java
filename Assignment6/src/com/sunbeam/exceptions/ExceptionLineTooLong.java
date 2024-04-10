package com.sunbeam.exceptions;

public class ExceptionLineTooLong extends RuntimeException{
	private String message;
	
	public ExceptionLineTooLong() {
		message = "";
	}
	
	public ExceptionLineTooLong(String message){
		if(message.length() > 80) {
			throw new ExceptionLineTooLong();
		}
		else {
			System.out.println("The string is valid");
		}
		this.message = message;
	}
	
	
}
