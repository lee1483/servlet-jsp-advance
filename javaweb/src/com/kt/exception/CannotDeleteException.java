package com.kt.exception;

public class CannotDeleteException extends Exception {

	private static final long serialVersionUID = 1L;

	public CannotDeleteException(String message) {
		super(message);
	}
}
