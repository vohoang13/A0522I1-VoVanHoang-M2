package ss6_ke_thua.bai_tap.circle_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "blue";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public double getArea(){
        return 3.14 * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "radius: " +
                radius +
                ", color: " +
                color;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.5,"yellow");
        System.out.println(circle);
    }
}
