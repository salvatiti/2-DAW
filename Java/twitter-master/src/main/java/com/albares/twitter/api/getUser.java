package com.albares.twitter.api;

import com.albares.twitter.db.User;
import com.albares.twitter.utils.Db;
import com.albares.twitter.utils.JWTUtils;
import com.albares.twitter.utils.Response;
import com.albares.twitter.utils.ResponseCodes;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/getUser")
public class getUser {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getUser(User user) {
        Response r = new Response();
        try {
            user.setId(JWTUtils.checkJWTandGetUserId(user.getToken()));
           
            User userResponse = new User();
            userResponse.setId(user.getId()); //Se le pasa el id que hemos seteado antes
            
            Db myDb = new Db();
            myDb.connect();
            userResponse.selectNamePass_DB(myDb);
            myDb.disconnect();//se desconecta cuando ya ha termiado la sentencia.

            r.setUser(userResponse);//iniciamos el usuario de la respuesta al userResponse.
            r.setResponseCode(ResponseCodes.OK);//si todo va bien se devuelve ok
            return r;
        } catch (Exception e) { 
            r.setResponseCode(ResponseCodes.ERROR);
            return r;
        }

    }

}
