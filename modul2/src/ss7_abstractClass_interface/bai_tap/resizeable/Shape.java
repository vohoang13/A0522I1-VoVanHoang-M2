package ss7_abstractClass_interface.bai_tap.resizeable;

public abstract class Shape implements Resizeable{
    private String color;
    private boolean filled;
    abstract String name();
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    abstract double getArea();

    abstract double getPerimeter();
    @Override
    public String toString() {
        return "A Shape with color of " + this.color + " and " + ((isFilled()) ? "Filled" : "not filled");
    }

    public static void main(String[] args) {
        ss6_ke_thua.thuc_hanh.cac_doi_tuong_hinh_hoc.Shape shape = new ss6_ke_thua.thuc_hanh.cac_doi_tuong_hinh_hoc.Shape();
        System.out.printf(shape.toString());
    }
}
