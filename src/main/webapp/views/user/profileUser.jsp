<%--
  Created by IntelliJ IDEA.
  User: HaiNam
  Date: 6/8/2024
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"
          integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap"
          rel="stylesheet">
    <link rel="stylesheet" href="../../css/editProfile.css"/>
    <link rel="stylesheet" href="../../css/style.css"/>
    <link rel="stylesheet" href="../../css/header.css"/>

</head>
<body>
<header class="fixed-top">
    <div class="container text-center">
        <div class="row align-items-center">
            <div class="col-2">
                <div id="logo">
                    <a>
                        <div class="img-logo">
                            <img src="../../image/icon/LogoHeader.png" height="50" width="50"/>
                        </div>
                    </a>
                    <h4 class="h3-logo">HNQT FOOD</h4>
                </div>
            </div>
            <div class="col-6">
                <div class="d-flex justify-content-around">
                    <div class="menu1 col mb-1">
                        <a href="/HNQTFood/home/home_page" class="nav-link">Trang chủ</a>
                    </div>
                    <%--                    <div class="menu2 col mb-1">--%>
                    <%--                        <a href="#food" class="nav-link">Đồ Ăn</a>--%>
                    <%--                    </div>--%>
                    <%--                    <div class="menu3 col mb-1">--%>
                    <%--                        <a href="#drink" class="nav-link">Đồ Uống</a>--%>
                    <%--                    </div>--%>
                    <div class="menu4 col mb-1">
                        <a href="" class="nav-link">Hỗ Trợ</a>
                    </div>
                    <c:if test="${sessionScope.users != null && sessionScope.users.roleUser == 0}">
                        <div class="menu5 col mb-1">
                            <a href="/HNQTFood/admin/account" class="nav-link">Quản Lý</a>
                        </div>
                    </c:if>
                </div>
            </div>
            <div class="col-4">
                <div class="d-flex justify-content-end align-items-center">
                    <c:if test="${sessionScope.users != null}">
                        <a href="/HNQTFood/admin/edit_account?id=${sessionScope.users.id}">
                            <div class="btn-user ">
                                <span>${sessionScope.users.fullName}</span>
                                <img src="../../image/user/${sessionScope.users.avatar}" alt="#" height="32"
                                     width="32" style="border-radius: 20px"/>
                            </div>
                        </a>
                    </c:if>
                    <c:if test="${sessionScope.users == null}">
                        <div class="btn-wrapper">
                            <a href="/HNQTFood/home/home_page">
                                <div class="btn-user">
                                    <img src="../../image/icon/LogoUser.png" height="32" width="32"/>
                                </div>
                            </a>
                        </div>
                    </c:if>
                    <div class="btn-wrapper">
                        <a href="/HNQTFood/cart">
                            <div class="btn-cart">
                                <img src="../../image/icon/LogoCart.png" height="35" width="35"/>
                            </div>
                        </a>
                    </div>
                    <c:if test="${sessionScope.users != null}">
                        <div class="btn-wrapper">
                            <a href="/HNQTFood/home/log_out">
                                <div class="btn-logout">
                                    <img src="../../image/icon/LogoLogOut.png" height="32" width="32"/>
                                </div>
                            </a>
                        </div>
                    </c:if>

                    <c:if test="${sessionScope.users == null}">
                        <div class="btn-wrapper">
                            <a href="/HNQTFood/sign_in" class="auth-link">Đăng nhập/Đăng ký</a>
                        </div>
                    </c:if>
                </div>
            </div>
        </div>
    </div>
</header>

<!-- Di chuyển thanh tìm kiếm ra ngoài header -->
<div class="search-bar-container mt-5 pt-3">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-8 col-lg-6">
                <form action="/path/to/search" method="POST">
                    <div class="search-container">
                        <input type="text" class="search-bar" name="searchQuery" placeholder="Search...">
                        <button type="submit" class="search-button">Search</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<div class="container bg-primary-emphasis">
    <div class="row justify-content-center">
<%--        <a href="../home.jsp">--%>
<%--            <div--%>
<%--                    class="img-logo text-center">--%>
<%--                <img src="../../image/icon/LogoHeader.png" height="130" width="130"/>--%>
<%--            </div>--%>
<%--        </a>--%>

<%--        <h1 class=" text-center fw-bold display-1 " style="color: #F96222">HNQTFood</h1>--%>
<%--        <p class=" text-center fw-bold">Nhanh, Ngon, Tiện – Đầy Đủ Hương Vị Mỗi Ngày!</p>--%>

        <div class="col-12 text-center">
        </div>


        <div class="col-12 col-lg-5 ">
            <div class="shadow bg-white rounded">
                <div class="p-3 text-center border-bottom">

                    <h1 class="fw-bold mb-0 text-primary">PROFILE</h1>
                </div>

                <div>
                    <img id="avt" src="../../image/user/${users.avatar}"
                         alt="..." width="200" height="200">
                </div>

                <div class="p-3">
                    <form action="/HNQTFood/home/home_page" method="post" class="row">
                        <div class="col-12">
                            <div class="mb-2">
                                <label for="name">Họ tên</label>
                                <input type="text" class="form-control py-2" value="${users.fullName}" id="name"
                                       name="fullName" readonly>
                            </div>
                        </div>


                        <div class="col-12 ">
                            <label for="birthday">Ngày sinh</label>
                            <input class="p-2 border rounded col-12" type="text" id="birthday" value="${users.birthday}"
                                   name="birthday" readonly>
                        </div>


                        <div class="col-12">
                            <div class="mb-2">
                                <label for="gender">Giới tính</label>
                                <input type="text" class="form-control py-2" id="gender"
                                       value="${users.isGender() == 1?"Nam":"Nữ"}" name="gender" readonly>
                            </div>
                        </div>

                        <div class="col-12">
                            <div class="mb-2">
                                <label for="phone">Email</label>
                                <input type="text" class="form-control py-2" id="email" value="${users.email}"
                                       name="phone" readonly>
                            </div>
                        </div>

                        <div class="col-12">
                            <div class="mb-2">
                                <label for="phone">Số điện thoại</label>
                                <input type="text" class="form-control py-2" id="phone" value="${users.phoneNumber}"
                                       name="phone" readonly>
                            </div>
                        </div>

                        <div class="col-12">
                            <div class="mb-2">
                                <label for="address">Địa chỉ</label>
                                <input type="text" class="form-control py-2" id="address" value="${users.address}"
                                       name="address" readonly>
                            </div>
                        </div>

                        <div class="col-12 text-center">

                            <div class="row">
                                <div class="col-6">
                                    <button type="submit" class="btn btn-warning mt-1 px-5">
                                        Sửa thông tin
                                    </button>
                                </div>

                                <div class="col-6">
                                    <button type="submit" class="btn btn-danger mt-1 px-5">
                                        Quay Trở Lại
                                    </button>
                                </div>
                            </div>

                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

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
        <div class="container">
            <div class="col-xs-12 col-sm-12 col-lg-12 text-center">
                <p>Copyright © 2022 HNQTFood. All rights reserved.</p>
            </div>
        </div>
    </div>
</footer>


<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
        integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
        crossorigin="anonymous"></script>
<script src="DemoJS.js"></script>
</body>
</html>
