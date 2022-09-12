package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model;

import java.util.Objects;

public abstract class Transport {
     private String bienKiemSoat;
     private String tenHang;
     private int namSX;
     private String chuSoHuu;

    public Transport() {
    }

    public Transport(String bienKiemSoat){
        this.bienKiemSoat = bienKiemSoat;
    }

    public Transport(String bienKiemSoat, String tenHang, int namSX, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenHang = tenHang;
        this.namSX = namSX;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", namSX=" + namSX +
                ", chuSoHuu='" + chuSoHuu + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(bienKiemSoat, transport.bienKiemSoat);
    }

}
