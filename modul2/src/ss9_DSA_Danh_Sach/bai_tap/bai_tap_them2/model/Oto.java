package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model;

public class Oto extends Transport{
    private int soChoNgoi;
    private String kieuXe;

    public Oto() {
    }

    public Oto(String bienKiemSoat){
        super(bienKiemSoat);
    }
    public Oto(String bienKiemSoat, String tenHang, int namSX, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHang, namSX, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Oto{" + super.toString() +
                "soChoNgoi=" + soChoNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }


}
