import java.util.Scanner;

public class Main {
    final static String vuong = "square";
    final static String tamGiac = "triangle";
    final static String tron = "circle";
    final static double PI = 3.14;

    public static String nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Chọn type với 1 trong các dạng:---");
        System.out.println("-Square\n-Triangle\n-Circle");
        System.out.print("Nhập: ");

        return sc.nextLine().trim();
    }

    public static double dienTichTamGiac(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Không phải tam giác");
            return -1;
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

    public static void tinhDienTich(String type) {
        Scanner sc = new Scanner(System.in);
        String tmp = type.toLowerCase();
        switch (tmp) {
            case vuong:
                System.out.println("---Gạch hình vuông---");
                System.out.print("Nhập cạnh: ");
                double c = Double.parseDouble(sc.nextLine());
                double res = c * c;
                System.out.printf("Diện tích của viên gạch: %.2f", res);
                break;
            case tamGiac:
                System.out.println("---Gạch hình tam giác---");
                System.out.print("Nhập cạnh thứ nhất: ");
                double a = Double.parseDouble(sc.nextLine());
                System.out.print("Nhập cạnh thứ hai: ");
                double b = Double.parseDouble(sc.nextLine());
                System.out.print("Nhập cạnh thứ ba: ");
                double d = Double.parseDouble(sc.nextLine());
                double dt = dienTichTamGiac(a,b,d);
                System.out.printf("Diện tích của viên gạch: %.2f", dt);
                break;
            case tron:
                System.out.println("---Gạch hình tròn---");
                System.out.print("Nhập bán kính: ");
                double r = Double.parseDouble(sc.nextLine());
                double kq = PI * r * r;
                System.out.printf("Diện tích của viên gạch: %.2f", kq);
                break;
            default:
                System.out.println("Không hợp lệ!");
        }
    }

    public static void main(String[] args) {
        String type = nhap();
        tinhDienTich(type);
    }
}