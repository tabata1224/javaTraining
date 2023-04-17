package consallink.chapter4.Training4_10.section2;

/*
 * 指示に従ってインターフェースを完成させてください。
 * 
 * メソッド
 * 
 * 【メソッド名】weaponEquip 【戻り値】void 【引数】Weapon w 【概要】武器を装備する抽象メソッド
 * 
 * 【メソッド名】weaponRemove 【戻り値】void 【引数】なし 【概要】 武器を外す抽象メソッド
 */

public interface Equippable {
    abstract void weaponEquip(Weapon w);

    abstract void weaponRemove();
}
