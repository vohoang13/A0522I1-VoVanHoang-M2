package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.controller;

import java.util.Scanner;

public class PersonController {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN VÀ GIÁO VIÊN--");
            System.out.println("Chọn chức năng theo số:");
            System.out.println("1.Quản lý sinh viên\n" +
                    "2. Quản lý giáo viên\n" +
                    "3. Thoát ");
            System.out.print("Mời bạn nhập:");
            int num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1:
                    StudentController.menuStudent();
                    break;
            }
        }
    }
}
