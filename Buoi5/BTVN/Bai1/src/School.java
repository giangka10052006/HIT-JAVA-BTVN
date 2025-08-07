import java.util.Scanner;

public class School {
    private String nameSchool;
    private String date;

    public School() {

    }

    public School(String nameSchool, String date) {
        this.nameSchool = nameSchool;
        this.date = date;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên trường: ");
        nameSchool = sc.nextLine();

        System.out.print("Nhập ngày vào trường: ");
        date = sc.nextLine();
    }

    public void outPut() {
        System.out.println("Trường: " + nameSchool);
        System.out.println("Ngày vào trường: " + date);
    }
}
