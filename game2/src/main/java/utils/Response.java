
package utils;


import com.fasterxml.jackson.annotation.JsonInclude;
import db.User;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    
    private Integer responseCode;
    private User user;
    private List<User> users;

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    
    
}
