package consallink.ecfTech._07_abstraction_diversity.q001;

public class Buki extends Item {
    Buki(String name, int value) {
        super(name, value);
    }

    public void use() {
        System.out.println(this.name + "でこうげき!!");
        System.out.println("敵に" + this.value + "のダメージ!");
    }
}
