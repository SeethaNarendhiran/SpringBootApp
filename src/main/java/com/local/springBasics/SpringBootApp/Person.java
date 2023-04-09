package com.local.springBasics.SpringBootApp;

public class Person {
	private int id;
	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", dob=" + dob + ", location=" + location + "]";
	}
	private String name;
	private String dob;
	private String location;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
