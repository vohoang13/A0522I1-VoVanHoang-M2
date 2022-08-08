package ss1_Introduction_to_Java.Thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        int nam;
        Scanner year = new Scanner(System.in);
        System.out.println("Nhập vào năm cần kiểm tra:");
        nam = year.nextInt();
        if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 100 == 0 && nam % 400 == 0)){
            System.out.println(nam + " là năm nhuận");
        }else {
            System.out.println(nam + " là năm không nhuận");
        }
    }
}
