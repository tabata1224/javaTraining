package consallink.ecfTech._01_class.q005;

public class Circle {
    final double PI = 3.14;
    int hankei;

    public void setHankei(int hankei) {
        this.hankei = hankei;
    }

    public double getEnsyu() {
        return 2 * this.hankei * this.PI;
    }

    public double getMenseki() {
        return this.hankei * this.hankei * this.PI;
    }
}
