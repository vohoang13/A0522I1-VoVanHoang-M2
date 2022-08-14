package ss4_oop.Thuc_hanh;

import java.util.Scanner;

public class HinhChuNhat {
    int weight;
    int height;
    public HinhChuNhat(){
    }
    public HinhChuNhat(int weight,int height){
        this.weight=weight;
        this.height=height;
    }
    public int getDientich(){
        return this.weight*this.height;
    }
    public int getChuvi(){
        return (this.height+this.weight)*2;
    }
    public String getDisplay(){
        return "{ height: " + height +", weight: " + weight + " }";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Nhập vào chiều cao: ");
        int height = sc.nextInt();
        System.out.printf("Nhập vào chiều dài: ");
        int weight = sc.nextInt();
        HinhChuNhat hinhChuNhat = new HinhChuNhat(height,weight);
        System.out.printf("Chi tiết hình chữ nhật: " + hinhChuNhat.getDisplay());
        System.out.printf("\nDiện tích hình chữ nhật: " + hinhChuNhat.getDientich());
        System.out.printf("\nChu vi hình chữ nhật: " + hinhChuNhat.getChuvi());
    }
}
