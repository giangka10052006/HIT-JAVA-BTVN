import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car a = new Car();
        System.out.print("Nhập hãng: ");
        a.brand = sc.nextLine();
        System.out.print("Nhập tốc độ: ");
        a.maxSpeed = Integer.parseInt(sc.nextLine());
        a.run();
    }
}