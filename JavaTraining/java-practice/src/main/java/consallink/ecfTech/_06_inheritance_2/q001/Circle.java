package consallink.ecfTech._06_inheritance_2.q001;

public class Circle {
    static public final double PI = 3.14;
    int hankei;

    Circle(int hankei) {
        this.hankei = hankei;
    }

    public double getArea() {
        return hankei * hankei * PI;
    }
}
