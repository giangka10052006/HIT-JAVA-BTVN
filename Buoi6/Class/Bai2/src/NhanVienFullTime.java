public class NhanVienFullTime extends NhanVien {
    private double luongCoBan;
    private double tienThuong;

    public NhanVienFullTime() {

    }

    public NhanVienFullTime(double luongCoBan, double tienThuong) {
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

    public NhanVienFullTime(String maNV, String ten, int tuoi, String email, String soDienThoai, double luongCoBan, double tienThuong) {
        super(maNV, ten, tuoi, email, soDienThoai);
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

    @Override
    public double tinhLuong() {
        return this.luongCoBan + this.tienThuong;
    }

    @Override
    public String toString() {
        return super.toString() +
                "NhanVienFullTime{" +
                "luongCoBan=" + luongCoBan +
                ", tienThuong=" + tienThuong +
                '}';
    }
}
