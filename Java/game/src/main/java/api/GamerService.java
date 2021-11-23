
package api;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.Map;
import utils.JWTUtils;
import utils.Parameters;

@Path("/gamer")
public class GamerService {
    
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String createGamer(Gamer newGamer){   
        Parameters.gamers.put(Parameters.idGamers.incrementAndGet(),newGamer);
        return JWTUtils.generateToken(Parameters.idGamers.get());   
    } 
    
     @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map getGamers(){ 
        return Parameters.gamers;
    }  
}
