package buoi7.repository;

import buoi7.entity.Category;
import buoi7.util.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {
    public List<Category> getAll(){
        List<Category> listCate= new ArrayList<>();
        //String sql = "SELECT * FROM category";
        //Mở SQL, Click chuột phải vào tên table
        //-> Chọn Script Table as....=>chọn Select, Insert, Delete....
        String sql= "SELECT [id]\n" +
                "      ,[category_code]\n" +
                "      ,[category_name]\n" +
                "  FROM [dbo].[category]";
        try (Connection con = DBConnect.getConnection();
             PreparedStatement ps= con.prepareStatement(sql)){
            ResultSet rs= ps.executeQuery();//nhận kêt quả dưới dạng rs
            //kiểm tra xem rs có next dc ko -> có còn dữ liệu ko
            while (rs.next()){
                //tạo đối tượng cate
                Category cate = new Category();
                cate.setId(rs.getInt(1));
                cate.setCode(rs.getString(2));
                cate.setName(rs.getString(3));
                //thêm đối tượng vào danh sách listCate
                listCate.add(cate);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listCate;
    }
//test
    public static void main(String[] args) {
        System.out.println(new CategoryRepository().getAll());
    }
}
