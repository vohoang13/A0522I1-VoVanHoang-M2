package ss2_loop_statement.Bai_tap;

import java.util.Scanner;

public class CacLoaiHinh {
    public static void main(String[] args) {
        //hình chữ nhật
        int chieuCao, chieuRong;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập vào chiều cao: ");
        chieuCao = sc.nextInt();
        System.out.printf("Nhập vào chiều rộng: ");
        chieuRong = sc.nextInt();
        for (int i = 0; i < chieuCao; i++) {
            for (int j = 0; j < chieuRong; j++) {
                if (j == 0 || i <= chieuCao - 1 || j <= chieuRong - 1) {
                    System.out.printf("*");
                }
            }
            System.out.printf("\n");
        }
        //hình tam giác vuông
        int cao;
        System.out.printf("Nhập vào chiều cao tam giác: ");
        cao = sc.nextInt();
        for (int i = 0; i <= cao; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        //tam giác vuông ngược
        System.out.printf("Nhập vào chiều cao tam giác: ");
        int cao2 = sc.nextInt();
        for (int i = cao2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println("\n");
        }

    }
}
