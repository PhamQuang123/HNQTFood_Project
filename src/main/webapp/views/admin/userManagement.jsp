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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="./css/style.css"/>
</head>
<body>
<header></header>


<!--START BODY-->
<section class="pt-5">
    <h1 class="text-center">QUẢN LÝ NGƯỜI DÙNG</h1>


    <div class="container-fluid">
        <div class="row">
            <div class="col-md-8">
            </div>
            <div class="col-md-3 d-flex justify-content-end mx-auto p-2">
                <form action="#" method="post">
                    <input type="search" class="search-input form-check-input mt-0 border border-dark-subtle" placeholder="Tìm kiếm">
                    <button type="submit" name="search" class="btn btn-success ms-2" >
                        <i class="fa-solid fa-magnifying-glass"></i>
                    </button>
                </form>
            </div>
            <div class="col-md-1 mx-auto p-2">
                <button type="button" class="btn btn-success">
                    <i class="fa-solid fa-plus"></i>Thêm
                </button>
            </div>

        </div>
    </div>

    <!--  SIDEBAR & TABLE-->
    <div class="container-fluid">
        <div class="row">

            <!--SIDEBAR &TABLE-->
            <div class=" sidebar-magane col-md-2 p-1 fw-bold text end" >
                <p><a href="#" >Đồ ăn/ đồ uống</a></p>
                <hr>
                <a href="#" >Tài khoản</a>
                <hr>
                <a href="#" >Danh mục</a>
                <hr>
                <a href="#" >Lịch sử đơn hàng</a>
                <hr>
            </div>
            <!--SIDEBAR &TABLE-->


            <div class="col-md-10 mx-auto">
                <div class="container-fluid  ">
                    <table class="table  table-hover" >
                        <thead  id="title" class=" table table-light" >
                        <tr >
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
                        <tr>
                            <th scope="row">1</th>
                            <td name="name">Trung Đào</td>
                            <td name="image" ><img class="user-image" src="images/user1.jpg"/></td>
                            <td name="address">18,ngõ 58, Quan Hoa, Cầu Giấy, hà Nội</td>
                            <td name="gender">Nam</td>
                            <td name="birth">24/07/1998</td>
                            <td name="phone">0971343398 </td>
                            <td name="mail">trungbaizen@gmail.com</td>
                            <td name="pass">trung123</td>
                            <td name="status"><div class="form-check form-switch">
                                <input class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckChecked" checked>
                                <label class="form-check-label" for="flexSwitchCheckChecked"></label>
                            </div></td>
                        </tr>

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
<!--END FOOTER-->
</body>
</html>