package ss12_JavaCollection.bai_tap.controller;

import ss12_JavaCollection.bai_tap.service.IProductService;
import ss12_JavaCollection.bai_tap.service.ProductService;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductService iProductService = new ProductService();

    public static void main(String[] args) {
        while (true){
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM");
            System.out.println("1.Thêm sản phẩm\n" +
                    "2.Sửa thông tin sản phẩm theo id\n" +
                    "3.Xóa sản phẩm theo id\n" +
                    "4.Hiển thị danh sách sản phẩm\n" +
                    "5.Tìm kiếm sản phẩm theo tên\n" +
                    "6.Sắp xếp sản phẩm tăng dần\n" +
                    "7.Sắp xếp giảm dần theo giá\n");
            System.out.printf("Nhập vào lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    System.out.printf("Nhập vào id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    iProductService.setProduct(id);
                    break;
                case 3:
                    System.out.print("Nhập vào id cần xóa: ");
                    id = Integer.parseInt(scanner.nextLine());
                    iProductService.removeProduct(id);
                    break;
                case 4:
                    iProductService.findAll();
                    break;
                case 5:
                    System.out.printf("Nhập vào tên sản phẩm: ");
                    String name = scanner.nextLine();
                    iProductService.findProduct(name);
                    break;
                case 6:
                    iProductService.sortProduct();
                    break;
                case 7:
                    iProductService.sortReduceProduct();
                    break;
            }
        }

    }
}
