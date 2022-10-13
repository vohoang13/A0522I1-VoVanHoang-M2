package ss19_Case_Study.QuanLyResort.model;

public class House extends Facility{
    private String tieuChuanPhong;
    private int soTang;

    public House() {
    }

    public House(String tenDV, double dienTichSuDung, int chiPhi, int sucChua, String kieuThue, String tieuChuanPhong, int soTang) {
        super(tenDV, dienTichSuDung, chiPhi, sucChua, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang=" + soTang +
                '}';
    }
}
