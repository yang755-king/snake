package com.crowd.exception;

public class UserAlreadInException extends RuntimeException{
	private static final long serialVersionUID=1L;
	public UserAlreadInException() {
		super();
	}

	public UserAlreadInException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UserAlreadInException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserAlreadInException(String message) {
		super(message);
	}

	public UserAlreadInException(Throwable cause) {
		super(cause);
	}

}
