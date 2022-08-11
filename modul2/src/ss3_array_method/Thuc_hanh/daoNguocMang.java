package ss3_array_method.Thuc_hanh;

import java.util.Scanner;

public class daoNguocMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int size;
       int arr[];
       do{
           System.out.print("Nhập vào độ dài mảng: ");
           size = sc.nextInt();
           if(size > 20){
               System.out.println("Nhập lại");
           }
       }while (size > 20);
       arr = new int[size];
       for( int i=0; i < arr.length; i++){
           System.out.print("Nhập phần tử thứ " + i + " cho mảng: ");
           arr[i] = sc.nextInt();
       }
      for ( int j=0;j<arr.length/2;j++){
          int temp = arr[j];
          arr[j] = arr[arr.length - 1 - j];
          arr[arr.length - 1 - j] = temp;
      }
        System.out.println("Mảng sau khi đảo ngược:");
      for (int x : arr){
          System.out.println(x);
      }
    }
}
