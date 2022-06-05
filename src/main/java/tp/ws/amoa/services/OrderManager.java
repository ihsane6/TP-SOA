package tp.ws.amoa.services;

import java.util.ArrayList;
import java.util.List;

import tp.ws.amoa.model.Order;

public class OrderManager {
	private static List<Order> orders = new ArrayList<>();

	public static long addOrder(Order order) {
		long id = orders.size() + 1;
		order.setId(id);
		orders.add(order);
		return id;
	}

	public static Order getOrder(long id) {
		for (Order order : orders) {
			if (order.getId() == id) {
				return order;
			}
		}
		return null;
	}

	public static void updateOrder(Order order) {
		int index = orders.indexOf(getOrder(order.getId()));
		orders.remove(index);
		orders.add(index, order);
	}

	public static void deleteOrder(long id) {
		orders.remove(getOrder(id));
	}

	public static List<Order> getAll() {
		return orders;
	}
}
