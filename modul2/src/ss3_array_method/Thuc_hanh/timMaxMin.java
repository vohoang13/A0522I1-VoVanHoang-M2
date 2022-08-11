package ss3_array_method.Thuc_hanh;

import java.util.Scanner;

public class timMaxMin {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào độ dài: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Nhập lại");
            }
        } while (size > 20);
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào phần tử thứ " + i + ": ");
           arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int index = 0;
        for ( int j = 1; j < arr.length; j++){
            if(max < arr[j]){
                max = arr[j];
                index = j;
            }
        }
        System.out.printf("Giá trị lớn nhất : " + max + " tại vị trí " + index);
    }
}
