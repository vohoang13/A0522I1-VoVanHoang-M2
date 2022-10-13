package ss19_Case_Study.QuanLyResort.model;

public abstract class Facility {
    private String tenDV;
    private double dienTichSuDung;
    private int chiPhi;
    private int sucChua;
    private String kieuThue;

    public Facility() {
    }

    public Facility(String tenDV, double dienTichSuDung, int chiPhi, int sucChua, String kieuThue) {
        this.tenDV = tenDV;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhi = chiPhi;
        this.sucChua = sucChua;
        this.kieuThue = kieuThue;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public int getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(int chiPhi) {
        this.chiPhi = chiPhi;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "tenDV='" + tenDV + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhi=" + chiPhi +
                ", sucChua=" + sucChua +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
}
