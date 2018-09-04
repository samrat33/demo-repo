package com.mphasis.demo.model;

public class DemoResponseModel {
	String Name;
	String Message;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public DemoResponseModel(String name, String message) {
		super();
		Name = name;
		Message = message;
	}
}
