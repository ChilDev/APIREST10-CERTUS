package pe.certus.clases;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.ArrayList;

@Path("/items")
public class listado {
    List<items> listaitems = new ArrayList<>();
    //Inserción de datos
    public listado() {
    	listaitems.add(new items(1,"Papel",30));
        listaitems.add(new items(2, "Jabón", 18));
        listaitems.add(new items(3, "Cepillos", 25));
    }
    //Mostrar Listado
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<items> getItems() {
        return listaitems;
    }
    //Obtener un item x id
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public items getItemById(@PathParam("id") Integer id) {
        for (items item : listaitems) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
}

