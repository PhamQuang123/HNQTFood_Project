<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 04/06/2024
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Modal</title>
    <style>
        .modal-body img {
            max-width: 100%;
        }
        .product-details {
            display: flex;
            flex-direction: row;
            gap: 20px;
        }
        .product-info {
            flex: 1;
        }
    </style>
</head>
<body>
<div class="container mt-5">
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#productModal">
        Xem Chi Tiết Sản Phẩm
    </button>
</div>

<!-- Modal -->
<div class="modal fade" id="productModal" tabindex="-1" role="dialog" aria-labelledby="productModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-xl" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="productModalLabel">Chi Tiết Sản Phẩm</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="product-details">
                    <div class="product-image">
                        <img src="https://via.placeholder.com/300" alt="Product Image">
                    </div>
                    <div class="product-info">
                        <h3 class="product-name">Tên Sản Phẩm</h3>
                        <p class="product-price text-danger">₫1,000,000</p>
                        <p class="product-description">Mô tả sản phẩm chi tiết, bao gồm các đặc điểm và tính năng nổi bật của sản phẩm.</p>
                        <p class="product-details">Thông tin thêm về sản phẩm: Chất liệu, kích thước, trọng lượng, v.v.</p>
                        <button type="button" class="btn btn-success">Thêm vào giỏ hàng</button>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng</button>
            </div>
        </div>
    </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>