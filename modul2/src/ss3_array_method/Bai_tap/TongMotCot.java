package ss3_array_method.Bai_tap;

import java.util.Scanner;

public class TongMotCot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col, row;
        System.out.printf("Nhập vào độ dài hàng : ");
        row = sc.nextInt();
        System.out.printf("Nhập vào độ dài cột : ");
        col = sc.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử cho hàng " + i + ": ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập phần tử thứ " + j + " của hàng " + i + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.printf("Nhập vào cột muốn tính: ");
        int numCol = sc.nextInt();
        int sum = 0;
        System.out.printf("Tổng các phần tử tại cột " + numCol + " = ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (numCol == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.printf(" " + sum);
//        Scanner sc = new Scanner(System.in);
//        int arr[][] = {{1,8,9},{1,2,3},{1,2,3}};
//        System.out.printf("Nhập vào cột muốn tính: ");
//        int numCol = sc.nextInt();
//        int sum = 0;
//        for(int i = 0; i < arr.length;i++){
//            for(int j = 0; j< arr[i].length;j++){
//                if(j == numCol){
//                    sum += arr[i][j];
//                }
//            }
//        }
//        System.out.printf(" " + sum);
    }
}
