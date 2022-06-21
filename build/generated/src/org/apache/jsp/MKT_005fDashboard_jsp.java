package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MKT_005fDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("        <title>Product Admin - Dashboard HTML Template</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:400,700\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("        <!-- https://fonts.google.com/specimen/Roboto -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fontawesome.min.css\">\r\n");
      out.write("        <!-- https://fontawesome.com/ -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <!-- https://getbootstrap.com/ -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/templatemo-style.css\">\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.4/Chart.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.8.0/chart.min.js\" integrity=\"sha512-sW/w8s4RWTdFFSduOTGtk4isV1+190E/GghVffMA9XczdJ2MDzSzLEubKAs5h0wzgSJOQTRYyaz73L3d6RtJSg==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.8.0/chart.js\" integrity=\"sha512-5m2r+g00HDHnhXQDbRLAfZBwPpPCaK+wPLV6lm8VQ+09ilGdHfXV7IVyKPkLOTfi4vTTUVJnz7ELs7cA87/GMA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.8.0/chart.esm.js\" integrity=\"sha512-YM18yiANXJFpbiOZjLzUrK/lNfTiBcwtTLeAntG4B8dJY+NdUDjxfPNGPEMuOdXlT7U/uT+zbIvbQYAEFog+MA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.8.0/chart.esm.min.js\" integrity=\"sha512-yPOQ2pPoQ9JtP0/jDKpXiKyWNCJWT5OI+6r1EqZmTg+afKQOBpy08VYboeq+Tt9kl9/FOCueEhH6cmHN3nAdJA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\r\n");
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
      out.write("                        <h1 class=\"tm-site-title mb-0\">Product Admin</h1>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <button class=\"navbar-toggler ml-auto mr-0\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\r\n");
      out.write("                            aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                        <i class=\"fas fa-bars tm-nav-icon\"></i>\r\n");
      out.write("                    </button>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                        <ul class=\"navbar-nav mx-auto h-100\">\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link active\" href=\"#\">\r\n");
      out.write("                                    <i class=\"fas fa-tachometer-alt\"></i>\r\n");
      out.write("                                    Dashboard\r\n");
      out.write("                                    <span class=\"sr-only\">(current)</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item dropdown\">\r\n");
      out.write("\r\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\r\n");
      out.write("                                   aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                    <i class=\"far fa-file-alt\"></i>\r\n");
      out.write("                                    <span>\r\n");
      out.write("                                        Reports <i class=\"fas fa-angle-down\"></i>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Daily Report</a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Weekly Report</a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Yearly Report</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"products.html\">\r\n");
      out.write("                                    <i class=\"fas fa-shopping-cart\"></i>\r\n");
      out.write("                                    Products\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"accounts.html\">\r\n");
      out.write("                                    <i class=\"far fa-user\"></i>\r\n");
      out.write("                                    Accounts\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item dropdown\">\r\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\r\n");
      out.write("                                   aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                    <i class=\"fas fa-cog\"></i>\r\n");
      out.write("                                    <span>\r\n");
      out.write("                                        Settings <i class=\"fas fa-angle-down\"></i>\r\n");
      out.write("                                    </span>\r\n");
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
      out.write("\r\n");
      out.write("            </nav>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                        <p class=\"text-white mt-5 mb-5\">Welcome back, <b>Admin</b></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- row -->\r\n");
      out.write("                <div class=\"row tm-content-row\">\r\n");
      out.write("                    <div class=\"col-sm-12 col-md-12 col-lg-6 col-xl-6 tm-block-col\">\r\n");
      out.write("                        <div class=\"tm-bg-primary-dark tm-block\">\r\n");
      out.write("                            <h2 class=\"tm-block-title\">Latest Hits</h2>\r\n");
      out.write("                            <canvas id=\"lineChart1\" ></canvas>\r\n");
      out.write("                            <script>\r\n");
      out.write("                                const ctx = document.getElementById('lineChart1').getContext('2d');\r\n");
      out.write("                                const myChart = new Chart(ctx, {\r\n");
      out.write("                                    type: 'bar',\r\n");
      out.write("                                    data: {\r\n");
      out.write("                                        labels: ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday'],\r\n");
      out.write("                                        datasets: [{\r\n");
      out.write("                                                label: '# of Votes',\r\n");
      out.write("                                                data: [12, 19, 3, 5, 2, 3, 9],\r\n");
      out.write("                                                backgroundColor: [\r\n");
      out.write("                                                    'rgba(255, 99, 132, 0.7)',\r\n");
      out.write("                                                    'rgba(54, 162, 235, 0.7)',\r\n");
      out.write("                                                    'rgba(255, 206, 86, 0.7)',\r\n");
      out.write("                                                    'rgba(75, 192, 192, 0.7)',\r\n");
      out.write("                                                    'rgba(153, 102, 255, 0.7)',\r\n");
      out.write("                                                    'rgba(153, 204, 255, 0.7)',\r\n");
      out.write("                                                    'rgba(255, 159, 64, 0.7)'\r\n");
      out.write("                                                ],\r\n");
      out.write("                                                borderColor: [\r\n");
      out.write("                                                    'rgba(255, 99, 132, 1)',\r\n");
      out.write("                                                    'rgba(54, 162, 235, 1)',\r\n");
      out.write("                                                    'rgba(255, 206, 86, 1)',\r\n");
      out.write("                                                    'rgba(75, 192, 192, 1)',\r\n");
      out.write("                                                    'rgba(145, 102, 255, 1)',\r\n");
      out.write("                                                    'rgba(153, 102, 255, 1)',\r\n");
      out.write("                                                    'rgba(255, 159, 64, 1)'\r\n");
      out.write("                                                ],\r\n");
      out.write("                                                borderWidth: 1\r\n");
      out.write("                                            }]\r\n");
      out.write("                                    },\r\n");
      out.write("                                    options: {\r\n");
      out.write("                                        scales: {\r\n");
      out.write("                                            y: {\r\n");
      out.write("                                                beginAtZero: true\r\n");
      out.write("                                            }\r\n");
      out.write("                                        }\r\n");
      out.write("                                    }\r\n");
      out.write("                                });\r\n");
      out.write("                            </script>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-12 col-md-12 col-lg-6 col-xl-6 tm-block-col\">\r\n");
      out.write("                        <div class=\"tm-bg-primary-dark tm-block\">\r\n");
      out.write("                            <h2 class=\"tm-block-title\">Revenue By Day</h2>\r\n");
      out.write("                            <canvas id=\"myChart\" style=\"width:100%;max-width:600px;color: khaki\"></canvas>\r\n");
      out.write("                            <form action=\"mktDashboard\" method=\"post\">\r\n");
      out.write("                                Month<input type=\"number\" name=\"month\" style=\"background-color: #23527c;color: #ffffff\"/>\r\n");
      out.write("                                Year<input type=\"number\" name=\"year\"style=\"background-color: #23527c;color: #ffffff\"/>\r\n");
      out.write("                                From<input type=\"number\" name=\"from\"style=\"background-color: #23527c;color: #ffffff\"/>\r\n");
      out.write("                                To<input type=\"number\" name=\"to\"style=\"background-color: #23527c;color: #ffffff\"/>\r\n");
      out.write("                                <input type=\"submit\" value=\"Filter\"style=\"background-color: #23527c;color: #ffffff\"/>\r\n");
      out.write("                            </form>\r\n");
      out.write("                            <script>\r\n");
      out.write("                                new Chart(\"myChart\", {\r\n");
      out.write("                                    type: \"line\",\r\n");
      out.write("                                    data: {\r\n");
      out.write("                                        labels: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listDay}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(",\r\n");
      out.write("                                        datasets: [{\r\n");
      out.write("                                                fill: false,\r\n");
      out.write("                                                lineTension: 0,\r\n");
      out.write("                                                backgroundColor: \"rgba(255, 99, 132, 0.7)\",\r\n");
      out.write("                                                borderColor: \"rgba(255, 99, 132, 1)\",\r\n");
      out.write("                                                data: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listRevenue}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                            }]\r\n");
      out.write("                                    },\r\n");
      out.write("                                    options: {\r\n");
      out.write("                                        legend: {display: false},\r\n");
      out.write("                                        scales: {\r\n");
      out.write("                                            yAxes: [{ticks: {min: 6, max: 16}}],\r\n");
      out.write("                                        }\r\n");
      out.write("                                    }\r\n");
      out.write("                                });\r\n");
      out.write("                            </script>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("<!--                    <div class=\"col-sm-12 col-md-12 col-lg-6 col-xl-6 tm-block-col\">\r\n");
      out.write("                        <div class=\"tm-bg-primary-dark tm-block tm-block-taller\">\r\n");
      out.write("                            <h2 class=\"tm-block-title\">Storage Information</h2>\r\n");
      out.write("                            <div id=\"pieChartContainer\">\r\n");
      out.write("                                <canvas id=\"pieChart\" class=\"chartjs-render-monitor\" width=\"200\" height=\"200\"></canvas>\r\n");
      out.write("                            </div>                        \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>-->\r\n");
      out.write("                    <!--                    <div class=\"col-sm-12 col-md-12 col-lg-6 col-xl-6 tm-block-col\">\r\n");
      out.write("                                            <div class=\"tm-bg-primary-dark tm-block tm-block-taller tm-block-overflow\">\r\n");
      out.write("                                                <h2 class=\"tm-block-title\">Notification List</h2>\r\n");
      out.write("                                                <div class=\"tm-notification-items\">\r\n");
      out.write("                                                    <div class=\"media tm-notification-item\">\r\n");
      out.write("                                                        <div class=\"tm-gray-circle\"><img src=\"img/notification-01.jpg\" alt=\"Avatar Image\" class=\"rounded-circle\"></div>\r\n");
      out.write("                                                        <div class=\"media-body\">\r\n");
      out.write("                                                            <p class=\"mb-2\"><b>Jessica</b> and <b>6 others</b> sent you new <a href=\"#\"\r\n");
      out.write("                                                                                                                               class=\"tm-notification-link\">product updates</a>. Check new orders.</p>\r\n");
      out.write("                                                            <span class=\"tm-small tm-text-color-secondary\">6h ago.</span>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"media tm-notification-item\">\r\n");
      out.write("                                                        <div class=\"tm-gray-circle\"><img src=\"img/notification-02.jpg\" alt=\"Avatar Image\" class=\"rounded-circle\"></div>\r\n");
      out.write("                                                        <div class=\"media-body\">\r\n");
      out.write("                                                            <p class=\"mb-2\"><b>Oliver Too</b> and <b>6 others</b> sent you existing <a href=\"#\"\r\n");
      out.write("                                                                                                                                       class=\"tm-notification-link\">product updates</a>. Read more reports.</p>\r\n");
      out.write("                                                            <span class=\"tm-small tm-text-color-secondary\">6h ago.</span>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"media tm-notification-item\">\r\n");
      out.write("                                                        <div class=\"tm-gray-circle\"><img src=\"img/notification-03.jpg\" alt=\"Avatar Image\" class=\"rounded-circle\"></div>\r\n");
      out.write("                                                        <div class=\"media-body\">\r\n");
      out.write("                                                            <p class=\"mb-2\"><b>Victoria</b> and <b>6 others</b> sent you <a href=\"#\"\r\n");
      out.write("                                                                                                                            class=\"tm-notification-link\">order updates</a>. Read order information.</p>\r\n");
      out.write("                                                            <span class=\"tm-small tm-text-color-secondary\">6h ago.</span>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"media tm-notification-item\">\r\n");
      out.write("                                                        <div class=\"tm-gray-circle\"><img src=\"img/notification-01.jpg\" alt=\"Avatar Image\" class=\"rounded-circle\"></div>\r\n");
      out.write("                                                        <div class=\"media-body\">\r\n");
      out.write("                                                            <p class=\"mb-2\"><b>Laura Cute</b> and <b>6 others</b> sent you <a href=\"#\"\r\n");
      out.write("                                                                                                                              class=\"tm-notification-link\">product records</a>.</p>\r\n");
      out.write("                                                            <span class=\"tm-small tm-text-color-secondary\">6h ago.</span>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"media tm-notification-item\">\r\n");
      out.write("                                                        <div class=\"tm-gray-circle\"><img src=\"img/notification-02.jpg\" alt=\"Avatar Image\" class=\"rounded-circle\"></div>\r\n");
      out.write("                                                        <div class=\"media-body\">\r\n");
      out.write("                                                            <p class=\"mb-2\"><b>Samantha</b> and <b>6 others</b> sent you <a href=\"#\"\r\n");
      out.write("                                                                                                                            class=\"tm-notification-link\">order stuffs</a>.</p>\r\n");
      out.write("                                                            <span class=\"tm-small tm-text-color-secondary\">6h ago.</span>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"media tm-notification-item\">\r\n");
      out.write("                                                        <div class=\"tm-gray-circle\"><img src=\"img/notification-03.jpg\" alt=\"Avatar Image\" class=\"rounded-circle\"></div>\r\n");
      out.write("                                                        <div class=\"media-body\">\r\n");
      out.write("                                                            <p class=\"mb-2\"><b>Sophie</b> and <b>6 others</b> sent you <a href=\"#\"\r\n");
      out.write("                                                                                                                          class=\"tm-notification-link\">product updates</a>.</p>\r\n");
      out.write("                                                            <span class=\"tm-small tm-text-color-secondary\">6h ago.</span>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"media tm-notification-item\">\r\n");
      out.write("                                                        <div class=\"tm-gray-circle\"><img src=\"img/notification-01.jpg\" alt=\"Avatar Image\" class=\"rounded-circle\"></div>\r\n");
      out.write("                                                        <div class=\"media-body\">\r\n");
      out.write("                                                            <p class=\"mb-2\"><b>Lily A</b> and <b>6 others</b> sent you <a href=\"#\"\r\n");
      out.write("                                                                                                                          class=\"tm-notification-link\">product updates</a>.</p>\r\n");
      out.write("                                                            <span class=\"tm-small tm-text-color-secondary\">6h ago.</span>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"media tm-notification-item\">\r\n");
      out.write("                                                        <div class=\"tm-gray-circle\"><img src=\"img/notification-02.jpg\" alt=\"Avatar Image\" class=\"rounded-circle\"></div>\r\n");
      out.write("                                                        <div class=\"media-body\">\r\n");
      out.write("                                                            <p class=\"mb-2\"><b>Amara</b> and <b>6 others</b> sent you <a href=\"#\"\r\n");
      out.write("                                                                                                                         class=\"tm-notification-link\">product updates</a>.</p>\r\n");
      out.write("                                                            <span class=\"tm-small tm-text-color-secondary\">6h ago.</span>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"media tm-notification-item\">\r\n");
      out.write("                                                        <div class=\"tm-gray-circle\"><img src=\"img/notification-03.jpg\" alt=\"Avatar Image\" class=\"rounded-circle\"></div>\r\n");
      out.write("                                                        <div class=\"media-body\">\r\n");
      out.write("                                                            <p class=\"mb-2\"><b>Cinthela</b> and <b>6 others</b> sent you <a href=\"#\"\r\n");
      out.write("                                                                                                                            class=\"tm-notification-link\">product updates</a>.</p>\r\n");
      out.write("                                                            <span class=\"tm-small tm-text-color-secondary\">6h ago.</span>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>-->\r\n");
      out.write("                    <div class=\"col-12 tm-block-col\">\r\n");
      out.write("                        <div class=\"tm-bg-primary-dark tm-block tm-block-taller tm-block-scroll\">\r\n");
      out.write("                            <h2 class=\"tm-block-title\">Top Customer Buy The Most </h2>\r\n");
      out.write("                            <table class=\"table\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th scope=\"col\">ORDER NO.</th>\r\n");
      out.write("                                        <th scope=\"col\">Avatar</th>\r\n");
      out.write("                                        <th scope=\"col\">Full Name</th>\r\n");
      out.write("                                        <th scope=\"col\">Address</th>\r\n");
      out.write("                                        <th scope=\"col\">Birthday</th>\r\n");
      out.write("                                        <th scope=\"col\">Email</th>\r\n");
      out.write("                                        <th scope=\"col\">Phone Number</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"col-12 tm-block-col\">\r\n");
      out.write("                        <div class=\"tm-bg-primary-dark tm-block tm-block-taller tm-block-scroll\">\r\n");
      out.write("                            <h2 class=\"tm-block-title\">Top Customer Buy The Most </h2>\r\n");
      out.write("                            <table class=\"table\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th scope=\"col\">ORDER NO.</th>\r\n");
      out.write("                                        <th scope=\"col\">Avatar</th>\r\n");
      out.write("                                        <th scope=\"col\">Full Name</th>\r\n");
      out.write("                                        <th scope=\"col\">Address</th>\r\n");
      out.write("                                        <th scope=\"col\">Birthday</th>\r\n");
      out.write("                                        <th scope=\"col\">Email</th>\r\n");
      out.write("                                        <th scope=\"col\">Phone Number</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <footer class=\"tm-footer row tm-mt-small\">\r\n");
      out.write("                <div class=\"col-12 font-weight-light\">\r\n");
      out.write("                    <p class=\"text-center text-white mb-0 px-4 small\">\r\n");
      out.write("                        Copyright &copy; <b>2018</b> All rights reserved. \r\n");
      out.write("\r\n");
      out.write("                        Design: <a rel=\"nofollow noopener\" href=\"https://templatemo.com\" class=\"tm-footer-link\">Template Mo</a>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("<!--        <script src=\"js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("         https://jquery.com/download/ \r\n");
      out.write("        <script src=\"js/moment.min.js\"></script>\r\n");
      out.write("         https://momentjs.com/ \r\n");
      out.write("        <script src=\"js/Chart.min.js\"></script>\r\n");
      out.write("         http://www.chartjs.org/docs/latest/ \r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("         https://getbootstrap.com/ \r\n");
      out.write("        <script src=\"js/tooplate-scripts.js\"></script>-->\r\n");
      out.write("        <!--        <script>\r\n");
      out.write("                                        Chart.defaults.global.defaultFontColor = 'white';\r\n");
      out.write("                                        let ctxLine,\r\n");
      out.write("                                                ctxBar,\r\n");
      out.write("                                                ctxPie,\r\n");
      out.write("                                                optionsLine,\r\n");
      out.write("                                                optionsBar,\r\n");
      out.write("                                                optionsPie,\r\n");
      out.write("                                                configLine,\r\n");
      out.write("                                                configBar,\r\n");
      out.write("                                                configPie,\r\n");
      out.write("                                                lineChart;\r\n");
      out.write("                                        barChart, pieChart;\r\n");
      out.write("                                        // DOM is ready\r\n");
      out.write("                                        $(function () {\r\n");
      out.write("                                            drawLineChart(); // Line Chart\r\n");
      out.write("                                            drawBarChart(); // Bar Chart\r\n");
      out.write("                                            drawPieChart(); // Pie Chart\r\n");
      out.write("        \r\n");
      out.write("                                            $(window).resize(function () {\r\n");
      out.write("                                                updateLineChart();\r\n");
      out.write("                                                updateBarChart();\r\n");
      out.write("                                            });\r\n");
      out.write("                                        })\r\n");
      out.write("                </script>-->\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("i");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listUser}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <tr>\r\n");
          out.write("                                            <th scope=\"row\"><b>#122349</b></th>\r\n");
          out.write("                                            <td><img  src=\"images/img_blog/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.avatar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" width=\"50\" height=\"50\">\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                            <td><b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b></td>\r\n");
          out.write("                                            <td><b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b></td>\r\n");
          out.write("                                            <td><b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b></td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        </tr>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("i");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listUser}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <tr>\r\n");
          out.write("                                            <th scope=\"row\"><b>#122349</b></th>\r\n");
          out.write("                                            <td><img  src=\"images/img_blog/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.avatar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" width=\"50\" height=\"50\">\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                            <td><b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b></td>\r\n");
          out.write("                                            <td><b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b></td>\r\n");
          out.write("                                            <td><b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b></td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        </tr>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
