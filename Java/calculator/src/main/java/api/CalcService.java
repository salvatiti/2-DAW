package api;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import static java.lang.Double.NaN;
import java.text.DecimalFormat;

@Path("/operation")
public class CalcService {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public static String calcu(Calculator newOperation) {
       double result = 0;
       DecimalFormat df = new DecimalFormat("#.00");
       
       switch ( newOperation.getOperation() ) {
      case "+":
          
          result=newOperation.getNumOne()+ newOperation.getNumTwo();
           break;
      case "-":
          result=newOperation.getNumOne() - newOperation.getNumTwo();
          break;
      case "*":
          result=newOperation.getNumOne() * newOperation.getNumTwo();
          break;
      case "/":
          if(newOperation.getNumTwo()!= 0)
          result=newOperation.getNumOne() / newOperation.getNumTwo();
          else
              result = NaN;
          break;
          
          default: return ("No me seas espabilado");

      }
 
        return df.format(result);
    }
}
        
       /*if ("+".equals(newOperation.getOperation()))
            result=newOperation.getNumOne()+newOperation.getNumTwo();
        
        if ("-".equals(newOperation.getOperation()))
            result=newOperation.getNumOne()-newOperation.getNumTwo();
        
        if ("*".equals(newOperation.getOperation()))
            result=newOperation.getNumOne()*newOperation.getNumTwo();
        
        if ("/".equals(newOperation.getOperation()))
            result=newOperation.getNumOne()/newOperation.getNumTwo();
        
        return result;
    }*/
    
        
        /*double result = 0;
        if ("+".equals(operation)) 
            result = numOne+numTwo;
        
         if ("-".equals(operation))
            result = numOne-numTwo;
        
         if ("*".equals(operation))
            result = numOne*numTwo;
        
         if ("/".equals(operation))
            result = numOne/numTwo;
        
        return result;
        
    }*/
    
