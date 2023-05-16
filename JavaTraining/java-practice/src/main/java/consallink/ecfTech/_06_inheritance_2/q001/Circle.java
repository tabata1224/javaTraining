package consallink.ecfTech._06_inheritance_2.q001;

public class Circle {
    public static final double PI = 3.14;
    private int hankei;

    public Circle(int hankei) {
        this.hankei = hankei;
    }

    public double getArea() {
        return this.hankei * this.hankei * PI;
    }
}
