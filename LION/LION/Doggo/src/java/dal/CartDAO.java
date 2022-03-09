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
import model.Cart;
import model.Item;
import model.Kit;

/**
 *
 * @author laptop
 */
public class CartDAO extends DBContext {

    DecimalFormat df = new DecimalFormat("#.00");
    
    public Cart getCart(String username) {
        
        Cart cart = new Cart(username);
        String sql = "SELECT * FROM dbo.kit INNER JOIN dbo.cart ON kit.kitID = cart.kitID where username = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Kit k = new Kit(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), Float.parseFloat(df.format(rs.getFloat(5))), rs.getString(6), rs.getString(7), rs.getString(8));
                String size = rs.getString(12);
                int quantity = rs.getInt(13);
                float price = k.getPrice();
                Item t = new Item(k, size, quantity, price);
                cart.addItem(t);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return cart;
    }

    public void updateCart(Cart cart) {
        String sql1 = "DELETE FROM dbo.cart WHERE username = ?";
        try {
            PreparedStatement st1 = connection.prepareStatement(sql1);
            st1.setString(1, cart.getUsername());
            st1.executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
        }
        for (int i = 0; i < cart.getItems().size(); i++) {
            String sql2 = "INSERT INTO dbo.cart VALUES (?,?,?,?,?,ROUND(?, 2),ROUND(?, 2))";
            Item t = cart.getItems().get(i);
            try {
                PreparedStatement st2 = connection.prepareStatement(sql2);
                st2.setString(1, t.getKit().getImg());
                st2.setString(2, cart.getUsername());
                st2.setString(3, t.getKit().getKitID());
                st2.setString(4, t.getSize());
                st2.setInt(5, t.getQuantity());
                st2.setFloat(6, Float.parseFloat(df.format(t.getPrice())));
                st2.setFloat(7, Float.parseFloat(df.format(t.getPrice()))*t.getQuantity());
                st2.executeQuery();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        CartDAO cdb = new CartDAO();
        Cart cart = cdb.getCart("mrb");
        KitDAO kdb = new KitDAO();
        Kit k = kdb.getKitByID("LIVH2021");
        Item t = new Item(k, "XL", 2, k.getPrice());
        cart.addItem(t);
        cdb.updateCart(cart);
    }

}
