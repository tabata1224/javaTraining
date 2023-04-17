package consallink.chapter4.Training4_10.section2;

/*
 * 指示に従ってクラスを完成させてください。
 * 
 * フィールド 【アクセス修飾子】private 【型】String 【変数名】name 【初期値】なし 【アクセス修飾子】private 【型】int 【変数名】power 【初期値】なし
 * 
 * メソッド ※処理内容内の引数名や{{ 計算結果 }}は適切に処理に置き換えてください。
 * 
 * 【メソッド名】コンストラクタ 【引数】String name, int power 【処理内容】引数の値を各フィールドに設定する
 * 
 * 【メソッド名】getPower 【戻り値】int 【引数】なし 【処理内容】フィールドpowerの値を戻り値で返す
 */

public class Weapon {
    private String name;
    private int power;

    Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

    public String getWeapon() {
        return this.name;
    }
}
