<!-- 
THEME: Aviato | E-commerce template
VERSION: 1.0.0
AUTHOR: Themefisher

HOMEPAGE: https://themefisher.com/products/aviato-e-commerce-template/
DEMO: https://demo.themefisher.com/aviato/
GITHUB: https://github.com/themefisher/Aviato-E-Commerce-Template/

WEBSITE: https://themefisher.com
TWITTER: https://twitter.com/themefisher
FACEBOOK: https://www.facebook.com/themefisher
-->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<!DOCTYPE html>
<html lang="en">
    <head>

        <!-- Basic Page Needs
        ================================================== -->
        <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
        <meta charset="utf-8">
        <title>List User</title>

        <!-- Mobile Specific Metas
        ================================================== -->
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="Construction Html5 Template">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=5.0">
        <meta name="author" content="Themefisher">
        <meta name="generator" content="Themefisher Constra HTML Template v1.0">

        <!-- Favicon -->
        <link rel="shortcut icon" type="image/x-icon" href="images/favicon.png" />

        <!-- Themefisher Icon font -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/themefisher-font/style.css">
        <!--<link rel="stylesheet" href="">-->
        <!-- bootstrap.min css -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">

        <!-- Animate css -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/animate/animate.css">
        <!-- Slick Carousel -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/slick/slick.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/slick/slick-theme.css">

        <!-- Main Stylesheet -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

    </head>

    <body id="body">
        <!-- Start Top Header Bar -->
        <section class="top-header">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 col-xs-12 col-sm-4">
                        <div class="contact-number">
                            <i class="tf-ion-ios-telephone"></i>
                            <span>0129- 12323-123123</span>
                        </div>
                    </div>
                    <div class="col-md-4 col-xs-12 col-sm-4">
                        <!-- Site Logo -->
                        <div class="logo text-center">
                            <a href="index.html">
                                <!-- replace logo here -->
                                <svg width="135px" height="29px" viewBox="0 0 155 29" version="1.1" xmlns="http://www.w3.org/2000/svg"
                                     xmlns:xlink="http://www.w3.org/1999/xlink">
                                <g id="Page-1" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" font-size="40"
                                   font-family="AustinBold, Austin" font-weight="bold">
                                <g id="Group" transform="translate(-108.000000, -297.000000)" fill="#000000">
                                <text id="AVIATO">
                                <tspan x="108.94" y="325">AVIATO</tspan>
                                </text>
                                </g>
                                </g>
                                </svg>
                            </a>
                        </div>
                    </div>
                    <div class="col-md-4 col-xs-12 col-sm-4">
                        <!-- Cart -->
                        <ul class="top-menu text-right list-inline">
                            <li class="dropdown cart-nav dropdown-slide">
                                <a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown"><i
                                        class="tf-ion-android-cart"></i>Cart</a>
                                <div class="dropdown-menu cart-dropdown">
                                    <!-- Cart Item -->
                                    <div class="media">
                                        <a class="pull-left" href="#!">
                                            <img class="media-object" src="images/shop/cart/cart-1.jpg" alt="image" />
                                        </a>
                                        <div class="media-body">
                                            <h4 class="media-heading"><a href="#!">Ladies Bag</a></h4>
                                            <div class="cart-price">
                                                <span>1 x</span>
                                                <span>1250.00</span>
                                            </div>
                                            <h5><strong>$1200</strong></h5>
                                        </div>
                                        <a href="#!" class="remove"><i class="tf-ion-close"></i></a>
                                    </div><!-- / Cart Item -->
                                    <!-- Cart Item -->
                                    <div class="media">
                                        <a class="pull-left" href="#!">
                                            <img class="media-object" src="images/shop/cart/cart-2.jpg" alt="image" />
                                        </a>
                                        <div class="media-body">
                                            <h4 class="media-heading"><a href="#!">Ladies Bag</a></h4>
                                            <div class="cart-price">
                                                <span>1 x</span>
                                                <span>1250.00</span>
                                            </div>
                                            <h5><strong>$1200</strong></h5>
                                        </div>
                                        <a href="#!" class="remove"><i class="tf-ion-close"></i></a>
                                    </div><!-- / Cart Item -->

                                    <div class="cart-summary">
                                        <span>Total</span>
                                        <span class="total-price">$1799.00</span>
                                    </div>
                                    <ul class="text-center cart-buttons">
                                        <li><a href="cart.html" class="btn btn-small">View Cart</a></li>
                                        <li><a href="checkout.html" class="btn btn-small btn-solid-border">Checkout</a></li>
                                    </ul>
                                </div>

                            </li><!-- / Cart -->

                            <!-- Search -->
                            <li class="dropdown search dropdown-slide">
                                <a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown"><i
                                        class="tf-ion-ios-search-strong"></i> Search</a>
                                <ul class="dropdown-menu search-dropdown">
                                    <li>
                                        <form action="post"><input type="search" class="form-control" placeholder="Search..."></form>
                                    </li>
                                </ul>
                            </li><!-- / Search -->

                            <!-- Languages -->
                            <li class="commonSelect">
                                <select class="form-control">
                                    <option>EN</option>
                                    <option>DE</option>
                                    <option>FR</option>
                                    <option>ES</option>
                                </select>
                            </li><!-- / Languages -->

                        </ul><!-- / .nav .navbar-nav .navbar-right -->
                    </div>
                </div>
            </div>
        </section><!-- End Top Header Bar -->
        <!-- Main Menu Section -->
        <section class="menu">
            <nav class="navbar navigation">
                <div class="container">
                    <div class="navbar-header">
                        <h2 class="menu-title">Main Menu</h2>
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                                aria-expanded="false" aria-controls="navbar">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>

                    </div><!-- / .navbar-header -->

                    <!-- Navbar Links -->
                    <div id="navbar" class="navbar-collapse collapse text-center">
                        <ul class="nav navbar-nav">

                            <!-- Home -->
                            <li class="dropdown ">
                                <a href="index.html">Home</a>
                            </li><!-- / Home -->


                            <!-- Elements -->
                            <li class="dropdown dropdown-slide">
                                <a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="350"
                                   role="button" aria-haspopup="true" aria-expanded="false">Shop <span
                                        class="tf-ion-ios-arrow-down"></span></a>
                                <div class="dropdown-menu">
                                    <div class="row">
                                        <!-- Basic -->
                                        <div class="col-lg-6 col-md-6 mb-sm-3">
                                            <ul>
                                                <li class="dropdown-header">Pages</li>
                                                <li role="separator" class="divider"></li>
                                                <li><a href="shop.html">Shop</a></li>
                                                <li><a href="checkout.html">Checkout</a></li>
                                                <li><a href="cart.html">Cart</a></li>
                                                <li><a href="pricing.html">Pricing</a></li>
                                                <li><a href="confirmation.html">Confirmation</a></li>
                                            </ul>
                                        </div>
                                        <!-- Layout -->
                                        <div class="col-lg-6 col-md-6 mb-sm-3">
                                            <ul>
                                                <li class="dropdown-header">Layout</li>
                                                <li role="separator" class="divider"></li>
                                                <li><a href="product-single.html">Product Details</a></li>
                                                <li><a href="shop-sidebar.html">Shop With Sidebar</a></li>
                                            </ul>
                                        </div>

                                    </div><!-- / .row -->
                                </div><!-- / .dropdown-menu -->
                            </li><!-- / Elements -->


                            <!-- Pages -->
                            <li class="dropdown full-width dropdown-slide">
                                <a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="350"
                                   role="button" aria-haspopup="true" aria-expanded="false">Pages <span
                                        class="tf-ion-ios-arrow-down"></span></a>
                                <div class="dropdown-menu">
                                    <div class="row">

                                        <!-- Introduction -->
                                        <div class="col-sm-3 col-xs-12">
                                            <ul>
                                                <li class="dropdown-header">Introduction</li>
                                                <li role="separator" class="divider"></li>
                                                <li><a href="contact.html">Contact Us</a></li>
                                                <li><a href="about.html">About Us</a></li>
                                                <li><a href="404.html">404 Page</a></li>
                                                <li><a href="coming-soon.html">Coming Soon</a></li>
                                                <li><a href="faq.html">FAQ</a></li>
                                            </ul>
                                        </div>

                                        <!-- Contact -->
                                        <div class="col-sm-3 col-xs-12">
                                            <ul>
                                                <li class="dropdown-header">Dashboard</li>
                                                <li role="separator" class="divider"></li>
                                                <li><a href="dashboard.html">User Interface</a></li>
                                                <li><a href="order.html">Orders</a></li>
                                                <li><a href="address.html">Address</a></li>
                                                <li><a href="addUser.html">Profile Details</a></li>
                                            </ul>
                                        </div>

                                        <!-- Utility -->
                                        <div class="col-sm-3 col-xs-12">
                                            <ul>
                                                <li class="dropdown-header">Utility</li>
                                                <li role="separator" class="divider"></li>
                                                <li><a href="verifyAddUser.html">Login Page</a></li>
                                                <li><a href="signin.html">Signin Page</a></li>
                                                <li><a href="forget-password.html">Forget Password</a></li>
                                            </ul>
                                        </div>

                                        <!-- Mega Menu -->
                                        <div class="col-sm-3 col-xs-12">
                                            <a href="shop.html">
                                                <img class="img-responsive" src="images/shop/header-img.jpg" alt="menu image" />
                                            </a>
                                        </div>
                                    </div><!-- / .row -->
                                </div><!-- / .dropdown-menu -->
                            </li><!-- / Pages -->



                            <!-- Blog -->
                            <li class="dropdown dropdown-slide">
                                <a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="350"
                                   role="button" aria-haspopup="true" aria-expanded="false">Blog <span
                                        class="tf-ion-ios-arrow-down"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="blog-left-sidebar.html">Blog Left Sidebar</a></li>
                                    <li><a href="blog-right-sidebar.html">Blog Right Sidebar</a></li>
                                    <li><a href="blog-full-width.html">Blog Full Width</a></li>
                                    <li><a href="blog-grid.html">Blog 2 Columns</a></li>
                                    <li><a href="blog-single.html">Blog Single</a></li>
                                </ul>
                            </li><!-- / Blog -->

                            <!-- Shop -->
                            <li class="dropdown dropdown-slide">
                                <a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="350"
                                   role="button" aria-haspopup="true" aria-expanded="false">Elements <span
                                        class="tf-ion-ios-arrow-down"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="typography.html">Typography</a></li>
                                    <li><a href="buttons.html">Buttons</a></li>
                                    <li><a href="alerts.html">Alerts</a></li>
                                </ul>
                            </li><!-- / Blog -->

                            <li class="dropdown dropdown-slide">
                                <a  class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="350"
                                    role="button" aria-haspopup="true" aria-expanded="false">Management <span
                                        class="tf-ion-ios-arrow-down"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="listuser">List User</a></li>
                                    <li><a href="AdminDashboard">Statistic Shop</a></li>
                                </ul>
                            </li>
                        </ul><!-- / .nav .navbar-nav -->

                    </div>
                    <!--/.navbar-collapse -->
                </div><!-- / .container -->
            </nav>
        </section>
        <section class="page-header">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="content">
                            <h1 class="page-name">List of User</h1>
                            <ol class="breadcrumb">
                                <li><a href="index.html">Home</a></li>
                                <li class="active"><a class ="active" href="listuser">List User</a></li>
                            </ol>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <form action="listuser" style="text-align: center">
            <c:if test="${key!=null}">
                <div style="padding: 10px 20%;text-align: center;background-color: beige;"><input style="width: 80%" type="text" name="key" value="${key}" placeholder="Find"></input><button>Find</button></div>
                    </c:if>
                    <c:if test="${key==null}">
                <div style="padding: 10px 20%;text-align: center;background-color: beige;"><input style="width: 80%" type="text" name="key" placeholder="Find"></input><button>Find</button></div>
                    </c:if>
            <div>
                <span>
                    Gender
                    <select name="gender">
                        <option value="-1">All</option>
                        <option ${1==requestScope.gender? "selected" : "" } value="1">Male</option>
                        <option ${0==requestScope.gender? "selected" : "" } value="0">Female</option>-->
                    </select>
                </span>
                <span>
                    Role
                    <select name="roleName">
                        <option value="-1">All</option>
                        <c:forEach items="${requestScope.listRole}" var="r">
                            <option ${r.roleID==requestScope.roleName? "selected" : "" } value="${r.roleID}">${r.roleName}</option>
                        </c:forEach>
                    </select>                    
                </span>
                <span>
                    Status
                    <select name="status">
                        <option  value="-1">All</option>
                        <option ${1==requestScope.status? "selected" : "" }  value="1">Active</option>
                        <option ${2==requestScope.status? "selected" : "" } value="2" >Not active</option>
                    </select>
                </span>
                <span>Sort User </span>
                <select name="upOrDown">
                    <option value="1" >Ascending</option>
                    <option value="2">Descending</option>           
                </select>
                <button>Apply</button>
            </div>
        </form>           
        <div class="page-wrapper">
            <div class="cart shopping">
                <form action="listuser" method="get">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-8 col-md-offset-2">
                                <div class="block">
                                    <div class="product-list">

                                        <table class="table">
                                            <thead>
                                                <tr>

                                                    <th class="">User ID</th>
                                                    <th class="">User Name</th>
                                                    <th class="">Contact</th>
                                                    <th class="">Role</th>
                                                    <th class="">Gender</th>
                                                    <th class="">Status</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach begin="0" items="${requestScope.listUser}" var="a">
                                                    <tr class="">  
                                                        <td class="">
                                                            <div class="product-info">                                                              
                                                                <h4 style="font-weight: 720">${a.id}</h4>
                                                            </div>
                                                        </td>
                                                        <td class=""><a href="adminedituser?id=${a.id}" style="color: #269abc">${a.name}</a</td>
                                                        <td class="">
                                                            <div>${a.email}</div>
                                                            <div>${a.phone}</div>
                                                        </td>
                                                        <td>
                                                            <div>${a.role.roleName}</div>
                                                        </td>                                                                                                                           
                                                        <c:if test="${a.gender==true}">
                                                            <td class="">Male</td>
                                                        </c:if>
                                                        <c:if test="${a.gender==false}">
                                                            <td class="">Female</td>
                                                        </c:if>
                                                        <c:if test="${a.ustatusId==1}">
                                                            <td class="" style="color: red">Active</td>                                                      
                                                        </c:if>
                                                        <c:if test="${a.ustatusId==2}">
                                                            <td class="" style="color: red">Not Active</td>                                                      
                                                        </c:if>
                                                    </tr>
                                                </c:forEach>  
                                            </tbody>
                                        </table>                                       
                                        <a href="adduser" class="btn btn-main pull-right">Add User</a>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                    <div class="cuaTao" style="text-align: center;">
                        <c:forEach begin="1" end="${requestScope.totalPage}" var="i">
                            <a href="listuser?page=${i}&gender=${requestScope.gender}&roleName=${requestScope.roleName}&status=${requestScope.status}&upOrDown=${upOrDown}" style="padding: 0 5px;background-color: #31b0d5">${i}</a>
                        </c:forEach>
                    </div>
                </form>
            </div>
        </div>
    </div>


    <footer class="footer section text-center">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <ul class="social-media">
                        <li>
                            <a href="https://www.facebook.com/themefisher">
                                <i class="tf-ion-social-facebook"></i>
                            </a>
                        </li>
                        <li>
                            <a href="https://www.instagram.com/themefisher">
                                <i class="tf-ion-social-instagram"></i>
                            </a>
                        </li>
                        <li>
                            <a href="https://www.twitter.com/themefisher">
                                <i class="tf-ion-social-twitter"></i>
                            </a>
                        </li>
                        <li>
                            <a href="https://www.pinterest.com/themefisher/">
                                <i class="tf-ion-social-pinterest"></i>
                            </a>
                        </li>
                    </ul>
                    <ul class="footer-menu text-uppercase">
                        <li>
                            <a href="contact.html">CONTACT</a>
                        </li>
                        <li>
                            <a href="shop.html">SHOP</a>
                        </li>
                        <li>
                            <a href="pricing.html">Pricing</a>
                        </li>
                        <li>
                            <a href="contact.html">PRIVACY POLICY</a>
                        </li>
                    </ul>
                    <p class="copyright-text">Copyright &copy;2021, Designed &amp; Developed by <a href="https://themefisher.com/">Themefisher</a></p>
                </div>
            </div>
        </div>
    </footer>

    <!-- 
    Essential Scripts
    =====================================-->

    <!-- Main jQuery -->
    <script src="${pageContext.request.contextPath}/plugins/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap 3.1 -->
    <script src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
    <!-- Bootstrap Touchpin -->
    <script src="${pageContext.request.contextPath}/plugins/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.js"></script>
    <!-- Instagram Feed Js -->
    <script src="${pageContext.request.contextPath}/plugins/instafeed/instafeed.min.js"></script>
    <!-- Video Lightbox Plugin -->
    <script src="${pageContext.request.contextPath}/plugins/ekko-lightbox/dist/ekko-lightbox.min.js"></script>
    <!-- Count Down Js -->
    <script src="${pageContext.request.contextPath}/plugins/syo-timer/build/jquery.syotimer.min.js"></script>

    <!-- slick Carousel -->
    <script src="${pageContext.request.contextPath}/plugins/slick/slick.min.js"></script>
    <script src="${pageContext.request.contextPath}/plugins/slick/slick-animation.min.js"></script>

    <!-- Google Mapl -->
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCC72vZw-6tGqFyRhhg5CkF2fqfILn2Tsw"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/plugins/google-map/gmap.js"></script>

    <!-- Main Js File -->
    <script src="${pageContext.request.contextPath}/js/script.js"></script>



</body>
</html>