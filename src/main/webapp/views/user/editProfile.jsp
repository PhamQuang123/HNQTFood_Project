<%--
  Created by IntelliJ IDEA.
  User: HaiNam
  Date: 6/8/2024
  Time: 4:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thay đổi thông tin </title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"
          integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../../css/editProfile.css"/>
</head>
<body>
<div class="container bg-primary-emphasis">
    <div class="row justify-content-center">
        <div class="col-12 text-center">
        </div>



        <div class="col-12 col-lg-5">
            <div class="shadow bg-white rounded">
                <div class="p-3 text-center border-bottom">

                    <h1 class="fw-bold mb-0 text-primary">EDIT PROFILE</h1>
                </div>

                <div>
                    <img id="avt" src="https://nld.mediacdn.vn/zoom/700_438/2016/tag-reuters-com-2016-binary-mt1aci14477582-viewimage-1468189990234.jpg"
                         alt="..." width="200" height="200">
                </div>

                <div class="p-3">
                    <form action="#" class="row">
                        <div class="col-12">
                            <div class="mb-2">
                                <input type="text" class="form-control py-2" placeholder="Họ Và Tên">
                            </div>
                        </div>

                        <div class="col-12">
                            <div class="mb-2">
                                <input type="file" class="form-control py-2" placeholder="Thay đổi ảnh đại diện">
                            </div>
                        </div>

                        <div class="col-12 ">
                            <input  class="p-2 border rounded col-12" type="date" id="birthday" name="birthday">
                        </div>

                        <div class="col-12">
                            <div class="mb-2">
                                <select class="form-select" aria-label="Default select example">
                                    <option selected>Giới Tính</option>
                                    <option value="1">Nữ</option>
                                    <option value="2">Nam</option>
                                    <option value="3">Khác</option>
                                </select>
                            </div>
                        </div>

                        <div class="col-12">
                            <div class="mb-2">
                                <input type="text" class="form-control py-2" placeholder="Địa Chỉ">
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

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
<script src="DemoJS.js"></script>
</body>
</html>
