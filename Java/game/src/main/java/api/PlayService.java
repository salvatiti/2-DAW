package api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import utils.JWTUtils;
import utils.Parameters;

@Path("/play")
public class PlayService {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{token}/{number}")
    public String gamePlay(@PathParam("token") String token, @PathParam("number") int number) {
        int randomNumber = (int) (Math.random() * 3) + 1;
        int player = JWTUtils.checkJWTandGetUserId(token);
        if (player == (Parameters.turn)) {
            if (randomNumber == number) {
                Parameters.gamers.get(player).scorePlus();
                Parameters.turn++;
                return "Congratulations " + Parameters.gamers.get(player).getName() + " you´ve match the number. Go ahead with the next turn"
                        + " . Your score is : " + Parameters.gamers.get(player).getScore();

            } else {
                Parameters.turn++;
                return "Sorry, you haven´t matched the number " + Parameters.gamers.get(player).getName() + 
                        ", try next turn";
            }

        } else {
            Parameters.gamers.get(player).scoreLess();
            return "What are u doing? It´s not ur turn, " + Parameters.gamers.get(player).getName() + 
                    ", for trying to be clever, u´ve 1 point less";
        }
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getPlayer() {
        
        int theGamers = Parameters.gamers.size();
        if (Parameters.turn > theGamers) {
            Parameters.turn = 1;
        }
        return "Le toca al jugador con ID " + Parameters.turn;

    }
}
