import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        String lop;
        double gpa;

        System.out.print("Nhập họ và tên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập lớp: ");
        lop = sc.nextLine();
        System.out.print("Nhập GPA: ");
        gpa = Double.parseDouble(sc.nextLine());

        System.out.printf("Tên: %s - Age: %d - Lớp: %s - GPA: %.2f", name, age, lop, gpa);
    }
}