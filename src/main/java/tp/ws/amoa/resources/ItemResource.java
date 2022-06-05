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
import tp.ws.amoa.model.Item;
import tp.ws.amoa.services.ItemsManager;

@Path("/items")
public class ItemResource {
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.TEXT_PLAIN)
	public long addItem(Item item) {
		return ItemsManager.addItem(item);
	}

	@GET
	@Path("/{itemId}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Item getItemDetails(@PathParam("itemId") long id) {
		return ItemsManager.getItem(id);
	}

	@PUT
	@Path("/{itemId}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void updateItem(@PathParam("itemId") long id, Item item) {
		item.setId(id);
		ItemsManager.updateItem(item);
	}

	@DELETE
	@Path("/{itemId}")
	public void deleteItem(@PathParam("itemId") long id) {
		ItemsManager.deleteItem(id);
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Item> getAllItems() {
		return ItemsManager.getAll();
	}
}