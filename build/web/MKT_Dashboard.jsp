<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Marketing Dashboard</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:400,700">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <!-- https://fonts.google.com/specimen/Roboto -->
        <link rel="stylesheet" href="css/fontawesome.min.css">
        <!-- https://fontawesome.com/ -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- https://getbootstrap.com/ -->
        <link rel="stylesheet" href="css/templatemo-style.css">

        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.4/Chart.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.8.0/chart.min.js" integrity="sha512-sW/w8s4RWTdFFSduOTGtk4isV1+190E/GghVffMA9XczdJ2MDzSzLEubKAs5h0wzgSJOQTRYyaz73L3d6RtJSg==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.8.0/chart.js" integrity="sha512-5m2r+g00HDHnhXQDbRLAfZBwPpPCaK+wPLV6lm8VQ+09ilGdHfXV7IVyKPkLOTfi4vTTUVJnz7ELs7cA87/GMA==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.8.0/chart.esm.js" integrity="sha512-YM18yiANXJFpbiOZjLzUrK/lNfTiBcwtTLeAntG4B8dJY+NdUDjxfPNGPEMuOdXlT7U/uT+zbIvbQYAEFog+MA==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.8.0/chart.esm.min.js" integrity="sha512-yPOQ2pPoQ9JtP0/jDKpXiKyWNCJWT5OI+6r1EqZmTg+afKQOBpy08VYboeq+Tt9kl9/FOCueEhH6cmHN3nAdJA==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <!--
            Product Admin CSS Template
            https://templatemo.com/tm-524-product-admin
        -->
    </head>

    <body id="reportsPage">
        <div class="" id="home">
            <nav class="navbar navbar-expand-xl">
                <div class="container h-100">
                    <a class="navbar-brand" href="index.html">
                        <h1 class="tm-site-title mb-0">Marketing Dashboard</h1>
                    </a>
                    <button class="navbar-toggler ml-auto mr-0" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <i class="fas fa-bars tm-nav-icon"></i>
                    </button>

                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav mx-auto h-100">
                            <li class="nav-item">
                                <a class="nav-link active" href="#">
                                    <i class="fas fa-tachometer-alt"></i>
                                    Dashboard
                                    <span class="sr-only">(current)</span>
                                </a>
                            </li>
                            <li class="nav-item dropdown">

                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
                                   aria-haspopup="true" aria-expanded="false">
                                    <i class="far fa-file-alt"></i>
                                    <span>
                                        Reports <i class="fas fa-angle-down"></i>
                                    </span>
                                </a>
                                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="#">Daily Report</a>
                                    <a class="dropdown-item" href="#">Weekly Report</a>
                                    <a class="dropdown-item" href="#">Yearly Report</a>
                                </div>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="products.html">
                                    <i class="fas fa-shopping-cart"></i>
                                    Products
                                </a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" href="accounts.html">
                                    <i class="far fa-user"></i>
                                    Accounts
                                </a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
                                   aria-haspopup="true" aria-expanded="false">
                                    <i class="fas fa-cog"></i>
                                    <span>
                                        Settings <i class="fas fa-angle-down"></i>
                                    </span>
                                </a>
                                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="#">Profile</a>
                                    <a class="dropdown-item" href="#">Billing</a>
                                    <a class="dropdown-item" href="#">Customize</a>
                                </div>
                            </li>
                        </ul>
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link d-block" href="login.html">
                                    Admin, <b>Logout</b>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>

            </nav>
            <div class="container">
                <div class="row">
                    <div class="col">
                        <p class="text-white mt-5 mb-5">Welcome back, <b>Admin</b></p>
                    </div>
                </div>
                <!-- row -->
                <div class="row tm-content-row">
