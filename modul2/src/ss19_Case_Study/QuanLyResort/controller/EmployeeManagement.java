package ss19_Case_Study.QuanLyResort.controller;

import ss19_Case_Study.QuanLyResort.service.EmployeeService;
import ss19_Case_Study.QuanLyResort.service.IEmployeeService;

import java.util.Scanner;

public class EmployeeManagement {
    private static IEmployeeService iEmployeeService = new EmployeeService();
    private static Scanner scanner = new Scanner(System.in);

    public static void displayEmployee(){
        int choice = 0;
        boolean check;
        do{
            System.out.println("--Employee Management--");
            System.out.println("1.Display list employees\n" +
                    "2.Add new employees\n" +
                    "3.Edit employees\n" +
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
                    iEmployeeService.display();
                    break;
                case 2:
                    iEmployeeService.addEmployees();
                    break;
                case 3:
                    System.out.print("Nhập vào mã nhân viên 'NV-xxx' :");
                    String maNV = scanner.nextLine();
                    iEmployeeService.edit(maNV);
                    break;
                case 4:
                    return;
            }
        }while (choice != 4);
    }
}
