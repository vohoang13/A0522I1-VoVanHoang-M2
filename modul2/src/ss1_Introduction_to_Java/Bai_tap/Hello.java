package ss1_Introduction_to_Java.Bai_tap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner ten = new Scanner(System.in);
        System.out.println("Nhập vào họ tên");
        String hoTen = ten.nextLine();
        System.out.println("Hello: " + hoTen);
    }
}