<!--                    <div class="col-sm-12 col-md-12 col-lg-6 col-xl-6 tm-block-col">
                        <div class="tm-bg-primary-dark tm-block">
                            <h2 class="tm-block-title">Latest Hits</h2>
                            <canvas id="lineChart1" ></canvas>
                            <script>
                                const ctx = document.getElementById('lineChart1').getContext('2d');
                                const myChart = new Chart(ctx, {
                                    type: 'bar',
                                    data: {
                                        labels: ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday'],
                                        datasets: [{
                                                label: '# of Votes',
                                                data: [12, 19, 3, 5, 2, 3, 9],
                                                backgroundColor: [
                                                    'rgba(255, 99, 132, 0.7)',
                                                    'rgba(54, 162, 235, 0.7)',
                                                    'rgba(255, 206, 86, 0.7)',
                                                    'rgba(75, 192, 192, 0.7)',
                                                    'rgba(153, 102, 255, 0.7)',
                                                    'rgba(153, 204, 255, 0.7)',
                                                    'rgba(255, 159, 64, 0.7)'
                                                ],
                                                borderColor: [
                                                    'rgba(255, 99, 132, 1)',
                                                    'rgba(54, 162, 235, 1)',
                                                    'rgba(255, 206, 86, 1)',
                                                    'rgba(75, 192, 192, 1)',
                                                    'rgba(145, 102, 255, 1)',
                                                    'rgba(153, 102, 255, 1)',
                                                    'rgba(255, 159, 64, 1)'
                                                ],
                                                borderWidth: 1
                                            }]
                                    },
                                    options: {
                                        scales: {
                                            y: {
                                                beginAtZero: true
                                            }
                                        }
                                    }
                                });
                            </script>
                        </div>
                    </div>-->
                    <div class="col-sm-12 col-md-12 col-lg-6 col-xl-6 tm-block-col">
                        <div class="tm-bg-primary-dark tm-block">
                            <h2 class="tm-block-title">Revenue By Day</h2>
                            <canvas id="myChart" style="width:100%;max-width:600px;color: khaki"></canvas>
                            <form action="mktDashboard" method="post">
                                Month<input type="number" name="month" style="background-color: #23527c;color: #ffffff"/>
                                Year<input type="number" name="year"style="background-color: #23527c;color: #ffffff"/>
                                From<input type="number" name="from"style="background-color: #23527c;color: #ffffff"/>
                                To<input type="number" name="to"style="background-color: #23527c;color: #ffffff"/>
                                <input type="submit" value="Filter"style="background-color: #23527c;color: #ffffff"/>
                            </form>
                            <script>
                                new Chart("myChart", {
                                    type: "line",
                                    data: {
                                        labels: ${listDay},
                                        datasets: [{
                                                fill: false,
                                                lineTension: 0,
                                                backgroundColor: "rgba(255, 99, 132, 0.7)",
                                                borderColor: "rgba(255, 99, 132, 1)",
                                                data: ${listRevenue}
                                            }]
                                    },
                                    options: {
                                        legend: {display: false},
                                        scales: {
                                            yAxes: [{ticks: {min: 6, max: 16}}],
                                        }
                                    }
                                });
                            </script>
                        </div>
                    </div>
