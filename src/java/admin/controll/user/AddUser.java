package admin.controll.user;

import dal.ControllUser;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Role;
import model.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author phung
 */
public class AddUser extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddUser</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddUser at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    boolean checkDate(String x) {
        try {
            Date now = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date cp = df.parse(x);
            if (now.compareTo(cp) > 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("admin/controll_User/addUser.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        ControllUser d = new ControllUser();
        String username = request.getParameter("username");
        if (d.checkUser(username)) {
            String err = "Sorry..username have exist!!Try a gain with another username";
            request.setAttribute("message", err);
            request.getRequestDispatcher("admin/controll_User/addUser.jsp").forward(request, response);
        } else {
            String fullname = request.getParameter("fullname");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String dob = request.getParameter("dob");
            String gender = request.getParameter("gender");
            String role = request.getParameter("role");
            String status = request.getParameter("status");
            String passSendUser = d.getRandom();
            int Role = Integer.parseInt(role);
            int Status = Integer.parseInt(status);
            int Gender = Integer.parseInt(gender);
            Role r = new Role(Role, "");
            if (Gender == 1) {
                User x = new User(1, username, passSendUser, fullname, "avatar-default-icon.png", address, dob, true, email, phone, r, Status);
                d.addUser(x);
                d.sendEmail(x,x.getName(),passSendUser);
            } else {
                User x = new User(1, username, passSendUser, fullname, "avatar-default-icon.png", address, dob, false, email, phone, r, Status);
                d.addUser(x);
                d.sendEmail(x,x.getName(),passSendUser);
            }
            String message = "Add Successfull";
            request.setAttribute("message", message);
            request.getRequestDispatcher("admin/controll_User/addUser.jsp").forward(request, response);
        }
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
