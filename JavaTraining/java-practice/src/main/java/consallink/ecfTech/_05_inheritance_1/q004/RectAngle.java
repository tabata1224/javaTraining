package consallink.ecfTech._05_inheritance_1.q004;

public class RectAngle {
    int haba;
    int takasa;

    RectAngle(int haba, int takasa) {
        this.haba = haba;
        this.takasa = takasa;
    }

    public int getMenseki() {
        return this.haba * this.takasa;
    }
}
