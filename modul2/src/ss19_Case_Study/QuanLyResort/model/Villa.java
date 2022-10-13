package ss19_Case_Study.QuanLyResort.model;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private double dienTichHoBoi;
    public int soTang;

    public Villa() {
    }

    public Villa(String tenDV, double dienTichSuDung, int chiPhi, int sucChua, String kieuThue, String tieuChuanPhong, double dienTichHoBoi, int soTang) {
        super(tenDV, dienTichSuDung, chiPhi, sucChua, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi='" + dienTichHoBoi + '\'' +
                ", soTang=" + soTang +
                '}';
    }
}
