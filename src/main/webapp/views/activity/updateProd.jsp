<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 04/06/2024
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Sửa thông tin</title>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">    <title>Title</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="FormSingUp.css">
    <link rel="stylesheet" href="../../css/addProduct.css">
    <link rel="stylesheet" href="../../css/style.css">
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
                    <%--                        <a href="" class="nav-link">Đồ Ăn</a>--%>
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
        <div class="col-12 col-lg-5 p-5">
            <div class="shadow bg-white rounded">
                <div class="p-3 text-center border-bottom p-5">
                    <h1>Thêm món mới</h1>
                </div>

                <div class="p-3">
                    <form action="/HNQTFood/admin/update_product" method="post">
                        <div class="form-group mb-3">
                            <label for="exampleInputName">Mã sản phẩm</label>
                            <input type="text" name="id" value="${product.id}" class="form-control" readonly/>
                        </div>
                        <div class="form-group mb-3">
                            <label for="exampleInputName">Tên món mới</label>
                            <input type="text" name="productName" value="${product.productName}" class="form-control" id="exampleInputName"/>
                        </div>
                        <div class="form-group mb-3">
                            <label for="exampleInputPrice">Đơn giá</label>
                            <input type="text" name="price" value="${product.price}" class="form-control" id="exampleInputPrice"/>
                        </div>
                        <div class="form-group mb-3">
                            <label>Trạng thái</label>
                            <%--                            <input type="text" class="form-control" id="exampleInputStatus"/>--%>
                            <select class="form-select" name="productStatus" aria-label="Default select example">
                                <option value="${product.productStatus}">
                                    <th>${product.productStatus == 0?"Còn bán":"Dừng bán"}</th>
                                </option>
                                <c:if test="${product.productStatus != 0}">
                                    <option value="0">Còn bán</option>

                                </c:if>
                                <option value="1">Dừng bán</option>
                            </select>
                        </div>
                        <div class="form-group mb-3">
                            <label for="exampleInputDesc">Mô tả</label>
                            <textarea class="form-control" name="descriptions" value="${product.descriptions}" id="exampleInputDesc"
                                      placeholder="Viết mô tả cho món ăn/ đồ uống"></textarea>
                        </div>
                        <div class="form-group mb-3">
                            <label for="exampleInputFile">Thêm ảnh</label>
                            <input type="file" class="form-control" value="${product.image}" name="image" id="exampleInputFile"/>
                            <c:if test="${product.category.id ==1}">
                                <img class="image" src="../../image/products/${product.image}">

                            </c:if>
                            <c:if test="${product.category.id ==2}">
                                <img class="image" src="../../image/products/drinks/${product.image}">

                            </c:if>
                        </div>
                        <div class="form-group mb-3">
                            <label>Phân loại</label>
                            <select class="form-select" name="categoryId" aria-label="Default select example">
                               <c:forEach items="${listCate}" var="listCate">
                                   <option value="${listCate.id}">${listCate.categoryName}</option>
                               </c:forEach>
                            </select>
                        </div>
                        <div class="row">
                            <div class="d-flex justify-content-center text-center">
                                <div class="col-md-3">
                                </div>
                                <div class="col-md-3">
                                    <a href="/HNQTFood/admin/product">
                                        <button type="button" class="btn btn-danger btn-lg"><i
                                                class="fa-solid fa-xmark"></i></button>
                                    </a>
                                </div>

                                <div class="col-md-3">
                                    <button type="submit" class="btn btn-primary btn-lg"><i
                                            class="fa-solid fa-check"></i></button>
                                </div>
                                <div class="col-md-3">
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
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

