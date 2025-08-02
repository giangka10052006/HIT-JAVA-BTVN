package Bai1;

public class Student {
    private String name;
    private int year;
    private String address;
    private double tx1;
    private double tx2;
    private double kthp;
    private int soTietnghi;

    public Student() {

    }

    public Student(String name, int year, String address, double tx1, double tx2, double kthp, int soTietnghi) {
        this.name = name;
        this.year = year;
        this.address = address;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.soTietnghi = soTietnghi;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }

    public double getTx1() {
        return tx1;
    }

    public double getTx2() {
        return tx2;
    }

    public double getKthp() {
        return kthp;
    }

    public int getSoTietnghi() {
        return soTietnghi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTx1(double tx1) {
        this.tx1 = tx1;
    }

    public void setTx2(double tx2) {
        this.tx2 = tx2;
    }

    public void setKthp(double kthp) {
        this.kthp = kthp;
    }

    public void setSoTietnghi(int soTietnghi) {
        this.soTietnghi = soTietnghi;
    }

    public int getTuoi() {
        return 2025 - year;
    }

    public double getGPA() {
        return tx1 * 0.1 + tx2 * 0.3 + kthp * 0.5;
    }
}
