package ss6_inheritance;

public class PointThreeDimensional extends PointTwoDimensional {
    private float z;

    public PointThreeDimensional() {
    }

    public PointThreeDimensional(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "PointThreeDimensional(" +
                "x=" + super.getX() +
                ",y=" + super.getY() +
                ",z=" + this.z +
                ')';
    }

}
