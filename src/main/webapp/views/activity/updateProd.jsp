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
        <div class="col-12 col-lg-5 p-5">
            <div class="shadow bg-white rounded">
                <div class="p-3 text-center border-bottom p-5">
                    <h1>Thêm món mới</h1>
                </div>

                <div class="p-3">
                    <div class="form-group mb-3">
                        <label for="ID">ID món ăn/đồ uống</label>
                        <input type="text" class="form-control" id="ID" readonly/>
                    </div>
                    <div class="form-group mb-3">
                        <label for="name">Thay đổi tên</label>
                        <input type="text" class="form-control" id="name" />
                    </div>
                    <div class="form-group mb-3">
                        <label for="exampleInputPrice">Đơn giá</label>
                        <input type="text" class="form-control" id="exampleInputPrice" />
                    </div>
                    <div class="form-group mb-3">
                        <label for="exampleInputStatus">Trạng thái</label>
                        <input type="text" class="form-control" id="exampleInputStatus" />
                    </div>
                    <div class="form-group mb-3">
                        <label for="exampleInputDesc">Mô tả</label>
                        <textarea class="form-control" id="exampleInputDesc" placeholder="Viết mô tả cho món ăn/ đồ uống"></textarea>
                    </div>
                    <div class="form-group mb-3">
                        <label for="exampleInputFile">Chọn ảnh</label>
                        <input type="text" class="form-control" id="exampleInputFile" />
                    </div>
                    <div class="form-group mb-3">
                        <label>Phân loại</label>
                        <select class="form-select" aria-label="Default select example">
                            <option><th>Chọn danh mục</th></option>
                            <option value="1">Đồ ăn</option>
                            <option value="2">Đồ uống</option>
                        </select>
                    </div>
                    <div class="row">
                        <div class="d-flex justify-content-center text-center">
                            <div class="col-md-3">
                            </div>
                            <div class="col-md-3">
                                <button type="button" class="btn btn-danger btn-lg"><i class="fa-solid fa-xmark"></i></button>
                            </div>

                            <div class="col-md-3">
                                <button type="button" class="btn btn-warning btn-lg"><i class="fa-solid fa-pen"></i></button>
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

