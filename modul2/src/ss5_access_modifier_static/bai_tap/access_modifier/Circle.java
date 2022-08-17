package ss5_access_modifier_static.bai_tap.access_modifier;

public class Circle {
    private double radius;
    private String color;
    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return this.radius*this.radius*3.14;
    }
}
