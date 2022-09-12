package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.controller;

import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model.Oto;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.service.*;

import java.util.Scanner;

public class TransportController {
    static IOtoService iOtoService = new OtoService();

    static IXeTaiService iXeTaiService = new XeTaiService();

    static IXeMayService iXeMayService = new XeMayService();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       while (true){
           System.out.println(" CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG ");
           System.out.println("Chọn chức năng: ");
           System.out.println("1.Thêm mới phương tiện \n" +
                   "2.Hiển thị phương tiện \n" +
                   "3.Xóa phương tiện \n" +
                   "4.Tìm kiếm theo biển kiểm soát \n" +
                   "5.Thoát");
           System.out.print("Nhập vào lựa chọn: ");
           int choice = Integer.parseInt(scanner.nextLine());
           switch (choice){
               case 1:
                   System.out.println("1.Thêm xe tải \n" +
                           "2.Thêm oto \n" +
                           "3.Thêm xe máy \n" +
                           "4.Thoát");
                   System.out.print("Nhập vào lựa chọn: ");
                   int firstOption = Integer.parseInt(scanner.nextLine());
                   switch (firstOption){
                       case 1:
                           iXeTaiService.addXeTai();
                           break;
                       case 2:
                           iOtoService.addOto();
                           break;
                       case 3:
                           iXeMayService.addXeMay();
                           break;
                       case 4:
                           break;
                   }
                   break;
               case 2:
                   System.out.println("1.Danh sách xe tải \n" +
                           "2.Danh sách xe oto \n" +
                           "3.Danh sách xe máy \n" +
                           "4.Thoát");
                   System.out.printf("Nhập vào lựa chọn: ");
                   int secondOption = Integer.parseInt(scanner.nextLine());
                   switch (secondOption){
                       case 1:
                           iXeTaiService.display();
                           break;
                       case 2:
                           iOtoService.display();
                           break;
                       case 3:
                           iXeMayService.display();
                           break;
                   }
                   break;
               case 3:
                   System.out.println("1.Xóa xe tải \n" +
                           "2.Xóa xe oto \n" +
                           "3.Xóa xe máy \n" +
                           "4.Thoát");
                   System.out.print("Nhập vào lựa chọn: ");
                   int thirdOption = Integer.parseInt(scanner.nextLine());
                   switch (thirdOption){
                       case 1:
                           System.out.print("Nhập vào biển số muốn xóa: ");
                           String bienSo = scanner.nextLine();
                           iXeTaiService.remove(bienSo);
                           break;
                       case 2:
                           System.out.printf("Nhập vào biển số muốn xóa: ");
                           String bienSo2 = scanner.nextLine();
                           iOtoService.remove(bienSo2);
                           break;
                       case 3:
                           System.out.printf("Nhập vào biển số muốn xóa: ");
                           String bienSo3 = scanner.nextLine();
                           iXeMayService.remove(bienSo3);
                           break;
                       case 4:
                           break;
                   }
                   break;
               case 4:
                   System.out.print("Nhập vào biển số muốn tìm: ");
                   String bienSoXe = scanner.nextLine();
                   iXeMayService.findTrans(bienSoXe);
                   iOtoService.findTrans(bienSoXe);
                   iXeTaiService.findTrans(bienSoXe);
                   break;
               case 5:
                   break;
           }
       }
    }
}
