package ss3_array_method.Bai_tap;

import java.util.Scanner;

public class TimMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập vào độ dài mảng: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
            }
        }
        System.out.printf("Giá trị nhỏ nhất của mảng: " + min);
    }
}
