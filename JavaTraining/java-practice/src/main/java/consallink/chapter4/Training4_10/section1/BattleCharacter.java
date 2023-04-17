package consallink.chapter4.Training4_10.section1;


/*
 * 指示に従ってクラスを完成させてください。
 * 
 * フィールド 【アクセス修飾子】private 【型】String 【変数名】name 【初期値】なし 【アクセス修飾子】private 【型】int 【変数名】level 【初期値】なし
 * 【アクセス修飾子】private 【型】int 【変数名】hp 【初期値】なし 【アクセス修飾子】private 【型】int 【変数名】mp 【初期値】なし 【アクセス修飾子】private
 * 【型】int 【変数名】attack 【初期値】なし 【アクセス修飾子】private 【型】int 【変数名】m_attack 【初期値】なし 【アクセス修飾子】private 【型】int
 * 【変数名】defense 【初期値】なし 【アクセス修飾子】private 【型】int 【変数名】m_defense 【初期値】なし 【アクセス修飾子】private 【型】String
 * 【変数名】type 【初期値】なし
 * 
 * メソッド ※処理内容内の引数名や{{ 計算結果 }}は適切に処理に置き換えてください。
 * 
 * 【メソッド名】コンストラクタ 【引数】String name, int level, int hp, int mp, int attack, int m_attack, int defense,
 * int m_defense, String type 【処理内容】引数の値を各フィールドに格納する
 * 
 * 【メソッド名】setName 【戻り値】void 【引数】String name 【処理内容】引数の値をフィールドnameに設定する
 * 
 * 【メソッド名】getName 【戻り値】String 【引数】なし 【処理内容】フィールドnameの値を返す
 * 
 * 【メソッド名】setType 【戻り値】void 【引数】String type 【処理内容】引数の値をフィールドtypeに設定する
 * 
 * 【メソッド名】getType 【戻り値】String 【引数】なし 【処理内容】フィールドtypeの値を返す
 * 
 * 【メソッド名】setStatus 【戻り値】void 【引数】int num, int value 【処理内容】第一引数の値に応じて、第二引数の値を対応するフィールドに設定する。
 * 
 * 【メソッド名】getStatus 【戻り値】int 【引数】int num 【処理内容】 引数で指定された値に応じて、対応するフィールドの値を返す
 * 
 * setStatus()の第一引数およびgetStatus()の第一引数に指定される数値とフィールドは以下のように対応します。
 * 0=level、1=hp、2=mp、3=attack、4=m_attack、5=defense、6=m_defense
 */

public class BattleCharacter {
    private String name;
    private int level;
    private int hp;
    private int mp;
    private int attack;
    private int m_attack;
    private int defense;
    private int m_defense;
    private String type;

    BattleCharacter(String name, int level, int hp, int mp, int attack, int m_attack, int defense,
            int m_defense, String type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.mp = mp;
        this.attack = attack;
        this.m_attack = m_attack;
        this.defense = defense;
        this.m_defense = m_defense;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setStatus(int num, int value) {
        if (num == 0) {
            this.level = value;
        } else if (num == 1) {
            this.hp = value;
        } else if (num == 2) {
            this.mp = value;
        } else if (num == 3) {
            this.attack = value;
        } else if (num == 4) {
            this.m_attack = value;
        } else if (num == 5) {
            this.defense = value;
        } else {
            this.m_defense = value;
        }
    }

    public int getStatus(int num) {
        if (num == 0) {
            return this.level;
        } else if (num == 1) {
            return this.hp;
        } else if (num == 2) {
            return this.mp;
        } else if (num == 3) {
            return this.attack;
        } else if (num == 4) {
            return this.m_attack;
        } else if (num == 5) {
            return this.defense;
        } else {
            return this.m_defense;
        }
    }
}
