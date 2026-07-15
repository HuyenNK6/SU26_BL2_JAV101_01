<%--
  Created by IntelliJ IDEA.
  User: Huyen
  Date: 7/13/2026
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Danh sách Sinh Viên</h1>
    <form action="/sinh-vien/add" method="post">
        Mã SV: <input type="text" name="msv" value="${sv.msv}"><br>
        Họ tên: <input type="text" name="ten" value="${sv.ten}"><br>
        Tuổi: <input type="text" name="tuoi" value="${sv.tuoi}"><br>
        Giới tính:
        <input type="radio" name="gioiTinh" value="${sv.gioiTinh}" ${sv.gioiTinh ? "": "checked"}> Nam
        <input type="radio" name="gioiTinh" value="${sv.gioiTinh}" ${sv.gioiTinh ? "checked": ""}> Nữ<br>
        Địa chỉ: <input type="text" name="diaChi" value="${sv.diaChi}"><br>
        <button type="submit">Thêm mới</button>
    </form>
    <table>
        <thead>
            <th>STT</th>
            <th>Mã SV</th>
            <th>Họ tên</th>
            <th>Tuổi</th>
            <th>Giới tính</th>
            <th>Địa chỉ</th>
            <th>Hành động</th>
        </thead>
        <tbody>
            <c:forEach items="${listSV}" var="sv" varStatus="i">
                <tr>
                    <td>${i.index+1}</td>
                    <td>${sv.msv}</td>
                    <td>${sv.ten}</td>
                    <td>${sv.tuoi}</td>
                    <td>${sv.gioiTinh}</td>
                    <td>${sv.diaChi}</td>
                    <td>
                        <a href="/sinh-vien/detail?msv=${sv.msv}">Detail</a>
                        <a href="#">Update</a>
                        <a href="#">Remove</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
