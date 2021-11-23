
package api;

import com.albares.trains.Train;
import com.albares.utils.Parameters;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/user")
public class UserService {
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ArrayList getTrains(Train filterTrain){
        ArrayList<Train> filteredTrains = new ArrayList<Train>(); 
        for (var trainEntry : Parameters.trains.entrySet()) {
            Train actualTrain = trainEntry.getValue();
            if(filterTrain.getOrigin().equals(actualTrain.getOrigin()) && 
               filterTrain.getDestination().equals(actualTrain.getDestination()))
            {
                Train t = new Train(actualTrain.getOrigin(),actualTrain.getDestination());
                t.setHour(actualTrain.getHour());
                if (filterTrain.getPromotion() != null && 
                        filterTrain.getPromotion().equals(actualTrain.getPromotion())
                     ) {
                    t.setPrice(actualTrain.getPrice() / 2);
                } else {
                    t.setPrice(actualTrain.getPrice());
                }

                filteredTrains.add(t);
            }
        }
        return filteredTrains;
    }
        
}    

  







