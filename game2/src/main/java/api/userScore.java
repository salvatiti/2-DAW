package api;

import db.User;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.List;
import utils.Db;
import utils.JWTUtils;
import utils.Response;
import utils.ResponseCodes;

@Path("/editScore")
public class userScore {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response editScore(User user) throws SQLException, NoSuchAlgorithmException {
        Response r = new Response();
        Db myDb = new Db();
        
        myDb.connect();

        if (user.score_is_valid(myDb)) {
             user = user.selectUser_db(myDb);
             
            user.updateScore_db(myDb);
            myDb.disconnect();
            r.setResponseCode(ResponseCodes.SCORE_VALID);
            return r;
        } else {
            r.setResponseCode(ResponseCodes.ERROR);
            return r;
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response selectScores() {
        Response r = new Response();
        try {
            Db myDb = new Db();
            myDb.connect();
            List<User> usersResponse = User.selectScores_db(myDb);
            myDb.disconnect();

            r.setUsers(usersResponse);
            r.setResponseCode(ResponseCodes.USER_VALID);
            return r;
        } catch (Exception e) {
            r.setResponseCode(ResponseCodes.ERROR);
            return r;
        }
    }
}
