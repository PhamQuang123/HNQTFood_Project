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

</head>
<body>
<div class="container bg-primary-emphasis">
    <div class="row justify-content-center">
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
                                <option>
                                    <th>${product.productStatus == 1?"Còn bán":"Dừng bán"}</th>
                                </option>
                                <option value="1">Còn bán</option>
                                <option value="0">Dừng bán</option>
                            </select>
                        </div>
                        <div class="form-group mb-3">
                            <label for="exampleInputDesc">Mô tả</label>
                            <textarea class="form-control" name="descriptions" value="${product.descriptions}" id="exampleInputDesc"
                                      placeholder="Viết mô tả cho món ăn/ đồ uống"></textarea>
                        </div>
                        <div class="form-group mb-3">
                            <label for="exampleInputFile">Thêm link ảnh</label>
                            <input type="text" class="form-control" value="${product.image}" name="image" id="exampleInputFile"/>
                        </div>
                        <div class="form-group mb-3">
                            <label>Phân loại</label>
                            <select class="form-select" name="categoryId" aria-label="Default select example">
                                <option>
                                    <th>Chọn danh mục</th>
                                </option>
                                <option value="1">Đồ ăn</option>
                                <option value="2">Đồ uống</option>
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

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
<script src="DemoJS.js"></script>
</body>
</html>

