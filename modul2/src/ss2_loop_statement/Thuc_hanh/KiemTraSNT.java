package ss2_loop_statement.Thuc_hanh;

import java.util.Scanner;

public class KiemTraSNT {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số cần kiểm tra:");
        num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count ++;
            }
        }
        if(count == 2){
            System.out.println(num + " là số nguyên tố");
        }else{
            System.out.println(num + " không phải số nguyên tố ");
        }
    }
}
