import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String hoTen;

    public QuanLy() {

    }

    public QuanLy(String hoTen, String maQL) {
        this.hoTen = hoTen;
        this.maQL = maQL;
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã quản lý: ");
        maQL = sc.nextLine();
        System.out.print("Nhập họ và tên: ");
        hoTen = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Mã quản lý là: " + maQL);
        System.out.println("Họ và tên: " + hoTen);
    }
}
