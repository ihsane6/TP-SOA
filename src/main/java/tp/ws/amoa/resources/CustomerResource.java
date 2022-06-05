package tp.ws.amoa.resources;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import tp.ws.amoa.model.Customer;
import tp.ws.amoa.services.CustomersManager;

@Path("/customers")
public class CustomerResource {
	@POST
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces(MediaType.TEXT_PLAIN)
	public long addCustomer(Customer customer) {
		return CustomersManager.addCustomer(customer);
	}

	@GET
	@Path("/{customerId}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Customer getCustomerDetails(@PathParam("customerId") long id) {
		return CustomersManager.getCustomer(id);
	}

	@PUT
	@Path("/{customerId}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void updateCustomer(@PathParam("customerId") long id, Customer customer) {
		customer.setId(id);
		CustomersManager.updateCustomer(customer);
	}

	@DELETE
	@Path("/{customerId}")
	public void deleteCustomer(@PathParam("customerId") long id) {
		CustomersManager.deleteCustomer(id);
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Customer> getAllCustomers() {
		return CustomersManager.getAll();
	}
}