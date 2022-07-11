package xaydunglopfan;

public class fan {
    private int slow = 1;
    private int MEDIUM = 2;
    private int FAST = 3;
    private int  speed;
    private boolean on;
    private int radius;
    private String color;

    public fan() {
        this.radius = 5;
        this.color = "blue";
        this.speed = slow;
        this.on = false;
    }

    public fan(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = false;
        this.radius = radius;
        this.color = color;
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

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
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
        return "fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
    public boolean ketqua() {
        if (on) {
            System.out.println(color + radius + " = Fan in off");
        } else {
            System.out.println(color + radius + " = Fan in on");
        } return ketqua();
    }
}
