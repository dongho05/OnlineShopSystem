<%-- 
    Document   : shop-sidebar
    Created on : May 30, 2022, 9:41:56 AM
    Author     : Long
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aviato | E-commerce template</title>

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
        <link rel="stylesheet" href="plugins/themefisher-font/style.css">
        <!-- bootstrap.min css -->
        <link rel="stylesheet" href="plugins/bootstrap/css/bootstrap.min.css">

        <!-- Animate css -->
        <link rel="stylesheet" href="plugins/animate/animate.css">
        <!-- Slick Carousel -->
        <link rel="stylesheet" href="plugins/slick/slick.css">
        <link rel="stylesheet" href="plugins/slick/slick-theme.css">

        <!-- Main Stylesheet -->
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/projectstyle2.css">

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">

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
                            <a href="home">
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
                        <ul class="top-menu text-right list-inline">
                            <li class="dropdown cart-nav dropdown-slide">
                                <i class="tf-ion-android-cart" style="margin-right: -10px"></i> 
                                <a href="showcart">Cart</a>
                                <c:if test="${sessionScope.user != null}">
                                    <c:if test="${sessionScope.user.role.roleID == 5}">
                                        <div class="dropdown-menu cart-dropdown">

                                            <c:forEach items="${listCart}" var="ca">
                                                <div class="media">
                                                    <a class="pull-left" href="#!">
                                                        <img class="media-object" src="images/shop/products/${ca.product.productImg}" alt="image" />
                                                    </a>
                                                    <div class="media-body">
                                                        <h4 class="media-heading"><a href="#!">${ca.product.productName}</a></h4>
                                                        <div class="cart-price">
                                                            <span>${ca.product.amount} x</span>
                                                            <!--<span>${ca.product.productPrice - ca.product.productPrice*ca.product.discount}</span>-->
                                                            <span>
                                                                <fmt:formatNumber pattern="###.##" value="${ca.product.productPrice - ca.product.productPrice*ca.product.discount}">
                                                                </fmt:formatNumber>
                                                            </span>
                                                        </div>
                                                        <h5><strong>
                                                                <fmt:formatNumber pattern="###.##" value="${ca.product.amount*(ca.product.productPrice - ca.product.productPrice*ca.product.discount)}"></fmt:formatNumber>
                                                                </strong></h5>
                                                        </div>
                                                        <a href="#!" class="remove"><i class="tf-ion-close"></i></a>
                                                    </div>  
                                            </c:forEach>

                                            <div class="cart-summary">
                                                <span data-translate="total">Total</span>
                                                <span class="total-price">
                                                    <fmt:formatNumber pattern="###.##" value="${sum}">
                                                    </fmt:formatNumber>
                                                </span>
                                            </div>
                                            <ul class="text-center cart-buttons">
                                                <li><a href="showcart" class="btn btn-small" data-translate="view_cart">View Cart</a></li>
                                                <li><a href="checkout" class="btn btn-small btn-solid-border" data-translate="checkout">Checkout</a></li>
                                            </ul>
                                        </div>
                                    </c:if>
                                </c:if>
                            </li> 
                            <!--Cart--> 

                            <!-- Search -->
                            <li class="dropdown search dropdown-slide">
                                <i class="tf-ion-ios-search-strong" style="margin-right: -5px"></i><a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-translate="search">Search</a>
                                <ul class="dropdown-menu search-dropdown">
                                    <li>
                                        <form action="post"><input type="search" class="form-control" placeholder="Search..."></form>
                                    </li>
                                </ul>
                            </li><!-- / Search -->

                            <li>
                                <div class="trancolor">
                                    <label>
                                        <input type="checkbox">
                                        <span class="check"></span>
                                    </label>
                                </div>
                            </li>
                            <!-- Languages -->
                            <li>
                                <button onclick="change_lang()">EN/VI</button>
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
                    <!-- Navbar Links -->
                    <div id="navbar" class="menu_title navbar-collapse collapse text-center">
                        <div class="menu_center">
                            <ul class="nav navbar-nav">
                                <!-- Home -->
                                <li class="dropdown ">
                                    <a href="home" data-translate="home">Home</a>
                                </li><!-- / Home -->

                                <!-- Elements -->
                                <li class="dropdown dropdown-slide">                              
                                    <a href="shop-sidebar">Shop</a>
                                </li>

                                <!-- Pages -->
                                

                                <!-- Blog -->
                                <li class="dropdown dropdown-slide">
                                    <a href="blogList" data-translate="blog">Blog</a> 
                                </li><!-- / Blog -->
                                <c:if test="${sessionScope.user == null}">
                                    <li class="dropdown dropdown-slide">
                                        <a href="login" data-translate="login_page">Login</a>
                                    </li>
                                </c:if> 
                                <c:if test="${sessionScope.user != null}">
                                    <li class="dropdown dropdown-slide"> 
                                        <a href="logout" data-translate="logout_page">
                                            ${sessionScope.user.name}
                                            <span class="tf-ion-ios-arrow-down"></span>
                                            <ul  class="dropdown-menu">
                                                <li>
                                                    <a href="viewuser" data-translate="profile">Profile</a>
                                                </li>
                                                <li>
                                                    <a href="myorder" data-translate="my_order">My Order</a>
                                                </li>
                                                <li>
                                                    <a href="change" data-translate="change_pass">Change Pass</a>
                                                </li>
                                                <c:if test="${sessionScope.user.role.roleID == 1}">
                                                    <li>
                                                        <a href="mktDashboard" data-translate="dashboard">MKT Dashboard</a>
                                                    </li>
                                                </c:if>
                                                <li>
                                                    <a href="logout" data-translate="logout_page">Logout</a>
                                                </li>
                                            </ul>
                                        </a>
                                    </li>                                    
                                </c:if>
                            </ul><!-- / .nav .navbar-nav -->
                        </div>
                        <div class="menu_right col-md-2">

                        </div>


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
                            <h1 class="page-name">Shop</h1>
                            <ol class="breadcrumb">
                                <li><a href="home">Home</a></li>
                                <li class="active">shop</li>
                            </ol>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="shop-siderbar-sider product section">
            <div class="container">
                <div class="row">
                    <div class="col-md-2">
                        <div>
                            <form action="shop-sidebar" method="get" class="filter_search_form">
                                <div class="filter_search">
                                    <div class="filter_title">Search</div>
                                    <c:if test="${txt!=null}">
                                        <input type="text" name="txt" placeholder="${txt}">
                                    </c:if>
                                    <c:if test="${txt==null}">
                                        <input type="text" name="txt" placeholder="Search Product">
                                    </c:if>
                                </div>
                            </form>
                        </div>
                        <hr/>
                        <div class="widget product-category"> 
                            <form action="shop-sidebar" method="get" class="filter_search_form">
                                <div class="filter">
                                    <div class="filter_check">
                                        <div class="filter_title"><a>Price</a></div>
                                        <div class="filte_price">
                                            <input type="text" placeholder="From" name="priceF"> - 
                                            <input type="text" placeholder="To" name="priceT">
                                        </div>
                                    </div>
                                    <hr/>
                                    <div class="filter_check">
                                        <div class="filter_title"><a>Order by</a></div>
                                        <div class="filter_option">
                                            <div>
                                                <input type="radio" name="desc">&nbsp; DESC
                                                <br/>
                                                <input type="radio" name="asc">&nbsp; ASC
                                            </div>
                                        </div>
                                    </div>
                                    <hr/>
                                    <div class="filter_check">
                                        <div class="filter_title"><a>Category</a></div>
                                        <div class="filter_option">
                                            <c:forEach begin="0" end="2" items="${requestScope.listC}" var="lc">
                                                <div>
                                                    <input type="radio" value="${lc.cateID}" name="cateID">&nbsp; ${lc.cateName}
                                                </div>
                                            </c:forEach>
                                        </div>
                                    </div>
                                    <hr/>
                                    <div class="filter_check">
                                        <div class="filter_title"><a>Brand</a></div>
                                        <div class="filter_option">
                                            <c:forEach begin="0" end="5" items="${requestScope.listB}" var="lb">
                                                <div>
                                                    <input type="radio" value="${lb.brandID}" name="brandID">&nbsp; ${lb.brandName}
                                                </div>
                                            </c:forEach>
                                        </div>

                                    </div>
                                    <hr/>
                                    <input type="submit" value="FILTER" class="filter_submit">
                                </div>                                
                            </form>
                        </div>      
                    </div>

                    <div class="shop-sidebar col-md-10">
                        <div class="row">
                            <c:forEach items="${listShop}" var="t"> 
                                <div class="col-md-3">
                                    <!--<div class="product-items">-->
                                    <div class="product-thumbs">
                                        <img class="img-responsive" src="images/shop/products/${t.productImg}" alt="product-img" />

                                        <div class="product_name" style="text-overflow: ellipsis; white-space: nowrap; overflow: hidden;min-width: 0 ; font-size: 15px">${t.productName}</div>

                                        <div class="product_des">
                                            <p style="text-overflow: ellipsis; white-space: nowrap; overflow: hidden;min-width: 0 ; font-size: 15px">
                                                
                                            ${t.productDes}
                                            </p>
                                        </div>
                                        <div class="product-price" > 
                                            <div class="price_discount">
                                                <fmt:formatNumber pattern="###.#" value="${t.productPrice - t.productPrice*t.discount}">
                                                </fmt:formatNumber> đ
                                            </div>
                                            <div class="discount">
                                                <span class="discount_1">${t.productPrice} đ</span>&nbsp;
                                                <span class="discount_2">-${t.discount*100}%</span>
                                            </div>   
                                        </div>
                                        <div class="cart_view">
                                            <!--<span class="cart"><a href="addcart?id=${t.productID}">Add to cart</a></span>-->
                                            <span class="view"><a href="detailproduct?productID=${t.productID}">View product</a></span>
                                        </div>
                                    </div>
                                    <!--</div>-->
                                </div>                      
                            </c:forEach>
                        </div>			
                    </div>
                </div>
            </div>
        </section>

        <c:set var="page" value="${requestScope.page}" />
        <div class="next">
            <a><</a>
            <c:forEach begin="1" end="${requestScope.num}" var="i">
                <c:if test="${priceF == null && priceT == null && txt == null && cateID == null && brandID == null && desc == null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}">${i}</a>
                </c:if>     

                <!--txt-->
                <c:if test="${priceF == null && priceT == null && txt != null && cateID == null && brandID == null && desc == null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&txt=${txt}">${i}</a>
                </c:if>

                <!--price-->
                <c:if test="${priceF != null && priceT != null && cateID == null && brandID == null && desc == null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&priceF=${priceF}&priceT=${priceT}">${i}</a>
                </c:if>
                <!--price + desc-->
                <c:if test="${priceF != null && priceT != null && cateID == null && brandID == null && desc != null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&priceF=${priceF}&priceT=${priceT}&desc=${desc}">${i}</a>
                </c:if>  
                <!--price + asc-->
                <c:if test="${priceF != null && priceT != null && cateID == null && brandID == null && desc == null && asc != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&priceF=${priceF}&priceT=${priceT}&asc=${asc}">${i}</a>
                </c:if>
                <!--price + cateID-->
                <c:if test="${priceF != null && priceT != null && cateID != null && brandID == null && desc == null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&priceF=${priceF}&priceT=${priceT}&cateID=${cateID}">${i}</a>
                </c:if>
                <!--price + cateID + desc-->
                <c:if test="${priceF != null && priceT != null && cateID != null && brandID == null && desc != null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&priceF=${priceF}&priceT=${priceT}&cateID=${cateID}&desc=${desc}">${i}</a>
                </c:if>
                <!--price + cateID + asc-->
                <c:if test="${priceF != null && priceT != null && cateID != null && brandID == null && desc == null && asc != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&priceF=${priceF}&priceT=${priceT}&cateID=${cateID}&asc=${asc}">${i}</a>
                </c:if>
                <!--price + brandID-->
                <c:if test="${priceF != null && priceT != null && cateID == null && brandID != null && desc == null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&priceF=${priceF}&priceT=${priceT}&brandID=${brandID}">${i}</a>
                </c:if>
                <!--price + brandID + desc-->
                <c:if test="${priceF != null && priceT != null && cateID == null && brandID != null && desc != null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&priceF=${priceF}&priceT=${priceT}&brandID=${brandID}&desc=${desc}">${i}</a>
                </c:if>
                <!--price + brandID + asc-->
                <c:if test="${priceF != null && priceT != null && cateID == null && brandID != null && desc == null && asc != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&priceF=${priceF}&priceT=${priceT}&brandID=${brandID}&asc=${asc}">${i}</a>
                </c:if>
                <!--price + cateID + brandID-->
                <c:if test="${priceF != null && priceT != null && cateID != null && brandID != null && desc == null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&priceF=${priceF}&priceT=${priceT}&brandID=${brandID}&cateID=${cateID}">${i}</a>
                </c:if>
                <!--price + cateID + brandID + desc-->
                <c:if test="${priceF != null && priceT != null && cateID != null && brandID != null && desc != null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&priceF=${priceF}&priceT=${priceT}&brandID=${brandID}&cateID=${cateID}&desc=${desc}">${i}</a>
                </c:if>
                <!--price + cateID + brandID + asc-->
                <c:if test="${priceF != null && priceT != null && cateID != null && brandID != null && desc == null && asc != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&priceF=${priceF}&priceT=${priceT}&brandID=${brandID}&cateID=${cateID}&asc=${asc}">${i}</a>
                </c:if>

                <!--asc-->
                <c:if test="${priceF == null && priceT == null && cateID == null && brandID == null && desc == null && asc != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&asc=${asc}">${i}</a>
                </c:if>
                <!--asc + cateID-->
                <c:if test="${priceF == null && priceT == null && cateID != null && brandID == null && desc == null && asc != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&asc=${asc}&cateID=${cateID}">${i}</a>
                </c:if>
                <!--asc + brandID-->
                <c:if test="${priceF == null && priceT == null && cateID == null && brandID != null && desc == null && asc != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&asc=${asc}&brandID=${brandID}">${i}</a>
                </c:if>
                <!--asc + brandID + cateID-->
                <c:if test="${priceF == null && priceT == null && cateID != null && brandID != null && desc == null && asc != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&asc=${asc}&cateID=${cateID}&brandID=${brandID}">${i}</a>
                </c:if>

                <!--desc-->
                <c:if test="${priceF == null && priceT == null && cateID == null && brandID == null && desc != null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&desc=${desc}">${i}</a>
                </c:if>
                <!--desc + cateID-->
                <c:if test="${priceF == null && priceT == null && cateID != null && brandID == null && desc != null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&asc=${desc}&cateID=${cateID}">${i}</a>
                </c:if>
                <!--desc + brandID-->
                <c:if test="${priceF == null && priceT == null && cateID == null && brandID != null && desc != null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&asc=${desc}&brandID=${brandID}">${i}</a>
                </c:if>
                <!--desc + brandID + cateID-->
                <c:if test="${priceF == null && priceT == null && cateID != null && brandID != null && desc != null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&asc=${desc}&cateID=${cateID}&brandID=${brandID}">${i}</a>
                </c:if>

                <!--cateID-->
                <c:if test="${priceF == null && priceT == null && cateID != null && brandID == null && desc == null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&cateID=${cateID}">${i}</a>
                </c:if>
                <!--cateID + brandID-->
                <c:if test="${priceF == null && priceT == null && cateID != null && brandID != null && desc == null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&cateID=${cateID}&brandID=${brandID}">${i}</a>
                </c:if>

                <!--brandID-->
                <c:if test="${priceF == null && priceT == null && cateID == null && brandID != null && desc == null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&brandID=${brandID}">${i}</a>
                </c:if>
            </c:forEach>
            <a>></a>
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
                                <a href="contact.jsp">CONTACT</a>
                            </li>
                            <li>
                                <a href="shop">SHOP</a>
                            </li>
                            <li>
                                <a href="pricing.jsp">Pricing</a>
                            </li>
                            <li>
                                <a href="contact.jsp">PRIVACY POLICY</a>
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
        <script src="plugins/jquery/dist/jquery.min.js"></script>
        <!-- Bootstrap 3.1 -->
        <script src="plugins/bootstrap/js/bootstrap.min.js"></script>
        <!-- Bootstrap Touchpin -->
        <script src="plugins/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.js"></script>
        <!-- Instagram Feed Js -->
        <script src="plugins/instafeed/instafeed.min.js"></script>
        <!-- Video Lightbox Plugin -->
        <script src="plugins/ekko-lightbox/dist/ekko-lightbox.min.js"></script>
        <!-- Count Down Js -->
        <script src="plugins/syo-timer/build/jquery.syotimer.min.js"></script>

        <!-- slick Carousel -->
        <script src="plugins/slick/slick.min.js"></script>
        <script src="plugins/slick/slick-animation.min.js"></script>

        <!-- Google Mapl -->
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCC72vZw-6tGqFyRhhg5CkF2fqfILn2Tsw"></script>
        <script type="text/javascript" src="plugins/google-map/gmap.js"></script>

        <!-- Main Js File -->
        <script src="js/script.js"></script>



    </body>
</html>
