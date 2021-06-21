package com.restaurant.restaurantManagement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.restaurant.controller.CheckoutController;
import com.restaurant.controller.LoginController;
import com.restaurant.controller.OrderController;
import com.restaurant.controller.ReceptionController;
import com.restaurant.dao.Jdbcimpl;
import com.restaurant.dao.SendEmail;
import com.restaurant.model.Login;
import com.restaurant.model.Menu;
import com.restaurant.model.Orderdetails;
import com.restaurant.model.Orders;
import com.restaurant.model.Seating;
import org.springframework.context.ApplicationContext;

class CheckoutControllerTest {


	@Autowired
	static LoginController loginC;
	@Autowired
	static Login login;
	static ModelMap model; 
	static CheckoutController checkout;
	@Autowired
	static ReceptionController receptionController;
	static ModelAndView mv;
	@Autowired
	static Menu menu;
	@Autowired
	static Jdbcimpl jdbc = new Jdbcimpl() {
		@Override 
		public List<Seating> getAllSeating(){
			List<Seating> seating = new ArrayList();
			return seating;
		}
		
		@Override
		public void changeStatus(int tableno) {
		}
		@Override
		public String findBill(int tableno) {
			return "1";
		}
		@Override
		public void deleteRow(Integer id) {
			
		}
		@Override
		public void changeStatus1(int tableno) {
			
		}
		@Override
		public String checkStatus1(int tableno)
		{
			return "occupied";
		}
		@Override
		public Menu getCodeandPrice(String id) {
			return menu;
			
		}
		
		public int insertOrders(Orderdetails d) {
			return 1;
		}
		@Override
		public Orderdetails getOrderdetails(String id) {
			return null;
			
		}
		
	}; 
	static SendEmail sendemail = new SendEmail() {
		@Override
		public void sendEmail(String emailid,String tablebill) {
		
		}
	};
	@Autowired
	static Seating Seating;
	@Autowired
	static OrderController orderC;
	@Autowired
	static Model x;
	static Orders o;
	
	@BeforeAll
	public static void setup() {
		loginC = new LoginController();
		checkout = new CheckoutController();
		receptionController = new ReceptionController();
		Seating = new Seating();
		orderC = new OrderController();
		x=new Model() {
			
			@Override
			public Model mergeAttributes(Map<String, ?> attributes) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getAttribute(String attributeName) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean containsAttribute(String attributeName) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Map<String, Object> asMap() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Model addAttribute(String attributeName, Object attributeValue) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Model addAttribute(Object attributeValue) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Model addAllAttributes(Map<String, ?> attributes) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Model addAllAttributes(Collection<?> attributeValues) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		mv = new ModelAndView();
		checkout.jdbcsetter(jdbc);
		checkout.emailSetter(sendemail);
		o =new Orders();
		menu =new Menu();
	} 
	
	@Test
	public void testCheckout() {
		assertEquals("checkout",checkout.showCheckout(model));
		assertEquals("waiter1",checkout.showCheckoutPage1(model,"abc","1"));
		assertEquals("waiter2",checkout.showCheckoutPage1(model,"abc","6"));
		
	}
}
