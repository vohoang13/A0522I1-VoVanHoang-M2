package ss3_array_method.Bai_tap;

import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
//        int arr[][]={
//                {1,2,3},
//                {3,4,5},
//                {5,6,7}
//        };
//        int sum = 0;
//        for(int i= 0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                if(i == j){
//                    sum += arr[i][j];
//                }
//            }
//        }
//        System.out.printf(" " + sum);
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
        int sum = 0;
        System.out.printf("Tổng các phần tử tại đường chéo chính: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.printf(" " + sum);
    }
}
