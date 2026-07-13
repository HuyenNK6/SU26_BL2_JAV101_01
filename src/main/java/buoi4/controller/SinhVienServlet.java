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

    private void detail(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void remove(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void search(HttpServletRequest req, HttpServletResponse resp) {
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
