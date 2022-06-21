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
        <link rel="stylesheet" href="css/projectstyle.css">

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
                                        <li><a href="cart.jsp" class="btn btn-small">View Cart</a></li>
                                        <li><a href="checkout.jsp" class="btn btn-small btn-solid-border">Checkout</a></li>
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
                                <a href="home">Home</a>
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
                                                <li><a href="shop">Shop</a></li>
                                                <li><a href="checkout.jsp">Checkout</a></li>
                                                <li><a href="cart.jsp">Cart</a></li>
                                                <li><a href="pricing.jsp">Pricing</a></li>
                                                <li><a href="confirmation.jsp">Confirmation</a></li>

                                            </ul>
                                        </div>

                                        <!-- Layout -->
                                        <div class="col-lg-6 col-md-6 mb-sm-3">
                                            <ul>
                                                <li class="dropdown-header">Layout</li>
                                                <li role="separator" class="divider"></li>
                                                <li><a href="product-single.jsp">Product Details</a></li>
                                                <li><a href="shop-sidebar.jsp">Shop With Sidebar</a></li>

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
                                                <li><a href="contact.jsp">Contact Us</a></li>
                                                <li><a href="about.jsp">About Us</a></li>
                                                <li><a href="404.jsp">404 Page</a></li>
                                                <li><a href="coming-soon.jsp">Coming Soon</a></li>
                                                <li><a href="faq.jsp">FAQ</a></li>
                                            </ul>
                                        </div>

                                        <!-- Contact -->
                                        <div class="col-sm-3 col-xs-12">
                                            <ul>
                                                <li class="dropdown-header">Dashboard</li>
                                                <li role="separator" class="divider"></li>
                                                <li><a href="dashboard.jsp">User Interface</a></li>
                                                <li><a href="order.jsp">Orders</a></li>
                                                <li><a href="address.jsp">Address</a></li>
                                                <li><a href="profile-details.jsp">Profile Details</a></li>
                                            </ul>
                                        </div>

                                        <!-- Utility -->
                                        <div class="col-sm-3 col-xs-12">
                                            <ul>
                                                <li class="dropdown-header">Utility</li>
                                                <li role="separator" class="divider"></li>
                                                <li><a href="login.jsp">Login Page</a></li>
                                                <li><a href="signin.jsp">Signin Page</a></li>
                                                <li><a href="forget-password.jsp">Forget Password</a></li>
                                            </ul>
                                        </div>

                                        <!-- Mega Menu -->
                                        <div class="col-sm-3 col-xs-12">
                                            <a href="shop">
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
                                    <li><a href="blog-left-sidebar.jsp">Blog Left Sidebar</a></li>
                                    <li><a href="blog-right-sidebar.jsp">Blog Right Sidebar</a></li>
                                    <li><a href="blog-full-width.jsp">Blog Full Width</a></li>
                                    <li><a href="blog-grid.jsp">Blog 2 Columns</a></li>
                                    <li><a href="blog-single.jsp">Blog Single</a></li>
                                </ul>
                            </li><!-- / Blog -->

                            <!-- Shop -->
                            <li class="dropdown dropdown-slide">
                                <a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="350"
                                   role="button" aria-haspopup="true" aria-expanded="false">Elements <span
                                        class="tf-ion-ios-arrow-down"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="typography.jsp">Typography</a></li>
                                    <li><a href="buttons.jsp">Buttons</a></li>
                                    <li><a href="alerts.jsp">Alerts</a></li>
                                </ul>
                            </li><!-- / Blog -->
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
                        <div class="widget product-category">
                            <div class="filter_search">
                                <div class="filter_title">Search</div>
                                <form action="shop-sidebar" method="get" class="filter_search_form">
                                    <!--<input type="text" placeholder="Search here..." name="txt" class="search_sidebar"/>-->
                                    <!--<button type="submit" > <i class="fas fa-search"></i> </button>-->  
                                    <c:if test="${txt!=null}">
                                        <input style="width: 70%" type="text" name="txt" placeholder="${txt}">
                                    </c:if>
                                    <c:if test="${txt==null}">
                                        <input style="width: 70%" type="text" name="txt" placeholder="Search Product">
                                    </c:if>
                                </form>
                            </div>  
                            <hr/>
                            <form action="shop-sidebar">
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
                                                <input type="radio" name="desc">DESC
                                                <br/>
                                                <input type="radio" name="asc">ASC
                                            </div>
                                        </div>
                                    </div>
                                    <hr/>
                                    <div class="filter_check">
                                        <div class="filter_title"><a>Category</a></div>
                                        <div class="filter_option">
                                            <c:forEach begin="0" end="5" items="${requestScope.listC}" var="lc">
                                                <div>
                                                    <input type="radio" value="${lc.cateID}" name="cateID">${lc.cateName}
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
                                                    <input type="radio" value="${lb.brandID}" name="brandID">${lb.brandName}
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
                            <c:forEach items="${requestScope.listShop}" var="t">
                                <div class="col-md-4">
                                    <div class="product-item">
                                        <div class="product-thumb">
                                            <img style="height: 300px;width: 300px" class="img-responsive" src="images/shop/products/${t.productImg}.jpg" alt="product-img" />
                                            <div class="preview-meta">
                                                <div class="modal-content">
                                                    <div class="modal-body">
                                                        <div class="row">
                                                            <div>
                                                                <div class="modal-image">
                                                                    <img class="img-responsive" src="images/shop/products/${t.productImg}.jpg" alt="product-img" />
                                                                </div>
                                                            </div>
                                                            <div>
                                                                <div class="product-short-details">
                                                                    <h2 class="product-title">${t.productName}</h2>

                                                                    <div class="product-price">
                                                                        <div data-translate="price">Price:
                                                                            <del class="initial_price">$${t.productPrice}</del> --> 
                                                                            $<fmt:formatNumber pattern="##.#" value="${t.productPrice - t.productPrice*t.discount}"/>
                                                                        </div>

                                                                    </div>

                                                                    <p class="product-short-description">${t.productDes} </p>
                                                                    <a href="cart.jsp" class="add_to_cart btn btn-main" data-translate="add_to_cart">Add To Cart</a><br/><br/>
                                                                    <a href="detailproduct?productID=${t.productID}" class="view_to btn btn-transparent" data-translate="view_product_details">View Product Details</a>
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
                                                        <a href="cart.jsp"><i class="tf-ion-android-cart"></i></a>
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


                </div>
            </div>
        </section>

        <c:set var="page" value="${requestScope.page}" />
        <div class="next">
            <a><</a>
            <c:forEach begin="1" end="${requestScope.num}" var="i">
                <c:if test="${priceF == null && priceT == null && txt == null && cateID == null && brandID == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}">${i}</a>
                </c:if>
                <c:if test="${priceF != null && priceT != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&priceF=${priceF}&priceT=${priceT}">${i}</a>
                </c:if>
                <c:if test="${txt != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&txt=${txt}">${i}</a>
                </c:if>
                <c:if test="%${cateID != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&cateID=${cateID}">${i}</a>
                </c:if>    
                <c:if test="%${brandID != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&brandID=${brandID}">${i}</a>
                </c:if>

                <%--
                <!--không chọn-->
                <c:if test="${cateID == null && brandID == null && priceF == null && priceT == null && txt == null && desc == null && asc == null}" >
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}">${i}</a>
                </c:if>
                    
                    <!--=========================================================================================-->
                    <!--chọn search-->
                <c:if test="${cateID == null && brandID == null && priceF == null && priceT == null && txt != null && desc == null && asc == null}" >
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&txt=${txt}">${i}</a>
                </c:if>
                    <!--chọn search & desc-->
                <c:if test="${cateID == null && brandID == null && priceF == null && priceT == null && txt != null && desc != null && asc == null}" >
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&txt=${txt}">${i}</a>
                </c:if>
                    <!--chọn search & asc-->
                <c:if test="${cateID == null && brandID == null && priceF == null && priceT == null && txt != null && desc == null && asc != null}" >
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&txt=${txt}">${i}</a>
                </c:if>
                    
                    <!--=========================================================================================-->
                    <!--chọn cateID-->
                <c:if test="${cateID != null && brandID == null && priceF == null && priceT == null && txt == null && desc == null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&cateID=${cateID}">${i}</a>
                </c:if>
                    <!--chọn cateID & desc-->
                <c:if test="${cateID != null && brandID == null && priceF == null && priceT == null && txt == null && desc != null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&cateID=${cateID}">${i}</a>
                </c:if>
                    <!--chọn cateID & asc-->
                <c:if test="${cateID != null && brandID == null && priceF == null && priceT == null && txt == null && desc == null && asc != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&cateID=${cateID}">${i}</a>
                </c:if>
                    
                    <!--=========================================================================================-->
                    <!--chọn brandID-->
                <c:if test="${cateID == null && brandID != null && priceF == null && priceT == null && txt == null && desc == null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&brandID=${brandID}">${i}</a>
                </c:if>
                    <!--chọn brandID & asc-->
                <c:if test="${cateID == null && brandID != null && priceF == null && priceT == null && txt == null && desc == null && asc != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&brandID=${brandID}">${i}</a>
                </c:if>
                    <!--chọn brandID  & desc-->
                <c:if test="${cateID == null && brandID != null && priceF == null && priceT == null && txt == null && desc != null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&brandID=${brandID}">${i}</a>
                </c:if>
                
                    <!--=========================================================================================-->
                    <!--chọn price-->
                <c:if test="${cateID == null && brandID == null && priceF == null && priceT != null && txt == null && desc == null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&priceF=${priceF}&priceT=${priceT}">${i}</a>
                </c:if>
                    <!--chọn price & desc-->
                <c:if test="${cateID == null && brandID == null && priceF == null && priceT != null && txt == null && desc != null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&priceF=${priceF}&priceT=${priceT}">${i}</a>
                </c:if>
                    <!--chọn price & asc-->
                <c:if test="${cateID == null && brandID == null && priceF == null && priceT != null && txt == null && desc == null && asc != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&priceF=${priceF}&priceT=${priceT}">${i}</a>
                </c:if>
                    
                    <!--=========================================================================================-->
                    <!--chọn cate & brand-->
                <c:if test="${cateID != null && brandID != null && priceF == null && priceT == null && txt == null  && desc == null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&cateID0=${cateID}&brandID=${brandID}">${i}</a>
                </c:if>
                    <!--chọn cate & brand & desc-->
                <c:if test="${cateID != null && brandID != null && priceF == null && priceT == null && txt == null  && desc != null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&cateID0=${cateID}&brandID=${brandID}">${i}</a>
                </c:if>
                    <!--chọn cate & brand & asc-->
                <c:if test="${cateID != null && brandID != null && priceF == null && priceT == null && txt == null  && desc == null && asc != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&cateID0=${cateID}&brandID=${brandID}">${i}</a>
                </c:if>
                    
                    <!--=========================================================================================-->
                    <!--chọn cate & price-->
                <c:if test="${cateID != null && brandID == null && priceF != null && priceT != null && txt == null && desc == null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&cateID=${cateID}&priceF=${priceF}&priceT=${priceT}">${i}</a>
                </c:if>
                    <!--chọn cate & price & asc-->
                <c:if test="${cateID != null && brandID == null && priceF != null && priceT != null && txt == null && desc == null && asc != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&cateID=${cateID}&priceF=${priceF}&priceT=${priceT}">${i}</a>
                </c:if>
                    <!--chọn cate & price & desc-->
                <c:if test="${cateID != null && brandID == null && priceF != null && priceT != null && txt == null && desc != null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&cateID=${cateID}&priceF=${priceF}&priceT=${priceT}">${i}</a>
                </c:if>
                    
                    <!--=========================================================================================-->
                    <!--chọn brand & price-->
                <c:if test="${cateID == null && brandID != null && priceF != null && priceT != null && txt == null && desc == null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&brandID=${brandID}&priceF=${priceF}&priceT=${priceT}">${i}</a>
                </c:if>    
                    <!--chọn brand & price & desc-->
                <c:if test="${cateID == null && brandID != null && priceF != null && priceT != null && txt == null && desc != null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&brandID=${brandID}&priceF=${priceF}&priceT=${priceT}">${i}</a>
                </c:if>    
                    <!--chọn brand & price & asc-->
                <c:if test="${cateID == null && brandID != null && priceF != null && priceT != null && txt == null && desc == null && asc != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&brandID=${brandID}&priceF=${priceF}&priceT=${priceT}">${i}</a>
                </c:if>
                    
                    <!--=========================================================================================-->
                    <!--chọn brand & cate & price-->
                <c:if test="${cateID != null && brandID != null && priceF != null && priceT != null && txt == null && desc == null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&cateID=${cateID}&brandID=${brandID}&priceF=${priceF}&priceT=${priceT}">${i}</a>
                </c:if>
                    <!--chọn brand & cate & price & asc-->
                <c:if test="${cateID != null && brandID != null && priceF != null && priceT != null && txt == null && desc == null && asc != null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&cateID=${cateID}&brandID=${brandID}&priceF=${priceF}&priceT=${priceT}">${i}</a>
                </c:if>
                    <!--chọn brand & cate & price & desc-->
                <c:if test="${cateID != null && brandID != null && priceF != null && priceT != null && txt == null && desc != null && asc == null}">
                    <a class="${i==page?"active":""}" href="shop-sidebar?page=${i}&cateID=${cateID}&brandID=${brandID}&priceF=${priceF}&priceT=${priceT}">${i}</a>
                </c:if>
                    
                --%>
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
