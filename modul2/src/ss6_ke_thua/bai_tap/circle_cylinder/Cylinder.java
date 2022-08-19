package ss6_ke_thua.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double hight;

    public Cylinder() {
        this.hight = 2.0;
    }

    public Cylinder(double hight, double radius, String color) {
        super(radius, color);
        this.hight = hight;
    }

    public void setHight(double hight){
        this.hight = hight;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public double getVolume(){
        return this.hight * getRadius() * getRadius() *3.14;
    }

    @Override
    public String toString() {
        return "hight: " +
                hight +
                ", " +
                super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(10, 20,"yellow");
        System.out.println(cylinder);
    }
}
