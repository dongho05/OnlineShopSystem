<%-- 
    Document   : index
    Created on : May 30, 2022, 9:38:02 AM
    Author     : Long
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link rel="stylesheet" href="css/projectstyle.css">
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.js"></script>
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
                        <!-- Cart -->

                        <ul class="top-menu text-right list-inline">
                            <li>
                                <div class="trancolor">
                                    <label>
                                        <input type="checkbox">
                                        <span class="check"></span>
                                    </label>
                                </div>
                            </li>

                            <li class="dropdown cart-nav dropdown-slide">
                                <i class="tf-ion-android-cart" style="margin-right: -10px"></i> <a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-translate="cart">Cart</a>
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
                                        <span data-translate="total">Total</span>
                                        <span class="total-price">$1799.00</span>
                                    </div>
                                    <ul class="text-center cart-buttons">
                                        <li><a href="cart.jsp" class="btn btn-small" data-translate="view_cart">View Cart</a></li>
                                        <li><a href="checkout.jsp" class="btn btn-small btn-solid-border" data-translate="checkout">Checkout</a></li>
                                    </ul>
                                </div>

                            </li><!-- / Cart -->

                            <!-- Search -->
                            <li class="dropdown search dropdown-slide">
                                <i class="tf-ion-ios-search-strong" style="margin-right: -5px"></i><a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-translate="search">Search</a>
                                <ul class="dropdown-menu search-dropdown">
                                    <li>
                                        <form action="post"><input type="search" class="form-control" placeholder="Search..."></form>
                                    </li>
                                </ul>
                            </li><!-- / Search -->

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
                                <a href="home" data-translate="home">Home</a>
                            </li><!-- / Home -->


                            <!-- Elements -->
                            <li class="dropdown dropdown-slide">
                                <a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="350"
                                   role="button" aria-haspopup="true" aria-expanded="false" data-translate="shop">Shop</a> 
                                <!--<spanclass="tf-ion-ios-arrow-down"></span>-->
                                <div class="dropdown-menu">
                                    <div class="row">

                                        <!-- Basic -->
                                        <div class="col-lg-6 col-md-6 mb-sm-3">
                                            <ul>
                                                <li class="dropdown-header" data-translate="pages">Pages</li>
                                                <li role="separator" class="divider"></li>
                                                <li><a href="shop.jsp" data-translate="shop">Shop</a></li>
                                                <li><a href="checkout.jsp" data-translate="checkout">Checkout</a></li>
                                                <li><a href="cart.jsp" data-translate="cart">Cart</a></li>
                                                <li><a href="pricing.jsp" data-translate="pricing">Pricing</a></li>
                                                <li><a href="confirmation.jsp" data-translate="confirmation">Confirmation</a></li>

                                            </ul>
                                        </div>

                                        <!-- Layout -->
                                        <div class="col-lg-6 col-md-6 mb-sm-3">
                                            <ul>
                                                <li class="dropdown-header" data-translate="layout">Layout</li>
                                                <li role="separator" class="divider"></li>
                                                <li><a href="viewuser" data-translate="product_details">Product Details</a></li>
                                                <li><a href="shop-sidebar" data-translate="shop_with_sidebar">Shop With Sidebar</a></li>
                                                <li><a href="myorder" data-translate="my_order">My Order</a></li>

                                            </ul>
                                        </div>
                                    </div><!-- / .row -->
                                </div><!-- / .dropdown-menu -->
                            </li><!-- / Elements -->


                            <!-- Pages -->
                            <li class="dropdown full-width dropdown-slide">
                                <a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="350"
                                   role="button" aria-haspopup="true" aria-expanded="false" data-translate="pages">Pages</a>
                                <!--<span class="tf-ion-ios-arrow-down"></span>-->
                                <div class="dropdown-menu">
                                    <div class="row">

                                        <!-- Introduction -->
                                        <div class="col-sm-3 col-xs-12">
                                            <ul>
                                                <li class="dropdown-header" data-translate="introduction">Introduction</li>
                                                <li role="separator" class="divider"></li>
                                                <li><a href="contact.jsp" data-translate="contact_us">Contact Us</a></li>
                                                <li><a href="about.jsp" data-translate="about_us">About Us</a></li>
                                                <li><a href="404.jsp" data-translate="404_page">404 Page</a></li>
                                                <li><a href="coming-soon.jsp" data-translate="coming_soon">Coming Soon</a></li>
                                                <li><a href="faq.jsp" data-translate="faq">FAQ</a></li>
                                            </ul>
                                        </div>

                                        <!-- Contact -->
                                        <div class="col-sm-3 col-xs-12">
                                            <ul>
                                                <li class="dropdown-header" data-translate="dashboard">Dashboard</li>
                                                <li role="separator" class="divider"></li>
                                                <li><a href="dashboard.jsp" data-translate="user_interface">User Interface</a></li>
                                                <li><a href="order.jsp" data-translate="orders">Orders</a></li>
                                                <li><a href="address.jsp" data-translate="address">Address</a></li>
                                                <li><a href="viewuser" data-translate="profile_details">Profile Details</a></li>
                                            </ul>
                                        </div>

                                        <!-- Utility -->
                                        <div class="col-sm-3 col-xs-12">
                                            <ul>
                                                <li class="dropdown-header" data-translate="utility">Utility</li>
                                                <li role="separator" class="divider"></li>
                                                <li><a href="login.jsp" data-translate="login_page">Login Page</a></li>
                                                <li><a href="signin.jsp" data-translate="signin_page">Signin Page</a></li>
                                                <li><a href="forget-password.jsp" data-translate="forget_password">Forget Password</a></li>
                                            </ul>
                                        </div>

                                        <!-- Mega Menu -->
                                        <div class="col-sm-3 col-xs-12">
                                            <a href="shop.jsp">
                                                <img class="img-responsive" src="images/shop/header-img.jpg" alt="menu image" />
                                            </a>
                                        </div>
                                    </div><!-- / .row -->
                                </div><!-- / .dropdown-menu -->
                            </li><!-- / Pages -->



                            <!-- Blog -->
                            <li class="dropdown dropdown-slide">
                                <a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="350"
                                   role="button" aria-haspopup="true" aria-expanded="false" data-translate="blog">Blog</a> 
                                <!--<span class="tf-ion-ios-arrow-down"></span>-->
                                <ul class="dropdown-menu">
                                    <li><a href="blog-left-sidebar.jsp" data-translate="blog_left_sidebar">Blog Left Sidebar</a></li>
                                    <li><a href="blog-right-sidebar.jsp" data-translate="blog_right_sidebar">Blog Right Sidebar</a></li>
                                    <li><a href="blog-full-width.jsp" data-translate="blog_full_width">Blog Full Width</a></li>
                                    <li><a href="blog-grid.jsp" data-translate="blog_2_columns">Blog 2 Columns</a></li>
                                    <li><a href="blog-single.jsp" data-translate="blog_single">Blog Single</a></li>
                                </ul>
                            </li><!-- / Blog -->

                            <!-- Shop -->
                            <li class="dropdown dropdown-slide">
                                <a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="350"
                                   role="button" aria-haspopup="true" aria-expanded="false"data-translate="elements">Elements</a>
                                <!--<span class="tf-ion-ios-arrow-down"></span>-->
                                <ul class="dropdown-menu">
                                    <li><a href="typography.jsp" data-translate="typography">Typography</a></li>
                                    <li><a href="buttons.jsp" data-translate="buttons">Buttons</a></li>
                                    <li><a href="alerts.jsp" data-translate="alerts">Alerts</a></li>
                                </ul>
                            </li><!-- / Blog -->
                            <li class="dropdown dropdown-slide">
                                <a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="350"
                                   role="button" aria-haspopup="true" aria-expanded="false"data-translate="manage">Manage</a>
                            </li>
                        </ul><!-- / .nav .navbar-nav -->

                    </div>
                    <!--/.navbar-collapse -->
                </div><!-- / .container -->
            </nav>
        </section>

        <div class="hero-slider">
            <div class="slider-item th-fullpage hero-area" style="background-image: url(images/slider/slider-4.jpg);">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 text-center">
                            <p data-duration-in=".3" data-animation-in="fadeInUp" data-delay-in=".1"  data-translate="products">PRODUCTS</p>
                            <h1 data-duration-in=".3" data-animation-in="fadeInUp" data-delay-in=".5" data-translate="nice_model">Nice model sports shoes</h1>
                            <a data-duration-in=".3" data-animation-in="fadeInUp" data-delay-in=".8" class="btn" href="shop.jsp" data-translate="shop_now">Shop Now</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="slider-item th-fullpage hero-area" style="background-image: url(images/slider/slider-5.jpg);">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 text-left">
                            <p data-duration-in=".3" data-animation-in="fadeInUp" data-delay-in=".1" data-translate="new_news">NEW NEWS</p>
                            <h1 data-duration-in=".3" data-animation-in="fadeInUp" data-delay-in=".5" data-translate="how_to">How To Wear Bright Shoes</h1>
                            <a data-duration-in=".3" data-animation-in="fadeInUp" data-delay-in=".8" class="btn" href="blog-right-sidebar.jsp" data-translate="watch_now">Watch Now</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="slider-item th-fullpage hero-area" style="background-image: url(images/slider/slider-6.jpg);">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 text-right">
                            <p data-duration-in=".3" data-animation-in="fadeInUp" data-delay-in=".1" data-translate="products">PRODUCTS</p>
                            <h1 data-duration-in=".3" data-animation-in="fadeInUp" data-delay-in=".5" data-translate="the_beauty">The beauty of nature <br> is hidden in details.</h1>
                            <a data-duration-in=".3" data-animation-in="fadeInUp" data-delay-in=".8" class="btn" href="shop.jsp" data-translate="shop_now">Shop Now</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <section class="product-category section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="title text-center" data-translate="product_category">
                            <h2>Product Category</h2>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="category-box">
                            <a href="#!">
                                <img src="images/shop/category/category-4.jpg" alt="" />
                                <div class="content">
                                    <h3>Sport Shoes</h3>
                                    <p>Shop New Season Shoes</p>
                                </div>
                            </a>	
                        </div>
                        <div class="category-box">
                            <a href="#!">
                                <img src="images/shop/category/category-5.jpg" alt="" />
                                <div class="content">
                                    <h3>Fashion Shoes</h3>
                                    <p>Get Wide Range Selection</p>
                                </div>
                            </a>	
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="category-box category-box-2">
                            <a href="#!">
                                <img src="images/shop/category/category-6.jpg" alt="" />
                                <div class="content">
                                    <h3>Soccer Shoes</h3>
                                    <p>Special Design Comes First</p>
                                </div>
                            </a>	
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="products section bg-gray">
            <div class="container">
                <div class="row">
                    <div class="title text-center" data-translate="trendy_products">
                        <h2>Trendy Products</h2>
                    </div>
                </div>
                <div class="row">
                    <c:forEach items="${listT}" var="t"> 

                        <div class="col-md-4">
                            <div class="product-item">
                                <div class="product-thumb">
                                    <span class="bage" data-translate="hot">Hot</span>
                                    <img style="width: 400px;height: 400px" class="img-responsive" src="images/shop/products/${t.productImg}.jpg" alt="product-img" />
                                    <div class="preview-meta">
                                        <!--<div class="modal-dialog" role="document">-->
                                        <div class="modal-content">
                                            <div class="modal-body">
                                                <div class="row">
                                                    <!--<div class="col-md-8 col-sm-6 col-xs-6">-->
                                                    <div class="img_short">
                                                        <div class="modal-image">
                                                            <img class="img-responsive" src="images/shop/products/${t.productImg}.jpg" alt="product-img" />
                                                        </div>
                                                    </div>
                                                    <!--<div class="col-md-4 col-sm-6 col-xs-12">-->
                                                    <div class="product_short">
                                                        <div class="product-short-details">
                                                            <h2 class="product-title">${t.productName}</h2>
                                                            <p class="product-price" >
                                                                Price: $${t.productPrice}
                                                            </p>    
                                                            <p class="product-short-description">${t.productDes} </p>
                                                            <a href="cart.jsp" class="btn btn-main" data-translate="add_to_cart">Add To Cart</a><br/><br/>
                                                            <a href="detailproduct?productID=${t.productID}" class="btn btn-transparent" data-translate="view_product_details">View Product Details</a>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <!--</div>--> 
                                        <ul>
                                            <li>
                                                <a href="#!" ><i class="tf-ion-ios-heart"></i></a>
                                            </li>
                                            <li>
                                                <a href="#!"><i class="tf-ion-android-cart"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="product-content">
                                    <h4><a href="product-single.jsp">${t.productName}</a></h4>

                                </div>
                            </div>
                        </div>                      
                    </c:forEach>
                </div>
            </div>
        </section>


        <!--
        Start Call To Action
        ==================================== -->
        <section class="call-to-action bg-gray section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 text-center">
                        <div class="title">
                            <h2 data-translate="subscribe_to">SUBSCRIBE TO NEWSLETTER</h2>
                            <p data-translate="the_shop_products">The shop's products are very good, the color and quality of 
                                the products are excellent beyond criticism.<br/> Hope the shop will grow stronger.</p>
                        </div>
                        <div class="col-lg-6 col-md-offset-3">
                            <div class="input-group subscription-form">
                                <input type="text" class="form-control" placeholder="Enter Your Email Address">
                                <span class="input-group-btn">
                                    <button class="btn btn-main" type="button" data-translate="subscribe_now">Subscribe Now!</button>
                                </span>
                            </div><!-- /input-group -->
                        </div><!-- /.col-lg-6 -->

                    </div>
                </div> 		<!-- End row -->
            </div>   	<!-- End container -->
        </section>   <!-- End section -->

        <section class="section instagram-feed">
            <div class="container">
                <div class="row">
                    <div class="title">
                        <h2 data-translate="view_us">View us on instagram</h2>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12">
                        <div class="instagram-slider" id="instafeed" data-accessToken="IGQVJYeUk4YWNIY1h4OWZANeS1wRHZARdjJ5QmdueXN2RFR6NF9iYUtfcGp1NmpxZA3RTbnU1MXpDNVBHTzZAMOFlxcGlkVHBKdjhqSnUybERhNWdQSE5hVmtXT013MEhOQVJJRGJBRURn"></div>
                    </div>
                </div>
            </div>
        </section>


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
                                <a href="contact.jsp" data-translate="contact">CONTACT</a>
                            </li>
                            <li>
                                <a href="shop.jsp"  data-translate="shop">SHOP</a>
                            </li>
                            <li>
                                <a href="pricing.jsp" data-translate="pricing">Pricing</a>
                            </li>
                            <li>
                                <a href="contact.jsp" data-translate="privacy_policy">PRIVACY POLICY</a>
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
        <!--change language-->
        <script src="js/language1.js"></script>
        <!--change language-->
    </body>
</html>
