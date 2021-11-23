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
import java.sql.PreparedStatement;

@Path("/editUser")
public class editUser {
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response editUser(User user){  
        try{
            user.setId(JWTUtils.checkJWTandGetUserId(user.getToken()));
            
            //Parameters.users.get(user.getId()).setName(user.getName());
            
            Db myDb = new Db();
            myDb.connect();
            
            user.updateName_DB(myDb);
            
            myDb.disconnect();
            
            
            Response r = new Response();
            r.setResponseCode(ResponseCodes.OK );
            return r;
        }catch(Exception e){
            Response r = new Response();
            r.setResponseCode(0);
            return r;
        }
        
    }    
    
    
}



