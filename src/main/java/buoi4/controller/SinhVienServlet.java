package buoi4.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

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
