import java.util.Scanner;

public class Main{
    public static String nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String chuoi = sc.nextLine();
        return chuoi.trim();
    }

    public static boolean Palindrome(String str){
        String b = "";
        for(int i = str.length() - 1; i >= 0;i--){
            b += str.charAt(i);
        }
        return b.equals(str);
    }

    public static void in(String str){
        if(Palindrome(str))
        {
            String text = str.toUpperCase();
            System.out.println("Chuỗi: " + text);
            System.out.println("---Đối xứng---");
        }
        else
        {
            String text = str.toLowerCase();
            System.out.println("Chuỗi: " + text);
            System.out.println("---Không đối xứng---");
        }
    }
    public static void main(String[] args) {
        String str = nhap();
        in(str);
    }
}