
package Api;


public class Response {
    private int responseCode;
    private User user;

    public Response() {
    }

    public Response(int responseCode) {
        this.responseCode = responseCode;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public User getNewUser() {
        return user;
    }

    public void setNewUser(User newUser) {
        this.user = user;
    }

   
    
}
