package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model;

import java.util.Objects;

public class XeTai extends Transport{
    private String trongTai;

    public XeTai() {
    }

    public XeTai(String bienKiemSoat){
        super(bienKiemSoat);
    }
    public XeTai(String bienKiemSoat, String tenHang, int namSX, String chuSoHuu, String trongTai) {
        super(bienKiemSoat, tenHang, namSX, chuSoHuu);
        this.trongTai = trongTai;
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{"
                + super.toString() +
                "trongTai='" + trongTai + '\'' +
                '}';
    }


}
