package Exam2.model;

public class BenhNhanThuong extends BenhAn{

    private int phiNamVien;

    public BenhNhanThuong() {
    }

    public BenhNhanThuong(String maBenhAn) {
        super(maBenhAn);
    }

    public BenhNhanThuong(int soThuTu, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien) {
        super(soThuTu, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
    }

    public BenhNhanThuong(int soThuTu, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, int phiNamVien) {
        super(soThuTu, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public int getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public void getABC() {

    }

    @Override
    public String toString() {
        return "BenhNhanThuong{" + super.toString() +
                '}';
    }
}
