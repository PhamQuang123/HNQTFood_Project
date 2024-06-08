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

<%--START HEADER--%>

<header class="fixed-top">

    <div class="container text-center">
        <div class="row">

            <div class="col-2">
                <div id="logo">
                    <a><div class="img-logo">
                        <img src="../../image/icon/LogoHeader.png" height="130" width="130"/>
                    </div></a>
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
                       <a><div class="btn-user" onclick="">
                           <img src="../../image/icon/LogoUser.png" height="32" width="32"/>
                       </div></a>
                    </div>

                    <c:if test="${sessionScope.users == null}">
                        <div class="col-3">
                            <a href="/HNQTFood/sign_in"><div class="btn-cart" onclick="">
                                Đăng ký/Đăng nhập
                                <img src="../../image/icon/LogoCart.png" height="35" width="35"/>
                            </div></a>
                        </div>
                    </c:if >

                    <div class="col-3">
                        <a href="/HNQTFood/"><div class="btn-logout" onclick="">
                            Giỏ hàng
                            <img src="../../image/icon/LogoLogOut.png" height="32" width="32"/></div></a>

                    </div>

                   <c:if test="${sessionScope.users != null}">
                       <div class="col-3">
                           <div class="btn-menu">
                               <a href="/HNQTFood/home/log_out">
                                   <div class="menu-icon" onclick="toggleSidebar()">
                                       Đăng xuất
                                       <img src="../../image/icon/LogoMenu.png" height="30" width="30"/></div>
                               </a>
                           </div>
                       </div>
                   </c:if>
                </div>
            </div>
        </div>
    </div>

    <div>
        <div id="mySidebar" class="sidebar">
            <div id="categoryItems">
                <div class="logo-menu">
                    <img src="css/image/imageLOGO.png.png" height="82" width="82"/>
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

            <div class="border-bottom"></div>
            <div class="row" id="body-menu">
                <div>
                    <h3 class="text-white text-center">HNQT Food</h3>
                    <p class="text-white text-center">Nhanh, Ngon, Tiện</p>
                    <p class="text-white text-center"> Đầy Đủ Hương Vị Mỗi Ngày! </p>
                </div>
            </div>


            <div class="row" id="footer-menu">
                <p class="text-white text-center">Liên Hệ Với Chúng Tôi</p>
                <div class="col-3">
                    <ul class="list-unstyled">
                        <li><a href="" class="fa-brands fa-facebook"></a></li>
                    </ul>
                </div>

                <div class="col-3">
                    <ul class="list-unstyled">
                        <li><a href="" class="fa-brands fa-twitter"></a></li>
                    </ul>
                </div>

                <div class="col-3">
                    <ul class="list-unstyled">
                        <li><a href="" class="fa-brands fa-instagram"></a></li>
                    </ul>
                </div>

                <div class="col-3">
                    <ul class="list-unstyled">
                        <li><a href="" class="fa-brands fa-youtube"></a></li>
                    </ul>
                </div>

                <div class="border-bottom"></div>

                <div class="text-white text-center">
                    <span>Copyright © 2023 KFC Vietnam</span>
                </div>
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

</div>


<%--END HEADER--%>

<%--START MAIN--%>
<section>
    <div class="slide-show">
        <div id="carouselExampleInterval" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active" data-bs-interval="100">
                    <img src=".././image/${prod.image}" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item" data-bs-interval="2000">
                    <img src=".././images/banner1.jpeg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src=".././images/banner3.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src=".././images/banner4jpg.jpg" class="d-block w-100" alt="...">
                </div>

            </div>
            <button class="carousel-control-prev" type="button"
                    data-bs-target="#carouselExampleInterval"
                    data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button"
                    data-bs-target="#carouselExampleInterval"
                    data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
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
</html>