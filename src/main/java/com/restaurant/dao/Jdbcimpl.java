package com.restaurant.dao;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.restaurant.model.Menu;
import com.restaurant.model.Orderdetails;
import com.restaurant.model.Seating;

@Service
public class Jdbcimpl {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	public int insertOrders(Orderdetails d) throws IOException, SQLException {
		String query = "insert into orderdetails(dishcode, quantity, table_no, bill) values(?,?,?,?)";
		Object[] args = new Object[] { storeInDB(d.getDish_code()), storeInDB(d.getQuantity()), d.getTable_no(), d.getBill() };

		int out = jdbcTemplate.update(query, args);

		return out;

	}
	
	public List<Seating> getAllSeating() {
		List<Seating> tList = new ArrayList<>();
		String query = "select * from seating WHERE status='A'";
		List<Map<String, Object>> seatingRows = jdbcTemplate.queryForList(query);

		for (Map<String, Object> seatingRow : seatingRows) {
			Seating seating = new Seating();
			seating.setTable_no(Integer.parseInt(String.valueOf(seatingRow.get("table_no"))));
			seating.setCapacity(Integer.parseInt(String.valueOf(seatingRow.get("capacity"))));
			seating.setStatus((String) seatingRow.get("status"));
			tList.add(seating);
		}
		return tList;
	}
	
	@SuppressWarnings("deprecation")
	public String findBill(int tableno) {

        String sql = "SELECT bill FROM orderdetails WHERE table_no = ?";

        return jdbcTemplate.queryForObject(sql, new Object[]{tableno}, String.class);
    }
	
	public void changeStatus(int tableno)
	{
		String sql="UPDATE seating SET status='NA' WHERE table_no=?";
		jdbcTemplate.update(sql,tableno);
	}

	public void changeStatus1(int tableno)
	{
		String sql="UPDATE seating SET status='A' WHERE table_no=?";
		jdbcTemplate.update(sql,tableno);
	}
	
	
	public void deleteRow(Integer id){
	      String SQL = "delete from orderdetails where table_no = ?";
	      jdbcTemplate.update(SQL, id);
	
	   }

	
	@SuppressWarnings("deprecation")
	public Menu getCodeandPrice(String id) {

        String sql = "SELECT * FROM menu WHERE Dishname = ?";

        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) ->
                new Menu(
                        rs.getInt("dishcode"),
                        rs.getString("dishname"),
                        rs.getInt("price"),
                        rs.getString("category")
                ));

    }
	@SuppressWarnings("deprecation")
	public Orderdetails getOrderdetails(String id) throws IOException {
		
		System.out.println("insideorderdetails"+id);
		String sql = "SELECT * FROM orderdetails WHERE table_no = ?";

		return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) ->
		{
			try {
				return new Orderdetails(
				readFromDB(rs.getBlob("dishcode")),
				readFromDB(rs.getBlob("quantity")),
				rs.getString("table_no"),
				rs.getInt("order_no"),
				rs.getDouble("bill")
				    );
			} catch (Exception e) {
				// TODO Auto-generated catch block
		
				e.printStackTrace();
			}
			return null;
		});
		

    }
	private int[] readFromDB(Blob b) throws IOException, SQLException {
		int[] dubs = new int[26];
		System.out.println("inside readdb");
	     // however we normally get this...
	    
	         
	        byte[] asBytes = b.getBytes(1,(int)b.length());
	        ByteArrayInputStream bin = new ByteArrayInputStream(asBytes);
	        DataInputStream din = new DataInputStream(bin);
	        for (int i = 0; i < dubs.length; i++) {
	        	
	            dubs[i] = din.readInt();   
	           // System.out.println(dubs[i]);
	    }
	                      
		 return dubs;
	}
	private static byte[] storeInDB(int[] arr) throws IOException, SQLException {

	    int[] dubs = new int[26];
	    dubs=arr;

	    ByteArrayOutputStream bout = new ByteArrayOutputStream();
	    DataOutputStream dout = new DataOutputStream(bout);
	    for (int d : dubs) {
	        dout.writeDouble(d);
	    }
	    dout.close();
	    byte[] asBytes = bout.toByteArray();
	    return asBytes;
}
}