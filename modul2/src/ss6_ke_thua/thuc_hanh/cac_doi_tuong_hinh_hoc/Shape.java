package ss6_ke_thua.thuc_hanh.cac_doi_tuong_hinh_hoc;

public class Shape {
    private String color;
    private boolean filled;

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

    @Override
    public String toString() {
        return "A Shape with color of " + this.color + " and " + ((isFilled()) ? "Filled" : "not filled");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.printf(shape.toString());
    }
}
