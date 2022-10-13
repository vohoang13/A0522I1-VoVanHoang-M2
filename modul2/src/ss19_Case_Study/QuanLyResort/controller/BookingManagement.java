package ss19_Case_Study.QuanLyResort.controller;

import java.util.Scanner;

public class BookingManagement {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayBooking() {
        int choice = 0;
        do {
            System.out.println("--Booking Management--");
            System.out.println("1.Add new booking\n" +
                    "2.Display list booking\n" +
                    "3.Create new contracts\n" +
                    "4.Display list contract\n" +
                    "5.Edit contract\n" +
                    "6.Return main menu");
            System.out.print("Nhập vào lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice != 6);
    }
}
