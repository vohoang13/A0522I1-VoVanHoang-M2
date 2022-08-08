package ss2_loop_statement.Thuc_hanh;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị a: ");
        a = sc.nextInt();
        System.out.println("Nhập vào giá trị b: ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có UCLN");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("UCLN :" + a);
    }
}
