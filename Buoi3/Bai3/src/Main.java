import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = Math.random() * 100 + 1;
        int a = (int) x;
        double y = Math.random() * 100 + 1;
        int b = (int) y;
        double z = Math.random() * 100 + 1;
        int c = (int) z;

        System.out.println("Phép toán: " + a + " + " + b + " = " + c);
        System.out.println("Chọn Correct hoặc Incorrect");
        System.out.print("Bạn chọn: ");
        String select = sc.nextLine();

        int res = a + b;
        if((res == c && select.equalsIgnoreCase("Correct")) || (res != c && !select.equalsIgnoreCase("Correct")))
        {
            System.out.println("Bạn đã trả lời đúng.");
        }
        else{
            System.out.println("Bạn trả lời sai rồi.");
        }
    }
}