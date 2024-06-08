<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 04/06/2024
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">

<html>
<head>
    <meta charset="utf-8" />
    <link rel="stylesheet" href="../../css/style.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<section>
    <div class="login-form mt-5 ">
        <div class="row justify-content-center">
            <a href="/HNQTFood/home/home_page">
                <div
                        class="img-logo text-center">
                    <img src="../../image/icon/LogoHeader.png" height="130" width="130"/>
                </div>
            </a>
            <div class="col-md-3">
                <div class=" mt-5">
                    <h1 class=" text-center fw-bold display-1 " style="color: #F96222">HNQTFood</h1>
                    <p class=" text-center fw-bold">Nhanh, Ngon, Tiện – Đầy Đủ Hương Vị Mỗi Ngày!</p>
                </div>
                <div class="card mt-1 shadow p-3 mb-5 bg-body-tertiary rounded">
                    <div class="card-header">
                        <h1 class="card-title text-center">Đăng nhập</h1>
                    </div>
                    <div class="card-body">
                        <form action="/HNQTFood/sign_in" method="post">
                            <div class="form-group">
                                <label for="email">Username:</label>
                                <input type="text" id="email" name="email" class="form-control" placeholder="Enter username">
                                <small class="text-danger">${err}</small>
                            </div>

                            <div class="form-group">
                                <label for="password">Password:</label>
                                <input type="password" id="password" name="pass" class="form-control" placeholder="Enter password">
                                <small class="text-danger">${err}</small>
                            </div>

                            <div class="form-check">
                                <input class="form-check-input" name="rememberAccount" value="false" type="checkbox"  id="flexCheckDefault">
                                <label class="form-check-label" for="flexCheckDefault">
                                    Nhớ mật khẩu
                                </label>
                            </div>

                            <div class="d-flex justify-content-center mt-1">
                                <button type="submit" class="btn btn-danger btn-block " >Đăng nhập</button>
                            </div>

                            <div class="d-flex justify-content-center mt-1">
                                <a  href="/HNQTFood/sign_up" class="link-offset-2 link-offset-3-hover link-underline link-underline-opacity-0 link-underline-opacity-75-hover" >
                                    Đăng Ký Tài Khoản
                                </a>/
                                <a class="link-offset-2 link-offset-3-hover link-underline link-underline-opacity-0 link-underline-opacity-75-hover" href="#">
                                    Quên mât khẩu?
                                </a>
                            </div>

                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<footer class="">
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
<script>
    document.getElementById('flexCheckDefault').addEventListener('click', function() {
        if (this.checked) {
            this.value = 'true';
        } else {

            this.value = 'false';}
        console.log(document.getElementById('flexCheckDefault').value)
    });
</script>
</body>
</html>