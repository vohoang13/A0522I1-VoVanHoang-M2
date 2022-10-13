package ss19_Case_Study.QuanLyResort.model;

public class Room extends Facility{
    private String dichVuMienPhi;

    public Room() {
    }

    public Room(String tenDV, double dienTichSuDung, int chiPhi, int sucChua, String kieuThue, String dichVuMienPhi) {
        super(tenDV, dienTichSuDung, chiPhi, sucChua, kieuThue);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichVuMienPhi='" + dichVuMienPhi + '\'' +
                '}';
    }
}
