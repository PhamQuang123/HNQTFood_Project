<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 04/06/2024
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"
          integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap"
          rel="stylesheet">
    <link rel="stylesheet" href="../../css/style.css"/>
    <link rel="stylesheet" href="../../css/header.css"/>
</head>
<body>
<<<<<<< HEAD

=======
>>>>>>> 38ca248853a9116e5256489e329d715d962bdbe8
<header class="fixed-top">
    <div class="container text-center">
        <div class="row">
            <div class="col-2">
                <div id="logo">
                    <a>
                        <div class="img-logo">
                            <img src="../../image/icon/LogoHeader.png" height="130" width="130"/>
                        </div>
                    </a>
                    <h4 class="h3-logo">HNQT FOOD</h4>
                </div>
            </div>
            <div class="col-8">
                <div class="d-flex">
                    <div class="menu1 col mb-1">
                        <a href="">Trang chủ</a>
                    </div>

                    <div class="menu2 col mb-1">
                        <a href="">Đồ Ăn</a>
                    </div>

                    <div class="menu3 col mb-1">
                        <a href="">Đồ Uống</a>
                    </div>

                    <div class="menu4 col mb-1">
                        <a href="">Hỗ Trợ</a>
                    </div>
                    <c:if test="${sessionScope.users.roleUser == 0}">
                        <div class="menu5 col mb-1">
                            <a href="/HNQTFood/admin/account">Quản Lý</a>
                        </div>
                    </c:if>

                </div>
            </div>
            <div class="col-2">
                <div class="row">
                    <div class="col-3">
<<<<<<< HEAD
                       <a><div class="btn-user" onclick="">
                           <img src="../../image/icon/LogoUser.png" height="32" width="32"/>
                       </div></a>
                    </div>

                    <div class="col-3">
                        <a><div class="btn-cart" onclick="">
                            <img src="../../image/icon/LogoCart.png" height="35" width="35"/>
                        </div></a>

                    </div>

                    <div class="col-3">
                        <a><div class="btn-logout" onclick="">
                            <img src="../../image/icon/LogoLogOut.png" height="32    " width="32"/></div></a>

                    </div>

=======
                        <c:if test="${sessionScope.users != null}">
                            <a href="/HNQTFood/admin/edit_account?id=${sessionScope.users.id}">
                                <div class="btn-user" onclick="">
                                    <img src="../../image/icon/LogoUser.png" height="32" width="32"/>
                                </div>
                            </a>
                        </c:if>
                        <c:if test="${sessionScope.users == null}">
                            <div class="menu3 col mb-1">
                                <a href="/HNQTFood/sign_in">Đăng nhập/Đăng ký</a>
                            </div>
                        </c:if>
                    </div>
                    <div class="col-3">
                        <div class="btn-cart" onclick="">
                            <a href="/HNQTFood/admin/edit_product?id=${sessionScope.users.id}">
                                <img src="../../image/icon/LogoCart.png" height="35" width="35"/>
                            </a>
                        </div>
                    </div>

                    <c:if test="${sessionScope.users != null}">
                        <div class="col-3">
                            <a href="/HNQTFood/home/log_out">
                                <div class="btn-logout" onclick="">
                                    <img src="../../image/icon/LogoLogOut.png" height="32" width="32"/></div>
                            </a>
                        </div>
                    </c:if>
>>>>>>> 38ca248853a9116e5256489e329d715d962bdbe8
                </div>
            </div>
        </div>
    </div>

<<<<<<< HEAD
    </div>
</header>

=======
    <div>
        <div id="mySidebar" class="sidebar">
            <div id="categoryItems">
                <div class="logo-menu">
                    <img src="../../image/icon/imageLOGO.png" height="82" width="82"/>
                </div>
            </div>

            <a href="javascript:void(0)" class="closebtn" onclick="toggleSidebar()">x</a>
            <div class="menu-bar">
                <h4 class="text-white text-center">Danh Mục</h4>
                <a href="">Gà rán</a>
                <a href="">Đồ ăn</a>
                <a href="">Đồ Uống</a>
                <a href="">Món tráng miệng</a>
            </div>


            <script>
                function toggleSidebar() {
                    let sidebar = document.getElementById("mySidebar");
                    if (sidebar.style.width === "250px") {
                        sidebar.style.width = "0";
                    } else {
                        sidebar.style.width = "250px";
                    }
                }
            </script>

        </div>
    </div>
</header>

<div>
    <div class="row">
        <div class="col-12">
            <div class="search-container ">
                <input type="text" class="search-bar" placeholder="Search...">
                <button class="search-button">Search</button>
            </div>
        </div>
    </div>
>>>>>>> 38ca248853a9116e5256489e329d715d962bdbe8



<%--END HEADER--%>

