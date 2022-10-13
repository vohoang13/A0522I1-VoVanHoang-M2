package ss19_Case_Study.QuanLyResort.controller;

import ss19_Case_Study.QuanLyResort.service.CustomerService;
import ss19_Case_Study.QuanLyResort.service.ICustomerService;

import java.util.Scanner;

public class CustomerManagement {
    private static ICustomerService iCustomerService = new CustomerService();
    private static Scanner scanner = new Scanner(System.in);

    public static void displayCustomer() {
        int choice = 0;
        boolean check;
        do {
            System.out.println("--Customer Management--");
            System.out.println("1.Display list customers\n" +
                    "2.Add new customer\n" +
                    "3.Edit customer\n" +
                    "4.Return Main Menu");
            do{
                check = false;
                System.out.print("Nhập vào lựa chọn của bạn: \n");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                }catch (NumberFormatException e){
                    check = true;
                    e.printStackTrace();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }while (check);
            switch (choice){
                case 1:
                    iCustomerService.display();
                    break;
                case 2:
                    iCustomerService.addCustomer();
                    break;
                case 3:
                    System.out.print("Nhập vào mã khách hàng: ");
                    String maKH = scanner.nextLine();
                    iCustomerService.edit(maKH);
                    break;
                case 4:
                    return;
            }
        } while (choice != 4);
    }
}
