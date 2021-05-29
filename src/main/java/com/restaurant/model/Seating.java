package com.restaurant.model;

public class Seating {
	private int table_no;
	private int capacity;
	private String status;

	
	
	public Seating() {
		super();
	}
	public Seating(int table_no, int capacity, String status) {
		super();
		this.table_no = table_no;
		this.capacity = capacity;
		this.status = status;
		
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
	@Override
	public String toString() {
		return "Seating [table_no=" + table_no + ", capacity=" + capacity + ", status=" + status + "]";
	}

	
	
	

}
