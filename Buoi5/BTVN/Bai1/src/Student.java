import java.util.Scanner;

public class Student {
    private String name;
    private String classs;
    private Double score;
    private Faculty y = new Faculty();

    public Student() {

    }

    public Student(String name, String classs, Double score, Faculty y) {
        this.name = name;
        this.classs = classs;
        this.score = score;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.print("Nhập lớp: ");
        classs = sc.nextLine();
        System.out.print("Nhập điểm: ");
        score = Double.parseDouble(sc.nextLine());

        System.out.println(">>>Nhập thông tin khoa của sinh viên");
        y.inPut();
    }

    public void outPut() {
        System.out.println("\n--- THÔNG TIN SINH VIÊN ---");
        System.out.println("Tên sinh viên: " + name);
        System.out.println("Lớp: " + classs);
        System.out.println("Điểm: " + score);
        y.outPut();
    }
}
