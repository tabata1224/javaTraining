package consallink.chapter4.Training4_10.section2;

/*
 * 指示に従ってクラスを完成させてください。
 * 
 * まずはsection1で作成したBattleCharacterクラスをコピーして、コンストラクタ名などを修正してから作業をしてください。 Equippableインターフェースを実装してください。
 * 以下のメンバを追加してください。
 * 
 * フィールド 【アクセス修飾子】private 【型】Weapon 【変数名】weapon 【初期値】なし
 * 
 * メソッド ※処理内容内の引数名や{{ 計算結果 }}は適切に処理に置き換えてください。
 * 
 * 【アクセス修飾子】public 【メソッド名】weaponEquip 【戻り値】void 【引数】Weapon w 【処理内容】 引数で取得したWeaponインスタンスをフィールドに格納します。
 * また、WeaponインスタンスのgetPower()メソッドを利用して、attackフィールドに攻撃力をプラスします。
 * 
 * 【アクセス修飾子】public 【メソッド名】weaponRemove 【戻り値】void 【引数】なし 【処理内容】
 * WeaponインスタンスのgetPower()メソッドを利用して、attackフィールドから攻撃力をマイナスする。
 * また、フィールドweaponのインスタンスはnullを代入することで、装備解除とします。
 */

public class BattleCharacter2 implements Equippable {
    private Weapon weapon;
    private String name;
    private int level;
    private int hp;
    private int mp;
    private int attack;
    private int m_attack;
    private int defense;
    private int m_defense;
    private String type;

    BattleCharacter2(String name, int level, int hp, int mp, int attack, int m_attack, int defense,
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

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setStatus(int num, int value) {
        switch (num) {
            case 0:
                this.level = value;
                break;
            case 1:
                this.hp = value;
                break;
            case 2:
                this.mp = value;
                break;
            case 3:
                this.attack = value;
                break;
            case 4:
                this.m_attack = value;
                break;
            case 5:
                this.defense = value;
                break;
            case 6:
                this.m_defense = value;
                break;
        }
    }

    public int getStatus(int num) {
        switch (num) {
            case 0:
                return this.level;
            case 1:
                return this.hp;
            case 2:
                return this.mp;
            case 3:
                return this.attack;
            case 4:
                return this.m_attack;
            case 5:
                return this.defense;
            default:
                return this.m_defense;
        }
    }

    public void weaponEquip(Weapon w) {
        this.weapon = w;
        this.attack += w.getPower();
    }

    public void weaponRemove() {
        this.attack -= this.weapon.getPower();
        this.weapon = null;
    }
}
