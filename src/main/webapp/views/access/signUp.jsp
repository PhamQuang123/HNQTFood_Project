<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 04/06/2024
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<<<<<<< HEAD
=======
<!DOCTYPE html>
<html lang="en">
<html>
<head>
    <meta charset="utf-8"/>

    <link rel="stylesheet" href="../../css/style.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"
          integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<header class="fixed-top">
    <nav class="navbar navbar-expand-lg fixed-top bg-body-tertiary">
        <div class="container-fluid">
            <a class="navbar-brand -logo" href="/HNQTFood.com.vn/home_page" style="color: #F96222">HNQTFood</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="/HNQTFood.com.vn/home_page">Trang chủ</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Đồ Ăn</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Đồ uống</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                           aria-expanded="false">
                            Dropdown
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="#">Action</a></li>
                            <li><a class="dropdown-item" href="#">Another action</a></li>
                            <li>
                                <hr class="dropdown-divider">
                            </li>
                            <li><a class="dropdown-item" href="#">Something else here</a></li>
                        </ul>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" aria-disabled="true">Disabled</a>
                    </li>
                </ul>
                <form class="d-flex" role="search">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
</header>

<section>
    <div class="container bg-primary-emphasis mt-5">
        <div class="row justify-content-center mt-5">

            <h1 class=" text-center fw-bold display-1 " style="color: #F96222">HNQTFood</h1>
            <p class=" text-center fw-bold">Nhanh, Ngon, Tiện – Đầy Đủ Hương Vị Mỗi Ngày!</p>

            <div class="col-12 col-lg-5">
                <div class="shadow bg-white rounded">
                    <div class="p-3 text-center border-bottom">
                        <h4 class="fw-bold mb-0">Đăng ký tài khoản</h4>
                        <p class="mb-0">Nhanh chóng và dễ dàng. </p>
                    </div>
                    <div class="p-3">
                        <form action="/HNQTFood.com.vn/sign_up" method="post" class="row">
                            <div class="col-12 col-lg-6">
                                <div class="mb-2">
                                    <input type="text" name="first_name" value="${first_name}" class="form-control py-2"
                                           placeholder="Họ">
                                </div>
                            </div>
                            <div class="col-12 col-lg-6">
                                <div class="mb-2">
                                    <input type="text" name="last_name" value="${last_name}" class="form-control py-2"
                                           placeholder="Tên">
                                </div>
                            </div>
                            <div class="col-12">
                                <div class="mb-2">
                                    <input type="text" name="email" value="${email}" class="form-control py-2"
                                           placeholder="Email">
                                    <small class="text-danger">${errEmail}</small>

                                </div>
                            </div>
                            <div class="col-12">
                                <div class="mb-2">
                                    <input type="text" name="phone" value="${phone}" class="form-control py-2"
                                           placeholder="Số điện thoại">
                                    <small class="text-danger">${errPhone}</small>

                                </div>
                            </div>
                            <div class="col-12 -password">
                                <div class="mb-2">
                                    <input type="password" name="pass" value="${pass}" class="form-control py-2"
                                           placeholder="Mật khẩu mới">
                                    <small class="text-danger">${errPass}</small>

                                </div>
                            </div>
                            <div class="col-12 -password">
                                <div class="mb-2">
                                    <input type="password" name="reconfirm_pass" class="form-control py-2"
                                           placeholder="Xác nhận lại mật khẩu">
                                </div>
                            </div>

                            <div class="mb-1">
                                <small>Giới tính</small>
                            </div>
                            <div class="col-4">
                                <label class="mb-2 d-flex justify-content-between p-2 border rounded">
                                    <div>
                                        <p class="m-0">Nữ</p>
                                    </div>
                                    <div>
                                        <input class="form-check-input" value="0" checked type="radio" name="gender">
                                    </div>
                                </label>
                            </div>
                            <div class="col-4">
                                <label class="mb-2 d-flex justify-content-between p-2 border rounded">
                                    <div>
                                        <p class="m-0">Nam</p>
                                    </div>
                                    <div>
                                        <input class="form-check-input" value="1" type="radio" name="gender"/>
                                    </div>
                                </label>
                            </div>
                            <div class="col-4">
                                <label class="mb-2 d-flex justify-content-between p-2 border rounded">
                                    <div>
                                        <p class="m-0">Khác</p>
                                    </div>
                                    <div>
                                        <input class="form-check-input" value="2" type="radio" name="gender"/>
                                    </div>
                                </label>
                            </div>

                            <div class="mb-1">
                                <small>Ngày sinh</small>
                            </div>
                            <div class="col-12 ">
                                <input class="p-2 border rounded col-12" type="date" id="birthday" name="birthday"
                                       value="${birthday}"/>
                                <small  class="text-danger">${errBirthday}</small>
                            </div>

                            <div class="col-12 text-center">
                                <div>
                                    <button type="submit" class="btn btn-danger mt-5 px-5">
                                        Đăng Ký
                                    </button>
                                </div>
                                <div class="mt-2"><a href="/HNQTFood.com.vn/sign_in"
                                                     class="text-decoration-none text-primary">
                                    Đã có tài khoản?
                                </a>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

</section>
<footer class="p-5">
    <div class="footer1">
        <div class="row">
            <div class="col-xs-3 col-sm-3 col-lg-3 text-center">
                <h3>HNQTFood</h3>
                <p>Nhanh, Ngon, Tiện – Đầy Đủ Hương Vị Mỗi Ngày!</p>
            </div>

            <div class="col-xs-3 col-sm-3 col-lg-3 text-center">
                <h3>Chính sách cửa hàng</h3>
                <p><a href="#" class="text-reset text-decoration-none">Dịch vụ</a> </p>
                <p><a href="#" class="text-reset text-decoration-none">Ưu đãi</a></p>
                <p><a href="#" class="text-reset text-decoration-none">Giải quyết khiếu nại</a></p>

            </div>

            <div class="col-xs-3 col-sm-3 col-lg-3 text-center">
                <h3>Liên  hệ với chúng tôi</h3>
                <ul>
                    <li><a href="" class="fa-brands fa-facebook"></a> </li>
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

</body>
</html>