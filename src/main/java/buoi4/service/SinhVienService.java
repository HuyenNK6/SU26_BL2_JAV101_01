package buoi4.service;

import buoi4.entity.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    List<SinhVien> listSV;

    public SinhVienService() {
        listSV= new ArrayList<>();
        listSV.add(new SinhVien("PH111", "Nguyen Van A", 18, false, "Ha Noi"));
        listSV.add(new SinhVien("PH222", "Nguyen Thi B", 24, true, "Ha Noi"));
        listSV.add(new SinhVien("PH333", "Nguyen Van C", 18, false, "Ha Noi"));
        listSV.add(new SinhVien("PH444", "Nguyen Thi D", 22, true, "Ha Noi"));
        listSV.add(new SinhVien("PH555", "Nguyen Van E", 18, false, "Ha Noi"));
    }
    public List<SinhVien> getAll(){
        return listSV;
    }
    public void add(SinhVien sv){
        listSV.add(sv);
    }
}
