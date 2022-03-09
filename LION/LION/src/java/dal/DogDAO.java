/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import model.Dog;

/**
 *
 * @author laptop
 */
public class DogDAO extends DBContext {

    DecimalFormat df = new DecimalFormat("#.00");

    public List<Dog> getDogs(String sex) {
        List<Dog> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.dog WHERE dogID IN (SELECT DISTINCT dogID FROM dbo.storage) and 1=1 ";
        if (!sex.equals("*")) {
            sql = sql.concat("and sex like '%" + sex + "%' ");
        }
        sql = sql.concat("order by sex desc, dogID");
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Dog d = new Dog();
                d.setDogID(rs.getString("dogID"));
                d.setDogName(rs.getString("dogName"));
                d.setSex(rs.getString("sex"));
                float price = Float.valueOf(rs.getString("price"));
                price = Float.parseFloat(df.format(price));
                d.setPrice(price);
                d.setDescript(rs.getString("descript"));
                d.setSupplier(rs.getString("supplier"));
                d.setImg(rs.getString("img"));
                list.add(d);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Dog> getDogCRUD() {
        List<Dog> list = new ArrayList<>();
        String sql = "SELECT * from dog where 1=1 ";
        sql = sql.concat("order by dogID asc, sex");
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Dog k = new Dog();
                k.setDogID(rs.getString("dogID"));
                k.setDogName(rs.getString("dogName"));
                k.setSex(rs.getString("sex"));
                float price = Float.valueOf(rs.getString("price"));
                price = Float.parseFloat(df.format(price));
                k.setPrice(price);
                k.setDescript(rs.getString("descript"));
                k.setSupplier(rs.getString("supplier"));
                k.setImg(rs.getString("img"));
                list.add(k);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        System.out.println(sql);
        return list;
    }

    public Dog getDogByID(String dogID) {
        Dog d = new Dog();
        String sql = "SELECT * FROM dbo.dog WHERE dogID IN (SELECT DISTINCT dogID FROM dbo.storage) and dog.dogID = ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, dogID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                d.setDogID(rs.getString("dogID"));
                d.setDogName(rs.getString("dogName"));
                d.setSex(rs.getString("sex"));
                float price = Float.valueOf(rs.getString("price"));
                price = Float.parseFloat(df.format(price));
                d.setPrice(price);
                d.setDescript(rs.getString("descript"));
                d.setSupplier(rs.getString("supplier"));
                d.setImg(rs.getString("img"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return d;
    }

    public List<Dog> getDogByName(String dogName) {
        dogName = dogName.replaceAll(" ", "%");
        List<Dog> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.dog WHERE dogID IN (SELECT DISTINCT dogID FROM dbo.storage) and dogName like '%" + dogName + "%' ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Dog d = new Dog();
                d.setDogID(rs.getString("dogID"));
                d.setDogName(rs.getString("dogName"));
                d.setSex(rs.getString("sex"));
                float price = Float.valueOf(rs.getString("price"));
                price = Float.parseFloat(df.format(price));
                d.setPrice(price);
                d.setDescript(rs.getString("descript"));
                d.setSupplier(rs.getString("supplier"));
                d.setImg(rs.getString("img"));
                list.add(d);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Dog> getDogByPage(List<Dog> list, int start, int end) {
        List<Dog> t = new ArrayList<>();
        for (int i = start; i < end; i++) {
            t.add(list.get(i));
        }
        return t;
    }

    public List<String> getType() {
        List<String> type = new ArrayList<>();
        String sql = "SELECT DISTINCT dog.sex FROM dbo.dog INNER JOIN dbo.storage ON storage.dogID = dog.dogID";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                type.add(rs.getString("sex"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return type;
    }

    public List<Integer> getNumLeft(String dogID) {
        List<Integer> numLeft = new ArrayList<>();
        String sql = "SELECT num_left FROM dbo.storage\n"
                + "WHERE dogID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, dogID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                numLeft.add(rs.getInt("num_left"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return numLeft;
    }

    public List<String> getSex(String dogID) {
        List<String> size = new ArrayList<>();
        String sql = "SELECT sex FROM storage where dogID =?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, dogID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                size.add(rs.getString("sex"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return size;
    }

    public List<Dog> getCheap() {
        List<Dog> cheap = new ArrayList<>();
        String sql = "SELECT TOP 4 * FROM dbo.dog WHERE dogID IN (SELECT DISTINCT dogID FROM dbo.storage) ORDER BY price ASC";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Dog k = new Dog();
                k.setDogID(rs.getString("dogID"));
                k.setDogName(rs.getString("dogName"));
                k.setSex(rs.getString("sex"));
                float price = Float.valueOf(rs.getString("price"));
                price = Float.parseFloat(df.format(price));
                k.setPrice(price);
                k.setDescript(rs.getString("descript"));
                k.setSupplier(rs.getString("supplier"));
                k.setImg(rs.getString("img"));
                cheap.add(k);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return cheap;
    }

    public List<Dog> getLatest() {
        List<Dog> latest = new ArrayList<>();
        String sql = "SELECT * FROM "
                + " (SELECT * FROM dog) d1 "
                + " INNER JOIN "
                + " (SELECT TOP 4 dogID, MAX(inDate) AS dayUpdate FROM dbo.storage GROUP BY dogID  ORDER BY dayUpdate DESC) d2 "
                + " ON (d1.dogID = d2.dogID); ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Dog k = new Dog();
                k.setDogID(rs.getString("dogID"));
                k.setDogName(rs.getString("dogName"));
                k.setSex(rs.getString("sex"));
                float price = Float.valueOf(rs.getString("price"));
                price = Float.parseFloat(df.format(price));
                k.setPrice(price);
                k.setDescript(rs.getString("descript"));
                k.setSupplier(rs.getString("supplier"));
                k.setImg(rs.getString("img"));
                latest.add(k);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return latest;
    }

    public void addDog(Dog dog) {
        String sql = "INSERT INTO dbo.dog VALUES(?,?,?,ROUND(?, 2),?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, dog.getDogID());
            st.setString(2, dog.getDogName());
            st.setString(3, dog.getSex());
            st.setFloat(4, dog.getPrice());
            st.setString(5, dog.getDescript());
            st.setString(6, dog.getSupplier());
            String src = dog.getImg();
            st.setString(7, "image/" + dog.getImg());
            ResultSet rs = st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateDog(Dog dog) {
        String sql = "UPDATE dbo.dog SET dogName = ?, sex = ?, price = ?, descript = ?, supplier = ?, img = ? WHERE dogID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, dog.getDogName());
            st.setString(2, dog.getSex());
            st.setFloat(3, dog.getPrice());
            st.setString(4, dog.getDescript());
            st.setString(5, dog.getSupplier());
            String src = dog.getImg();
            st.setString(6, "image/" + dog.getImg());
            st.setString(7, dog.getDogID());
            ResultSet rs = st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void deleteDog(String id) {
//        String sql = "Delete from dog where "
    }
    public static void main(String[] args) {
        DogDAO db = new DogDAO();
        Dog d = new Dog("AHBM", "alo", "male", 12, "nothing", "no", "img/");
        db.updateDog(d);
    }

}
