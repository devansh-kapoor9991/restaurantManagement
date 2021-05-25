package com.restaurant.model;

public class Menu {
	
	


	private int dishcode;
	private String dishname;
	private int price;
	private String category;
	public Menu() {
		super();
	}
	public Menu(int dishcode, String dishname, int price, String category) {
		super();
		this.dishcode = dishcode;
		this.dishname = dishname;
		this.price = price;
		this.category = category;
	}

	public int getDish_code() {
		return dishcode;
	}
	public void setDish_code(int dish_code) {
		this.dishcode = dishcode;
	}
	public String getDish_name() {
		return dishname;
	}
	public void setDish_name(String dish_name) {
		this.dishname = dishname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	@Override
	public String toString() {
		return "Menu [dish_code=" + dishcode + ", dish_name=" + dishname + ", price=" + price + ", category="
				+ category + "]";
	}

}
