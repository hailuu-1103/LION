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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Cart;
import model.Item;
import model.Order;

/**
 *
 * @author laptop
 */
public class OrderDAO extends DBContext {

    DecimalFormat df = new DecimalFormat("#.00");

    public void addOrder(Order order, Cart cart) {
        LocalDate curDate = java.time.LocalDate.now();
        String date = curDate.toString();

//        System.out.println(order.getOdate()+" "+order.getOdate().length());
//        System.out.println(order.getSdate()+" "+order.getSdate().length());
//        System.out.println(order.getUsername()+" "+order.getUsername().length());
//        System.out.println(order.getPayment());
//        System.out.println(order.getShipping());
//        float all = order.getPayment()+order.getShipping();
//        System.out.println(all);
//
//        System.out.println("");
//        System.out.println("--------------------------------------");
//        int k = 1;
//        for (Item i : cart.getItems()) {
//            System.out.println(k++);
//            System.out.println("");
//            System.out.println(i.getKit().getKitID()+" "+i.getKit().getKitID().length());
//            System.out.println(i.getSize()+" "+i.getSize().length());
//            System.out.println(i.getPrice());
//            System.out.println(i.getQuantity());
//            System.out.println(i.getQuantity() * i.getPrice());
//            System.out.println("");
//        }
        try {
            //add vào bang Order
            String sql = "INSERT INTO dbo.orders VALUES (?,?,?,ROUND(?, 2),ROUND(?, 2),ROUND(?, 2),?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, order.getOdate());
            st.setString(2, order.getSdate());
            st.setString(3, order.getUsername());
            st.setFloat(4, Float.parseFloat(df.format(order.getPayment())));
            st.setFloat(5, Float.parseFloat(df.format(order.getShipping())));
            st.setFloat(6, Float.parseFloat(df.format(order.getPayment() + order.getShipping())));
            st.setString(7, order.getStatus());
            st.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Add vao order");
        }

        try {
            //lay ra id cua Order vua add
            String sql1 = "SELECT TOP 1 orderID FROM dbo.orders ORDER BY orderID DESC";
            PreparedStatement st1 = connection.prepareStatement(sql1);
            ResultSet rs = st1.executeQuery();
            //add vào bang OrderDetail
            if (rs.next()) {
                int oid = rs.getInt(1);
                for (Item i : cart.getItems()) {
                    try {
                        String sql2 = "INSERT INTO dbo.orderDetails VALUES (?,?,?,ROUND(?, 2),?,ROUND(?, 2))";
                        PreparedStatement st2 = connection.prepareStatement(sql2);
                        st2.setInt(1, oid);
                        st2.setString(2, i.getKit().getKitID());
                        st2.setString(3, i.getSize());
                        st2.setFloat(4, Float.parseFloat(df.format(i.getPrice())));
                        st2.setInt(5, i.getQuantity());
                        st2.setFloat(6, Float.parseFloat(df.format(i.getQuantity() * i.getPrice())));
                        st2.executeUpdate();
                    } catch (SQLException e) {
                        System.out.println("Them vao detail");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Them vao detail nhung o ngoai");
        }

        //update so luong trong bang Product sau khi ban
        String sql3 = "update storage set num_left = num_left - ? where kitID =  ? and size = ?";
        for (Item i : cart.getItems()) {
            try {
                PreparedStatement st3 = connection.prepareStatement(sql3);
                st3.setInt(1, i.getQuantity());
                st3.setString(2, i.getKit().getKitID());
                st3.setString(3, i.getSize());
                st3.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("update storage");
            }
        }

    }
    
    public void updateConfirm(int oid, String message){
        String sql;
        if(message.equals("delivering")){
            sql = "UPDATE dbo.orders SET status = ?, shipDate = DATEADD(day, 5, orderDate) WHERE orderID = ? ";
        }
        else  sql = "UPDATE dbo.orders SET status = ?, shipDate = GETDATE() WHERE orderID = ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, message);
            st.setInt(2, oid);
            st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public int getOrderNum(String username) {
        int orderNum = 0;
        String sql = "SELECT username, COUNT(orderID) AS orderNum FROM dbo.orders WHERE username = ? AND MONTH(orderDate) = MONTH(GETDATE()) GROUP BY username";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                orderNum = rs.getInt(2);
            }
        } catch (SQLException ex) {
            System.out.println("lay so luong don hang");
        }
        return orderNum;
    }

    public Order getOrderByID(int oid) {
        Order o = new Order();
        String sql = "SELECT * FROM dbo.orders WHERE orderID = ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, oid);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                o.setOid(rs.getInt(1));
                o.setOdate(rs.getString(2));
                o.setSdate(rs.getString(3));
                o.setUsername(rs.getString(4));
                o.setPayment(rs.getFloat(5));
                o.setShipping(rs.getFloat(6));
                o.setTotal(rs.getFloat(7));
                o.setStatus(rs.getString(8));
            }
        } catch (SQLException ex) {
            System.out.println("lay tat ca don hang");
        }
        return o;
    }

    public List<Order> getAllOrder(String username) {
        List<Order> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.orders ";
        if(username!=""){
            sql = sql.concat(" WHERE username = '"+username+"' ");
        }
        sql = sql.concat(" ORDER BY orderID DESC");
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Order o = new Order();
                o.setOid(rs.getInt(1));
                o.setOdate(rs.getString(2));
                o.setSdate(rs.getString(3));
                o.setUsername(username);
                o.setPayment(rs.getFloat(5));
                o.setShipping(rs.getFloat(6));
                o.setTotal(rs.getFloat(7));
                o.setStatus(rs.getString(8));
                list.add(o);
            }
        } catch (SQLException ex) {
            System.out.println("lay tat ca don hang");
        }
        return list;
    }

    public List<Item> getDetails(int oid) {
        List<Item> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.orderDetails WHERE orderID = ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, oid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Item i = new Item();
                KitDAO kdb = new KitDAO();
                i.setKit(kdb.getKitByID(rs.getString(2)));
                i.setSize(rs.getString(3));
                i.setQuantity(rs.getInt(5));
                i.setPrice(rs.getFloat(4));
                list.add(i);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public Map<String, Integer> getMostBuy(String username) {
        Map<String, Integer> most = new HashMap<>();
        String sql = "SELECT TOP 1 kitID, SUM(quantity) AS num_of_bought "
                + "FROM dbo.orders INNER JOIN dbo.orderDetails ON orderDetails.orderID = orders.orderID "
                + "WHERE username = ? GROUP BY kitID ORDER BY num_of_bought DESC";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                most.put(rs.getString(1), rs.getInt(2));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return most;
    }

    public static void main(String[] args) {
//        DecimalFormat df = new DecimalFormat("#.00");
//        KitDAO kdb = new KitDAO();
//        Item i = new Item(kdb.getKitByID("ACMA2021"), "XL", 2, (float) 73.87);
//        List<Item> list = new ArrayList<>();
//        list.add(i);
//        Cart cart = new Cart("mrc");
//        cart.setItems(list);
//        Order order = new Order(cart.getUsername(), cart.getTotalMoney(), cart.getTotalMoney() / 100, (cart.getTotalMoney() * 101) / 100);
        OrderDAO odb = new OrderDAO();
//        odb.addOrder(order, cart);
//        for (Item x : cart.getItems()) {
//            System.out.println(Float.parseFloat(df.format(x.getPrice())));
//            System.out.println(Float.parseFloat(df.format(x.getQuantity() * x.getPrice())));
//        }

//        System.out.println(odb.getOrderNum("mrc"));
            odb.updateConfirm(10, "delivering");

    }

}
