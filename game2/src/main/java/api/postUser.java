
package api;

import db.User;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.HashSet;
import java.util.List;
import utils.Db;
import utils.JWTUtils;
import utils.Response;
import utils.ResponseCodes;

@Path("/postUser")
public class postUser {
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postUser(User user){
        Response r = new Response();
        
        try{
            Db myDb = new Db();
            myDb.connect();
            if(user.user_exists_db(myDb)){ //si el usuario existe
                //
                if(user.pass_is_valid(myDb)){ // y si la pass es la correcta
                    user.selectUser_db(myDb);//se coge al usuario y se le asigna un nuevo token
                    user.setToken(JWTUtils.generateToken(user.getId()));

                    r.setUser(user);
                    r.setResponseCode(ResponseCodes.USER_VALID);
                    return r;   
                }else{ // caso 2
                    r.setResponseCode(ResponseCodes.WRONG_PASS); //si la pass no es la correcta
                    return r;   
                }
            }else{ // caso 1
                user.setToken(JWTUtils.generateToken(user.insert_db(myDb))); //se agrega un usuario
                myDb.disconnect();
                r.setUser(user);
                r.setResponseCode(ResponseCodes.NEW_USER);
                return r;   
            }
           
        }catch(Exception e){
            r.setResponseCode(ResponseCodes.ERROR);
            return r;   
        }
    }    
}
