package ss3_array_method.Bai_tap;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập độ dài cho mảng: ");
        int size = sc.nextInt();
        int arr[] = new int[100];
        int push;
        int index;
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập phần tử thứ " + i + " cho mảng: ");
            arr[i] = sc.nextInt();
        }
        System.out.printf("Nhập vào phần tử muốn thêm: ");
        push = sc.nextInt();
        do {
            System.out.printf("Nhập vào vị trí muốn thêm: ");
            index = sc.nextInt();
            if (index <= 1 || index > arr.length - 1) {
                System.out.printf("Nhập lại! Không thêm vào mảng được");
            }
        } while (index <= 1 || index > arr.length - 1);
        for (int j = size; j >= index; j--) {
            arr[j + 1] = arr[j];
        }
        arr[index] = push;
        //HỎI CÁCH TĂNG KÍCH THƯỚC SAU KHI THÊM

        System.out.printf("Mảng sau khi thêm : ");
        for (int h = 0; h < arr.length; h++) {
            System.out.printf(arr[h] + "\t");
        }
    }
}
