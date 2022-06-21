/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Blog;
import model.CategoryBlog;
import model.Slider;
import model.User;

/**
 *
 * @author Admin
 */
public class MKTDAO  extends DBContext{
//    private PreparedStatement st;
//    private ResultSet rs;
    public List<Slider> getAllSlider() {
        List<Slider> list = new ArrayList<>();
        String sql = "select * from [Slider]";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Slider U = new Slider();
                U.setSliderID(rs.getInt(1));
                U.setTitle(rs.getString(2));
                U.setSliderContent(rs.getString(3));
                U.setImg(rs.getString(4));
                U.setStatus(rs.getBoolean(5));
                U.setLink(rs.getString(6));
                list.add(U);
            }
            st.close();
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return list;
    }
    
    public List<Blog> getAllBlog() {
        List<Blog> list = new ArrayList<>();
        String sql = "select * from [Blog]";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Blog U = new Blog();
                U.setBlogID(rs.getInt(1));
                U.setUserID(rs.getInt(2));
                U.setTitle(rs.getString(3));
                U.setContent(rs.getString(4));
                U.setImage(rs.getString(5));
                U.setAuthor(rs.getString(6));
                U.setCreateDate(rs.getString(7));
                U.setStatusBlogID(rs.getBoolean(8));
                U.setCateBlogID(new CategoryBlog(rs.getInt(9), ""));                
                list.add(U);
            }
            st.close();
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return list;
    }
    
    public List<Slider> getSliderByTitle(String title) {
        List<Slider> list = null;
        String sql = "select * from [Slider] where title like ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,"%"+ title + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                
                Slider x = new Slider(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getBoolean(5),
                        rs.getString(6));
                list.add(x);
                
            }
            st.close();
            rs.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<Blog> getBlogByTitle(String title) {
        List<Blog> list = new ArrayList<>();
        String sql = "select * from [Blog] where blogTitle like ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, "%"+title+"%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Blog U = new Blog();
                U.setBlogID(rs.getInt(1));
                U.setUserID(rs.getInt(2));
                U.setTitle(rs.getString(3));
                U.setContent(rs.getString(4));
                U.setImage(rs.getString(5));
                U.setAuthor(rs.getString(6));
                U.setCreateDate(rs.getString(7));
                U.setStatusBlogID(rs.getBoolean(8));
                U.setCateBlogID(new CategoryBlog(rs.getInt(9), ""));                
                list.add(U);
            }
            st.close();
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return list;
    }
    
    public List<Blog> getBlogByAuthor(String author) {
        List<Blog> list = new ArrayList<>();
        String sql = "select * from [Blog] where authorName like ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, "%"+author+"%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Blog U = new Blog();
                U.setBlogID(rs.getInt(1));
                U.setUserID(rs.getInt(2));
                U.setTitle(rs.getString(3));
                U.setContent(rs.getString(4));
                U.setImage(rs.getString(5));
                U.setAuthor(rs.getString(6));
                U.setCreateDate(rs.getString(7));
                U.setStatusBlogID(rs.getBoolean(8));
                U.setCateBlogID(new CategoryBlog(rs.getInt(9), ""));                
                list.add(U);
            }
            st.close();
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return list;
    }
    
