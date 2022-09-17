package ss15_Exception_Debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IllegalTriangleException {
        System.out.println("Nhập vào số a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào số b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào số c: ");
        double c = Double.parseDouble(scanner.nextLine());
//        try {
//            checkTriangle(a,b,c);
//        } catch (IllegalTriangleException illegalTriangleException){
//            illegalTriangleException.printStackTrace();
//        }
        try{
            checkTriangle(a,b,c);
        }catch (IllegalTriangleException illegalTriangleException){
            illegalTriangleException.printStackTrace();
        }
        System.out.println("Kết thúc");
    }
    
    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if(a <0 || b < 0 || c < 0){
            throw new IllegalTriangleException("Exception xảy ra vì nhập số bị âm");
        } else if (a + b <= c || b + c <= a || a + c <= b ) {
            throw  new IllegalTriangleException("Exception xảy ra vì tổng hai số không lớn hơn số còn lại");
        }
    }
}
