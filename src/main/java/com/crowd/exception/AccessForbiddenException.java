package com.crowd.exception;
//用户未登录就访问资源时的异常
public class AccessForbiddenException extends RuntimeException{

	private static final long serialVersionUID=1L;
	
	public AccessForbiddenException() {
		super();
	}

	public AccessForbiddenException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AccessForbiddenException(String message, Throwable cause) {
		super(message, cause);
	}

	public AccessForbiddenException(String message) {
		super(message);
	}

	public AccessForbiddenException(Throwable cause) {
		super(cause);
	}

}
