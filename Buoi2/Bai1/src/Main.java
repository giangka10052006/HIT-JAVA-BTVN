import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi của bạn: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập chiều cao của bạn: ");
        double height = Double.parseDouble(sc.nextLine());

        System.out.print("Xin chào " + name + ",bạn " + age + " tuổi và cao " + height + " mét.");
    }
}
