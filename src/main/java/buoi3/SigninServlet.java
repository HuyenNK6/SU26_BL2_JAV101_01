package buoi3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "signinServlet", value = {
        "/signin",//GET
        "/ket-qua-signin"//POST
})
public class SigninServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/buoi3/sign-in.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. lấy từ form đăng ký về
        String ten = req.getParameter("ten");
        String ngaySinh = req.getParameter("ngaySinh");
        String sdt = req.getParameter("sdt");
        String gioiTinh = req.getParameter("gioiTinh");
        String quocGia = req.getParameter("quocGia");
        String[] soThichs = req.getParameterValues("soThich");
        //2. set thuộc tính để gửi đi
        req.setAttribute("ten", ten);
        req.setAttribute("ngaySinh", ngaySinh);
        req.setAttribute("sdt", sdt);
        req.setAttribute("gioiTinh", gioiTinh);
        req.setAttribute("quocGia", quocGia);
        req.setAttribute("soThichs", soThichs);
        //3. chuyển sang trang kết quả
        req.getRequestDispatcher("/buoi3/ket-qua-sign-in.jsp").forward(req,resp);
    }
}
