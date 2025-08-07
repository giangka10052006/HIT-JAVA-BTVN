import java.util.Scanner;

public class Faculty {
    private String nameKhoa;
    private String dateKhoa;
    private School x = new School();

    public Faculty() {

    }

    public Faculty(String nameKhoa, String dateKhoa, School x) {
        this.nameKhoa = nameKhoa;
        this.dateKhoa = dateKhoa;
        this.x = x;
    }

    public String getNameKhoa() {
        return nameKhoa;
    }

    public void setNameKhoa(String nameKhoa) {
        this.nameKhoa = nameKhoa;
    }

    public String getDateKhoa() {
        return dateKhoa;
    }

    public void setDateKhoa(String dateKhoa) {
        this.dateKhoa = dateKhoa;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên khoa: ");
        nameKhoa = sc.nextLine();

        System.out.print("Nhập ngày vào khoa: ");
        dateKhoa = sc.nextLine();
        System.out.println(">>> Nhập thông tin trường thuộc khoa:");
        x.inPut();
    }

    public void outPut() {
        System.out.println("Khoa: " + nameKhoa);
        System.out.println("Ngày vào khoa: " + dateKhoa);
        x.outPut();
    }
}
