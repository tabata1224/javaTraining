package consallink.ecfTech._03_has_a_1.q002;

public class Yusha {
    String name;
    int hp;
    int atk;
    Buki buki;

    Yusha(String name, int hp, int atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    public void displayStatus() {
        System.out.println("勇者：" + this.name);
        System.out.println("HP：" + this.hp);
        if (this.buki == null) {
            System.out.println("攻撃力:" + this.atk);
        } else {
            System.out.println("攻撃力:" + this.atk + "　+" + this.buki.atk);
        }
    }
}
