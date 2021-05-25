package com.restaurant.model;

public class Seating {
	private int table_no;
	private int capacity;
	private String status;
	private int e_id;
	
	
	public Seating() {
		super();
	}
	public Seating(int table_no, int capacity, String status, int e_id) {
		super();
		this.table_no = table_no;
		this.capacity = capacity;
		this.status = status;
		this.e_id = e_id;
	}
	public int getTable_no() {
		return table_no;
	}
	public void setTable_no(int table_no) {
		this.table_no = table_no;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	
	@Override
	public String toString() {
		return "Seating [table_no=" + table_no + ", capacity=" + capacity + ", status=" + status + ", e_id=" + e_id
				+ "]";
	}
	
	

}
