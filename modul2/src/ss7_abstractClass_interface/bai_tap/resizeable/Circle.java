package ss7_abstractClass_interface.bai_tap.resizeable;

import ss7_abstractClass_interface.bai_tap.resizeable.Resizeable;

public class Circle extends Shape{
    private double radius;

    @Override
    String name() {
        return "Circle: ";
    }

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public double getArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 3.14 * radius;
    }

    @Override
    public String toString() {
        return "A Square with side= " + this.radius + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        ss6_ke_thua.thuc_hanh.cac_doi_tuong_hinh_hoc.Circle circle = new ss6_ke_thua.thuc_hanh.cac_doi_tuong_hinh_hoc.Circle();
        System.out.println(circle);

        circle = new ss6_ke_thua.thuc_hanh.cac_doi_tuong_hinh_hoc.Circle(3.5);
        System.out.println(circle);

        circle = new ss6_ke_thua.thuc_hanh.cac_doi_tuong_hinh_hoc.Circle(3.5, "indigo", false);
        System.out.println(circle);
    }

    @Override
    public void resize(double percent) {
        this.radius += percent;
    }
}

