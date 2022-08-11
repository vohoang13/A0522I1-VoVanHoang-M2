package ss3_array_method.Thuc_hanh;

import java.util.Scanner;

public class timMang {
    public static void main(String[] args) {
        String arr[] = {"NguyenVanA", "VoVanHoang", "Tuan"};
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập vào tên sinh viên: ");
        String name = sc.nextLine();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(name)){
                System.out.println("Tìm thấy");
                count++;
            }
        }
        if(count==0){
            System.out.println("Không tìm thấy");
        }
    }
}
