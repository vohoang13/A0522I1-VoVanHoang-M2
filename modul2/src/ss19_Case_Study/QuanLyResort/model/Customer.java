package ss19_Case_Study.QuanLyResort.model;

import java.util.Objects;

public class Customer extends Person{
    private String maKH;
    private String loaiKH;
    private String diaChi;

    public Customer() {
    }

    public Customer(String maKH){
        this.maKH = maKH;
    }
    public Customer(String hoTen, String ngaySinh, String gioiTinh, String soCMND, String soDienThoai, String email, String maKH, String loaiKH, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.maKH = maKH;
        this.loaiKH = loaiKH;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "maKH='" + maKH + '\'' +
                ", loaiKH='" + loaiKH + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return maKH.equals(customer.maKH);
    }

}
