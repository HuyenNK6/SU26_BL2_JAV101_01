package buoi4.controller;

import buoi4.entity.SinhVien;
import buoi4.service.SinhVienService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "sinhVienServlet", value = {
        "/sinh-vien/get-all", //GET
        "/sinh-vien/search", //GET
        "/sinh-vien/remove", //GET
        "/sinh-vien/detail", //GET
        "/sinh-vien/add", //POST
        "/sinh-vien/view-update", //GET
        "/sinh-vien/update" //POST
})
public class SinhVienServlet extends HttpServlet {
    SinhVienService service= new SinhVienService();
    List<SinhVien> listSV= new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.getRequestURL()=> http://localhost:8080/sinh-vien/get-all
        //req.getRequestURI()=> /sinh-vien/get-all
        String uri = req.getRequestURI();
        if(uri.contains("get-all")){
            this.getAll(req,resp);
        }else if(uri.contains("search")){
            this.search(req,resp);
        }else if(uri.contains("remove")){
            this.remove(req,resp);
        }else if(uri.contains("detail")){
            this.detail(req,resp);
        }else if(uri.contains("view-update")){
            this.viewUpdate(req,resp);
        }
    }

    private void getAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. lấy list từ service
        listSV = service.getAll();
        //2. set thuộc tính
        req.setAttribute("listSV",listSV);
        //3. chuyển sang jsp
        req.getRequestDispatcher("/buoi4/hien-thi.jsp").forward(req,resp);
    }

    private void viewUpdate(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void detail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. cần lấy msv cần lấy thông tin chi tiết
        String msv= req.getParameter("msv");
        //2. cần tìm đối tượng SV có msv trên
        SinhVien sv= service.getOne(msv);
        //3. set thuộc tính cho đối tượng
        req.setAttribute("sv",sv);
        //4. chuyển sang trang hiển thị
        //cách 1: gửi thủ công
        //        listSV = service.getAll();
        //        req.setAttribute("listSV",listSV);
       // req.getRequestDispatcher("/buoi4/hien-thi.jsp").forward(req,resp);
        //cách 2: gọi luôn getAll
        this.getAll(req,resp);
    }

    private void remove(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void search(HttpServletRequest req, HttpServletResponse resp) {
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri= req.getRequestURI();
        if(uri.contains("add")){
            this.add(req,resp);
        }else if(uri.contains("update")){
            this.update(req,resp);
        }
    }
    private void add(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //1. lấy toàn bộ thông tin trên form gửi về
        String msv= req.getParameter("msv");
        String ten= req.getParameter("ten");
        Integer tuoi= Integer.valueOf(req.getParameter("tuoi"));
        Boolean gioiTinh= Boolean.valueOf(req.getParameter("gioiTinh"));
        String diaChi= req.getParameter("diaChi");
        //2. tạo đối tượng SV từ thông tin trên
        SinhVien sv= new SinhVien(msv,ten,tuoi,gioiTinh, diaChi);
        //3. tiến hành add vào list -> gọi service
        service.add(sv);
        //4. chuyển về trang hiển thị
        resp.sendRedirect("/sinh-vien/get-all");
    }
    private void update(HttpServletRequest req, HttpServletResponse resp) {
    }


}
