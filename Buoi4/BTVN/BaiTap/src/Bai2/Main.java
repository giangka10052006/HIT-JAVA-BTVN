package Bai2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import Bai1.Student;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> ds = new ArrayList<>();

    public static void themSinhVien() {
        System.out.print("Nhập tên: ");
        String na = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        int y = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập địa chỉ: ");
        String addr = sc.nextLine();
        System.out.print("Điểm tx1: ");
        double t1 = Double.parseDouble(sc.nextLine());
        System.out.print("Điểm tx2: ");
        double t2 = Double.parseDouble(sc.nextLine());
        System.out.print("Điểm kết thúc học phần: ");
        double kt = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số tiết nghỉ: ");
        int nghi = Integer.parseInt(sc.nextLine());

        Student sv = new Student(na, y, addr, t1, t2, kt, nghi);
        ds.add(sv);
        System.out.println("--> Đã thêm sinh viên.");
    }

    public static void suaThongTinSinhVien() {
        System.out.print("Nhập tên sinh viên cần sửa: ");
        String ten = sc.nextLine();
        for (Student s : ds) {
            if (s.getName().equalsIgnoreCase(ten)) {
                System.out.print("Địa chỉ mới: ");
                s.setAddress(sc.nextLine());
                System.out.print("TX1 mới: ");
                s.setTx1(Double.parseDouble(sc.nextLine()));
                System.out.print("TX2 mới: ");
                s.setTx2(Double.parseDouble(sc.nextLine()));
                System.out.print("KTHP mới: ");
                s.setKthp(Double.parseDouble(sc.nextLine()));
                System.out.print("Số tiết nghỉ mới: ");
                s.setSoTietnghi(Integer.parseInt(sc.nextLine()));
                System.out.println("-->Đã sửa thông tin.");
                return;
            }
        }
        System.out.println("Không tin thấy sinh viên tên: " + ten);
    }

    public static void sapXepTheoTuoi() {
        ds.sort(Comparator.comparing(Student :: getTuoi));
        System.out.println("-->Đã sắp xếp theo tuổi.");
    }

    public static void sapXepTheoSoTietNghi() {
        ds.sort(Comparator.comparing(Student :: getSoTietnghi));
        System.out.println("--> Đã sắp xếp theo số tiết nghỉ.");
    }

    public static void xoaSinhVien() {
        System.out.print("Nhập tên sinh viên cần xóa: ");
        String ten = sc.nextLine();
        boolean removed = ds.removeIf(s -> s.getName().equalsIgnoreCase(ten));
        if (removed) {
            System.out.println("--> Đã xóa sinh viên " + ten);
        }
        else
            System.out.println("Không tìm thấy sinh viên tên: " + ten);

    }

    public static void sapXepTheoGpa() {
        ds.sort((a,b) -> Double.compare(b.getGPA(), a.getGPA()));
        System.out.println("--> Đã sắp xếp theo GPA.");
    }

    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\n---------Quản lý sinh viên---------");
            System.out.println("Hãy chọn chức năng:");
            System.out.println("1.Thêm sinh viên mới");
            System.out.println("2.Sửa thông tin sinh viên");
            System.out.println("3.Sắp xếp sinh viên theo tuổi");
            System.out.println("4.Sắp xếp sinh viên theo GPA");
            System.out.println("5.Sắp xếp sinh viên theo số tiết nghỉ");
            System.out.println("6.Xóa sinh viên khỏi danh sách");
            System.out.println("0.Thoát\n");
            System.out.print("---Chọn: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    themSinhVien();
                    break;
                case 2:
                    suaThongTinSinhVien();
                    break;
                case 3:
                    sapXepTheoTuoi();
                    break;
                case 4:
                    sapXepTheoGpa();
                    break;
                case 5:
                    sapXepTheoSoTietNghi();
                    break;
                case 6:
                    xoaSinhVien();
                    break;
                case 0:
                    System.out.println("Kết thúc!");
                    break;
                default:
                    System.out.println("Không hợp lệ!");
                    break;

            }
        } while (chon != 0);
    }
}
