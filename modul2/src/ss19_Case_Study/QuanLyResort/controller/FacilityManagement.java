package ss19_Case_Study.QuanLyResort.controller;

import ss19_Case_Study.QuanLyResort.service.FacilityService;
import ss19_Case_Study.QuanLyResort.service.IFacilityService;

import java.util.Scanner;

public class FacilityManagement {
    static IFacilityService iFacilityService = new FacilityService();
    private static Scanner scanner = new Scanner(System.in);

    public static void displayFacility() {
        int choice = 0;
        boolean check;
        do {
            System.out.println("--Facility Management--");
            System.out.println("1.Display list employees\n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
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

                    break;
                case 2:
                    int chosen = 0;
                    do {
                        System.out.println("1.Add New Villa\n" +
                                "2.Add New House\n" +
                                "3.Add New Room\n" +
                                "4.Back to menu");
                        chosen = Integer.parseInt(scanner.nextLine());
                        switch (chosen) {
                            case 1:
                                iFacilityService.addVilla();
                                break;
                            case 2:
                                iFacilityService.addHouse();
                                break;
                            case 3:
                                iFacilityService.addRoom();
                                break;
                            case 4:
                                break;
                        }
                    }while (chosen != 4);
                    break;
            }
        } while (choice != 4);
    }
}
