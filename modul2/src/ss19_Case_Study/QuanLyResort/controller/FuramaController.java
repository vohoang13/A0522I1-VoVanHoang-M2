package ss19_Case_Study.QuanLyResort.controller;


import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        int choice = 0;
        boolean check;
        do {
            System.out.println("--RESORT FURAMA--");
            System.out.println("1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management\n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit");
            do {
                System.out.println("Nhập vào lựa chọn: ");
                check = false;
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    check = true;
                    e.printStackTrace();
                } catch (Exception e) {
                    check = true;
                    e.printStackTrace();
                }
            }while (check);
            switch (choice) {
                case 1:
                    EmployeeManagement.displayEmployee();
                    break;
                case 2:
                    CustomerManagement.displayCustomer();
                    break;
                case 3:
                    FacilityManagement.displayFacility();
                    break;
                case 4:
                    BookingManagement.displayBooking();
                    break;
                case 5:
                    PromotionManagement.displayPromotion();
                    break;
                case 6:
                    break;
            }
        } while (choice != 6 || choice < 1 || choice > 6);
    }
}
