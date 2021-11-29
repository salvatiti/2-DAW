package db;

import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.Db;

public class Product {

    private Integer id;
    private String name;
    private Integer price;
    private Integer stock;
    private Integer gender;

    private static final int MALE = 1;
    private static final int FEMALE = 2;

    public Product() {
    }

    public Product(Integer id, String name, Integer price, Integer stock, Integer gendr) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.gender = gender;
    }

    public Product(Integer id, String name, Integer price, Integer stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer insert_db(Db myDb) throws SQLException, NoSuchAlgorithmException { //Agregar usuario

        PreparedStatement ps = myDb.prepareStatement(
                "INSERT INTO products (name, price, stock, gender) VALUES (?, ?, ?, ?) returning id;"
        );
        ps.setString(1, this.getName());
        ps.setInt(2, this.getPrice());
        ps.setInt(3, this.getStock());
        ps.setInt(4, this.getGender());
        ResultSet rs = myDb.executeQuery(ps);
        rs.next();
        this.setId(rs.getInt(1));
        return this.getId();
    }

    public Integer selectOneProduct_db(Db myDb) throws SQLException {
        PreparedStatement ps = myDb.prepareStatement(
                "SELECT id,name,price,stock,gender FROM products WHERE id = ?;"
        );
        ps.setInt(1, this.getId());

        ResultSet rs = myDb.executeQuery(ps);
        rs.next();
        this.setId(rs.getInt(id));
        this.setName(rs.getString(name));
        this.setPrice(rs.getInt(price));
        this.setStock(rs.getInt(stock));
        this.setGender(rs.getInt(gender));
        return rs.getInt(id);
    }

    public static List selectProducts_db(Db myDb) throws SQLException, Exception {

        PreparedStatement ps = myDb.prepareStatement(
                "SELECT id,name,price,stock,gender FROM products;"
        );
        ResultSet rs = myDb.executeQuery(ps);
        List<Product> products = new ArrayList();

        while (rs.next()) {
            Product product = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
            products.add(product);
        }
        return products;
    }

    public void updateProducts(Db myDb) throws SQLException {
        PreparedStatement ps = myDb.prepareStatement(
                "UPDATE products SET (name,price,stock,gender) = (?, ?, ?, ?) WHERE id = ?;"
        );
        ps.setString(1, this.getName());
        ps.setInt(2, this.getPrice());
        ps.setInt(3, this.getStock());
        ps.setInt(4, this.getGender());
        ps.setInt(5, this.getId());
        myDb.executUpdate(ps);

    }

    public static List selectProductsByGender_db(Db myDb, int gender) throws SQLException, Exception {

        PreparedStatement ps = myDb.prepareStatement(
                "SELECT id, name, price, stock FROM products WHERE gender = ? AND stock>0;"
        );

        switch (gender) {
            case 1:
                ps.setInt(1, Product.MALE);
                break;
            case 2:
                ps.setInt(1, Product.FEMALE);
                break;
            default:
                throw new Exception();
        }

        ResultSet rs = myDb.executeQuery(ps);

        List<Product> products = new ArrayList();

        while (rs.next()) {
            Product product = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
            products.add(product);
        }
        return products;

    }
    
    public static boolean stockMoreThanZero(Db myDb) throws SQLException{
        PreparedStatement ps = myDb.prepareStatement(
                "Select id,name,price,stock,gender FROM products WHERE stock > 0;"
        );
       
        ResultSet rs = myDb.executeQuery(ps);
        List<Product> products = new ArrayList();

        while (rs.next()) {
            Product product = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4),rs.getInt(5));
            products.add(product);
        }
        
        return true;     
}
}
