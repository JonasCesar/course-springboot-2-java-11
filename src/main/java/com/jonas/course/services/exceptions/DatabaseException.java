package com.jonas.course.services.exceptions;

public class DatabaseException extends RuntimeException{

	private static final long serialVersionUID = 7966449192032553603L;
	
	public DatabaseException(String msg) {
		super(msg);
	}

}
