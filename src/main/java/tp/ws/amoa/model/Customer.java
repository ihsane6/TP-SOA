package tp.ws.amoa.model;

import javax.json.bind.annotation.JsonbPropertyOrder;
@JsonbPropertyOrder({"id","firstName","lastName","address"})
public class Customer {
	private long id;
	private String firstName;
	private String lastName;
	private String address;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(long id, String firstName, String lastName, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
