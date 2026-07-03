<%--
  Created by IntelliJ IDEA.
  User: Huyen
  Date: 7/3/2026
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1> FORM ĐĂNG KÝ</h1>
    <form action="/ket-qua-signin" method="post">
        Họ và tên: <input type="text" name="ten" placeholder="Nhập họ và tên"> <br>
        Ngày sinh: <input type="date" name="ngaySinh"><br>
        Số điện thoại: <input type="text" name="sdt" placeholder="Nhập số điện thoại"> <br>
        Giới tính:
        <input type="radio" name="gioiTinh" value="nam"> Nam
        <input type="radio" name="gioiTinh" value="nu"> Nữ <br>
        Quốc gia:
        <select name="quocGia">
            <option value="vn">Việt Nam</option>
            <option value="hq">Hàn Quốc</option>
            <option value="tq">Trung Quốc</option>
        </select> <br>
        Sở thích:
        <input type="checkbox" name="soThich" value="book"> Đọc sách <br>
        <input type="checkbox" name="soThich" value="travel"> Du lịch <br>
        <input type="checkbox" name="soThich" value="music"> Nghe nhạc <br>
        <button type="submit">ĐĂNG KÝ</button>
    </form>
</body>
</html>
