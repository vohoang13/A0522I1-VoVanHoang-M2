package ss4_oop.Bai_tap;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public Fan(int speed, double radius, String color, boolean on) {
        this.color = color;
        this.speed = speed;
        this.radius = radius;
        this.on = on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        String run = "";
        if (isOn()) {
            run += "{ speed: " + getSpeed() + ", color: " + getColor() + ", radius: " + getRadius() + ", fan is on }";
        } else {
            run += "{ speed: " + getSpeed() + ", color: " + getColor() + ", radius: " + getRadius() + ", fan is off }";
        }
        return run;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3, 10, "Yellow", true);
        System.out.println("Quạt 1: " + fan1);
        Fan fan2 = new Fan(1, 5, "Blue", false);
        System.out.printf("Quạt 2: " + fan2);
    }
}
