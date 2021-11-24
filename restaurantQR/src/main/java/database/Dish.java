
package database;

import api.Menu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.Db;


public class Dish {
    private Integer id;
    private String name;
    private Integer price;
    private Integer type;

    public Dish() {
    }

    public Dish(Integer id,String name, Integer price, Integer type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
    
    public int insertDishes_DB(Db myDb) throws SQLException{
        PreparedStatement ps = myDb.prepareStatement(
                "INSERT INTO dishes (name,price,type) VALUES (?, ?, ?) returning id;"
        );
        ps.setString(1, this.getName());
        ps.setInt(2, this.getPrice());
        ps.setInt(3, this.getType());
        ResultSet rs = myDb.executeQuery(ps);
        rs.next();
        this.setId(rs.getInt(1));
        Dish newDish = new Dish(this.getId(), this.getName(), this.getPrice(), this.getType());
        Menu menu = new Menu();
        menu.addDish(newDish);
        return id;
    }
   
     public void selectDishes_DB(Db myDb) throws SQLException{
         PreparedStatement ps = myDb.prepareStatement(
                    "SELECT id,name,price FROM users WHERE type = ?;"
            );
            ps.setInt(1, this.getType());
            ResultSet rs = myDb.executeQuery(ps); //respuesta que devuelve sql al hacer executeQuery
             
            rs.next();//pasar de fila en fila
            this.setId(rs.getInt("id"));
            this.setName(rs.getString("name"));
            this.setPrice(rs.getInt("price")); 
    }
     
    
}
