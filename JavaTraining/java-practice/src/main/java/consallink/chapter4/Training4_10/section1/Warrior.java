package consallink.chapter4.Training4_10.section1;

/*
 * 指示に従ってクラスを完成させてください。
 * 
 * BattleCharacterクラスを継承する
 * 
 * メソッド ※処理内容内の引数名や{{ 計算結果 }}は適切に処理に置き換えてください。
 * 
 * 【メソッド名】コンストラクタ 【引数】String name, int level, int hp, int mp, int attack, int m_attack, int defense,
 * int m_defense 【処理内容】引数で取得した値をスーパークラスのコンストラクタに引き渡す。typeは"戦士"を指定。
 * 
 * 【メソッド名】コンストラクタ 【引数】なし 【処理内容】 値をスーパークラスのコンストラクタに引き渡す。値は以下を参考にすること。 name="せん つよっし", level=1, hp=15,
 * mp=0, attack=12, m_attack=0, defense=10, m_defense=5, type="戦士"
 * 
 * 【メソッド名】levelUp 【戻り値】void 【引数】なし 【処理内容】 スーパークラスのフィールドの値を以下のように増加させるメソッド。
 * levelは+1、hpは+3、mpは+0、attackは+3、m_attackは+0、defenseは+2、m_defenseは+1
 */

public class Warrior extends BattleCharacter {
    Warrior(String name, int level, int hp, int mp, int attack, int m_attack, int defense,
            int m_defense) {
        super(name, level, hp, mp, attack, m_attack, defense, m_defense, "戦士");
    }

    Warrior() {
        this("せん つよし", 1, 15, 0, 12, 0, 10, 5);
    }

    public void levelUp() {
        super.setStatus(0, getStatus(0) + 1);
        super.setStatus(1, getStatus(1) + 3);
        super.setStatus(2, getStatus(2) + 0);
        super.setStatus(3, getStatus(3) + 3);
        super.setStatus(4, getStatus(4) + 0);
        super.setStatus(5, getStatus(5) + 2);
        super.setStatus(6, getStatus(6) + 1);
    }
}
