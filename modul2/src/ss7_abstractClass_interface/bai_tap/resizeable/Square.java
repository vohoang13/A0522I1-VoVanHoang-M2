package ss7_abstractClass_interface.bai_tap.resizeable;

import ss7_abstractClass_interface.bai_tap.resizeable.Resizeable;

public class Square extends Shape {
    private double side;

    @Override
    String name() {
        return "Square: ";
    }

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, boolean filled, String color) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * 4;
    }

        @Override
    public String toString() {
        return "A Square with side= " +
                getSide() + ", which is a subclass of " +
                super.toString();
    }

    public static void main(String[] args) {
        ss6_ke_thua.thuc_hanh.cac_doi_tuong_hinh_hoc.Square square = new ss6_ke_thua.thuc_hanh.cac_doi_tuong_hinh_hoc.Square();
        System.out.println(square);

        square = new ss6_ke_thua.thuc_hanh.cac_doi_tuong_hinh_hoc.Square(2.3);
        System.out.println(square);

        square = new ss6_ke_thua.thuc_hanh.cac_doi_tuong_hinh_hoc.Square(5.8, true, "yellow");
        System.out.println(square);
    }

    @Override
    public void resize(double percent) {
        this.side += percent;
    }
}

