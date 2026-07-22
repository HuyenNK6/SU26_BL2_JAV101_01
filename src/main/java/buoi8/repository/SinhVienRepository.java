package buoi8.repository;

import buoi8.entity.SinhVien;
import buoi8.util.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SinhVienRepository {
    public List<SinhVien> getAll(){
        List<SinhVien> listSV= new ArrayList<>();
        String sql= "SELECT * FROM [QLSV].[dbo].[sinh_vien]";
        try(Connection con = DBConnect.getConnection();
            PreparedStatement ps= con.prepareStatement(sql)) {
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                SinhVien sv = new SinhVien();
                sv.setId(rs.getInt(1));
                sv.setMsv(rs.getString(2));
                sv.setTen(rs.getString(3));
                sv.setTuoi(rs.getInt(4));
                sv.setDiaChi(rs.getString(5));
                sv.setGioiTinh(rs.getBoolean(6));
                sv.setLopId(rs.getInt(7));
                listSV.add(sv);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listSV;
    }
    public static void main(String[] args) {
        System.out.println(new SinhVienRepository().getAll());
    }
}
