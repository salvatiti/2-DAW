
package Utils;


import Api.Response;
import Api.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


public final class Parameters {

    public Parameters() {
    }
    
    public static final String PROJECT_NAME = "salva";
 
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/prueba_db";
    public static final String DB_USER = "prueba_user";
    //public static final String DB_PASS = Secrets.DB_PASS;
    
    public static final ArrayList<Response> responseCode = new ArrayList();
    public static final Map<Integer, User> users = new HashMap();
    public static final AtomicInteger idUsers = new AtomicInteger(0);
    
}
