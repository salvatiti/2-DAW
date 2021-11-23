
package api;

import com.albares.trains.Train;
import com.albares.utils.JWTUtils;
import com.albares.utils.Parameters;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/admin")
public class AdminService {
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{token}")
    public Map createTrain(@PathParam("token") String token,Train newTrain){
        if(JWTUtils.checkJWTandGetUserId(token)){
            Parameters.trains.put(Parameters.idTrains.incrementAndGet(),newTrain);
            return Parameters.trains;
        }else{
            return new HashMap();
        }  
    }    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{token}")
    public Map getTrains(@PathParam("token") String token){
        if(JWTUtils.checkJWTandGetUserId(token)){
            return Parameters.trains;
        }else{
            return new HashMap();
        }  
    }    

    /*@PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{token}/{idTrain}")
    public Map editUser(@PathParam("token") String token,
            @PathParam("idTrain") Integer idTrain,
            Train trainToEdit){ 
        if(JWTUtils.checkJWTandGetUserId(token)){
            Parameters.trains.remove(idTrain);
            Parameters.trains.put(idTrain,trainToEdit);
            return Parameters.trains;
        }else{
            return new HashMap();
        }  
      
    }  */
    
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{token}/{idTrain}")
    public Map editTrain(@PathParam("token") String token,
            @PathParam("idTrain") Integer idTrain,
            Train newTrain){ 
        if(JWTUtils.checkJWTandGetUserId(token)){
            Train trainToEdit = Parameters.trains.get(idTrain);
            if(newTrain.getOrigin()!=null) trainToEdit.setOrigin(newTrain.getOrigin());
            if(newTrain.getDestination()!=null) trainToEdit.setDestination(newTrain.getDestination());
            if(newTrain.getPrice()!=null) trainToEdit.setPrice(newTrain.getPrice());
            if(newTrain.getPromotion()!=null) trainToEdit.setPromotion(newTrain.getPromotion());
            if(newTrain.getHour()!=null) trainToEdit.setHour(newTrain.getHour());
                        
            return Parameters.trains;
        }else{
            return new HashMap();
        }  
      
    }
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{token}/{idTrain}")
    public Map deleteTrain(@PathParam("token") String token,
            @PathParam("idTrain") Integer idTrain){
        if(JWTUtils.checkJWTandGetUserId(token)){
            Parameters.trains.remove(idTrain);
            return Parameters.trains;
        }else{
            return new HashMap();
        }  
    } 
    
}







