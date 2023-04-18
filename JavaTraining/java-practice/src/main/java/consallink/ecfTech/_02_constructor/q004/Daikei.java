package consallink.ecfTech._02_constructor.q004;

public class Daikei {
    int jyotei;
    int katei;
    int takasa;

    Daikei(int jyotei, int katei, int takasa) {
        this.jyotei = jyotei;
        this.katei = katei;
        this.takasa = takasa;
    }

    public int getMenseki() {
        return ((this.jyotei + this.katei) * this.takasa) / 2;
    }
}
