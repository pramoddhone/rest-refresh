package com.trainingwebservice.resttraining.pojo;

public class HelloBean {

	private String name;
	private String message;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HelloBean() {
		super();
	}

	public HelloBean(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloBean [name=" + name + ", message=" + message + "]";
	}

}
