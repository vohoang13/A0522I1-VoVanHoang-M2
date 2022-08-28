package ss7_abstractClass_interface.bai_tap.resizeable;

import ss7_abstractClass_interface.bai_tap.resizeable.Resizeable;

public class Rectangle extends Shape{
    private double width;
    private double length;

    @Override
    String name() {
        return "Rectangle: ";
    }

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, boolean filled, String color) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width= " +
                width +
                " and length= " + length +
                ", which is a subclass of " +
                super.toString();
    }

    public static void main(String[] args) {
        ss6_ke_thua.thuc_hanh.cac_doi_tuong_hinh_hoc.Rectangle rectangle = new ss6_ke_thua.thuc_hanh.cac_doi_tuong_hinh_hoc.Rectangle();
        System.out.println(rectangle);
        rectangle = new ss6_ke_thua.thuc_hanh.cac_doi_tuong_hinh_hoc.Rectangle(2,3);
        System.out.println(rectangle);
        rectangle = new ss6_ke_thua.thuc_hanh.cac_doi_tuong_hinh_hoc.Rectangle(2,3,false,"black");
        System.out.println(rectangle);
    }

    @Override
    public void resize(double percent) {
        this.length += percent;
    }
}
