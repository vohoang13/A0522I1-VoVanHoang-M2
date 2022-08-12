package ss3_array_method.Bai_tap;

import java.util.Scanner;

public class TimMaxMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col, row;
        System.out.printf("Nhập vào độ dài hàng : ");
        row = sc.nextInt();
        System.out.printf("Nhập vào độ dài cột : ");
        col = sc.nextInt();
        int arr[][] = new int[row][col];
        for (int k = 0; k < arr.length; k++) {
            System.out.println("Nhập phần tử cho hàng " + k + ": ");
            for (int h = 0; h < arr[k].length; h++) {
                System.out.print("Nhập phần tử thứ " + h + " của hàng " + k + ": ");
                arr[k][h] = sc.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.printf("Giá trị lớn nhất: " + max);
    }
}
