import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mang = new int[5];
        System.out.print("Nhập 5 so nguyên:\n ");
        for(int i = 0; i < 5;i++)
        {
            System.out.print("Số thứ " + (i + 1) + " là: ");
            mang[i] = sc.nextInt();
        }
        System.out.println("----Các phần tử vừa nhập----");
        for(int i = 0; i < 5;i++)
        {
            System.out.print(mang[i] + " ");
        }
        System.out.println(" ");
        int tong = 0;
        for(int i = 0; i < 5; i++)
        {
            tong += mang[i];
        }

        int ma = mang[0];
        for(int i = 0; i < 5;i++)
        {
            if(mang[i] > ma)
            {
                ma = mang[i];
            }
        }

        System.out.printf("Tổng các phần tử: %d\n", tong);
        System.out.printf("Phần tử lớn nhất: %d\n", ma);
    }
}
