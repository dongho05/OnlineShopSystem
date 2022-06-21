/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static javafx.scene.input.KeyCode.U;
import static jdk.nashorn.internal.runtime.regexp.joni.constants.AsmConstants.S;
import model.User;

/**
 *
 * @author HP
 */
public class UsersDAO extends DBContext {

    public List<User> getAll() {
        List<User> list = new ArrayList<>();
        String sql = "select * from [User]";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                User U = new User();
                U.setEmail(rs.getString(9));
                U.setId(rs.getInt(1));
                U.setPass(rs.getString(3));
                U.setName(rs.getString(2));
                list.add(U);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return list;
    }

    public User getUser(int id) {
        User U = new User();
        String sql = "select top(1) * from [user] where userID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                U = new User();
                U.setEmail(rs.getString(9));
                U.setId(rs.getInt(1));
                U.setPass(rs.getString(3));
                U.setName(rs.getString(4));
                U.setGender(rs.getBoolean(8));
                U.setPhone(rs.getString(10));
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return U;
    }

    public void resetPassword(String pass, String email) {
        String sql = "update [User] set userPass = ? where userEmail = ?";
        try {
            int result = 0;
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, pass);
            st.setString(2, email);
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        UsersDAO dao = new UsersDAO();
//        List<User> list = dao.getAll();
//        for (User users : list) {
//            System.out.println(users);
//        }
        dao.resetPassword("123", "dungndhe150788@fpt.edu.vn");
    }
}
