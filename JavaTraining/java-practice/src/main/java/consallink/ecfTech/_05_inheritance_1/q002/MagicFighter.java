package consallink.ecfTech._05_inheritance_1.q002;

public class MagicFighter extends Fighter {
    int mp;

    MagicFighter() {
        this.name = "魔法戦士";
        this.mp = 10;
    }

    public void attack() {
        System.out.println(this.name + "の魔法攻撃!");
        System.out.println("敵に" + (this.atk + this.mp) + "の魔法攻撃!");
    }
}
