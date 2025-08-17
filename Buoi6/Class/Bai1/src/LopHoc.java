public class LopHoc {
    private String malop;
    private String tenLop;

    public LopHoc() {

    }

    public LopHoc(String malop, String tenLop) {
        this.malop = malop;
        this.tenLop = tenLop;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void inThongTin() {
        System.out.println("Mã lớp học: " + malop);
        System.out.println("Tên lớp: " + tenLop);
    }
}
