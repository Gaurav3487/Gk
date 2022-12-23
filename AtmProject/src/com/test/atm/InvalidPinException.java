package com.test.atm;

public class InvalidPinException extends RuntimeException {
	
	public InvalidPinException(String msg) {
		
		super(msg);
	}

}
