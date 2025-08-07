import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sinh viên: ");
        int n = Integer.parseInt(sc.nextLine());

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhập thông tin sinh viên thứ " + (i + 1) + ":---");
            students[i] = new Student();
            students[i].inPut();
        }

        System.out.println("\n--- THÔNG TIN CÁC SINH VIÊN ---");
        for (int i = 0; i < n; i++) {
            students[i].outPut();
        }
    }
}