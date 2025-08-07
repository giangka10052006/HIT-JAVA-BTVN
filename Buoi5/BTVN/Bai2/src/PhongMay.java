import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private Double dienTich;
    private QuanLy x = new QuanLy();
    private May[] y;
    private Integer n;

    public PhongMay() {

    }

    public PhongMay(String maPhong, String tenPhong, Double dienTich, QuanLy x, May[] y, Integer n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public Double getDienTich() {
        return dienTich;
    }

    public void setDienTich(Double dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phòng: ");
        maPhong = sc.nextLine();
        System.out.print("Nhập tên phòng: ");
        tenPhong = sc.nextLine();
        System.out.print("Nhập diện tích phòng: ");
        dienTich = Double.parseDouble(sc.nextLine());

        System.out.println(">> Nhập thông tin quản lý:");
        x.Nhap();

        System.out.println("Nhập số lượng máy trong phòng: ");
        n = Integer.parseInt(sc.nextLine());

        y = new May[n];
        for(int i = 0; i < n;i++)
        {
            System.out.println(">>Nhập máy thứ " + (i + 1) + ":");
             y[i] = new May();
             y[i].Nhap();
        }
    }

    public void Xuat() {
        System.out.println("\n--- THÔNG TIN PHÒNG MÁY ---");
        System.out.println("Mã phòng: " + maPhong);
        System.out.println("Tên phòng: " + tenPhong);
        System.out.println("Diện tích phòng: " + dienTich);
        x.Xuat();

        System.out.println(">> Danh sách máy trong phòng:");
        for(int i = 0; i < n;i++){
            System.out.println("Máy thứ " + (i + 1) + ":");
            y[i].Xuat();
        }
    }
}
