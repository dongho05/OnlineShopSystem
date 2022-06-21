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
import model.Feedback;
import model.User;
import model.product.Brand;
import model.product.Category;
import model.product.Color;
import model.product.ImgOfProduct;
import model.product.Product;
import model.product.ProductDetail;
import model.product.Size;

/**
 *
 * @author Long
 */
public class ProductDAO extends DBContext {

//    private PreparedStatement st;
//    private ResultSet rs;
    public List<Product> getProduct() {
        List<Product> list = new ArrayList<>();
        String sql = "select top 9 * from Product p order by p.totalQuantity desc";
//        String sql="select * from Product";
        ProductDAO pd = new ProductDAO();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Category cate = new Category(rs.getInt(6), null, "");
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), cate, rs.getInt(7), rs.getDouble(8), rs.getString(9), rs.getBoolean(10), rs.getBoolean(11));
                list.add(p);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public List<Product> getAll() throws SQLException {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product";
        PreparedStatement st = connection.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            Product p = new Product();
            p.setProductID(rs.getInt(1));
            p.setProductName(rs.getString(2));
            list.add(p);
        }
        return list;
    }

    public Brand getBrandByID(int brandID) {
        String sql = "select * from Brand where brandID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, brandID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new Brand(rs.getInt(1), rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Category getCateByID(int cateID) {
        String sql = "select * from Category where cateID = ?";
        ProductDAO pd = new ProductDAO();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, cateID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Brand x = pd.getBrandByID(rs.getInt(2));
                return new Category(rs.getInt(1), x, rs.getString(3));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Product getByID(int productID) {
        String sql = "select * from Product where productID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, productID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Category cate = getCateByID(rs.getInt(6));
                return new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), cate, rs.getInt(7), rs.getDouble(8), rs.getString(9), rs.getBoolean(10), rs.getBoolean(11));
            }
        } catch (Exception e) {

        }
        return null;
    }

    public Size getSizeByID(int id) {
        String sql = "select * from Size where sizeID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new Size(rs.getInt(1), rs.getInt(2));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Color getColorByID(int id) {
        String sql = "select * from Color where colorID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new Color(rs.getInt(1), rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public ProductDetail getProductDetailByID(int id) {
        String sql = "select * from ProductDetail where detailID=?";
        List<ProductDetail> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = getByID(rs.getInt(2));
                Size s = getSizeByID(rs.getInt(3));
                Color c = getColorByID(rs.getInt(5));
                return new ProductDetail(rs.getInt(1), p, s, rs.getInt(4), c);
            }
        } catch (Exception e) {
        }
        return null;
    }

    public ProductDetail getProductDetailScreen(int productID, int colorID, int sizeID) {
//        String sql = "select distinct * from ProductDetail pd inner join Size s\n"
//                + "on pd.sizeID=s.sizeID inner join Color c\n"
//                + "on pd.colorID=c.colorID where s.sizeID=? and c.colorID=? and pd.productID=?";

//        String sql = "select top 1 * from ProductDetail pd inner join Color c\n"
//                + "on pd.colorID=c.colorID where pd.productID=? and c.colorID=?";
        String sql = "select * from ProductDetail where productID=? and colorID=? and sizeID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, productID);
            st.setInt(2, colorID);
            st.setInt(3, sizeID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = getByID(rs.getInt(2));
                Size s = getSizeByID(rs.getInt(3));
                Color c = getColorByID(rs.getInt(5));
                return new ProductDetail(rs.getInt(1), p, s, rs.getInt(4), c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<ProductDetail> getAllProductDetailByID(int productID) {
        String sql = "select * from ProductDetail pd inner join Size s\n"
                + "on pd.sizeID=s.sizeID inner join Color c\n"
                + "on pd.colorID=c.colorID where productID=?\n"
                + "order by s.sizeID asc";
        List<ProductDetail> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, productID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = getByID(rs.getInt(2));
                Size s = getSizeByID(rs.getInt(3));
                Color c = getColorByID(rs.getInt(5));
                list.add(new ProductDetail(rs.getInt(1), p, s, rs.getInt(4), c));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Size> getListSizeOfProduct(int productID, int colorID) {
        List<Size> list = new ArrayList<>();
        String sql = "select distinct s.sizeID,s.numberSize from Size s inner join ProductDetail pd\n"
                + "on s.sizeID=pd.sizeID where pd.ProductID=? and colorID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, productID);
            st.setInt(2, colorID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Size(rs.getInt(1), rs.getInt(2)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Feedback> getAllFeedbackByID(int productID) {
        String sql = "select * from Feedback f inner join ProductDetail pd\n"
                + "on f.detailID=pd.detailID where pd.productID=?\n"
                + "order by f.commentDate desc";
        List<Feedback> list = new ArrayList<>();
        ControllUser u = new ControllUser();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, productID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                User account = u.getUser(rs.getInt(2));
                list.add(new Feedback(rs.getInt(1), account, rs.getInt(3), rs.getString(4), rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Color> getListColorOfProduct(int productID) {
        String sql = "select distinct c.colorID,c.colorName from Color c inner join ProductDetail pd\n"
                + "on pd.colorID=c.colorID where pd.productID=?";
        List<Color> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, productID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Color(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public List<ImgOfProduct> getAllImgOfProductDetail(int productID, int colorID) {
        List<ImgOfProduct> list = new ArrayList<>();
        String sql = "select * from ImgOfProduct where productID=? and colorID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, productID);
            st.setInt(2, colorID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Color c = getColorByID(rs.getInt(2));
                list.add(new ImgOfProduct(rs.getInt(1), c, rs.getInt(3), rs.getString(4)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public ProductDetail forWrongSize(int productID, int colorID) {
        String sql = "select top 1 * from ProductDetail pd\n"
                + "inner join Color c\n"
                + "on pd.colorID=pd.colorID\n"
                + "inner join Size s\n"
                + "on pd.sizeID=s.sizeID\n"
                + "where pd.productID=2 and c.colorID=3\n"
                + "order by s.sizeID asc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, productID);
            st.setInt(2, colorID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = getByID(rs.getInt(2));
                Size s = getSizeByID(rs.getInt(3));
                Color c = getColorByID(rs.getInt(5));
                return new ProductDetail(rs.getInt(1), p, s, rs.getInt(4), c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    //long
    public List<Product> getProductShop() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product p order by p.createAt desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt("productID"));
                p.setProductName(rs.getString("productName"));
                p.setProductPrice(rs.getDouble("productPrice"));
                p.setProductImg(rs.getString("productImage"));
                p.setProductDes(rs.getString("productDescribe"));
                p.setDiscount(rs.getDouble("discount"));
                p.setCreateAt(rs.getString("createAt"));
                list.add(p);
            }
//            return list;
        } catch (SQLException e) {
        }
        return list;
    }

    public List<Product> getListByPage(List<Product> list, int start, int end) {
        ArrayList<Product> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
    }

    public List<Brand> listBrand() {
        List<Brand> listB = new ArrayList<>();
        String sql = "select * from Brand";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Brand b = new Brand();
                b.setBrandID(rs.getInt("brandID"));
                b.setBrandName(rs.getString("brandName"));
                listB.add(b);
            }
//            return listB;
        } catch (Exception e) {
        }
        return listB;
    }

    public List<Product> SideBarProduct(String cateID, String brandID, String priceF, String priceT, String asc, String desc) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product p join Category c on p.cateID = c.cateID join Brand b on b.brandID = c.brandID where 1=1";
        if (cateID != null && cateID != "") {
            sql += " and p.cateID = '" + cateID + "'";
        }
        if (brandID != null && brandID != "") {
            sql += " and b.brandID = '" + brandID + "'";
        }
        if (priceF != null && priceF != "" && priceT != null && priceT != "") {
            sql += " and p.ProductPrice between '" + priceF + "' and '" + priceT + "'";
        }
        if (desc != null && desc != "") {
            sql += " order by p.createAt desc";
        }
        if (asc != null && asc != "") {
            sql += " order by p.createAt asc";
        }
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Brand b = new Brand();
                b.setBrandID(rs.getInt("brandID"));
                b.setBrandName(rs.getString("brandName"));
                Category c = new Category();
                c.setCateID(rs.getInt("cateID"));
                c.setBrand(b);
                c.setCateName(rs.getString("cateName"));
                list.add(new Product(rs.getInt("productID"),
                        rs.getString("productName"),
                        rs.getDouble("productPrice"),
                        rs.getString("productImage"),
                        rs.getString("productDescribe"),
                        c,
                        rs.getInt("totalQuantity"),
                        rs.getDouble("discount"),
                        rs.getString("createAt"),
                        rs.getBoolean("isSale"),
                        rs.getBoolean("isActive")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Category> listCate() {
        List<Category> listC = new ArrayList<>();
        String sql = "select * from Category";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Category c = new Category();
                c.setCateID(rs.getInt("cateID"));
                c.setCateName(rs.getString("cateName"));
                listC.add(c);
            }
//            return listC;
        } catch (Exception e) {
        }
        return listC;
    }

    public List<Product> searchSideBarShop(String txt) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product p join Category c on p.cateID = c.cateID "
                + "join Brand b on c.brandID = b.brandID where p.productName like ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, "%" + txt + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Brand b = new Brand();
                Category c = new Category();
                list.add(new Product(rs.getInt("productID"),
                        rs.getString("productName"),
                        rs.getDouble("productPrice"),
                        rs.getString("productImage"),
                        rs.getString("productDescribe"),
                        c,
                        rs.getInt("totalQuantity"),
                        rs.getDouble("discount"),
                        rs.getString("createAt"),
                        rs.getBoolean("isSale"),
                        rs.getBoolean("isActive")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Product> getProductHome() {
        List<Product> list = new ArrayList<>();
        String sql = "select top 9 * from Product p inner join ProductDetail pd on p.productID = pd.productID\n"
                + "inner join OrderDetail od on pd.detailID = od.detailID order by od.quantity desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt("productID"));
                p.setProductName(rs.getString("productName"));
                p.setProductPrice(rs.getDouble("productPrice"));
                p.setProductImg(rs.getString("productImage"));
                p.setProductDes(rs.getString("productDescribe"));
                list.add(p);
            }
        } catch (Exception e) {

        }
        return list;
    }

    public Product getProductByID(int id){
        String sql="select * from Product where productID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
//                Category cate = new Category(rs.getInt(6), null, "");
Category cate = getCateByID(rs.getInt(6));
                return new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), cate, rs.getInt(7), rs.getDouble(8), rs.getString(9), rs.getBoolean(10), rs.getBoolean(11));
            }
        } catch (Exception e) {

        }
        return null;
    }
    public List<Product> getTop4Product() {
        List<Product> list = new ArrayList<>();
        String sql = "select top 4 pd.productID,sum(od.quantity) as quantity,sum(od.price) as price from ProductDetail pd, OrderDetail od\n"
                + "where pd.detailID=od.detailID\n"
                + "group by pd.productID\n"
                + "order by quantity desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p=getProductByID(rs.getInt(1));
                list.add(p);
            }
        } catch (Exception e) {

        }
        return list;
    }

    public static void main(String[] args) {
        ProductDAO pd = new ProductDAO();
        List<Product> list1 = pd.getProductHome();
//        System.out.println(list1.get(0).getProductName());
        System.out.println(list1.get(1).getProductName());
//        System.out.println(pd.getCateByID(1).getCateName());
//        System.out.println(pd.getByID(1).getProductName());
//        System.out.println(list1.get(0).getProductName());
//        System.out.println(pd.getProductDetailByID(1).getColor().getColorName());
//        System.out.println(pd.getProductDetailScreen(2, 3));
//        System.out.println(pd.getListSizeOfProduct(1, 1).get(0).getSizeNumber());
//        System.out.println(pd.getListColorOfProduct(1).size());
        System.out.println(pd.getProductDetailByID(1).getProduct().getProductName());

    }
}
