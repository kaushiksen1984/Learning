package com.office.model;

public class Data {
	private String name;
	private String code;
	private String dial_code;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDial_code() {
		return dial_code;
	}
	public void setDial_code(String dial_code) {
		this.dial_code = dial_code;
	}
	@Override
	public String toString() {
		return "Data [name=" + name + ", code=" + code + ", dial_code=" + dial_code + "]";
	}
}
