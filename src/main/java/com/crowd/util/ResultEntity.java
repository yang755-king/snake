package com.crowd.util;
//统一ajax请求的返回结果，也可用于分布式各个模块返回同一类型
public class ResultEntity<T> {
	
	public static final String success="SUCCESS";
	public static final String fail="FAIL";
	private String result;
	private String message;
	private T data;
	
	public static <E> ResultEntity<E> success() {
		return new ResultEntity<E>(success,null,null);
	}
	public static <E> ResultEntity<E> successWithData(E data) {
		return new ResultEntity<E>(success,null,data);
	}
	public static <E> ResultEntity<E> failed(String message) {
		return new ResultEntity<E>(fail,message,null);
	}
	public ResultEntity(String result, String message, T data) {
		super();
		this.result = result;
		this.message = message;
		this.data = data;
	}
	public ResultEntity() {
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResultEntity [result=" + result + ", message=" + message + ", data=" + data + "]";
	}
	
	
	
}