<%--START MAIN--%>
<section class="py-5">

    <div class="container-fluid">
        <div class="row">
    <div id="carouselExampleAutoplaying" class="carousel slide" data-bs-ride="carousel">
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="../../image/banner1.jpeg" class="d-block w-100" height="600" width="1280"/>
            </div>

            <div class="carousel-item">
                <img src="../../image/banner2.jpg" class="d-block w-100" height="600" width="1280"/>
            </div>
            <div class="carousel-item">
                <img src="../../image/banner3.jpg" class="d-block w-100" height="600 " width="1280"/>
            </div>
            <div class="carousel-item">
                <img src="../../image/banner4.jpg" class="d-block w-100" height="600 " width="1280"/>
            </div>

        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleAutoplaying"
                data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleAutoplaying"
                data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>
        </div>
    </div>

    <div class="container py-5">
        <div class="category1">
            <h1 class="text-center">BÁN CHẠY</h1>
            <hr>
            <div class="row row-cols-1 row-cols-md-3 g-4 py-5">
                <c:forEach items="${listBestSeller}" var="bs">
                    <div class="col">
                        <div class="card h-100">
                            <img src="${bs.image}" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">${bs.productName}</h5>
                                <p class="card-text">${bs.descriptions}</p>
                            </div>
                            <div class="d-flex justify-content-around mb-5">
                                <h3>${bs.price} vnđ</h3>
                                <button type="button" class="btn btn-primary"><i
                                        class="fa-solid fa-basket-shopping"></i>
                                </button>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>

        <div class="category1">
            <h1 class="text-center">ĐỒ ĂN</h1>
            <hr>
            <div class="row row-cols-1 row-cols-md-3 g-4 py-5">
                <c:forEach items="${listFood}" var="food">
                    <div class="col">
                        <div class="card h-100">
                            <img src="/image/${food.image}" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">${food.productName}</h5>
                                <p class="card-text">${food.descriptions}</p>
                            </div>
                            <div class="d-flex justify-content-around mb-5">
                                <h3>${food.price} vnđ</h3>
                                <button type="button" class="btn btn-primary"><i
                                        class="fa-solid fa-basket-shopping"></i>
                                </button>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
            <a class="nav-link" onclick="load">Xem thêm</a>
        </div>

        <div class="category">
            <h1 class="text-center">ĐỒ UỐNG</h1>
            <hr>
            <div class="row row-cols-1 row-cols-md-3 g-4 py-5">
                <c:forEach items="${listDrink}" var="drink">
                    <div class="col">
                        <div class="card h-100">
                            <img src="${drink.image}" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">${drink.productName}</h5>
                                <p class="card-text">${drink.descriptions}</p>
                            </div>
                            <div class="d-flex justify-content-around mb-5">
                                <h3>${drink.price} vnđ</h3>
                                <button type="button" class="btn btn-primary"><i
                                        class="fa-solid fa-basket-shopping"></i>
                                </button>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
            <a class="nav-link" onclick="load">Xem thêm</a>
        </div>
    </div>
</section>

<%--START FOOTER--%>
<footer class="">
    <div class="footer1">
        <div class="row">
            <div class="col-xs-3 col-sm-3 col-lg-3 text-center">
                <h3>HNQTFood</h3>
                <p>Nhanh, Ngon, Tiện – Đầy Đủ Hương Vị Mỗi Ngày!</p>
            </div>

            <div class="col-xs-3 col-sm-3 col-lg-3 text-center">
                <h3>Chính sách cửa hàng</h3>
                <p><a href="#" class="text-reset text-decoration-none">Dịch vụ</a></p>
                <p><a href="#" class="text-reset text-decoration-none">Ưu đãi</a></p>
                <p><a href="#" class="text-reset text-decoration-none">Giải quyết khiếu nại</a></p>

            </div>

            <div class="col-xs-3 col-sm-3 col-lg-3 text-center">
                <h3>Liên hệ với chúng tôi</h3>
                <ul>
                    <li><a href="" class="fa-brands fa-facebook"></a></li>
                    <li><a href="" class="fa-brands fa-twitter"></a></li>
                    <li><a href="" class="fa-brands fa-instagram"></a></li>
                </ul>
            </div>

            <div class="col-xs-3 col-sm-3 col-lg-3 text-center">
                <h3>Địa chỉ cửa hàng</h3>
                <p>Nhà số 23, Lô TT-01, Khu đô thị MonCity, P. Hàm Nghi, Hà Nội </p>
                <p>Số điện thoại: 0123456789</p>
            </div>

        </div>

    </div>

    <div class="footer2">
        <div class="col-xs-12 col-sm-12 col-lg-12 text-center">
            <p>Copyright © 2022 HNQTFood. All rights reserved.</p>
        </div>
    </div>
</footer>
<%--END FOOTER--%>

</body>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
        integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
        crossorigin="anonymous"></script>
</html>