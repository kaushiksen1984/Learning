package com.office.model;

import java.util.List;

public class Person {
	
	private String name;
	private int age;
	private int salary;
	private List<Integer> phoneNos;
	private String country;
	
	public Person(String name, int age, int salary, List<Integer> phoneNos, String country) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.phoneNos = phoneNos;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<Integer> getPhoneNos() {
		return phoneNos;
	}

	public void setPhoneNos(List<Integer> phoneNos) {
		this.phoneNos = phoneNos;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + ", phoneNos=" + phoneNos + ", country="
				+ country + "]";
	}
	
}

