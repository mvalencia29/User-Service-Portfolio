package com.portfolio.response.result;

public class Result {
	
	private int code = 0;
	
	private String message = null;
	
	public Result(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	} 

}
