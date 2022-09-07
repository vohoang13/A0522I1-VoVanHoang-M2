package ss10_DSA_Stack_Queue.thuc_hanh;

public class Test {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(1, 2);
        ToaDo td2 = new ToaDo(4, 5);
        HinhTron ht = new HinhTron(td1, 5);
        HinhChuNhat hcn = new HinhChuNhat(td2, 5, 10);

        System.out.println("Diện tích hình tròn: " + ht.tinhDienTich());
        System.out.println("Diện tích hình chữ nhật: " + hcn.tinhDienTich());
        System.out.println("Chu vi hình chữ nhật: " + hcn.tinhChuVi());
        System.out.println(td1.getX());
    }
}
