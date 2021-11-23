package api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import utils.Parameters;

@Path("/menu")
public class MenuService {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{newDish}")
    public static boolean addDishes(@PathParam("newDish") String newDish) {
        
        if (Parameters.dishes.contains(newDish)) {
            return false;
        } else {
            Parameters.dishes.add(newDish);

            return true;
        }

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public static ArrayList getDishes() {
        return Parameters.dishes;

    }

}
