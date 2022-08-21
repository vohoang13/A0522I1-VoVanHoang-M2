package ss7_abstractClass_interface.bai_tap.colorable;

public class Square extends Shape implements Colorable{
    private double side;

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

    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}
