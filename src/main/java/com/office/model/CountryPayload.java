package com.office.model;

public class CountryPayload {
	
	private boolean error;
	private String msg;
	private Data data;
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "CountryPayload [error=" + error + ", msg=" + msg + ", data=" + data + "]";
	}

}
