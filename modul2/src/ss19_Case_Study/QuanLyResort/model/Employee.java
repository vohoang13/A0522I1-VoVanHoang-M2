package ss19_Case_Study.QuanLyResort.model;

import java.util.Objects;

public class Employee extends Person{
    private String maNV;
    private String trinhDo;
    private String viTri;
    private int luong;

    public Employee() {
    }

    public Employee(String maNV){
        this.maNV = maNV;
    }
    public Employee(String hoTen, String ngaySinh, String gioiTinh, String soCMND, String soDienThoai, String email, String maNV, String trinhDo, String viTri, int luong) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.maNV = maNV;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "maNV='" + maNV + '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return maNV.equals(employee.maNV);
    }

}
