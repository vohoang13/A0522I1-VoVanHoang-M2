package ss19_Case_Study.QuanLyResort.model;

public class Booking {
    private String maBooking;
    private String ngayBatDau;
    private String ngayKetThuc;
    private String maKH;
    private String tenDV;
    private String loaiDV;

    public Booking() {
    }

    public Booking(String maBooking, String ngayBatDau, String ngayKetThuc, String maKH, String tenDV, String loaiDV) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKH = maKH;
        this.tenDV = tenDV;
        this.loaiDV = loaiDV;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public String getLoaiDV() {
        return loaiDV;
    }

    public void setLoaiDV(String loaiDV) {
        this.loaiDV = loaiDV;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "maBooking='" + maBooking + '\'' +
                ", ngayBatDau='" + ngayBatDau + '\'' +
                ", ngayKetThuc='" + ngayKetThuc + '\'' +
                ", maKH='" + maKH + '\'' +
                ", tenDV='" + tenDV + '\'' +
                ", loaiDV='" + loaiDV + '\'' +
                '}';
    }
}
