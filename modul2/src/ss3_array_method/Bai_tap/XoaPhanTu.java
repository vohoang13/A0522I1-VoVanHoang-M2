package ss3_array_method.Bai_tap;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập độ dài cho mảng: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int del;
        int index = 0;
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập phần tử thứ " + i + " cho mảng: ");
            arr[i] = sc.nextInt();
        }
        System.out.printf("Nhập vào phần tử muốn xóa : ");
        del = sc.nextInt();
        for (int j = 0; j < size; j++) {
            if (arr[j] == del) {
                index = j;
            }
        }
        for (int k = index; k < size - 1; k++) {
            arr[k] = arr[k + 1];
        }
        size--;
        System.out.printf("Mảng sau khi xóa:");
        for (int h = 0; h < size; h++) {
            System.out.print(arr[h] + "\t");
        }
    }
}
