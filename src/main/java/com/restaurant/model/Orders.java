package com.restaurant.model;

import org.springframework.stereotype.Service;


@Service
public class Orders {
	
	String dishname;
	int quantity;
	String tableno;
	int id;
	String order_status;

	
	

	public Orders() {
		super();
	}

	
	public Orders(String dishname, int quantity, String tableno, int id, String order_status) {
		super();
		this.dishname = dishname;
		this.quantity = quantity;
		this.tableno = tableno;
		this.id = id;
		this.order_status = order_status;
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



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getOrder_status() {
		return order_status;
	}



	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}



	public void setTableno(String tableno) {
		this.tableno = tableno;
	}
    @Override public boolean equals(Object obj)
    {
  
        // checking if the two objects
        // pointing to same object
        if (this == obj)
            return true;
  
        // checking for two condition:
        // 1) object is pointing to null
        // 2) if the objects belong to
        // same class or not
        if (obj == null
            || this.getClass() != obj.getClass())
            return false;
  
        Orders ords = (Orders)obj; // type casting object to the
                           // intended class type
  
        // checking if the two two
        // objects share all the same values
        return this.dishname.equals(ords.dishname)
            && this.quantity == ords.quantity
            && this.tableno.equals(ords.tableno);
    }



	@Override
	public String toString() {
		return "Orders [dishname=" + dishname + ", quantity=" + quantity + ", tableno=" + tableno + ", id=" + id
				+ ", order_status=" + order_status + "]";
	}



	
	
}