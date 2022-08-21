package ss7_abstractClass_interface.bai_tap.colorable;

public class Circle extends Shape{
    private double radius;

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

}
