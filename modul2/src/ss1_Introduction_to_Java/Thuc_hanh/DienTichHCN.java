package ss1_Introduction_to_Java.Thuc_hanh;

import java.util.Scanner;

public class DienTichHCN {
    public static void main(String[] args) {
        int chieuRong,chieuCao;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng : ");
        chieuRong=scanner.nextInt();
        System.out.println("Nhập vào chiều cao: ");
        chieuCao=scanner.nextInt();
        System.out.println("Diện tích hình chữ nhật : "+ (chieuCao+chieuRong)*2);
    }
}
