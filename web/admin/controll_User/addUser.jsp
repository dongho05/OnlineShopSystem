                                    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Customer List</title>
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">
        <link href="css/sb-admin-2.min.css" rel="stylesheet">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.8.0/chart.min.js" integrity="sha512-sW/w8s4RWTdFFSduOTGtk4isV1+190E/GghVffMA9XczdJ2MDzSzLEubKAs5h0wzgSJOQTRYyaz73L3d6RtJSg==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    </head>

    <body id="page-top">
        <style>
            .pagination a.active {
                background-color: #4CAF50;
                color: white;
            }
            .pagination a:hover:not(.active) {
                background-color: #FFF44F;
                color: black;
            }
            .search-box{
                position: absolute;
                height: 40px;
                border-radius:40px;
                padding: 10px;
            }
            .search-box:hover > .search-txt{
                width: 240px;
                padding: 0 6px;
            }
            .search-box:hover > .search-btn{
                color: green
            }
            .search-btn{
                color:blue;
                width: 40px;
                height:40px;
                border-radius: 50%;
                transition: 0.4s;
            }
            .search-txt{
                border:none;
                background:#99ff99;
                outline:none;
                padding:0;
                color:black;
                font-size: 16px;
                transition: 0.4s;
                line-height: 40px;
                width: 0px;
            }
        </style>

        <!-- Page Wrapper -->
        <div id="wrapper">

            <!-- Sidebar -->
            <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

                <!-- Sidebar - Brand -->
                <a class="sidebar-brand d-flex align-items-center justify-content-center" href="mktDashboard">
                    <div class="sidebar-brand-icon rotate-n-15">
                        <i class="fas fa-laugh-wink"></i>
                    </div>
                    <div class="sidebar-brand-text mx-3">Marketing Dashboard </div>
                </a>

                <!-- Divider -->
                <hr class="sidebar-divider my-0">

                <!-- Nav Item - Dashboard -->
                <li class="nav-item">
                    <a class="nav-link" href="AdminDashboard">
                        <span>Dashboard</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="listuser">
                        <ion-icon name="receipt"></ion-icon>                       
                        <span>List Customers</span></a>
                </li>
                <!-- Heading -->


            </ul>
            <!-- End of Sidebar -->

            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">

                    <!-- Topbar -->
                    <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                        <!-- Sidebar Toggle (Topbar) -->
                        <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                            <i class="fa fa-bars"></i>
                        </button>


                        <!-- Topbar Navbar -->
                        <ul class="navbar-nav ml-auto">



                            <div class="topbar-divider d-none d-sm-block"></div>

                            <!-- Nav Item - User Information -->
                            <li class="nav-item dropdown no-arrow">
                                <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <span class="mr-2 d-none d-lg-inline text-gray-600 small">${sessionScope.user.fullname}</span>
                                    <img class="img-profile rounded-circle"
                                         src="images/shop/user/${sessionScope.user.avatar}">
                                </a>
                                <!-- Dropdown - User Information -->
                                <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                     aria-labelledby="userDropdown">

                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item" href="logout">
                                        <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                        Logout
                                    </a>
                                </div>
                            </li>

                        </ul>

                    </nav>
                    <!-- End of Topbar -->

                    <!-- Begin Page Content -->
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-xl-12" style="height: 100%;margin-bottom: 20px;">
                                <div class="card shadow mb-4">
                                    <div class="media">
                                        <div class="pull-left text-center" href="#!" style="border: 7px solid bisque;">
                                            <img class="media-object user-img" src="images/AddAccountDefault/avatar-default-icon.png" alt="Image" style="width: 200px;height: 200px">
                                        </div>
                                        <div class="media-body">
                                            <form action="adduser" method="post">
                                                <table style="margin:auto">
                                                    <tr>
                                                        <td>User Name</td>
                                                        <td><input name="username" type="text" placeholder="User Name" ></input></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Full Name</td>
                                                        <td><input name="fullname" type="text" placeholder="Full Name" ></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Address</td>
                                                        <td><input name="address" type="text" placeholder="Address" ></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Email</td>
                                                        <td><input name="email" type="text" placeholder="Address" ></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Phone Number</td>
                                                        <td><input name="phone" type="text" placeholder="Phone Number" ></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Date of birth</td>
                                                        <td><input name="dob" type="date"></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Gender</td>
                                                        <td>
                                                            <select name="gender">
                                                                <option value="1">Male</option>
                                                                <option value="0">Female</option>
                                                            </select>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td>Role</td>
                                                        <td>
                                                            <select name="role">
                                                                <option value="1">Admin</option>
                                                                <option value="2" >Sale Manager</option>
                                                                <option value="3">Sale</option>
                                                                <option value="4">Marketing</option>
                                                                <option value="5">Customer</option>
                                                                <option value="6">Guest</option>
                                                            </select>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td>Status</td>
                                                        <td><select name="status">
                                                                <option value="1">Active</option>
                                                                <option value="2" >Not active</option>
                                                            </select></td>
                                                    </tr>
                                                    <tr>
                                                        <td></td>
                                                        <td><button type="submit">Save</button></td>
                                                    </tr>
                                                </table>
                                                
                                                <c:if test="${requestScope.message!=null}">
                                                    <h3 style="color: red">${requestScope.message}</h3>
                                                </c:if>
                                            </form>
                                        </div>
                                    </div>
                                    <div class="text-center">
                                    </div>  

                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
        <script src="js/sb-admin-2.min.js"></script>
        <script src="vendor/chart.js/Chart.min.js"></script>
        <script src="js/demo/chart-area-demo.js"></script>
        <script src="js/demo/chart-pie-demo.js"></script>

    </body>

</html>