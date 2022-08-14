package ss4_oop.Bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getABC() {
        return "{ " + a + ", " + b + ", " + c + " }";
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() == 0) {
            return -b / (2 * a);
        }
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Giải phương trình bậc 2 ");
        System.out.printf("Nhập vào biến a: ");
        a = sc.nextDouble();
        System.out.printf("Nhập vào biến b: ");
        b = sc.nextDouble();
        System.out.printf("Nhập vào biến c: ");
        c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Chi tiết: " + quadraticEquation.getABC());
        if(quadraticEquation.getDiscriminant()>0){
            System.out.printf("Phương trình có 2 nghiệm: " + quadraticEquation.getRoot1() + "," +quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant()==0){
            System.out.printf("Phương trình có 1 nghiệm : " + quadraticEquation.getRoot1());
        }else {
            System.out.printf("Phương trình vô nghiệm");
        }
    }
}
