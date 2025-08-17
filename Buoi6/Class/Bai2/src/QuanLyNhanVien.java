import java.util.ArrayList;

public class QuanLyNhanVien {
    private ArrayList<NhanVien> danhSachNhanVien;

    public QuanLyNhanVien() {
    }

    public QuanLyNhanVien(ArrayList<NhanVien> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }

    public ArrayList<NhanVien> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }

    public void setDanhSachNhanVien(ArrayList<NhanVien> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }

    public void themNhanVien(NhanVien nv) {
        this.danhSachNhanVien.add(nv);
        System.out.println("Thêm thành công");
    }

    public void hienThiTatCa() {
        System.out.println("---Danh sách");
        for (NhanVien a : danhSachNhanVien) {
            System.out.println(a.toString());
        }
    }

    public double tinhTongLuong() {
        double total = 0;
        for (NhanVien a : danhSachNhanVien) {
            total += a.tinhLuong();
        }
        return total;
    }
}
