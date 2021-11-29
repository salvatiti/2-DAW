
package utils;


import com.fasterxml.jackson.annotation.JsonInclude;
import db.Product;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    
    private Integer responseCode;
    private Product product;
    private List<Product> products;

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    
    
}
