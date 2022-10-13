package Exam2.model;

public class BenhNhanVIP extends BenhAn{
    private String loaiVIP;
    private String thoiHan;

    public BenhNhanVIP() {
    }

    public BenhNhanVIP(String maBenhAn) {
        super(maBenhAn);
    }

    public BenhNhanVIP(int soThuTu, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien) {
        super(soThuTu, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
    }

    public BenhNhanVIP(int soThuTu, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String loaiVIP, String thoiHan) {
        super(soThuTu, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.loaiVIP = loaiVIP;
        this.thoiHan = thoiHan;
    }

    public String getLoaiVIP() {
        return loaiVIP;
    }

    public void setLoaiVIP(String loaiVIP) {
        this.loaiVIP = loaiVIP;
    }

    public String getThoiHan() {
        return thoiHan;
    }

    public void setThoiHan(String thoiHan) {
        this.thoiHan = thoiHan;
    }

    @Override
    public void getABC() {

    }

    @Override
    public String toString() {
        return "BenhNhanVIP{" + super.toString() +
                '}';
    }
}
