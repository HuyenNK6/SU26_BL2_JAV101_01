package buoi4.entity;

public class SinhVien {
    private String msv;
    private String ten;
    private Integer tuoi;
    private Boolean gioiTinh;
    private String diaChi;
    //Click chuột phải -> chọn Generate -> Select None để tạo constructor ko tham số
    public SinhVien() {

    }
    //Click chuột phải -> chọn Generate ->Chọn hết để tạo constructor full tham số
    public SinhVien(String msv, String ten, Integer tuoi, Boolean gioiTinh, String diaChi) {
        this.msv = msv;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
    //Click chuột phải -> chọn Generate -> Getter and Setter
    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
