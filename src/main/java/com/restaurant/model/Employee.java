package com.restaurant.model;

public class Employee {
	
	private int  e_id;
	private  String e_role;
	private String e_name;
	
public Employee() {
		super();
	}
public Employee(int e_id, String e_role, String e_name) {
		super();
		this.e_id = e_id;
		this.e_role = e_role;
		this.e_name = e_name;
	}

	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_role() {
		return e_role;
	}
	public void setE_role(String e_role) {
		this.e_role = e_role;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_role=" + e_role + ", e_name=" + e_name + "]";
	}
}
