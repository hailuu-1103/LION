/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Customer;

/**
 *
 * @author laptop
 */
public class CustomerDAO extends DBContext {

    public String addCustomer(String username, String email, String address, String phone) {
        String out = "Dang ky thanh cong";
        String sql = "INSERT INTO dbo.customer(username,email,address,phone) VALUES (N'" + username + "', N'" + email + "', N'" + address + "', N'" + phone + "')";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.executeQuery();
        } catch (SQLException e) {
            String ex = e.toString();
            if (!(ex.contains("The statement did not return a result set."))) {
                out = "Đăng ký thất bại, vui lòng thử tên đăng nhập khác";
            }
        }
        return out;
    }

    public Customer getCustomer(String username) {
        String sql = "SELECT * FROM dbo.customer WHERE username = ?";
        Customer cus = null;
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                cus = new Customer();
                cus.setUsername(username);
                cus.setEmail(rs.getString(2));
                cus.setAddress(rs.getString(3));
                cus.setPhone(rs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println("lay ra thong tin khach hang");
        }
        return cus;
    }

    public void updateCustomer(String username, String newmail, String newadd, String newphone) {
        String sql = "UPDATE dbo.customer SET email = ? , [address] = ? , phone = ? WHERE username = ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, newmail);
            st.setString(2, newadd);
            st.setString(3, newphone);
            st.setString(4, username);
            st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        CustomerDAO db = new CustomerDAO();
        System.out.println(db.getCustomer("mra"));
    }

}
