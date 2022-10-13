package Exam2.controller;

import Exam2.service.IThuongService;
import Exam2.service.IVIPService;
import Exam2.service.ThuongService;
import Exam2.service.VIPService;

import java.util.Scanner;

public class BenhAnController {
    private static Scanner scanner = new Scanner(System.in);
    private static IThuongService iThuongService = new ThuongService();

    private static IVIPService ivipService = new VIPService();

    public static void main(String[] args) {
        int chon = 0;
        do{
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN--");
            System.out.println("1.Thêm mới\n" +
                    "2.Xóa\n" +
                    "3.Xem danh sách các bệnh án\n" +
                    "4.Thoát");
            System.out.println("Chọn chức năng: ");
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1:
                    int luaChon = 0;
                    do {
                        System.out.println("1.Bệnh nhân thường\n" +
                                "2.Bệnh nhân VIP\n" +
                                "3.Thoát");
                        System.out.println("Nhập vào lựa chọn: ");
                        luaChon = Integer.parseInt(scanner.nextLine());
                        switch (luaChon){
                            case 1:
                                iThuongService.addThuong();
                                break;
                            case 2:
                                ivipService.addVIP();
                                break;
                            case 3:
                                break;
                        }
                    }while (luaChon < 1 || luaChon > 3 ||luaChon !=3);
                    break;
                case 2:
                    int luaChon2 = 0;
                    do{
                        System.out.println("1.Xóa bệnh nhân thường\n" +
                                "2.Xóa bệnh nhân VIP\n" +
                                "3.Thoát");
                        System.out.println("Nhập vào lựa chọn: ");
                        luaChon2 = Integer.parseInt(scanner.nextLine());
                        switch (luaChon2){
                            case 1:
                                System.out.println("Nhập vào mã bệnh nhân cần xóa: ");
                                String ma = scanner.nextLine();
                                iThuongService.xoa(ma);
                                break;
                            case 2:
                                System.out.println("Nhập vào mã bệnh nhân cần xóa: ");
                                String maXoa = scanner.nextLine();
                                ivipService.xoa(maXoa);
                                break;
                            case 3:
                                break;
                        }
                    }while (luaChon2 < 1 || luaChon2 > 3 || luaChon2 !=3);
                    break;
                case 3:
                    int luaChon3 = 0;
                    do{
                        System.out.println("1.Danh sách bệnh nhân thường\n" +
                                "2.Danh sách bệnh nhân VIP\n" +
                                "3.Thoát");
                        System.out.println("Nhập vào lựa chọn :");
                        luaChon3 = Integer.parseInt(scanner.nextLine());
                        switch (luaChon3){
                            case 1:
                                iThuongService.findAll();
                                break;
                            case 2:
                                ivipService.findAll();
                                break;
                            case 3:
                                break;
                        }

                    }while (luaChon3 < 1 || luaChon3 > 3 ||luaChon3 !=3);
                    break;
            }
        }while (chon < 1 || chon > 4 || chon != 4);
    }
}
