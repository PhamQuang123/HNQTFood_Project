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
<html>
<head>
    <meta charset="utf-8" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../../css/style.css"/>
</head>
<body>
<header class="fixed-top">
    <nav class="navbar navbar-expand-lg fixed-top bg-body-tertiary">
        <div class="container-fluid">
            <a class="navbar-brand -logo fw-bold fs-1" href="#" style="color: #F96222">HNQTFood</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active fw-bold fs-5" aria-current="page" href="#">Trang chủ</a>
                    </li>
                    <li class="nav-item fw-bold fs-5">
                        <a class="nav-link" href="#">Đồ Ăn</a>
                    </li>
                    <li class="nav-item fw-bold fs-5">
                        <a class="nav-link" href="#">Đồ uống</a>
                    </li>
                </ul>
                <form class="d-flex" role="search">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <c:if test="${sessionScope.users == null}">
                        <li class="nav-item fw-bold fs-5">
                            <a class="nav-link" href="/HNQTFood.com.vn/sign_up">Đăng ký</a>
                        </li>
                    </c:if>

                   <c:if test="${sessionScope.users == null}">
                       <li class="nav-item fw-bold fs-5">
                           <a class="nav-link" href="/HNQTFood.com.vn/sign_in">Đăng nhập</a>
                       </li>
                   </c:if>

                    <c:if test="${sessionScope.user != null}">
                        <li class="nav-item fw-bold fs-5">
                            <a class="nav-link" href="/HNQTFood.com.vn/v1/logout">logout</a>
                        </li>
                    </c:if>
                    <li class="nav-item fw-bold fs-5">
                        <p>${users.fullName}</p>
                    </li>
                    <li class="nav-item fw-bold fs-5">
                        <img src="#" alt="avatar" width="50" height="50">
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>
<section>
    <div class="slide-show">
        <div id="carouselExampleInterval" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active" data-bs-interval="100">
                    <img src="./images/banner2.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item" data-bs-interval="2000">
                    <img src="./images/banner1.jpeg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="./images/banner3.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="./images/banner4jpg.jpg" class="d-block w-100" alt="...">
                </div>

            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="next">
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
                <div class="col">
                    <div class="card h-100">
                        <img src="./images/products/prod1.jpg" class="card-img-top" alt="..." >
                        <div class="card-body">
                            <h5 class="card-title">Bánh mì pate</h5>
                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="d-flex justify-content-around mb-5">
                            <h3>30.000 vnđ</h3>
                            <button type="button" class="btn btn-primary"><i class="fa-solid fa-basket-shopping"></i></button>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="card h-100">
                        <img src="./images/products/prod1.jpg" class="card-img-top" alt="..." >
                        <div class="card-body">
                            <h5 class="card-title">Bánh mì pate</h5>
                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="d-flex justify-content-around mb-5">
                            <h3>30.000 vnđ</h3>
                            <button type="button" class="btn btn-primary"><i class="fa-solid fa-basket-shopping"></i></button>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="card h-100">
                        <img src="./images/products/prod1.jpg" class="card-img-top" alt="..." >
                        <div class="card-body">
                            <h5 class="card-title">Bánh mì pate</h5>
                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="d-flex justify-content-around mb-5">
                            <h3>30.000 vnđ</h3>
                            <button type="button" class="btn btn-primary"><i class="fa-solid fa-basket-shopping"></i></button>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="card h-100">
                        <img src="./images/products/prod1.jpg" class="card-img-top" alt="..." >
                        <div class="card-body">
                            <h5 class="card-title">Bánh mì pate</h5>
                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="d-flex justify-content-around mb-5">
                            <h3>30.000 vnđ</h3>
                            <button type="button" class="btn btn-primary"><i class="fa-solid fa-basket-shopping"></i></button>
                        </div>
                    </div>
                </div>

                <div  class="col">
                    <div class="card h-100">
                        <img src="./images/products/prod1.jpg" class="card-img-top" alt="..." >
                        <div class="card-body">
                            <h5 class="card-title">Bánh mì pate</h5>
                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="d-flex justify-content-around mb-5">
                            <h3>30.000 vnđ</h3>
                            <button type="button" class="btn btn-primary"><i class="fa-solid fa-basket-shopping"></i></button>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="card h-100">
                        <img src="./images/products/prod1.jpg" class="card-img-top" alt="..." >
                        <div class="card-body">
                            <h5 class="card-title">Bánh mì pate</h5>
                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="d-flex justify-content-around mb-5">
                            <h3>30.000 vnđ</h3>
                            <button type="button" class="btn btn-primary"><i class="fa-solid fa-basket-shopping"></i></button>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="category1">
            <h1 class="text-center">ĐỒ ĂN</h1>
            <hr>
            <div class="row row-cols-1 row-cols-md-3 g-4 py-5">
                <div class="col">
                    <div class="card h-100">
                        <img src="./images/products/prod1.jpg" class="card-img-top" alt="..." >
                        <div class="card-body">
                            <h5 class="card-title">Bánh mì pate</h5>
                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="d-flex justify-content-around mb-5">
                            <h3>30.000 vnđ</h3>
                            <button type="button" class="btn btn-primary"><i class="fa-solid fa-basket-shopping"></i></button>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="card h-100">
                        <img src="./images/products/prod1.jpg" class="card-img-top" alt="..." >
                        <div class="card-body">
                            <h5 class="card-title">Bánh mì pate</h5>
                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="d-flex justify-content-around mb-5">
                            <h3>30.000 vnđ</h3>
                            <button type="button" class="btn btn-primary"><i class="fa-solid fa-basket-shopping"></i></button>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="card h-100">
                        <img src="./images/products/prod1.jpg" class="card-img-top" alt="..." >
                        <div class="card-body">
                            <h5 class="card-title">Bánh mì pate</h5>
                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="d-flex justify-content-around mb-5">
                            <h3>30.000 vnđ</h3>
                            <button type="button" class="btn btn-primary"><i class="fa-solid fa-basket-shopping"></i></button>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="card h-100">
                        <img src="./images/products/prod1.jpg" class="card-img-top" alt="..." >
                        <div class="card-body">
                            <h5 class="card-title">Bánh mì pate</h5>
                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="d-flex justify-content-around mb-5">
                            <h3>30.000 vnđ</h3>
                            <button type="button" class="btn btn-primary"><i class="fa-solid fa-basket-shopping"></i></button>
                        </div>
                    </div>
                </div>

                <div  class="col">
                    <div class="card h-100">
                        <img src="./images/products/prod1.jpg" class="card-img-top" alt="..." >
                        <div class="card-body">
                            <h5 class="card-title">Bánh mì pate</h5>
                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="d-flex justify-content-around mb-5">
                            <h3>30.000 vnđ</h3>
                            <button type="button" class="btn btn-primary"><i class="fa-solid fa-basket-shopping"></i></button>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="card h-100">
                        <img src="./images/products/prod1.jpg" class="card-img-top" alt="..." >
                        <div class="card-body">
                            <h5 class="card-title">Bánh mì pate</h5>
                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="d-flex justify-content-around mb-5">
                            <h3>30.000 vnđ</h3>
                            <button type="button" class="btn btn-primary"><i class="fa-solid fa-basket-shopping"></i></button>
                        </div>
                    </div>
                </div>
            </div>


        </div>

        <div class="category">
            <h1 class="text-center">ĐỒ UỐNG</h1>
            <hr>
            <div class="row row-cols-1 row-cols-md-3 g-4 py-5">
                <div class="col">
                    <div class="card h-100">
                        <img src="./images/products/prod1.jpg" class="card-img-top" alt="..." >
                        <div class="card-body">
                            <h5 class="card-title">Bánh mì pate</h5>
                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="d-flex justify-content-around mb-5">
                            <h3>30.000 vnđ</h3>
                            <button type="button" class="btn btn-primary"><i class="fa-solid fa-basket-shopping"></i></button>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="card h-100">
                        <img src="./images/products/prod1.jpg" class="card-img-top" alt="..." >
                        <div class="card-body">
                            <h5 class="card-title">Bánh mì pate</h5>
                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="d-flex justify-content-around mb-5">
                            <h3>30.000 vnđ</h3>
                            <button type="button" class="btn btn-primary"><i class="fa-solid fa-basket-shopping"></i></button>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="card h-100">
                        <img src="./images/products/prod1.jpg" class="card-img-top" alt="..." >
                        <div class="card-body">
                            <h5 class="card-title">Bánh mì pate</h5>
                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="d-flex justify-content-around mb-5">
                            <h3>30.000 vnđ</h3>
                            <button type="button" class="btn btn-primary"><i class="fa-solid fa-basket-shopping"></i></button>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="card h-100">
                        <img src="./images/products/prod1.jpg" class="card-img-top" alt="..." >
                        <div class="card-body">
                            <h5 class="card-title">Bánh mì pate</h5>
                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="d-flex justify-content-around mb-5">
                            <h3>30.000 vnđ</h3>
                            <button type="button" class="btn btn-primary"><i class="fa-solid fa-basket-shopping"></i></button>
                        </div>
                    </div>
                </div>

                <div  class="col">
                    <div class="card h-100">
                        <img src="./images/products/prod1.jpg" class="card-img-top" alt="..." >
                        <div class="card-body">
                            <h5 class="card-title">Bánh mì pate</h5>
                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="d-flex justify-content-around mb-5">
                            <h3>30.000 vnđ</h3>
                            <button type="button" class="btn btn-primary"><i class="fa-solid fa-basket-shopping"></i></button>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="card h-100">
                        <img src="./images/products/prod1.jpg" class="card-img-top" alt="..." >
                        <div class="card-body">
                            <h5 class="card-title">Bánh mì pate</h5>
                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="d-flex justify-content-around mb-5">
                            <h3>30.000 vnđ</h3>
                            <button type="button" class="btn btn-primary"><i class="fa-solid fa-basket-shopping"></i></button>
                        </div>
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
        <div class="col-xs-12 col-sm-12 col-lg-12 text-center">
            <p>Copyright © 2022 HNQTFood. All rights reserved.</p>
        </div>
    </div>
</footer>


</body>
</html>