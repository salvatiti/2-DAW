
package com.albares.utils;

import com.albares.trains.Train;
import com.auth0.jwt.algorithms.Algorithm;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


public final class Parameters {

    public Parameters() {
    }
    
    public static final String PROJECT_NAME = "Trains";
    public static final String PROMOTIONCODE = "VIVACIEZA";
    public static final Integer PRICE= 100;
    public static final Algorithm algorithm = Algorithm.HMAC256(Secrets.JWT_SECRET);
    public static final AtomicInteger idTrains = new AtomicInteger(0);

    public static final Map<Integer, Train> trains = new HashMap<Integer, Train>(){{
        put(Parameters.idTrains.incrementAndGet(),new Train("Cieza","Madrid", "8:00", PRICE, PROMOTIONCODE));
        put(Parameters.idTrains.incrementAndGet(),new Train("Cieza","Madrid", "10:00", PRICE, PROMOTIONCODE));
        put(Parameters.idTrains.incrementAndGet(),new Train("Cieza","Murcia", "12:00", PRICE, PROMOTIONCODE));
    }};
    

    
}
