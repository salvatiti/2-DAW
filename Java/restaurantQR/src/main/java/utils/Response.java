
package utils;


import com.fasterxml.jackson.annotation.JsonInclude;
import database.Dish;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    
    private Integer responseCode;
    private Dish dish;

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }
    
}
