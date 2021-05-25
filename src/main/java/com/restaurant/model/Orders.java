package com.restaurant.model;

import org.springframework.stereotype.Service;


@Service
public class Orders {
	
	String dishname;
	int quantity;
	String tableno;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Orders(String dishname, int quantity, String tableno) {
		super();
		this.dishname = dishname;
		this.quantity = quantity;
		this.tableno = tableno;
	}

	public String getDishname() {
		return dishname;
	}
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getTableno() {
		return tableno;
	}



	public void setTableno(String tableno) {
		this.tableno = tableno;
	}



	@Override
	public String toString() {
		return "Orders [dishname=" + dishname + ", quantity=" + quantity + ", tableno=" + tableno + "]";
	}



	
	
}