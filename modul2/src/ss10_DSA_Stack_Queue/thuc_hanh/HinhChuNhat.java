package ss10_DSA_Stack_Queue.thuc_hanh;

public class HinhChuNhat extends Hinh {
    private double chieuRong;
    private double chieuCao;

    public HinhChuNhat(ToaDo toaDo, double chieuRong, double chieuCao) {
        super(toaDo);
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double tinhDienTich() {
        return this.chieuCao * this.chieuRong;
    }

    public double tinhChuVi(){
        return (this.chieuRong+this.chieuCao)*2;
    }
}
