package ss6_ke_thua.bai_tap.point_movablePoint;

public class Point {
    float x;
    float y;

    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] arr={this.x,this.y};
        return  arr;
    }

    @Override
    public String toString() {
        return "(" + x +
                "," + y +
                "), ";
    }
}
