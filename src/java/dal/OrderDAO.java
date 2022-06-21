package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import model.Feedback;
import model.User;
import model.order.Order;
import model.order.OrderDetail;
import model.order.OrderState;
import model.product.Color;
import model.product.Product;
import model.product.ProductDetail;
import model.product.Size;

public class OrderDAO extends DBContext {

    PreparedStatement st;
    ResultSet rs;

    public List<Order> getListOrder(String key, String from, String to, int[] stateOrder, int sortCondition, int page, int pageSize) {
        List<Order> list = new ArrayList<>();
        ControllUser cu = new ControllUser();
        String sql = "select * from [Order] o inner join OrderState os\n"
                + "on o.stateID=os.stateID inner join [User] u\n"
                + "on o.userID=u.userID where 1=1";
        //handle from to
        if ((from == "" && to == "")) {
            //handle orderState
            if (stateOrder != null) {
                sql += " and o.stateID in(";
                for (int i = 0; i < stateOrder.length; i++) {
                    sql += stateOrder[i] + ",";
                }
                if (sql.endsWith(",")) {
                    sql = sql.substring(0, sql.length() - 1);
                }
                sql += ")";
            }
//        //handle search
            if (key != null) {
                sql += " and (o.orderID like ? or u.fullName like ?)";
            }
            //handle sort
            if (sortCondition == 1) {
                sql += " order by o.orderDate asc,u.fullName asc,o.amount asc, o.stateID asc";
            } else if (sortCondition == 2) {
                sql += " order by o.orderDate desc,u.fullName desc,o.amount desc, o.stateID desc";
            }
            sql += " offset (?-1)*? row fetch next ? rows only";
            try {
                st = connection.prepareStatement(sql);
                st.setString(1, "%" + key + "%");
                st.setString(2, "%" + key + "%");
                st.setInt(3, page);
                st.setInt(4, pageSize);
                st.setInt(5, pageSize);
                rs = st.executeQuery();
                while (rs.next()) {
                    User account = cu.getUser(rs.getInt(2));
                    OrderState o_state = getOrderStateByID(rs.getInt(5));
                    List<OrderDetail> listOrderDetail = getListOfOrder(rs.getInt(1));
                    list.add(new Order(rs.getInt(1), account, rs.getString(3), rs.getDouble(4), o_state, listOrderDetail));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            if (stateOrder != null) {
                sql += " and o.stateID in(";
                for (int i = 0; i < stateOrder.length; i++) {
                    sql += stateOrder[i] + ",";
                }
                if (sql.endsWith(",")) {
                    sql = sql.substring(0, sql.length() - 1);
                }
                sql += ")";
            }
//        //handle search
            if (key != null) {
                sql += " and (o.orderID like ? or u.fullName like ?)";
            }
            sql += " and (o.orderDate between ? and ?)";
            //handle sort
            if (sortCondition == 1) {
                sql += " order by o.orderDate asc,u.fullName asc,o.amount asc, o.stateID asc";
            } else if (sortCondition == 2) {
                sql += " order by o.orderDate desc,u.fullName desc,o.amount desc, o.stateID desc";
            }

            sql += " offset (?-1)*? row fetch next ? rows only";
            try {
                st = connection.prepareStatement(sql);
                st.setString(1, "%" + key + "%");
                st.setString(2, "%" + key + "%");
                st.setString(3, from);
                st.setString(4, to);
                st.setInt(5, page);
                st.setInt(6, pageSize);
                st.setInt(7, pageSize);
                rs = st.executeQuery();
                while (rs.next()) {
                    User account = cu.getUser(rs.getInt(2));
                    OrderState o_state = getOrderStateByID(rs.getInt(5));
                    List<OrderDetail> listOrderDetail = getListOfOrder(rs.getInt(1));
                    list.add(new Order(rs.getInt(1), account, rs.getString(3), rs.getDouble(4), o_state, listOrderDetail));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return list;
    }

    public List<Order> getListOrderBySearch(String key) {
        String sql = "select * from [Order] o inner join OrderState os\n"
                + "on o.stateID=os.stateID inner join [User] u\n"
                + "on o.userID=u.userID where 1=1";
        ControllUser cu = new ControllUser();
        List<Order> list = new ArrayList<>();
        if (key != null) {
            if (key != null) {
                sql += " and (o.orderID like ? or u.fullName like ?)";
            }
        }
        try {
            st = connection.prepareCall(sql);
            st.setString(1, "%" + key + "%");
            st.setString(2, "%" + key + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                User account = cu.getUser(rs.getInt(2));
                OrderState o_state = getOrderStateByID(rs.getInt(5));
                List<OrderDetail> listOrderDetail = getListOfOrder(rs.getInt(1));
                list.add(new Order(rs.getInt(1), account, rs.getString(3), rs.getDouble(4), o_state, listOrderDetail));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public int getTotalPage(String key, String from, String to, int[] stateOrder) {
        int count = 0;
        List<Order> list = new ArrayList<>();
        ControllUser cu = new ControllUser();
        String sql = "select * from [Order] o inner join OrderState os\n"
                + "on o.stateID=os.stateID inner join [User] u\n"
                + "on o.userID=u.userID where 1=1";
        //handle from to
        if ((from == "" && to == "")) {
            //handle orderState
            if (stateOrder != null) {
                sql += " and o.stateID in(";
                for (int i = 0; i < stateOrder.length; i++) {
                    sql += stateOrder[i] + ",";
                }
                if (sql.endsWith(",")) {
                    sql = sql.substring(0, sql.length() - 1);
                }
                sql += ")";
            }
//        //handle search
            if (key != null) {
                sql += " and (o.orderID like ? or u.fullName like ?)";
            }
            try {
                st = connection.prepareStatement(sql);
                st.setString(1, "%" + key + "%");
                st.setString(2, "%" + key + "%");
                rs = st.executeQuery();
                while (rs.next()) {
                    User account = cu.getUser(rs.getInt(2));
                    OrderState o_state = getOrderStateByID(rs.getInt(5));
                    List<OrderDetail> listOrderDetail = getListOfOrder(rs.getInt(1));
                    list.add(new Order(rs.getInt(1), account, rs.getString(3), rs.getDouble(4), o_state, listOrderDetail));
                    count++;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            if (stateOrder != null) {
                sql += " and o.stateID in(";
                for (int i = 0; i < stateOrder.length; i++) {
                    sql += stateOrder[i] + ",";
                }
                if (sql.endsWith(",")) {
                    sql = sql.substring(0, sql.length() - 1);
                }
                sql += ")";

            }
            //handle search
            if (key != null) {
                sql += " and (o.orderID like ? or u.fullName like ?)";
            }
            sql += " and (o.orderDate between ? and ?)";
            try {
                st = connection.prepareStatement(sql);
                st.setString(1, "%" + key + "%");
                st.setString(2, "%" + key + "%");
                st.setString(3, from);
                st.setString(4, to);
                rs = st.executeQuery();
                while (rs.next()) {
                    User account = cu.getUser(rs.getInt(2));
                    OrderState o_state = getOrderStateByID(rs.getInt(5));
                    List<OrderDetail> listOrderDetail = getListOfOrder(rs.getInt(1));
                    list.add(new Order(rs.getInt(1), account, rs.getString(3), rs.getDouble(4), o_state, listOrderDetail));
                    count++;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return count;
    }

    public List<ProductDetail> getTop5Product() {
        ProductDAO pd = new ProductDAO();

//        String sql = "with t as(select pd.detailID,pd.productID, pd.quantity,pd.colorID,pd.sizeID,o.orderID from ProductDetail pd\n"
//                + "join OrderDetail od\n"
//                + "on pd.detailID = od.detailID\n"
//                + "join [Order] o\n"
//                + "on od.orderID=o.orderID)\n"
//                + "select top(5)detailID,productID,quantity,colorID,sizeID,orderID from t order by t.quantity desc";
        String sql = "with t as(select pd.detailID,pd.productID, pd.quantity,pd.colorID,pd.sizeID,o.orderID from ProductDetail pd\n"
                + "join OrderDetail od\n"
                + "on pd.detailID = od.detailID\n"
                + "join [Order] o\n"
                + "on od.orderID=o.orderID\n"
                + "join OrderState os\n"
                + "on o.stateID=os.stateID)\n"
                + "select top(5)detailID,productID,quantity,colorID,sizeID,orderID from t order by t.quantity desc";
        List<ProductDetail> list = new LinkedList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = pd.getByID(rs.getInt(2));
                Size s = pd.getSizeByID(rs.getInt(3));
                Color c = pd.getColorByID(rs.getInt(5));
                list.add(new ProductDetail(rs.getInt(1), p, s, rs.getInt(4), c));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Order> getOrderNewInLessMonth() {
        String sql = "select * from [Order]\n"
                + "where orderDate > GETDATE()-30\n"
                + "order by orderDate desc";
        ControllUser d = new ControllUser();
        List<Order> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                User account = d.getUser(rs.getInt(2));
                OrderState o_state = getOrderStateByID(rs.getInt(5));
                List<OrderDetail> listOrderDetail = getListOfOrder(rs.getInt(1));
                list.add(new Order(rs.getInt(1), account, rs.getString(3), rs.getDouble(4), o_state, listOrderDetail));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public OrderState getOrderStateByID(int id) {
        String sql = "select * from [OrderState] where stateID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new OrderState(rs.getInt(1), rs.getString(2));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<OrderState> getListOrderState() {
        String sql = "select top 5 * from [OrderState]";
        List<OrderState> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new OrderState(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public OrderDetail getOrderDetailByID(int id) {
        String sql = "select * from OrderDetail where orderDetailID=?";
        ProductDAO pd = new ProductDAO();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ProductDetail p = pd.getProductDetailByID(rs.getInt(2));

                return new OrderDetail(rs.getInt(1), p, rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getDouble(9));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<OrderDetail> getListOfOrder(int orderID) {
        ProductDAO pd = new ProductDAO();
        String sql = "select * from OrderDetail where orderID=?";
        ControllUser d = new ControllUser();
        List<OrderDetail> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, orderID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ProductDetail p = pd.getProductDetailByID(rs.getInt(2));
                list.add(new OrderDetail(rs.getInt(1), p, rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getDouble(9)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public int AmountPriceLessMonth() {
        String sql = "select sum(amount) from [Order]\n"
                + "where orderDate > GETDATE()-30";
        int sum = 0;
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                sum += rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return sum;
    }

    //dung
    //Customer
    public List<Order> pagingOrders(int id, int index) {
        List<Order> list = new ArrayList<>();
        ControllUser d = new ControllUser();
        String query = "select * from [Order] where userID = ? order by orderID  offset ?  rows fetch next 6 rows only";
        try {
            PreparedStatement st = connection.prepareStatement(query);
            st.setInt(1, id);
            st.setInt(2, (index - 1) * 6);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                User account = d.getUser(rs.getInt(2));
                OrderState o_state = getOrderStateByID(rs.getInt(5));
                List<OrderDetail> listOrderDetail = getListOfOrder(rs.getInt(1));
                list.add(new Order(rs.getInt(1), account, rs.getString(3), rs.getDouble(4), o_state, listOrderDetail));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public int getTotalOrder(int userID) {
        String query = "select count(*) from [Order] where userID=?";
        try {
            PreparedStatement st = connection.prepareStatement(query);
            st.setInt(1, userID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public List<Order> getAllName(String name) {
        List<Order> list = new ArrayList<>();
        ControllUser d = new ControllUser();
        String query = "select * from MyOrder where Product like '%" + name + "%'";
        try {
            st = connection.prepareStatement(query);
            rs = st.executeQuery();
            while (rs.next()) {
                User account = d.getUser(rs.getInt(2));
                OrderState o_state = getOrderStateByID(rs.getInt(5));
                List<OrderDetail> listOrderDetail = getListOfOrder(rs.getInt(1));
                list.add(new Order(rs.getInt(1), account, rs.getString(3), rs.getDouble(4), o_state, listOrderDetail));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public Order getOrderByID(int id){
        ControllUser d = new ControllUser();
        String sql="select * from [Order] where orderID=?";
        try{
            st = connection.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            while(rs.next()){
                User account = d.getUser(rs.getInt(2));
                OrderState o_state = getOrderStateByID(rs.getInt(5));
                List<OrderDetail> listOrderDetail = getListOfOrder(rs.getInt(1));
                return new Order(rs.getInt(1), account, rs.getString(3), rs.getDouble(4), o_state, listOrderDetail);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    public static void main(String[] args) {
        OrderDAO d = new OrderDAO();
//        List<OrderDetail> list = d.getListOfOrder(1);
        int ar[] = {1, 2, 3};
//        List<Order> list2 = d.getListOrder("Ro", "20220107", "", ar, 1, 1, 2);
//        System.out.println(list2.get(0).getAmount());
//        System.out.println(list2.size());
//        System.out.println(d.getTotalPage("", "", "", ar));
//        List<OrderState> list3 = d.getListOrderState();
//        System.out.println(list3.get(0).getNameState());
//        List<ProductDetail> list = d.getTop5Product();
//        System.out.println(list.get(0).getProduct().getProductName());
        List<OrderDetail> list = d.getListOfOrder(1);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getOdAmount());
        }
    }
}