<!--                    <div class="col-sm-12 col-md-12 col-lg-6 col-xl-6 tm-block-col">
                        <div class="tm-bg-primary-dark tm-block tm-block-taller">
                            <h2 class="tm-block-title">Storage Information</h2>
                            <div id="pieChartContainer">
                                <canvas id="pieChart" class="chartjs-render-monitor" width="200" height="200"></canvas>
                            </div>                        
                        </div>
                    </div>-->
                    <!--                    <div class="col-sm-12 col-md-12 col-lg-6 col-xl-6 tm-block-col">
                                            <div class="tm-bg-primary-dark tm-block tm-block-taller tm-block-overflow">
                                                <h2 class="tm-block-title">Notification List</h2>
                                                <div class="tm-notification-items">
                                                    <div class="media tm-notification-item">
                                                        <div class="tm-gray-circle"><img src="img/notification-01.jpg" alt="Avatar Image" class="rounded-circle"></div>
                                                        <div class="media-body">
                                                            <p class="mb-2"><b>Jessica</b> and <b>6 others</b> sent you new <a href="#"
                                                                                                                               class="tm-notification-link">product updates</a>. Check new orders.</p>
                                                            <span class="tm-small tm-text-color-secondary">6h ago.</span>
                                                        </div>
                                                    </div>
                                                    <div class="media tm-notification-item">
                                                        <div class="tm-gray-circle"><img src="img/notification-02.jpg" alt="Avatar Image" class="rounded-circle"></div>
                                                        <div class="media-body">
                                                            <p class="mb-2"><b>Oliver Too</b> and <b>6 others</b> sent you existing <a href="#"
                                                                                                                                       class="tm-notification-link">product updates</a>. Read more reports.</p>
                                                            <span class="tm-small tm-text-color-secondary">6h ago.</span>
                                                        </div>
                                                    </div>
                                                    <div class="media tm-notification-item">
                                                        <div class="tm-gray-circle"><img src="img/notification-03.jpg" alt="Avatar Image" class="rounded-circle"></div>
                                                        <div class="media-body">
                                                            <p class="mb-2"><b>Victoria</b> and <b>6 others</b> sent you <a href="#"
                                                                                                                            class="tm-notification-link">order updates</a>. Read order information.</p>
                                                            <span class="tm-small tm-text-color-secondary">6h ago.</span>
                                                        </div>
                                                    </div>
                                                    <div class="media tm-notification-item">
                                                        <div class="tm-gray-circle"><img src="img/notification-01.jpg" alt="Avatar Image" class="rounded-circle"></div>
                                                        <div class="media-body">
                                                            <p class="mb-2"><b>Laura Cute</b> and <b>6 others</b> sent you <a href="#"
                                                                                                                              class="tm-notification-link">product records</a>.</p>
                                                            <span class="tm-small tm-text-color-secondary">6h ago.</span>
                                                        </div>
                                                    </div>
                                                    <div class="media tm-notification-item">
                                                        <div class="tm-gray-circle"><img src="img/notification-02.jpg" alt="Avatar Image" class="rounded-circle"></div>
                                                        <div class="media-body">
                                                            <p class="mb-2"><b>Samantha</b> and <b>6 others</b> sent you <a href="#"
                                                                                                                            class="tm-notification-link">order stuffs</a>.</p>
                                                            <span class="tm-small tm-text-color-secondary">6h ago.</span>
                                                        </div>
                                                    </div>
                                                    <div class="media tm-notification-item">
                                                        <div class="tm-gray-circle"><img src="img/notification-03.jpg" alt="Avatar Image" class="rounded-circle"></div>
                                                        <div class="media-body">
                                                            <p class="mb-2"><b>Sophie</b> and <b>6 others</b> sent you <a href="#"
                                                                                                                          class="tm-notification-link">product updates</a>.</p>
                                                            <span class="tm-small tm-text-color-secondary">6h ago.</span>
                                                        </div>
                                                    </div>
                                                    <div class="media tm-notification-item">
                                                        <div class="tm-gray-circle"><img src="img/notification-01.jpg" alt="Avatar Image" class="rounded-circle"></div>
                                                        <div class="media-body">
                                                            <p class="mb-2"><b>Lily A</b> and <b>6 others</b> sent you <a href="#"
                                                                                                                          class="tm-notification-link">product updates</a>.</p>
                                                            <span class="tm-small tm-text-color-secondary">6h ago.</span>
                                                        </div>
                                                    </div>
                                                    <div class="media tm-notification-item">
                                                        <div class="tm-gray-circle"><img src="img/notification-02.jpg" alt="Avatar Image" class="rounded-circle"></div>
                                                        <div class="media-body">
                                                            <p class="mb-2"><b>Amara</b> and <b>6 others</b> sent you <a href="#"
                                                                                                                         class="tm-notification-link">product updates</a>.</p>
                                                            <span class="tm-small tm-text-color-secondary">6h ago.</span>
                                                        </div>
                                                    </div>
                                                    <div class="media tm-notification-item">
                                                        <div class="tm-gray-circle"><img src="img/notification-03.jpg" alt="Avatar Image" class="rounded-circle"></div>
                                                        <div class="media-body">
                                                            <p class="mb-2"><b>Cinthela</b> and <b>6 others</b> sent you <a href="#"
                                                                                                                            class="tm-notification-link">product updates</a>.</p>
                                                            <span class="tm-small tm-text-color-secondary">6h ago.</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>-->
                    <div class="col-12 tm-block-col">
                        <div class="tm-bg-primary-dark tm-block tm-block-taller tm-block-scroll">
                            <h2 class="tm-block-title">Top Customer Buy The Most </h2>
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th scope="col">ORDER NO.</th>
                                        <th scope="col">Avatar</th>
                                        <th scope="col">Full Name</th>
                                        <th scope="col">Address</th>
                                        <th scope="col">Birthday</th>
                                        <th scope="col">Email</th>
                                        <th scope="col">Phone Number</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="i" items="${listUser}">
                                        <tr>
                                            <th scope="row"><b>#122349</b></th>
                                            <td><img  src="images/img_blog/${i.avatar}" alt="" width="50" height="50">
                                            </td>
                                            <td><b>${i.fullname}</b></td>
                                            <td><b>${i.address}</b></td>
                                            <td><b>${i.dob}</b></td>
                                            <td>${i.email}</td>
                                            <td>${i.phone}</td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    
                    <div class="col-12 tm-block-col">
                        <div class="tm-bg-primary-dark tm-block tm-block-taller tm-block-scroll">
                            <h2 class="tm-block-title">Top Product Bought Most </h2>
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th scope="col">ORDER NO.</th>
                                        <th scope="col">Image</th>
                                        <th scope="col">Product Name</th>
                                        <th scope="col">Price</th>
                                        <th scope="col">Category</th>
                                        <!--<th scope="col"></th>-->
                                        <!--<th scope="col">Phone Number</th>-->
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="i" items="${ListProduct}">
                                        <tr>
                                            <th scope="row"><b>#122349</b></th>
                                            <td><img  src="images/shop/products/${i.productImg}" alt="" width="50" height="50"></td>
                                            <td><b>${i.productName}</b></td>
                                            <td><b>${i.productPrice}</b></td>
                                            <td><b>${i.cate.cateName}</b></td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <footer class="tm-footer row tm-mt-small">
                <div class="col-12 font-weight-light">
                    <p class="text-center text-white mb-0 px-4 small">
                        Copyright &copy; <b>2018</b> All rights reserved. 

                        Design: <a rel="nofollow noopener" href="https://templatemo.com" class="tm-footer-link">Template Mo</a>
                    </p>
                </div>
            </footer>
        </div>

<!--        <script src="js/jquery-3.3.1.min.js"></script>
         https://jquery.com/download/ 
        <script src="js/moment.min.js"></script>
         https://momentjs.com/ 
        <script src="js/Chart.min.js"></script>
         http://www.chartjs.org/docs/latest/ 
        <script src="js/bootstrap.min.js"></script>
         https://getbootstrap.com/ 
        <script src="js/tooplate-scripts.js"></script>-->
        <!--        <script>
                                        Chart.defaults.global.defaultFontColor = 'white';
                                        let ctxLine,
                                                ctxBar,
                                                ctxPie,
                                                optionsLine,
                                                optionsBar,
                                                optionsPie,
                                                configLine,
                                                configBar,
                                                configPie,
                                                lineChart;
                                        barChart, pieChart;
                                        // DOM is ready
                                        $(function () {
                                            drawLineChart(); // Line Chart
                                            drawBarChart(); // Bar Chart
                                            drawPieChart(); // Pie Chart
        
                                            $(window).resize(function () {
                                                updateLineChart();
                                                updateBarChart();
                                            });
                                        })
                </script>-->
    </body>

</html>