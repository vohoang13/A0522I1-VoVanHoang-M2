package ss19_Case_Study.QuanLyResort.model;

public class Contract {
    private String soHD;
    private String maBooking;
    private int soTienCocTruoc;
    private int tongSoTien;
    private String maKH;

    public Contract() {
    }

    public Contract(String soHD, String maBooking, int soTienCocTruoc, int tongSoTien, String maKH) {
        this.soHD = soHD;
        this.maBooking = maBooking;
        this.soTienCocTruoc = soTienCocTruoc;
        this.tongSoTien = tongSoTien;
        this.maKH = maKH;
    }

    public String getSoHD() {
        return soHD;
    }

    public void setSoHD(String soHD) {
        this.soHD = soHD;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public int getSoTienCocTruoc() {
        return soTienCocTruoc;
    }

    public void setSoTienCocTruoc(int soTienCocTruoc) {
        this.soTienCocTruoc = soTienCocTruoc;
    }

    public int getTongSoTien() {
        return tongSoTien;
    }

    public void setTongSoTien(int tongSoTien) {
        this.tongSoTien = tongSoTien;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "soHD='" + soHD + '\'' +
                ", maBooking='" + maBooking + '\'' +
                ", soTienCocTruoc=" + soTienCocTruoc +
                ", tongSoTien=" + tongSoTien +
                ", maKH='" + maKH + '\'' +
                '}';
    }
}
