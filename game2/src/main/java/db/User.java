package db;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.Db;
import static utils.SHAUtils.sha256;
import utils.Secrets;

public class User {

    private Integer id;
    private String name;
    private String pass;
    private int score;

    private String token;

    public User() {
    }

    public User(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @JsonIgnore //Esta variable no aparece en el JSON de Jackson
    public String getEncodedPass() throws NoSuchAlgorithmException {
        return sha256(this.getPass() + Secrets.SALT_PASS);
    }

    public Integer insert_db(Db myDb) throws SQLException, NoSuchAlgorithmException { //Agregar usuario
        PreparedStatement ps = myDb.prepareStatement(
                "INSERT INTO users (name, pass, score) VALUES (?, ?, ?) returning id;"
        );
        ps.setString(1, this.getName());
        ps.setString(2, this.getEncodedPass());
        ps.setInt(3, this.getScore());
        ResultSet rs = myDb.executeQuery(ps);
        rs.next();
        this.setId(rs.getInt(1));
        return this.getId();
    }

    public boolean user_exists_db(Db myDb) throws SQLException { //Existe el usuario?
        PreparedStatement ps = myDb.prepareStatement(
                "SELECT COUNT(*) FROM users WHERE name = ?;"
        );
        ps.setString(1, this.getName());

        ResultSet rs = myDb.executeQuery(ps);
        rs.next();
        if (rs.getInt(1) > 0) {
            return true;
        }
        return false;
    }

    public User selectUser_db(Db myDb) throws SQLException {
        PreparedStatement ps = myDb.prepareStatement(
                "SELECT id,name,score FROM users WHERE name = ?;"
        );
        ps.setString(1, this.getName());

        ResultSet rs = myDb.executeQuery(ps);
        rs.next();
        User user = new User();
        this.setId(rs.getInt(1));
        this.setName(rs.getString(2));
        this.setScore(this.getScore()); //(rs.getInt(3));
        return this;
    }

    public boolean pass_is_valid(Db myDb) throws SQLException, NoSuchAlgorithmException {
        PreparedStatement ps = myDb.prepareStatement(
                "SELECT pass FROM users WHERE name = ?;"
        );
        ps.setString(1, this.getName());
        ResultSet rs = myDb.executeQuery(ps);
        rs.next();
        if (rs.getString(1).equals(this.getEncodedPass())) {
            return true;//si la pass de la query es la misma que encodePass de la bbdd
        }
        return false;

    }

    public boolean score_is_valid(Db myDb) throws SQLException, NoSuchAlgorithmException {
        PreparedStatement ps = myDb.prepareStatement(
                "SELECT score FROM users WHERE name = ?;"
        );
        ps.setString(1, this.getName());
        ResultSet rs = myDb.executeQuery(ps);
        rs.next();
        if (this.getScore() > rs.getInt(1)) {
            return true;
        }
        return false; 
    }

    public void updateScore_db(Db myDb) throws SQLException {
        PreparedStatement ps = myDb.prepareStatement(
                "UPDATE users SET score = ? WHERE name = ?;"
        );
        ps.setInt(1, this.getScore());
        ps.setString(2, this.getName());
        myDb.executUpdate(ps);
        
    }

    
     public static List selectScores_db(Db myDb) throws SQLException, Exception{
        
        PreparedStatement ps = myDb.prepareStatement(
                    "SELECT name, score FROM users ORDER BY score DESC LIMIT 3;"
            );
        ResultSet rs = myDb.executeQuery(ps);
        List<User> users = new ArrayList();
        
        while(rs.next()){
            User user = new User(rs.getString(1),rs.getInt(2));
            users.add(user);
        }
        return users;
     }
}
