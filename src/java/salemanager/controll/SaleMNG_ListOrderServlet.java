/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salemanager.controll;

import dal.OrderDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.function.IntPredicate;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.order.Order;
import model.order.OrderState;

/**
 *
 * @author phung
 */
public class SaleMNG_ListOrderServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SaleMNG_ListOrder</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SaleMNG_ListOrder at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        OrderDAO od = new OrderDAO();
        List<OrderState> listOrderState = od.getListOrderState();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //handle id orderState
        String[] getIDState = request.getParameterValues("orderState");
        int orderStateID[] = null;
        if (getIDState != null) {
            orderStateID = new int[getIDState.length];
            for (int i = 0; i < getIDState.length; i++) {
                //transform data string to int
                orderStateID[i] = Integer.parseInt(getIDState[i]);
            }
        }
        boolean[] tid = new boolean[listOrderState.size()];
        for (int i = 0; i < tid.length; i++) {
            if (isCheck(listOrderState.get(i).getStateID(), orderStateID)) {
                tid[i] = true;
            } else {
                tid[i] = false;
            }
        }
//        //handle sort
        int sortCondition = 2;
        if (request.getParameter("sort") != null) {
            sortCondition = Integer.parseInt(request.getParameter("sort"));
        }

        //handle key
        String key = "";
        if (request.getParameter("key") != null) {
            key = request.getParameter("key");
        }
        //handle page
        int pageSize = 10;
        int page = 1;//default
        if (request.getParameter("page") != null) {
            page = Integer.parseInt(request.getParameter("page"));
        }
        //handle fromTo
        String realFrom = "";
        String realTo = "";
        String from_raw = request.getParameter("from");
        String to_raw = request.getParameter("to");
        if ((from_raw == null && to_raw != null) || (from_raw != null && to_raw == null)) {
            request.setAttribute("tid", tid);
            request.setAttribute("listOrderState", listOrderState);
            request.setAttribute("messDate", "Need fill both from date and to date");
            request.getRequestDispatcher("salemanage/saleMNG_listorder.jsp").forward(request, response);
        } else if (checkDate(from_raw, to_raw)) {
            request.setAttribute("tid", tid);
            request.setAttribute("listOrderState", listOrderState);
            request.setAttribute("messDate", "From date must less than To date");
            request.getRequestDispatcher("salemanage/saleMNG_listorder.jsp").forward(request, response);
        } else if (from_raw != null && to_raw != null) {
            int totalOrder = od.getTotalPage(key, realFrom, realTo, orderStateID);
            int totalPage = totalOrder / pageSize;
            if (totalOrder % pageSize != 0 && totalOrder > 10) {
                totalPage += 1;
            } else if (totalOrder <= 10) {
                totalPage = 1;
            }
            List<Order> list = od.getListOrder(key, from_raw, to_raw, orderStateID, sortCondition, page, pageSize);
            request.setAttribute("page", page);
            request.setAttribute("sort", sortCondition);
            request.setAttribute("key", key);
            request.setAttribute("tid", tid);
            request.setAttribute("state", orderStateID);
            request.setAttribute("listOrder", list);
            request.setAttribute("from", from_raw);
            request.setAttribute("to", to_raw);
            request.setAttribute("listOrderState", listOrderState);
            request.setAttribute("totalPage", totalPage);
            request.getRequestDispatcher("salemanage/saleMNG_listorder.jsp").forward(request, response);
        } else {
            int totalOrder = od.getTotalPage(key, realFrom, realTo, orderStateID);
            int totalPage = totalOrder / pageSize;
            if (totalOrder % pageSize != 0 && totalOrder > 10) {
                totalPage += 1;
            } else if (totalOrder <= 10) {
                totalPage = 1;
            }
            List<Order> list = od.getListOrder(key, "", "", orderStateID, sortCondition, page, pageSize);
            request.setAttribute("page", page);
            request.setAttribute("sort", sortCondition);
            request.setAttribute("key", key);
            request.setAttribute("state", orderStateID);
            request.setAttribute("listOrder", list);
            request.setAttribute("from", realFrom);
            request.setAttribute("to", realTo);
            request.setAttribute("tid", tid);
            request.setAttribute("listOrderState", listOrderState);
            request.setAttribute("totalPage", totalPage);
            request.getRequestDispatcher("salemanage/saleMNG_listorder.jsp").forward(request, response);
        }
    }

    boolean checkDate(String x, String y) {
        try {
            Date now = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date cp = df.parse(x);
            Date pc = df.parse(y);
            if (cp.compareTo(pc) > 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    private boolean isCheck(int d, int[] id) {
        if (id == null) {
            return false;
        } else {
            for (int i = 0; i < id.length; i++) {
                if (id[i] == d) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
