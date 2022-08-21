package ss7_abstractClass_interface.bai_tap.resizeable;

import sun.security.rsa.RSASignature;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle();
        shapes[1] = new Square();
        shapes[2] = new Circle();
        double numRan = Math.random() * (100-1+1) + 1;
//        System.out.println(numRan);
        System.out.println("Diện tích trước khi tăng kích thước: ");
        for(Shape shape : shapes){
            System.out.println(shape.name());
            System.out.println(shape.getArea());
        }
        System.out.println("Diện tích sau khi tăng kích thước: ");
        for (Shape shape: shapes){
            shape.resize(numRan);
            System.out.println(shape.name());
            System.out.println(shape.getArea());
        }
    }
}
