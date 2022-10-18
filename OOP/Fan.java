package OOP;

public class Fan {
    int slow = 1;
    int medium = 2;
    int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan is on {"
                    + "Speed: " + this.getSpeed()
                    + ", Color: " + this.getColor()
                    + ", Radius: " + this.getRadius()
                    + "}";
        }else {
            return "Fan is off {"
                    + "Speed: " + this.getSpeed()
                    + ", Color: " + this.getColor()
                    + ", Radius: " + this.getRadius()
            + "}";
        }
    }

    public static void main(String[] args) {
        Fan fanFirst = new Fan();
        fanFirst.setSpeed(fanFirst.fast);
        fanFirst.setRadius(10);
        fanFirst.setColor("yellow");
        fanFirst.setOn(true);
        System.out.println("Information fanFirst: ");
        System.out.println(fanFirst.toString());

        Fan fanSecond = new Fan();
        fanSecond.setSpeed(fanSecond.medium);
        System.out.println("Information fanSecond: ");
        System.out.println(fanSecond.toString());
    }

}
