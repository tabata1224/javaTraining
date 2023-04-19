package consallink.ecfTech._04_has_a_2.q001;

public class Yusha {
    String name;
    int atk;

    Yusha(String name, int atk) {
        this.name = name;
        this.atk = atk;
    }

    public void attack(Monster target) {
        target.hp = target.hp - this.atk;
        System.out.println(target.name + "に" + this.atk + "のダメージ!");
    }
}
