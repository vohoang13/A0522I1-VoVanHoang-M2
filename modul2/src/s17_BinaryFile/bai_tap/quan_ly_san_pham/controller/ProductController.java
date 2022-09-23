package s17_BinaryFile.bai_tap.quan_ly_san_pham.controller;

import s17_BinaryFile.bai_tap.quan_ly_san_pham.service.IProductService;
import s17_BinaryFile.bai_tap.quan_ly_san_pham.service.ProductService;

import java.io.IOException;
import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductService iProductService = new ProductService();
    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM--");
            System.out.println("1. Thêm sản phẩm\n" +
                    "2.Hiển thị sản phẩm\n" +
                    "3.Tìm kiếm theo id\n" +
                    "4.Xóa sản phẩm theo id\n" +
                    "5.Thoát");
            System.out.print("Nhập vào lựa chọn: ");
            try{
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
            switch (choice){
                case 1:
                    try {
                        iProductService.addProduct();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    iProductService.findAll();
                    break;
                case 3:
                    System.out.println("Nhập vào id sản phẩm: ");
                    String id = scanner.nextLine();
                    iProductService.findId(id);
                    break;
                case 4:
                    System.out.println("Nhập vào id sản phẩm cần xóa: ");
                    String removeId = scanner.nextLine();
                    iProductService.removeId(removeId);
                    break;
            }
        } while (choice != 5);
    }
}