//    public List<Blog> searchBlogByKey(String key){
//        List<Blog> list = new ArrayList<>();
//        String sql ="select * from Blog where blogTitle like ? ";
//        try {
//            PreparedStatement st = connection.prepareStatement(sql);
//            st.setString(1, "%"+key+"%");
//            ResultSet rs =st.executeQuery();
//            while(rs.next()){
//                CategoryBlog cb = new CategoryBlog(rs.getInt(9), "");
//                Blog b = new Blog(rs.getInt(1),
//                        rs.getInt(2),
//                        rs.getString(3),
//                        rs.getString(4),
//                        rs.getString(5),
//                        rs.getString(6),
//                        rs.getString(7),
//                        rs.getBoolean(8),
//                        cb);
//                list.add(b);
//            }
//        } catch (Exception e) {
//        }
//        return list;
//    }
    
    public List<Slider> getSliderByStatus(boolean status) {
        List<Slider> list = new ArrayList<>();
        String sql = "select * from [Slider] where status = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,"%"+ status + "%");
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                
                Slider x = new Slider(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getBoolean(5),
                        rs.getString(6));
                list.add(x);
            }
            st.close();
            rs.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<Blog> getBlogByStutus(boolean status) {
        List<Blog> list = new ArrayList<>();
        String sql = "select * from [Blog] where statusBlogID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setBoolean(1, status);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Blog U = new Blog();
                U.setBlogID(rs.getInt(1));
                U.setUserID(rs.getInt(2));
                U.setTitle(rs.getString(3));
                U.setContent(rs.getString(4));
                U.setImage(rs.getString(5));
                U.setAuthor(rs.getString(6));
                U.setCreateDate(rs.getString(7));
                U.setStatusBlogID(rs.getBoolean(8));
                U.setCateBlogID(new CategoryBlog(rs.getInt(9), ""));                
                list.add(U);
            }
            st.close();
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return list;
    }
    
    public List<Blog> getBlogByID(int id) {
        List<Blog> list = new ArrayList<>();
        String sql = "select * from [Blog] where BlogID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Blog U = new Blog();
                U.setBlogID(rs.getInt(1));
                U.setUserID(rs.getInt(2));
                U.setTitle(rs.getString(3));
                U.setContent(rs.getString(4));
                U.setImage(rs.getString(5));
                U.setAuthor(rs.getString(6));
                U.setCreateDate(rs.getString(7));
                U.setStatusBlogID(rs.getBoolean(8));
                U.setCateBlogID(new CategoryBlog(rs.getInt(9), ""));                
                list.add(U);
            }
            st.close();
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return list;
    }
    
    public void update(Blog p){
        String sql = "update [Blog] set blogTitle = ?, blogContent= ?, blogImg=?, authorName=?, createDate=?,statusBlogID = ?, "
                + "cateBlogID = ? where blogID= ?"; 
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, p.getTitle());
            st.setString(2, p.getContent());
            st.setString(3, p.getImage());
            st.setString(4, p.getAuthor());
            st.setString(5, p.getCreateDate());
            st.setBoolean(6, p.isStatusBlogID());
            st.setInt(7, p.getCateBlogID().getCateBlogID());
            st.setInt(8, p.getBlogID());
            st.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void insert(Blog p){
        String sql = "insert into [Blog] values(?,?,?,?,?,?,?,?)"; 
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, p.getUserID());
            st.setString(2, p.getTitle());
            st.setString(3, p.getContent());
            st.setString(4, p.getImage());
            st.setString(5, p.getAuthor());
            st.setString(6, p.getCreateDate());
            st.setBoolean(7, p.isStatusBlogID());
            st.setInt(8, p.getCateBlogID().getCateBlogID());
            st.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public List<CategoryBlog> getAllCateBlog(){
        List<CategoryBlog> list = new ArrayList<>();
        String sql = "select * from [CategoryBlog]";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                CategoryBlog U = new CategoryBlog();
                U.setCateBlogID(rs.getInt(1));
                U.setCateBlogName(rs.getString(2));                 
                list.add(U);
            }
            st.close();
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return list;
    }
    
    public List<Blog> filter(String status, String cate) {
        List<Blog> list = new ArrayList<>();
        String sql = "select * from [Blog]";
        String s1 = " where statusBlogID = ?";
        String s2 = " cateBlogID = ?";
        int xx = 0;
        if (!status.equals("-1")) {
            sql += s1;
            xx++;
        }
        if (!cate.equals("-1")) {
            if (xx == 1) sql = sql + " and" + s2;
            else sql = sql + " where" + s2;
        }
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            int co = 1;
            if (!status.equals("-1")) {
                if (status.equals("1")) st.setBoolean(co, true);
                    else st.setBoolean(co, false);
                co++;
            } 
            if (!cate.equals("-1")) {
                int xcate = Integer.parseInt(cate);
                st.setInt(co, xcate); 
            } 
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Blog U = new Blog();
                U.setBlogID(rs.getInt(1));
                U.setUserID(rs.getInt(2));
                U.setTitle(rs.getString(3));
                U.setContent(rs.getString(4));
                U.setImage(rs.getString(5));
                U.setAuthor(rs.getString(6));
                U.setCreateDate(rs.getString(7));
                U.setStatusBlogID(rs.getBoolean(8));
                U.setCateBlogID(new CategoryBlog(rs.getInt(9), ""));                
                list.add(U);
            }
            st.close();
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return list;
    }
    
    public static void main(String[] args) {
        MKTDAO mkt = new MKTDAO();
        //List<Blog> lst = mkt.getAllBlog();
        //List<Blog> lst = mkt.getBlogByTitle("Actuary");
        //List<Blog> lst = mkt.getBlogByStutus(true);
//        List<Blog> lst = mkt.getBlogByAuthor("a");
//        List<Blog> lst = mkt.getBlogByID(10);
        List<Blog> lst = mkt.filter("1", "4");
//        System.out.println(lst.size());
        for (Blog blog : lst) {
            System.out.println(blog.toString());
        }
//        Blog u; 
//        u = new Blog(1,15,"Actuary", 
//                "magna vestibulum aliquet ultrices erat tortor sollicitudin "
//                        + "mi sit amet lobortis sapien sapien non mi integer ac neque duis bibendum",
//                "blog3.jpg", "Donggg" , "2021-12-21", true, new CategoryBlog(4,"")
//        );
////        mkt.update(u);
//        mkt.insert(u);
            
    }
    
}
