package ss3_array_method.Bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, size2;
        System.out.printf("Nhập vào độ dài mảng 1: ");
        size = sc.nextInt();
        int arr1[] = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + " của mảng 1: ");
            arr1[i] = sc.nextInt();
        }
        System.out.printf("Nhập độ dài mảng 2: ");
        size2 = sc.nextInt();
        int arr2[] = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + " của mảng 2: ");
            arr2[i] = sc.nextInt();
        }
        int arr3[] = new int[size + size2];
        for (int j = 0; j < arr1.length; j++) {
            arr3[j] = arr1[j];
        }
        int d = arr1.length;
        for (int k = 0; k < arr2.length; k++) {
            arr3[d] = arr2[k];
            d++;
        }
        System.out.printf("Mảng 3 sau khi gộp mảng: ");
        for (int x : arr3) {
            System.out.printf(x + " ");
        }
    }
}
