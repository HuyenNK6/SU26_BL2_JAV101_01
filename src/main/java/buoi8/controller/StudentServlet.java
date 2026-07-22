package buoi8.controller;

import buoi8.entity.SinhVien;
import buoi8.repository.SinhVienRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "studentServlet", value = {
                "/student/get-all",
                "/student/add",
                "/student/detail",
                "/student/delete",
                "/student/update",
                "/student/view-update",
                "/student/search",
                "/student/top3"
})
public class StudentServlet extends HttpServlet {
    SinhVienRepository repository= new SinhVienRepository();
    List<SinhVien> listSV= new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri= req.getRequestURI();
        if(uri.contains("get-all")){
            this.getAll(req,resp);
        }
    }
    private void getAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. lấy danh sách từ repo
        listSV= repository.getAll();
        //2. set thuộc tính
        req.setAttribute("listSV",listSV);
        //3. chuyển sang jsp
        req.getRequestDispatcher("/buoi8/hien-thi.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
