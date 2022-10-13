package ss19_Case_Study.QuanLyResort.controller;

import java.util.Scanner;

public class PromotionManagement {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayPromotion() {
        int choice = 0;
        do {
            System.out.println("--Promotion Management--");
            System.out.println("1.Display list customer use service\n" +
                    "2.Display list customers get voucher\n" +
                    "3.Return main menu");
            System.out.print("Nhập vào lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice != 3);
    }
}
