/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.product.Brand;
import model.product.Category;
import model.product.Product;

/**
 *
 * @author Long
 */
public class ShopSideBarServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ShopSideBarServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShopSideBarServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Sidebar
        ProductDAO pd = new ProductDAO();
        String cateID_raw = request.getParameter("cateID");
        String brandID_raw = request.getParameter("brandID");
        String priceF_raw = request.getParameter("priceF");
        String priceT_raw = request.getParameter("priceT");
        String asc = request.getParameter("asc");
        String desc = request.getParameter("desc");
       
        //Trường hợp chưa chọn cateID & brandID & txt & sort & price
        if (cateID_raw == null && brandID_raw == null && priceF_raw == null && priceT_raw == null) {
            List<Product> listPS1 = pd.getProductShop();
            int page, size, num;
            int numberpage = 9;
            size = listPS1.size();
            num = (size % 9 == 0 ? (size / 9) : ((size / 9)) + 1);
            String xpage = request.getParameter("page");
            if (xpage == null) {
                page = 1;
            } else {
                page = Integer.parseInt(xpage);
            }
            int start, end;
            start = (page - 1) * numberpage;
            end = Math.min(page * numberpage, size);
            List<Product> listShop1 = pd.getListByPage(listPS1, start, end);
            request.setAttribute("listShop", listShop1);
            List<Category> listC1 = pd.listCate();
            request.setAttribute("listC", listC1);
            List<Brand> listB1 = pd.listBrand();
            request.setAttribute("listB", listB1);
            request.setAttribute("page", page);
            request.setAttribute("num", num);
        }
        
        //Trường hợp chọn cateID và brandID
        else {
            request.setAttribute("cateID", cateID_raw);
            request.setAttribute("brandID", brandID_raw);
            request.setAttribute("priceF", priceF_raw);
            request.setAttribute("priceT", priceT_raw);
            request.setAttribute("desc", desc);
            request.setAttribute("asc", asc);
            List<Product> listPS2 = pd.SideBarProduct(cateID_raw, brandID_raw, priceF_raw, priceT_raw,asc, desc);
            int page, size, num;
            int numberpage = 9;
            size = listPS2.size();
            num = (size % 9 == 0 ? (size / 9) : ((size / 9)) + 1);
            String xpage = request.getParameter("page");
            if (xpage == null) {
                page = 1;
            } else {
                page = Integer.parseInt(xpage);
            }
            int start, end;
            start = (page - 1) * numberpage;
            end = Math.min(page * numberpage, size);
            List<Product> listShop2 = pd.getListByPage(listPS2, start, end);
            request.setAttribute("listShop", listShop2);
            request.setAttribute("cateID", cateID_raw);
            List<Category> listC2 = pd.listCate();
            request.setAttribute("listC", listC2);
            List<Brand> listB2 = pd.listBrand();
            request.setAttribute("listB", listB2);
            request.setAttribute("page", page);
            request.setAttribute("num", num);
        }
        
        //Search
        String txt = request.getParameter("txt");
        if(txt != null){
            List<Product> listSBS = pd.searchSideBarShop(txt);
            int page, numberpage = 9;
            int size = listSBS.size();
            int num = (size % 9 == 0 ? (size / 9) : ((size / 9)) + 1);
            String xpage = request.getParameter("page");
            if (xpage == null) {
                page = 1;
            } else {
                page = Integer.parseInt(xpage);
            }
            int start, end;
            start = (page - 1) * numberpage;
            end = Math.min(page * numberpage, size);
            List<Product> list1 = pd.getListByPage(listSBS, start, end);
            
            request.setAttribute("listShop", list1);
            request.setAttribute("page", page);
            request.setAttribute("num", num);
            request.setAttribute("txt", txt);        
        }
        
        request.getRequestDispatcher("shop-sidebar.jsp").forward(request, response);
        
    }

    private boolean ischeck(int d, int[] id) {
        if (id == null) 
            return false;
        else {
            for (int i = 0; i < id.length; i++) {
                if (id[i] == d) {
                    return true;
                }

            }
        }
        return false;
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
