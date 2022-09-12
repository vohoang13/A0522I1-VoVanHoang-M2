package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model;

public class Moto extends Transport {
    private String congSuat;

    public Moto() {
    }

    public Moto(String bienKiemSoat){
        super(bienKiemSoat);
    }
    public Moto(String bienKiemSoat, String tenHang, int namSX, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, tenHang, namSX, chuSoHuu);
        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "Moto{" + super.toString() +
                "congSuat='" + congSuat + '\'' +
                '}';
    }
}
