import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien(new ArrayList<>());
        NhanVien a = new NhanVien("2020", "A", 20, "t@gmail.com", "0232344324");
        NhanVien b = new NhanVienFullTime("2020", "B", 20, "t@gmail.com", "0232344324", 5000, 10);
        NhanVien c = new NhanVienFullTime("2021", "C", 20, "t@gmail.com", "0232344324", 5000, 10);
        NhanVien d = new NhanVienPartTime("2022", "d", 20, "t@gmail.com", "0232344324", 5, 10);
        NhanVien e = new NhanVienPartTime("2023", "e", 20, "t@gmail.com", "0232344324", 10, 10);
        quanLyNhanVien.themNhanVien(a);
        quanLyNhanVien.themNhanVien(b);
        quanLyNhanVien.themNhanVien(c);
        quanLyNhanVien.themNhanVien(d);
        quanLyNhanVien.themNhanVien(e);

        quanLyNhanVien.hienThiTatCa();

        double totalSalary = quanLyNhanVien.tinhTongLuong();
        System.out.println("Tổng lương của nhân viên: " + totalSalary);
    }
}