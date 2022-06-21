/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Role;
import model.User;
import model.product.Product;

/**
 *
 * @author hophu
 */
public class MarketingDAO extends DBContext{

    
    
    public static void main(String[] args) {
        MarketingDAO m = new MarketingDAO();
//        List<Integer> list = m.getTop5UserBuyMost();
//        System.out.println(list.get(0));

        List<Double> list = m.getRevenueByDay(2, 7, 2, 2022);
        System.out.println(list.size());

    }
    
    public List<Product> getTop10ProductBuyMost(){
        List<Product> list = new ArrayList<>();
            
        return list;
    }
    
    public List<Double> getRevenueByDay(int from,int to,int month,int year){
        List<Double> list = new ArrayList<>() ;
        String sql = "select sum(amount) from [Order] where MONTH(orderDate) = ? and YEAR(orderDate)= ? and DAY(orderDate) between ? and ? group by userID";
        try {
            PreparedStatement st= connection.prepareStatement(sql);
            st.setInt(1, month);
            st.setInt(2, year);
            st.setInt(3, from);
            st.setInt(4, to);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                double x = (double)rs.getInt(1);
                list.add(x);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return list;
    }
    public List<Integer> getTop5UserBuyMost() {
        List<Integer> list = new ArrayList<>();
        int userID = 0;
        String sql = "select top 5 count(userID), o.userID from [Order] o\n"
                + "group by  o.userID\n"
                + "order by count(userID) desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                userID = rs.getInt(2);
                list.add(userID);
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
}
