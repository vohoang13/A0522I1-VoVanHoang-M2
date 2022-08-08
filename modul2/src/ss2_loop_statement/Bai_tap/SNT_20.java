package ss2_loop_statement.Bai_tap;

import java.util.Scanner;

public class SNT_20 {
    public static void main(String[] args) {
        int so, dem, dem2;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập vào 1 số:  ");
        so = sc.nextInt();
        dem2=0;
        for (int i = 1; i > 0; i++) {
            dem = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    dem++;
                }
            }
            if (dem == 2) {
                System.out.printf(i + " ");
                dem2++;
            }
            if (dem2 == so) {
                break;
            }
        }
    }
}
