package com.crowd.exception;

public class EditUserAlreadInException extends RuntimeException{
	private static final long serialVersionUID=1L;
	public EditUserAlreadInException() {
		super();
	}

	public EditUserAlreadInException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EditUserAlreadInException(String message, Throwable cause) {
		super(message, cause);
	}

	public EditUserAlreadInException(String message) {
		super(message);
	}

	public EditUserAlreadInException(Throwable cause) {
		super(cause);
	}

}
