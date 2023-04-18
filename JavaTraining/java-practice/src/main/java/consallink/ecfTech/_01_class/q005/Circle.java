package consallink.ecfTech._01_class.q005;

public class Circle {
    double PI = 3.14;
    int hankei;

    public void setHankei(int hankei) {
        this.hankei = hankei;
    }

    public double getEnsyu() {
        return 2 * hankei * PI;
    }

    public double getMenseki() {
        return hankei * hankei * PI;
    }
}
