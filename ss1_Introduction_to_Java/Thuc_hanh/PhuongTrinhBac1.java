package ss1_Introduction_to_Java.Thuc_hanh;

import java.util.Scanner;

public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào điểm a:");
        a=scanner.nextInt();
        System.out.println("Nhập vào biến b:");
        b=scanner.nextInt();
        if(a==0){
            if(b!=0){
                System.out.println("Phương trình vô nghiệm");
            }else {
                System.out.println("Phương trình có vô số nghiệm");
            }
        }else {
            System.out.println("Nghiệm của phương trình : "+ -b*1.0/a);
        }
    }
}
