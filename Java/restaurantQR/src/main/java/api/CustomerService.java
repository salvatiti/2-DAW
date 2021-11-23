
package api;

import database.Dish;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import utils.Db;
import utils.Response;
import utils.ResponseCodes;

@Path("/customer")
public class CustomerService {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{type}")
    public Response getUser(@PathParam("type") int type) {
        Response r = new Response();
        Dish dish = new Dish();
      
        try {   
            dish.setType(type);
            Db myDb = new Db();
            myDb.connect();
            dish.selectDishes_DB(myDb);
            myDb.disconnect();       
            r.setDish(dish);
            r.setResponseCode(ResponseCodes.OK);
            return r;
        } catch (Exception e) { 
            r.setResponseCode(ResponseCodes.ERROR);
            return r;
        }

    }
}
