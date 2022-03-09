/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Account;

/**
 *
 * @author laptop
 */
public class AccountDAO extends dal.DBContext {

    public Account getAccount(String username, String password) {
        String sql = "select * from account where username=? and password=? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Account(rs.getString("username"), rs.getString("password"), rs.getString("role"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public void addAccount(String username, String password) {
        String out = "Dang ky thanh cong";
        String sql = "INSERT INTO dbo.account VALUES (N'" + username + "', N'" + password + "', 'user')";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateAccount(String username, String newpass) {
        String sql = "UPDATE dbo.account SET password = ? WHERE username = ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, newpass);
            st.setString(2, username);
            st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
