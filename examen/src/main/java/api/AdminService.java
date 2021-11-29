/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api;

import db.Product;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.List;
import utils.Db;
import utils.Response;
import utils.ResponseCodes;

@Path("/admin")
public class AdminService {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addProduct(Product product) {
        Response r = new Response();
        try {
            Db myDb = new Db();

            myDb.connect();
            product.insert_db(myDb);
            myDb.disconnect();

            r.setResponseCode(ResponseCodes.OK);
            return r;
        } catch (Exception e) {

            r.setResponseCode(ResponseCodes.ERROR);
            return r;
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response selectProducts() {
        Response r = new Response();
        try {
            Db myDb = new Db();
            myDb.connect();
            List<Product> productsFromList = Product.selectProducts_db(myDb);
            myDb.disconnect();

            r.setProducts(productsFromList);
            r.setResponseCode(ResponseCodes.OK);
            return r;
        } catch (Exception e) {
            r.setResponseCode(ResponseCodes.ERROR);
            return r;
        }
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response editUser(Product product) throws SQLException, NoSuchAlgorithmException {
        Response r = new Response();
        try {
            Db myDb = new Db();
            myDb.connect();
            List<Product> productsFromList = Product.selectProducts_db(myDb);
            product.updateProducts(myDb);
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
