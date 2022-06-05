package tp.ws.amoa.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder({"id","customer","orderDate"})
public class Order {
	
	private long id;
	private Customer customer;
	private String orderDate;
	public Order(long id, Customer customer,String orderDate) {
		super();
		this.id = id;
		this.customer = customer;
		this.orderDate = orderDate;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	
}
