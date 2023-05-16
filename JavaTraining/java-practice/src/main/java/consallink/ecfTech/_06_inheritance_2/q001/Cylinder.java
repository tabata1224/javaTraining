package consallink.ecfTech._06_inheritance_2.q001;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(int hankei, int height) {
        super(hankei);
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }
}
