<%--
  Created by IntelliJ IDEA.
  User: HaiNam
  Date: 6/8/2024
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"
          integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../../css/editProfile.css"/>
    <link rel="stylesheet" href="../../css/style.css"/>
</head>
<body>

<div class="container bg-primary-emphasis">
    <div class="row justify-content-center">
        <a href="../home.jsp">
            <div
                    class="img-logo text-center">
                <img src="../../image/icon/LogoHeader.png" height="130" width="130"/>
            </div>
        </a>

        <h1 class=" text-center fw-bold display-1 " style="color: #F96222">HNQTFood</h1>
        <p class=" text-center fw-bold">Nhanh, Ngon, Tiện – Đầy Đủ Hương Vị Mỗi Ngày!</p>

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
                    <form action="#" class="row">
                        <div class="col-12">
                            <div class="mb-2">
                                <input type="text" class="form-control py-2" value="${users.fullName}" placeholder="Họ Và Tên">
                            </div>
                        </div>

                        <div class="col-12">
                            <div class="mb-2">
                                <input type="file" class="form-control py-2" value="${users.avatar}" placeholder="Thay đổi ảnh đại diện">
                            </div>
                        </div>

                        <div class="col-12 ">
                            <input  class="p-2 border rounded col-12" type="date" id="birthday" value="${users.birthday}" name="birthday">
                        </div>

                        <div class="col-12 ">
                            <div class="row">
                                <div class="col-4">
                                    <label class="mb-2 d-flex justify-content-between p-2 border rounded">
                                        <div>
                                            <p class="m-0">Nữ</p>
                                        </div>
                                        <div>
                                            <input class="form-check-input" value="" ${users.isGender() == 0?"checked":""} type="radio" name="gender">
                                        </div>
                                    </label>
                                </div>
                                <div class="col-4">
                                    <label class="mb-2 d-flex justify-content-between p-2 border rounded">
                                        <div>
                                            <p class="m-0">Nam</p>
                                        </div>
                                        <div>
                                            <input class="form-check-input" value="1" ${users.isGender() == 1?"checked":""} type="radio" name="gender"/>
                                        </div>
                                    </label>
                                </div>
                                <div class="col-4">
                                    <label class="mb-2 d-flex justify-content-between p-2 border rounded">
                                        <div>
                                            <p class="m-0">Khác</p>
                                        </div>
                                        <div>
                                            <input class="form-check-input" value="2" ${users.isGender() == 2?"checked":""} type="radio" name="gender"/>
                                        </div>
                                    </label>
                                </div>
                            </div>
                        </div>

                        <div class="col-12">
                            <div class="mb-2">
                                <input type="text" class="form-control py-2" value="${users.address}" placeholder="Địa Chỉ">
                            </div>
                        </div>

                        <div class="col-12 text-center">
                            <div class="row">
                                <div class="col-6">
                                    <button type="submit" class="btn btn-primary mt-1 px-5">
                                        Lưu Thông Tin
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


<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
<script src="DemoJS.js"></script>
</body>
</html>
