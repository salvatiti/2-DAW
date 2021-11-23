
package Api;

import Utils.Parameters;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/addUser")
public class addUser {
       

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addUser(User user){   
        try{
        Parameters.users.put(Parameters.idUsers.incrementAndGet(),user);
        Response res = new Response();
        User usu = new User();
        usu.setToken(Utils.JWTUtils.generateToken(Parameters.idUsers.get()));
        res.setResponseCode(1);
        res.setNewUser(user);
        return res;
        }catch (Exception e){
                Response r = new Response();
                r.setResponseCode(0);
                return r;
    }    
    }
}

 
