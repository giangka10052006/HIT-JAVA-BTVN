import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> sv = new ArrayList<>();

        sv.add(new SinhVien("2024", "Giang", 3.5, new LopHoc("01", "304")));
        sv.add(new SinhVien("2023", "Hu", 3.4, new LopHoc("01", "304")));
        sv.add(new SinhVien("2022", "hi", 3.4, new LopHoc("01", "304")));
        sv.add(new SinhVien("2020", "hí", 3.4, new LopHoc("01", "304")));
        sv.add(new SinhVien("2019", "ha", 3.4, new LopHoc("01", "304")));
        System.out.println("---Danh sách sinh viên---");
        for (int i = 0; i < sv.size(); i++) {
            sv.get(i).inThongTin();
        }
        double max_tb = sv.get(0).getDiemTB();
        for (int i = 0; i < sv.size(); i++) {
            if (sv.get(i).getDiemTB() > max_tb) {
                max_tb = sv.get(i).getDiemTB();
            }
        }
        System.out.println("---Sinh viên cao nhất:");
        for (int i = 0; i < sv.size(); i++) {
            if (sv.get(i).getDiemTB() == max_tb) {
                sv.get(i).inThongTin();
            }
        }
    }
}