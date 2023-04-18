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
        System.out.println("勇者：" + name);
        System.out.println("HP：" + hp);
        if (buki == null) {
            System.out.println("攻撃力:" + atk);
        } else {
            System.out.println("攻撃力:" + atk + "　+" + buki.atk);
        }
    }
}
