<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 04/06/2024
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Giỏ Hàng Shopee</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../css/cart.css">
</head>
<body>
<div class="container mt-4">
    <div class="cart-header">
        <h5>Giỏ Hàng</h5>
    </div>

    <div class="cart-item d-flex align-items-center">
        <div class="item-image">
            <img src="https://via.placeholder.com/100" alt="Product Image">
        </div>
        <div class="item-details">
            <h6>Tên Sản Phẩm</h6>
            <p class="text-muted">Mô tả ngắn gọn về sản phẩm.</p>
            <p>Giá: 100,000 VND</p>
        </div>
        <div class="item-quantity">
            <button class="btn btn-secondary btn-sm" onclick="decreaseQuantity(this)">-</button>
            <input type="number" class="form-control form-control-sm" value="1" min="1" readonly>
            <button class="btn btn-secondary btn-sm" onclick="increaseQuantity(this)">+</button>
        </div>
        <div class="item-total ml-3">
            <p>Tổng: 100,000 VND</p>
        </div>
        <div class="item-remove ml-3">
            <button class="btn btn-danger btn-sm">Xóa</button>
        </div>
    </div>


    <div class="cart-footer d-flex justify-content-between">
        <div>
            <p>Tổng Cộng: 100,000 VND</p>
        </div>
        <div>
            <button class="btn btn-primary">Tiến Hành Thanh Toán</button>
        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script>
    function decreaseQuantity(button) {
        const input = button.nextElementSibling;
        let quantity = parseInt(input.value);
        if (quantity > 1) {
            input.value = quantity - 1;
            updateTotal(button, input.value);
        }
    }

    function increaseQuantity(button) {
        const input = button.previousElementSibling;
        let quantity = parseInt(input.value);
        input.value = quantity + 1;
        updateTotal(button, input.value);
    }

    function updateTotal(button, quantity) {
        const item = button.closest('.cart-item');
        const price = parseFloat(item.querySelector('.item-details p:nth-child(3)').innerText.replace('Giá: ', '').replace(' VND', '').replace(/,/g, ''));
        const total = item.querySelector('.item-total p');
        const newTotal = price * quantity;
        total.innerText = 'Tổng: ' + newTotal.toLocaleString() + ' VND';

        updateGrandTotal();
    }

    function updateGrandTotal() {
        let grandTotal = 0;
        document.querySelectorAll('.cart-item').forEach(item => {
            const total = parseFloat(item.querySelector('.item-total p').innerText.replace('Tổng: ', '').replace(' VND', '').replace(/,/g, ''));
            grandTotal += total;
        });
        document.querySelector('.cart-footer p').innerText = 'Tổng Cộng: ' + grandTotal.toLocaleString() + ' VND';
    }
</script>
</body>
</html>
