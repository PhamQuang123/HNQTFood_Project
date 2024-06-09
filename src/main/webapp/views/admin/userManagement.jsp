<%--
  Created by IntelliJ IDEA.
  User: HaiNam
  Date: 6/7/2024
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Quản lý tài khoản</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"
          integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>

    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap"
          rel="stylesheet">
    <link rel="stylesheet" href="../../css/productManagement"/>
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
<!--START BODY-->
<section class="pt-5">
    <h1 class="text-center">QUẢN LÝ NGƯỜI DÙNG</h1>
<%--    <div class="container-fluid">--%>
<%--        <div class="row">--%>
<%--            <div class="col-md-8">--%>
<%--            </div>--%>
<%--            <div class="col-md-3 d-flex justify-content-end mx-auto p-2">--%>
<%--                <form action="#" method="post">--%>
<%--                    <input type="search" class="search-input form-check-input mt-0 border border-dark-subtle"--%>
<%--                           placeholder="Tìm kiếm">--%>
<%--                    <button type="submit" name="search" class="btn btn-success ms-2">--%>
<%--                        <i class="fa-solid fa-magnifying-glass"></i>--%>
<%--                    </button>--%>
<%--                </form>--%>
<%--            </div>--%>
<%--            <div class="col-md-1 mx-auto p-2">--%>
<%--                <button type="button" class="btn btn-success">--%>
<%--                    <a href="/HNQTFood/admin/new_product"><i class="fa-solid fa-plus"></i>Thêm</a>--%>
<%--                </button>--%>
<%--            </div>--%>

<%--        </div>--%>
<%--    </div>--%>

    <!--  SIDEBAR & TABLE-->
    <div class="container-fluid">
        <div class="row">

            <!--SIDEBAR &TABLE-->
            <div class=" sidebar-magane col-md-2 p-1 fw-bold text end">
                <p><a href="/HNQTFood/admin/product">Đồ ăn/ đồ uống</a></p>
                <hr>
                <a href="/HNQTFood/admin/account">Tài khoản</a>
                <hr>
<%--                <a href="/HNQTFood/admin/category">Danh mục</a>--%>
<%--                <hr>--%>
<%--                <a href="/HNQTFood/admin/order">Lịch sử đơn hàng</a>--%>
<%--                <hr>--%>
            </div>
            <!--SIDEBAR &TABLE-->


            <div class="col-md-10 mx-auto">
                <div class="container-fluid  ">
                    <table class="table  table-hover">
                        <thead id="title" class=" table table-light">
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Tên tài khoản</th>
                            <th scope="col">Ảnh</th>
                            <th scope="col">Địa chỉ</th>
                            <th scope="col">Giới tính</th>
                            <th scope="col">Ngày sinh</th>
                            <th scope="col">Số điện thoại</th>
                            <th scope="col">Email</th>
                            <th scope="col">Mật khẩu</th>
                            <th scope="col">Trạng thái</th>
                        </tr>
                        </thead>

                        <!-- MAIN TABLE-->
                        <tbody class=" table-group-divider">
                        <c:set var="i" value="1"/>
                        <c:forEach items="${listAccount}" var="account">
                            <tr>
                                <th scope="row">${i}</th>
                                <td name="name">${account.fullName}</td>
                                <td name="image"><img class="user-image" src="../../image/user/${account.avatar}"
                                                      style="width: 150px;height: 150px; border-radius: 12px"
                                                      alt="avatar"/></td>
                                <td name="address">${account.address}</td>
                                <td name="gender">${account.isGender() == 1? "Nam":"Nữ"}</td>
                                <td name="birth">${account.birthday}</td>
                                <td name="phone">${account.phoneNumber} </td>
                                <td name="mail">${account.email}</td>
                                <td name="pass">${account.pass}</td>
                                <td name="status">
                                    <div class="form-check form-switch">
                                        <a class="text-decoration"
                                           href="/HNQTFood/admin/block_account?id=${account.id}&&status=${account.userStatus}"
                                           onclick="handleStatus(1)" id="status${account.id}">
                                            <span>${account.userStatus?"Hoạt động":"Khoá"}</span>
                                        </a>
                                    </div>
                                </td>
                            </tr>
                            <c:set var="i" value="${i + 1}"/>
                        </c:forEach>

                        </tbody>
                        <!--END MAIN TABLE-->
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>
<!--END BODY-->

<!--START FOOTER-->
<footer>
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
<!--END FOOTER-->
</body>
</html>