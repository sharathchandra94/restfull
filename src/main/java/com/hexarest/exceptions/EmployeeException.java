package com.hexarest.exceptions;

@SuppressWarnings("serial")
public class EmployeeException extends Exception {

	String msg ;
	
	public String getMsg() {
		return msg;
	}
	public EmployeeException(String msg) {
		super(msg);
		this.msg =msg;
	}
	EmployeeException(){
		super();
	}

}
