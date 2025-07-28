import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student a = new Student();
        System.out.print("Nhập tên: ");
        a.setName(sc.nextLine());
        System.out.print("Nhập tuổi: ");
        a.setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("Tên: " + a.getName());
        System.out.println("Tuổi: " + a.getAge());
    }
}