
package Api;

public class User {
    
    private String name;
    private String pass;
    private Integer id;
    private String token;

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public User() {
    }
    
    

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

   
    
    
}
