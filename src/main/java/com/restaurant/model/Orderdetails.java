package com.restaurant.model;

import java.util.Arrays;

public class Orderdetails {
	
	private int dish_code []= new int[26];
	private int quantity []= new int[26];
	private String table_no;
	private int order_no;
	private double bill;
	
	public Orderdetails(int[] dish_code, int[] quantity, String table_no, int order_no, double bill) {
		super();
		this.dish_code = dish_code;
		this.quantity = quantity;
		this.table_no = table_no;
		this.order_no = order_no;
		this.bill = bill;
	}
	public Orderdetails() {
		super();
	}
	
	public int[] getDish_code() {
		return dish_code;
	}
	public void setDish_code(int[] dish_code) {
		this.dish_code = dish_code;
	}
	public int[] getQuantity() {
		return quantity;
	}
	public void setQuantity(int[] quantity) {
		this.quantity = quantity;
	}
	public String getTable_no() {
		return table_no;
	}
	public void setTable_no(String table_no) {
		this.table_no = table_no;
	}
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public double getBill() {
		return bill;
	}
	public void setBill(double bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "Orderdetails [dish_code=" + Arrays.toString(dish_code) + ", quantity=" + Arrays.toString(quantity)
				+ ", table_no=" + table_no + ", order_no=" + order_no + ", bill=" + bill + "]";
	}

}
