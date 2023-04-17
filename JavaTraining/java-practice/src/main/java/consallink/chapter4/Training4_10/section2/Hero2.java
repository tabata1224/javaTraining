package consallink.chapter4.Training4_10.section2;

/*
 * 指示に従ってクラスを完成させてください。 section1で作成したHeroクラスをコピーして、コンストラクタ名などを修正してください。
 */

public class Hero2 extends BattleCharacter2 {

    Hero2(String name, int level, int hp, int mp, int attack, int m_attack, int defense,
            int m_defense) {
        super(name, level, hp, mp, attack, m_attack, defense, m_defense, "勇者");
    }

    Hero2() {
        super("ななし ひろ", 1, 10, 8, 10, 8, 8, 7, "勇者");

    }

    public void levelUp() {
        super.setStatus(0, getStatus(0) + 1);
        super.setStatus(1, getStatus(1) + 2);
        super.setStatus(2, getStatus(2) + 1);
        super.setStatus(3, getStatus(3) + 2);
        super.setStatus(4, getStatus(4) + 1);
        super.setStatus(5, getStatus(5) + 1);
        super.setStatus(6, getStatus(6) + 1);

    }
}
