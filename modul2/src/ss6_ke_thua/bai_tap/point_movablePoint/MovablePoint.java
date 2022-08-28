package ss6_ke_thua.bai_tap.point_movablePoint;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(){
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed =xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed =ySpeed;
    }
    public float[] getSpeed(){
        float arr[] = {xSpeed,ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                super.toString() +
                "speed=(" + xSpeed +
                "," + ySpeed +
                ")}";
    }

    public MovablePoint move() {
        this.x += xSpeed;
        this.y += ySpeed;
        return this;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint =new MovablePoint(1,3,2,7);
        System.out.println(movablePoint);
    }
}
