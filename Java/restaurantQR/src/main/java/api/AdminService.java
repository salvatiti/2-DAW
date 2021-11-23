package api;

import database.Dish;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import utils.Db;
import utils.Response;
import utils.ResponseCodes;

@Path("/addDish")
public class AdminService {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addDish( Dish dish) {
        Response r = new Response();
        try {
            Db myDb = new Db();

            myDb.connect();
            dish.insertDishes_DB(myDb);
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
