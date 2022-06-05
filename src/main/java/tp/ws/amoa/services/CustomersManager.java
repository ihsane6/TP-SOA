package tp.ws.amoa.services;

import java.util.ArrayList;
import java.util.List;

import tp.ws.amoa.model.Customer;

public class CustomersManager {
	private static List<Customer> customers = new ArrayList<>();

	public static long addCustomer(Customer customer) {
		long id = customers.size() + 1;
		customer.setId(id);
		customers.add(customer);
		return id;
	}

	public static Customer getCustomer(long id) {
		for (Customer Customer : customers) {
			if (Customer.getId() == id) {
				return Customer;
			}
		}
		return null;
	}

	public static void updateCustomer(Customer customer) {
		int index = customers.indexOf(getCustomer(customer.getId()));
		customers.remove(index);
		customers.add(index, customer);
	}

	public static void deleteCustomer(long id) {
		customers.remove(getCustomer(id));
	}

	public static List<Customer> getAll() {
		return customers;
	}
}
