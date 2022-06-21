package org.apache.jsp.salemanage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class saleMNG_005fScreen_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\r\n");
      out.write("        <title>Sale Manager</title>\r\n");
      out.write("        <link\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Roboto:400,700\"\r\n");
      out.write("            />\r\n");
      out.write("        <!-- https://fonts.google.com/specimen/Roboto -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/fontawesome.min.css\" />\r\n");
      out.write("        <!-- https://fontawesome.com/ -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap.min.css\" />\r\n");
      out.write("        <!-- https://getbootstrap.com/ -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/templatemo-style.css\">\r\n");
      out.write("        <!--\r\n");
      out.write("            Product Admin CSS Template\r\n");
      out.write("            https://templatemo.com/tm-524-product-admin\r\n");
      out.write("        -->\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body id=\"reportsPage\">\r\n");
      out.write("        <div class=\"\" id=\"home\">\r\n");
      out.write("            <nav class=\"navbar navbar-expand-xl\">\r\n");
      out.write("                <div class=\"container h-100\">\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\">\r\n");
      out.write("                        <h1 class=\"tm-site-title mb-0\">Sale Manager</h1>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <button\r\n");
      out.write("                        class=\"navbar-toggler ml-auto mr-0\"\r\n");
      out.write("                        type=\"button\"\r\n");
      out.write("                        data-toggle=\"collapse\"\r\n");
      out.write("                        data-target=\"#navbarSupportedContent\"\r\n");
      out.write("                        aria-controls=\"navbarSupportedContent\"\r\n");
      out.write("                        aria-expanded=\"false\"\r\n");
      out.write("                        aria-label=\"Toggle navigation\"\r\n");
      out.write("                        >\r\n");
      out.write("                        <i class=\"fas fa-bars tm-nav-icon\"></i>\r\n");
      out.write("                    </button>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                        <ul class=\"navbar-nav mx-auto h-100\">\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"index.html\">\r\n");
      out.write("                                    <i class=\"fas fa-tachometer-alt\"></i> Dashboard\r\n");
      out.write("                                    <span class=\"sr-only\">(current)</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item dropdown\">\r\n");
      out.write("                                <a\r\n");
      out.write("                                    class=\"nav-link dropdown-toggle\"\r\n");
      out.write("                                    href=\"#\"\r\n");
      out.write("                                    id=\"navbarDropdown\"\r\n");
      out.write("                                    role=\"button\"\r\n");
      out.write("                                    data-toggle=\"dropdown\"\r\n");
      out.write("                                    aria-haspopup=\"true\"\r\n");
      out.write("                                    aria-expanded=\"false\"\r\n");
      out.write("                                    >\r\n");
      out.write("                                    <i class=\"far fa-file-alt\"></i>\r\n");
      out.write("                                    <span> Reports <i class=\"fas fa-angle-down\"></i> </span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Daily Report</a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Weekly Report</a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Yearly Report</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"products.html\">\r\n");
      out.write("                                    <i class=\"fas fa-shopping-cart\"></i> Products\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link active\" href=\"accounts.html\">\r\n");
      out.write("                                    <i class=\"far fa-user\"></i> Accounts\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item dropdown\">\r\n");
      out.write("                                <a\r\n");
      out.write("                                    class=\"nav-link dropdown-toggle\"\r\n");
      out.write("                                    href=\"#\"\r\n");
      out.write("                                    id=\"navbarDropdown\"\r\n");
      out.write("                                    role=\"button\"\r\n");
      out.write("                                    data-toggle=\"dropdown\"\r\n");
      out.write("                                    aria-haspopup=\"true\"\r\n");
      out.write("                                    aria-expanded=\"false\"\r\n");
      out.write("                                    >\r\n");
      out.write("                                    <i class=\"fas fa-cog\"></i>\r\n");
      out.write("                                    <span> Settings <i class=\"fas fa-angle-down\"></i> </span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Profile</a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Billing</a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Customize</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <ul class=\"navbar-nav\">\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link d-block\" href=\"login.html\">\r\n");
      out.write("                                    Admin, <b>Logout</b>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <div class=\"container mt-5\">\r\n");
      out.write("                <div class=\"row tm-content-row\">\r\n");
      out.write("                    <div class=\"col-12 tm-block-col\">\r\n");
      out.write("                        <div class=\"tm-bg-primary-dark tm-block tm-block-h-auto\">\r\n");
      out.write("                            <h2 class=\"tm-block-title\">List of Accounts</h2>\r\n");
      out.write("                            <p class=\"text-white\">Accounts</p>\r\n");
      out.write("                            <select class=\"custom-select\">\r\n");
      out.write("                                <option value=\"0\">Select account</option>\r\n");
      out.write("                                <option value=\"1\">Admin</option>\r\n");
      out.write("                                <option value=\"2\">Editor</option>\r\n");
      out.write("                                <option value=\"3\">Merchant</option>\r\n");
      out.write("                                <option value=\"4\">Customer</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- row -->\r\n");
      out.write("                <div class=\"row tm-content-row\">\r\n");
      out.write("                    <div class=\"tm-block-col tm-col-avatar\">\r\n");
      out.write("                        <div class=\"tm-bg-primary-dark tm-block tm-block-avatar\">\r\n");
      out.write("                            <h2 class=\"tm-block-title\">Change Avatar</h2>\r\n");
      out.write("                            <div class=\"tm-avatar-container\">\r\n");
      out.write("                                <img\r\n");
      out.write("                                    src=\"../images/avater.jpg\"\r\n");
      out.write("                                    alt=\"Avatar\"\r\n");
      out.write("                                    class=\"tm-avatar img-fluid mb-4\"\r\n");
      out.write("                                    />\r\n");
      out.write("                                <a href=\"#\" class=\"tm-avatar-delete-link\">\r\n");
      out.write("                                    <i class=\"far fa-trash-alt tm-product-delete-icon\"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button class=\"btn btn-primary btn-block text-uppercase\">\r\n");
      out.write("                                Upload New Photo\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"tm-block-col tm-col-account-settings\">\r\n");
      out.write("                        <div class=\"tm-bg-primary-dark tm-block tm-block-settings\">\r\n");
      out.write("                            <h2 class=\"tm-block-title\">Account Settings</h2>\r\n");
      out.write("                            <form action=\"userprofile\"  method=\"POST\" class=\"tm-signup-form row\">\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                <div class=\"form-group col-lg-6\">\r\n");
      out.write("                                    <label for=\"name\">Account Name</label>\r\n");
      out.write("                                    <input id=\"name\" name=\"fname\" type=\"text\" class=\"form-control validate\"/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UserTemp.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group col-lg-6\">\r\n");
      out.write("                                    <label for=\"email\">Account Email</label>\r\n");
      out.write("                                    <input id=\"email\" name=\"email\" type=\"email\" class=\"form-control validate\" readonly />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group col-lg-6\">\r\n");
      out.write("                                    <label for=\"password\">Password</label>\r\n");
      out.write("                                    <input id=\"password\" name=\"password\" type=\"password\" class=\"form-control validate\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group col-lg-6\">\r\n");
      out.write("                                    <label for=\"password2\">Re-enter Password</label>\r\n");
      out.write("                                    <input id=\"password2\" name=\"password2\" type=\"password\" class=\"form-control validate\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group col-lg-6\">\r\n");
      out.write("                                    <label for=\"phone\">Phone</label>\r\n");
      out.write("                                    <input id=\"phone\" name=\"phone\" type=\"tel\" class=\"form-control validate\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group col-lg-6\">\r\n");
      out.write("                                    <label for=\"address\">Address</label>\r\n");
      out.write("                                    <input id=\"address\" name=\"address\" type=\"text\" class=\"form-control validate\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group col-lg-6\">\r\n");
      out.write("                                    <label for=\"dob\">Date</label>\r\n");
      out.write("                                    <input id=\"dob\" name=\"dob\" type=\"date\" class=\"form-control validate\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group col-lg-6\">\r\n");
      out.write("                                    <label for=\"gender\">Gender</label>\r\n");
      out.write("                                    <select id=\"gender\" class=\"custom-select\">\r\n");
      out.write("                                        <option value=\"male\" class=\"form-control validate\">Male</option>\r\n");
      out.write("                                        <option value=\"female\" class=\"form-control validate\">Female</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                   \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group col-lg-6\">\r\n");
      out.write("                                    <label class=\"tm-hide-sm\">&nbsp;</label>\r\n");
      out.write("                                    <button type=\"submit\"  class=\"btn btn-primary btn-block text-uppercase\" >\r\n");
      out.write("                                        Update Your Profile\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12\">\r\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary btn-block text-uppercase\" >\r\n");
      out.write("                                        Delete Your Account\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                ");
      out.write("    \r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <footer class=\"tm-footer row tm-mt-small\">\r\n");
      out.write("                    <div class=\"col-12 font-weight-light\">\r\n");
      out.write("                        <p class=\"text-center text-white mb-0 px-4 small\">\r\n");
      out.write("                            Copyright &copy; <b>2018</b> All rights reserved. \r\n");
      out.write("\r\n");
      out.write("                            Design: <a rel=\"nofollow noopener\" href=\"https://templatemo.com\" class=\"tm-footer-link\">Template Mo</a>\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </footer>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("        <!-- https://jquery.com/download/ -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <!-- https://getbootstrap.com/ -->\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<h3>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h3>");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
