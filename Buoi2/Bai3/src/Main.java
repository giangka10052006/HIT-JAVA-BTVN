import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("---Cặp số thứ " + i + " :---");
            System.out.print("Nhập số thứ nhất: ");
            int a = sc.nextInt();
            System.out.print("Nhập số thứ hai: ");
            int b = sc.nextInt();

            System.out.printf("Cộng: %d\n",a + b);
            System.out.printf("Trừ: %d\n",a - b);
            System.out.printf("Nhân: %d\n",a * b);
            if (b != 0 )
            {
                System.out.printf("Chia: %.2f\n",(double)a / b);
                System.out.printf("Chia lấy dư: %d\n",a % b);
            }
            else {
                System.out.println("Không thể chia và chia lấy dư vì b = 0");
            }

            if(a == b) System.out.println("2 số bằng nhau.");
            else System.out.println("2 số không bằng nhau.");
        }
    }
}
