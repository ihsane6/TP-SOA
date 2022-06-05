package tp.ws.amoa.resources;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import tp.ws.amoa.model.Order;
import tp.ws.amoa.services.OrderManager;

@Path("/orders")
public class OrderRessource {
	OrderManager orderManager = new OrderManager();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Order> getOrders() {
		return orderManager.getAll();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public long submitOrder(Order order) {
		return orderManager.addOrder(order);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void updateOrder(Order order) {
		orderManager.updateOrder(order);
	}
	
	@GET
	@Path("/{orderId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Order getOrder(@PathParam("orderId") long id) {
		return orderManager.getOrder(id);
	}
}
