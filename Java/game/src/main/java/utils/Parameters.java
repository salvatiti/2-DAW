
package utils;

import api.Gamer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


public class Parameters {

    public Parameters() {
    }
    
     public static final String PROJECT_NAME = "Salva";
     public static final Map<Integer, Gamer> gamers = new HashMap();
     public static final AtomicInteger idGamers = new AtomicInteger(0);
     public static int turn =1;
     public static int getRandomNumber(){
         int randomlyNumber =  (int) (Math.random() * 4 + 1);
        return randomlyNumber;
    
}
}
