package ss1_Introduction_to_Java.Bai_tap;

import java.util.Scanner;

public class DocSo {
    public static void main(String[] args) {
        int num, donVi, chuc, tram;
        Scanner number = new Scanner(System.in);
        System.out.println("Nhập vào số cần đọc : ");
        num = number.nextInt();
        donVi = num % 10;
        chuc = (num / 10) % 10;
        tram = (num / 100) % 10;
        switch (tram) {
            case 1:
                System.out.printf("Một trăm ");
                break;
            case 2:
                System.out.printf("Hai trăm ");
                break;
            case 3:
                System.out.printf("Ba trăm ");
                break;
            case 4:
                System.out.printf("Bốn trăm ");
                break;
            case 5:
                System.out.printf("Năm trăm ");
                break;
            case 6:
                System.out.printf("Sáu trăm ");
                break;
            case 7:
                System.out.printf("Bảy trăm ");
                break;
            case 8:
                System.out.printf("Tám trăm ");
                break;
            case 9:
                System.out.printf("Chín trăm ");
                break;
        }
        switch (chuc) {
            case 0:
                System.out.printf("lẻ ");
                break;
            case 1:
                System.out.printf("Mười ");
                break;
            case 2:
                System.out.printf("Hai mươi ");
                break;
            case 3:
                System.out.printf("Ba mươi ");
                break;
            case 4:
                System.out.printf("Bốn mươi ");
                break;
            case 5:
                System.out.printf("Năm mươi ");
                break;
            case 6:
                System.out.printf("Sáu mươi ");
                break;
            case 7:
                System.out.printf("Bảy mươi ");
                break;
            case 8:
                System.out.printf("Tám mươi ");
                break;
            case 9:
                System.out.printf("Chín mươi ");
                break;
        }
        switch (donVi) {
            case 1:
                System.out.printf("Một ");
                break;
            case 2:
                System.out.printf("Hai ");
                break;
            case 3:
                System.out.printf("Ba ");
                break;
            case 4:
                System.out.printf("Bốn ");
                break;
            case 5:
                System.out.printf("Năm ");
                break;
            case 6:
                System.out.printf("Sáu ");
                break;
            case 7:
                System.out.printf("Bảy ");
                break;
            case 8:
                System.out.printf("Tám ");
                break;
            case 9:
                System.out.printf("Chín ");
                break;
        }
    }
}
