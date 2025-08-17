public class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemTB;
    private LopHoc lop;

    public SinhVien() {

    }

    public SinhVien(String maSV, String hoTen, double diemTB, LopHoc lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public void setDiemTB(int diemTB) {
        this.diemTB = diemTB;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }

    public void inThongTin() {
        System.out.println("--- Thông tin sinh viên ---");
        System.out.println("Mã sinh viên: " + this.maSV);
        System.out.println("Họ tên: " + this.hoTen);
        System.out.println("Điểm Tb: " + this.diemTB);
        this.lop.inThongTin();
        System.out.println("----------");
    }
}
