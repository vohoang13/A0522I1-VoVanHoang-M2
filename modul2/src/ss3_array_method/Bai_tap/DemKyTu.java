package ss3_array_method.Bai_tap;

import java.util.Scanner;

public class DemKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "vovanhoanghtc";
        System.out.printf("Nhập vào 1 ký tự cần kiểm tra: ");
        char s = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == s) {
                count++;
            }
        }
        System.out.printf(" " + count);
    }
}

