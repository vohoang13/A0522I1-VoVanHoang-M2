package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.controller;

import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.service.IStudent;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.service.StudentService;

import java.util.Scanner;

public class

StudentController {
    private static IStudent iStudent = new StudentService();
    private static Scanner scanner = new Scanner(System.in);


    public static void menuStudent() {
        while (true) {
            System.out.println("--Chương trình quản lý sinh viên--");
            System.out.println("Chọn các chức năng:");
            System.out.println("1.Thêm mới sinh viên\n" +
                    "2.Danh sách sinh viên\n" +
                    "3.Xóa sinh viên\n" +
                    "4.Thoát\n");
            System.out.println("Nhập vào chức năng muốn thực hiện: ");
            int num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1:
                    iStudent.addStudent();
                    System.out.println("Thêm thành công");
                    break;
                case 2:
                    iStudent.display();
                    break;
                case 3:
                    iStudent.remove();
                    break;
                case 4:
                    return;
            }
        }
    }
}
