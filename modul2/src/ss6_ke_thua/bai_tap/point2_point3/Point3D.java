package ss6_ke_thua.bai_tap.point2_point3;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        this.z = 0.0f;
    }

    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ(){
        float arr[] = {getX(),getY(),getZ()};
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                super.toString() +
                "z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D =new Point3D(1.1f,2f,4f);
        System.out.println(point3D);
    }
}
