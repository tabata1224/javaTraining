package consallink.chapter4.Training4_10.section1;


/*
 * 指示に従ってクラスを完成させてください。
 * 
 * BattleCharacterクラスを継承する
 * 
 * メソッド
 * ※処理内容内の引数名や{{ 計算結果 }}は適切に処理に置き換えてください。
 * 
 * 【メソッド名】コンストラクタ
 * 【引数】String name, int level, int hp, int mp, int attack, int m_attack, int defense, int m_defense
 * 【処理内容】引数で取得した値をスーパークラスのコンストラクタに引き渡す。typeは"勇者"を指定。
 * 
 * 【メソッド名】コンストラクタ
 * 【引数】なし
 * 【処理内容】
 * 値をスーパークラスのコンストラクタに引き渡す。値は以下を参考にすること。
 * name="ななし ひろ", level=1, hp=10, mp=8, attack=10, m_attack=8, defense=8, m_defense=7, type="勇者"
 * 
 * 【メソッド名】levelUp
 * 【戻り値】void
 * 【引数】なし
 * 【処理内容】
 * スーパークラスのフィールドの値を以下のように増加させるメソッド。
 * levelは+1、hpは+2、mpは+1、attackは+2、m_attackは+1、defenseは+1、m_defenseは+1
 */

public class Hero extends BattleCharacter {

    Hero(String name, int level, int hp, int mp, int attack, int m_attack, int defense,
            int m_defense) {
        super(name, level, hp, mp, attack, m_attack, defense, m_defense, "勇者");
    }

    Hero() {
        super("ななし ひろ", 1, 10, 8, 10, 8, 8, 7,"勇者");

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
