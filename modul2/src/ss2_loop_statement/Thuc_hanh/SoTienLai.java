package ss2_loop_statement.Thuc_hanh;

import java.util.Scanner;

public class SoTienLai {
    public static void main(String[] args) {
        float soTienLai, soTienGui, laiSuat;
        int soThangGui;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số tiền cần gửi : ");
        soTienGui = sc.nextFloat();
        System.out.println("Nhập vào lãi suất : ");
        laiSuat = sc.nextFloat();
        System.out.println("Nhập vào số tháng : ");
        soThangGui = sc.nextInt();
        soTienLai = 0;
        for (int i = 0; i < soThangGui; i++) {
            soTienLai += soTienGui * (laiSuat / 100) / 12 * soThangGui;
        }
        System.out.println("Số tiền lãi: " + soTienLai);
    }
}
