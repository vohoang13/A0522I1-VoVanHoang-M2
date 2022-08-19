package ss6_ke_thua.bai_tap.point2_point3;

import java.lang.reflect.Array;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setX() {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x =x;
        this.y = y;
    }

    public float[] getXY(){
        float arr[] = {this.x,this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y +
                ',';
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
    }
}
