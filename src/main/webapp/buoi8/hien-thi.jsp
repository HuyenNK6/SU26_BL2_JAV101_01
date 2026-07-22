<%--
  Created by IntelliJ IDEA.
  User: Huyen
  Date: 7/22/2026
  Time: 9:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <thead>
            <th>ID</th>
            <th>Mã SV</th>
            <th>Họ tên</th>
            <th>Tuổi</th>
            <th>Địa chỉ</th>
            <th>Giới tính</th>
            <th>Lớp ID</th>
            <th>Hành động</th>
        </thead>
        <tbody>
            <c:forEach items="${listSV}" var="sv">
                <tr>
                    <td>${sv.id}</td>
                    <td>${sv.msv}</td>
                    <td>${sv.ten}</td>
                    <td>${sv.tuoi}</td>
                    <td>${sv.diaChi}</td>
                    <td>${sv.gioiTinh}</td>
                    <td>${sv.lopId}</td>
                    <td>
                        <a href="#">Detail</a>
                        <a href="#">Update</a>
                        <a href="#">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>
