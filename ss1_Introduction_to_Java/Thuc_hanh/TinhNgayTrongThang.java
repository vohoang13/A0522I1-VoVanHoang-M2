package ss1_Introduction_to_Java.Thuc_hanh;

import java.util.Scanner;

public class TinhNgayTrongThang {
    public static void main(String[] args) {
        int thang;
        Scanner month = new Scanner(System.in);
        System.out.println("Nhập vào tháng :");
        thang = month.nextInt();
        switch (thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + thang + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + thang + " có 30 ngày");
                break;
            case 2:
                System.out.println("Tháng " + thang + " có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("Nhập sai ");
        }
    }
}
