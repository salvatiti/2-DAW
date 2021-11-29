package api;

import db.Product;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.sql.SQLException;
import java.util.List;
import utils.Db;
import utils.Response;
import utils.ResponseCodes;

@Path("/user")
public class UserService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{gender}")

    public Response selectProductsByGender(@PathParam("gender") Integer gender) {
        Response r = new Response();
        try {
            Db myDb = new Db();

            myDb.connect();
            List<Product> productsFromList = Product.selectProductsByGender_db(myDb, gender);
            myDb.disconnect();

            r.setProducts(productsFromList);
            r.setResponseCode(ResponseCodes.OK);
            return r;
        } catch (Exception e) {

            r.setResponseCode(ResponseCodes.ERROR);
            return r;
        }
    }
}
