package ss6_inheritance;

public class PointTwoDimensional {
    private float x;
    private float y;

    public PointTwoDimensional() {
    }

    public PointTwoDimensional(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "PointTwoDimensional(" +
                "x=" + this.x +
                ",y=" + this.y +
                ')';
    }

//    public static void main(String[] args) {
//        PointTowDimensional pointTowDimensional = new PointTowDimensional(4,5);
//        System.out.println(pointTowDimensional);
//    }
}
