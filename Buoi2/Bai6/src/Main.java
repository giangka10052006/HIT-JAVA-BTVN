import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = Integer.parseInt(sc.nextLine());

        String[] name = new String[n];
        int[] age = new int[n];
        double[] gpa = new double[n];

        for(int i = 0; i < n;i++)
        {
            System.out.println("---Sinh viên thứ " + (i + 1) + ": ---");
            System.out.print("Nhập tên: ");
            name[i] = sc.nextLine();
            System.out.print("Nhập tuổi: ");
            age[i] = sc.nextInt();
            System.out.print("Nhập GPA: ");
            gpa[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("---Danh sách sinh viên:---");
        for(int i = 0; i < n;i++)
        {
            System.out.println("STT " +(i + 1) + ": Tên: " + name[i] + " - Tuổi: " + age[i] + "tuổi - GPA: " + gpa[i] + ".");
        }
        // Tính trung bình
        double sum = 0;
        for(int i = 0; i < n;i++){
            sum += gpa[i];
        }
        double tb = (double) sum / n;
        System.out.printf("---Điểm trung bình GPA của lớp: %.2f\n", tb);

        // Tìm sinh viên có GPA lớn nhất
        double topStudent = gpa[0];
        int viTri = 0;
        for(int i = 0; i < n;i++)
        {
            if(gpa[i] > topStudent)
            {
                topStudent = gpa[i];
                viTri = i;
            }
        }
        System.out.println("---Sinh viên có GPA cao nhất:");
        System.out.print("Tên: " + name[viTri] + " - Tuổi: " + age[viTri] + "tuổi - GPA: " + gpa[viTri] + ".\n");
        System.out.print("---------------------");
    }
}