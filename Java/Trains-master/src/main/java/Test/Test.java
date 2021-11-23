
package Test;

import com.albares.utils.Parameters;



public class Test {
    public static void main(String[] args) {
        
        Parameters.trains.entrySet().forEach(train -> {
            System.out.println(train.getKey() + "/" + train.getValue());
        });
        
        
    }
}