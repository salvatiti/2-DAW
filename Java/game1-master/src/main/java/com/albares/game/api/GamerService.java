
package com.albares.game.api;

import com.albares.game.utils.Parameters;
import com.albares.game.utils.JWTUtils;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/gamer")
public class GamerService {
    
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String createGamer(Gamer newGamer){
        if(newGamer.getScore()!=0 ){
            newGamer.setScore(-Math.abs(newGamer.getScore()));
            return "Hackeo detectado... tu token es: "+JWTUtils.generateToken(Parameters.match.addGamer(newGamer));
        }
        return JWTUtils.generateToken(Parameters.match.addGamer(newGamer));
    }    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List getGamers(){ 
        return new ArrayList<>(Parameters.match.getGamers().values());
    }    
}







