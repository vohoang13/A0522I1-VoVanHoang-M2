package Exam.controller;

import Exam.service.ChinhHangService;
import Exam.service.IChinhHangService;
import Exam.service.IXachTayService;
import Exam.service.XachTayService;

import java.util.Scanner;

public class DienThoaiController {
    private static Scanner scanner = new Scanner(System.in);

    private static IChinhHangService iChinhHangService = new ChinhHangService();

    private static IXachTayService iXachTayService = new XachTayService();

    public static void main(String[] args) {
        int chon = 0;
        boolean check;
        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ DIỆN THOẠI--");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1.Thêm mới\n" +
                    "2.Xóa\n" +
                    "3.Xem danh sách điện thoại\n" +
                    "4.Tìm kiếm\n" +
                    "5.Thoát");
            do {
                System.out.println("Nhập vào lựa chọn: ");
                check = false;
                try {
                    chon = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    check = true;
                    e.printStackTrace();
                } catch (Exception e) {
                    check = true;
                    e.printStackTrace();
                }
            }while (check);
            switch (chon){
                case 1:
                    int luaChon = 0;
                    do {
                        System.out.println("--THÊM MỚI--");
                        System.out.println("1.Điện thoại chính hãng\n" +
                                "2.Điện thoại xách tay\n" +
                                "3.Thoát");
                        System.out.println("Nhập vào lựa chọn: ");
                        luaChon = Integer.parseInt(scanner.nextLine());
                        switch (luaChon){
                            case 1:
                                iChinhHangService.themChinhHang();
                                break;
                            case 2:
                                iXachTayService.themXachTay();
                                break;
                            case 3:
                                break;
                        }
                    }while (luaChon < 1 || luaChon > 3 || luaChon !=3);
                    break;
                case 2:
                    int luaChon1 = 0;
                    do {
                        System.out.println("--XÓA--");
                        System.out.println("1.Điện thoại chính hãng\n" +
                                "2.Điện thoại xách tay\n" +
                                "3.Thoát");
                        System.out.println("Nhập vào lựa chọn: ");
                        luaChon1 = Integer.parseInt(scanner.nextLine());
                        switch (luaChon1){
                            case 1:
                                System.out.println("Nhập vào id: ");
                                int id = Integer.parseInt(scanner.nextLine());
                                iChinhHangService.xoa(id);
                                break;
                            case 2:
                                System.out.println("Nhập vào id: ");
                                int idSecond = Integer.parseInt(scanner.nextLine());
                                iXachTayService.xoa(idSecond);
                                break;
                            case 3:
                                break;
                        }
                    }while (luaChon1 < 1 || luaChon1 > 3 || luaChon1 !=3);
                    break;
                case 3:
                    int luaChon2 = 0;
                    do{
                        System.out.println("--HIỂN THỊ DANH SÁCH--");
                        System.out.println("1.Điện thoại chính hãng\n" +
                                "2.Điện thoại xách tay\n" +
                                "3.Thoát");
                        System.out.println("Nhập vào lựa chọn: ");
                        luaChon2 = Integer.parseInt(scanner.nextLine());
                        switch (luaChon2){
                            case 1:
                                iChinhHangService.danhSach();
                                break;
                            case 2:
                                iXachTayService.danhSach();
                                break;
                            case 3:
                                break;
                        }
                    }while (luaChon2 < 1 || luaChon2 > 3 || luaChon2 !=3);
                    break;
                case 4:
                    int luaChon3 = 0;
                    do{
                        System.out.println("--TÌM KIẾM ĐIỆN THOẠI--");
                        System.out.println("1.Tìm kiếm theo id\n" +
                                "2.Tìm kiếm theo tên\n" +
                                "3.Thoát");
                        System.out.println("Nhập vào lựa chọn: ");
                        luaChon3 = Integer.parseInt(scanner.nextLine());
                        switch (luaChon3){
                            case 1:
                                System.out.println("Nhập vào id: ");
                                int id = Integer.parseInt(scanner.nextLine());
                                iChinhHangService.timKiemID(id);
                                iXachTayService.timKiemID(id);
                                break;
                            case 2:
                                System.out.println("Nhập vào tên điện thoại: ");
                                String name = scanner.nextLine();
                                iChinhHangService.timKiemTen(name);
                                iXachTayService.timKiemTen(name);
                                break;
                            case 3:
                                break;
                        }
                    }while (luaChon3 > 3 || luaChon3 < 1 || luaChon3 !=3);
                    break;
            }
        }while (chon > 5 || chon < 1 ||chon !=5);
    }
}
