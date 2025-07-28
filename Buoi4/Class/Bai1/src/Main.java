import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student a = new Student();
        System.out.print("Nhập tên: ");
        a.name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        a.age = Integer.parseInt(sc.nextLine());
        a.sayHello();
    }
}