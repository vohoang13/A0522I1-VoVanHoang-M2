package ss6_ke_thua.thuc_hanh.cac_doi_tuong_hinh_hoc;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, boolean filled, String color) {
        super(side, side, filled, color);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    public void setWidth(double width) {
        setSide(width);
    }

    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side= " +
                getSide() + ", which is a subclass of " +
                super.toString();
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, true, "yellow");
        System.out.println(square);
    }
}
