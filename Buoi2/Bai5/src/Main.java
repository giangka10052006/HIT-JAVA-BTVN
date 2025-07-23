import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---bảng cửu chương 5---");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
        // vòng for
        int tong = 0;
        for (int i = 2; i <= 100; i += 2) {
            tong += i;
        }
        System.out.println("---Tổng các số chẵn từ 1 đến 100 bằng vòng for: " + tong);
        //Vòng while
        int sum = 0;
        int j = 2;
        while (j <= 100 )
        {
            sum += j;
            j += 2;
        }
        System.out.println("---Tổng các số chẵn từ 1 đến 100 bằng vòng while: " + sum);
    }
}
