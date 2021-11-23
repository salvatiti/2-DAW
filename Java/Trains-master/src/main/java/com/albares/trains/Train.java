
package com.albares.trains;

public class Train {
    
    private String origin;
    private String destination;
    private String hour;
    private Integer price;
    private String promotion;

    public Train() {
    }

    public Train(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    
    public Train(String origin, String destination, String hour, Integer price, String promotion) {
        this.origin = origin;
        this.destination = destination;
        this.hour = hour;
        this.price = price;
        this.promotion = promotion;
    }
    
    

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

   
    
}
