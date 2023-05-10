package consallink.ecfTech._05_inheritance_1.q002;

public class Fighter {
    String name;
    int atk;

    Fighter() {
        this.name = "戦士";
        this.atk = 10;
    }

    public void attack() {
        System.out.println(this.name + "の攻撃!");
        System.out.println("敵に" + this.atk + "のダメージ!");
    }
}
