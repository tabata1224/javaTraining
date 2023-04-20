package consallink.ecfTech._06_inheritance_2.q001;

public class Cylinder extends Circle {
    int height;

    Cylinder(int hankei, int height) {
        super(hankei);
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}
