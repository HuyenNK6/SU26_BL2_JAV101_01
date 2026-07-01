package buoi2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "loginServlet", value = {"/login","/ket-qua"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name  = "HuyenNK6";
        req.setAttribute("name", name);
        req.getRequestDispatcher("/buoi2/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. lấy kết quả từ form gửi về
        String username= req.getParameter("username");
        String password= req.getParameter("password");
        //2. set thuộc tính
        req.setAttribute("username", username);
        req.setAttribute("password", password);
        //3. gửi sang trang kết quả hiển thị
        req.getRequestDispatcher("/buoi2/ket-qua.jsp").forward(req,resp);
    }
}
