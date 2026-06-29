package buoi1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//@WebServlet
//Đây là một annotation được sử dụng để định nghĩa một servlet trong ứng dụng Java web.
//name chỉ định tên của servlet.
//value chỉ định đường dẫn URL  mà servlet sẽ lắng nghe.
// Khi người dùng truy cập vào URL "/home", servlet này sẽ được gọi và thực thi.
@WebServlet(name = "homeServlet", value = "/home")
public class HomeServlet extends HttpServlet {
     /*
POST và GET là 2 phương pháp truyền dữ liệu từ trình duyệt đến server.
Khi submit form với
- Method=“GET” thì dữ liệu form được thu thập và tạo thành chuỗi truy vấn (ghép vào sau dấu ? của url) để gửi đến server
- Method=“POST” thì trình duyệt sẽ tạo một kênh riêng để truyền dữ liệu (ngầm) đến server

*/
 /* TẠO NHANH PHƯƠNG THỨC doGet và doPost:
   - Cách 1:
        Chọn Override Methods: Một danh sách các phương thức có thể override sẽ hiện ra.
        Chọn doGet và doPost: Tìm và chọn doGet và doPost, sau đó nhấn OK
   - Cách 2:
        Gõ doGet và nhấn Tab sẽ tạo ra phương thức doGet.
        Gõ doPost và nhấn Tab sẽ tạo ra phương thức doPost.
        IntelliJ sẽ tự động sinh mã phương thức doGet và doPost
     */

    /* CHIA SẺ DỮ LIỆU
    - Servlet sẽ đặt dữ liệu vào request trước khi chuyển tiếp sang JSP.
            HttpServletRequest.setAttribute(name, Object)
        + setAttribute là một phương thức được sử dụng trong Java Servlet để lưu trữ
        một đối tượng dưới dạng thuộc tính (attribute)
        + name: Tên của thuộc tính. Đây là một chuỗi định danh duy nhất để truy cập thuộc tính đó.
        + Object: Giá trị của thuộc tính, có thể là bất kỳ đối tượng Java nào.
    - JSP lấy và hiển thị: ${name}
 	//getRequestDispatcher: chuyển hướng đến home.jsp
    //forward(req,resp): chuyển tiếp yêu cầu & phản hồi
*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = "FPT Polytechnic";
        req.setAttribute("message",message);//lưu trữ message dưới dạng thuộc tính
        //tạo thông tin của SV: tên, lớp, LIST điểm -> gửi sang JSP
        //getRequestDispatcher: chuyển hướng đến /buoi1/home.jsp
        //forward(req,resp): chuyển toàn bộ yêu cầu req & phản hồi resp
        req.getRequestDispatcher("/buoi1/home.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
