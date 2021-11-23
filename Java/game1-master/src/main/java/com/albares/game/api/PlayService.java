
package com.albares.game.api;

import com.albares.game.utils.JWTUtils;
import com.albares.game.utils.Parameters;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/play")
public class PlayService {
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{token}/{num}")
    public Gamer playMatch(@PathParam("token") String token,@PathParam("num") Integer num){
        Integer id = JWTUtils.checkJWTandGetUserId(token);
        
        //Si el token no es válido
        if(id == -1) return new Gamer();
        
        Gamer player = Parameters.match.getGamers().get(id);
        
        if(id.equals(Parameters.match.getTurn())){
            
            //Solo si acierta el número, se incrementa el score del player
            if(num.equals(Parameters.match.getRandomNumber())){
                player.increment();
            }
            
            //Acierte o no, se pasa de turno
            Parameters.match.nextTurn();
        }else{
            
            //Si no era su turno, se resta un punto
            player.decrement();
        }
        
        return player;
        
    }    
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getTurn(){ 
        return String.valueOf(Parameters.match.getTurn());
    }    
}







