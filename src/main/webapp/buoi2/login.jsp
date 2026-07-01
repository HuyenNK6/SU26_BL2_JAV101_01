<%--
  Created by IntelliJ IDEA.
  User: Huyen
  Date: 7/1/2026
  Time: 9:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Trang Đăng Nhập</title>
</head>
<body>
    <h1>${name}</h1>
<%--    FORM CONTROL
-   - action: địa chỉ URL sẽ được gửi đến khi bấm form submic
    - method: hình thức gửi dữ liệu: GET & POST
        + GET: gửi trực tiếp dữ liệu trên URL đến server
        + POST: tạo ra kênh truyền dữ liệu ngầm tới server
--%>
    <form action="/ket-qua" method="post">
        Username : <input type="text" name="username" placeholder="Enter your username"><br>
        Password : <input type="password" name="password" placeholder="Enter your username"><br>
        <button type="submit">Login</button>
    </form>
</body>
</html>
