package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] danhSach = new Student[5];
        danhSach[0] = new Student("Nguyễn Đức Giang", 2006, "Thanh Hóa", 8, 8, 8, 0);
        danhSach[1] = new Student("Nguyễn Ngọc Hiến", 2006, "Thái Bình", 8, 9, 7.5, 1);
        danhSach[2] = new Student("Đào Ngọc Chiến", 2006, "Hải Dương", 7, 8, 8, 2);
        danhSach[3] = new Student("Nguyễn Kim Quang", 2005, "Lai Châu", 9, 9, 9, 3);
        danhSach[4] = new Student("Đỗ Ngọc Ánh", 2006, "Thanh Hóa", 8, 8, 8, 0);

        System.out.printf("%-20s%-10s%-15s%-10s%-10s%-10s%-10s%-10s\n","Tên","Tuổi","Địa chỉ","TX1", "TX2", "KTHP", "GPA", "Số tiết nghỉ");

        for (Student s : danhSach) {
            System.out.printf("%-20s%-10d%-15s%-10.2f%-10.2f%-10.2f%-10.2f%-10d\n",s.getName(), s.getTuoi(), s.getAddress(),s.getTx1(),s.getTx2(),s.getKthp(),s.getGPA(),s.getSoTietnghi());
        }
    }
}
