package consallink.ecfTech._04_has_a_2.q003;

public class Reaction {
    String face;
    int count;

    Reaction(String face, int count) {
        this.face = face;
        this.count = count;
    }

    public void display() {
        System.out.print(this.face + ":" + this.count);
    }
}
