package com.office.model;

public class Country {
	
	public Country(String country) {
		super();
		this.country = country;
	}

	private String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Country [country=" + country + "]";
	}
	
	
}
