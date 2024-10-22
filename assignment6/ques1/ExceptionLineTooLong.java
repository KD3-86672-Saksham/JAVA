package com.sunbeam.string;

public class ExceptionLineTooLong extends Exception {
	public ExceptionLineTooLong() {
		
	}
	
	public ExceptionLineTooLong(String message) throws ExceptionLineTooLong {
		super(message);
	}

}
