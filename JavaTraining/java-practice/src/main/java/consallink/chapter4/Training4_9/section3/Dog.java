package consallink.chapter4.Training4_9.section3;

/*
 * 指示に従ってクラスを完成させてください。
 * 
 * フィールド 【アクセス修飾子】private 【型】String 【変数名】name 【初期値】なし 【アクセス修飾子】private 【型】String 【変数名】type 【初期値】なし
 * 【アクセス修飾子】private 【型】String 【変数名】color 【初期値】なし
 * 
 * メソッド ※処理内容内の引数名や{{ 計算結果 }}は適切に処理に置き換えてください。
 * 
 * 【アクセス修飾子】public 【メソッド名】コンストラクタ 【引数】String name, String type, String color 【処理内容】
 * 引数の値を各フィールドに格納する。 typeには「プードル」「チワワ」「プレーリードッグ」「ブルドッグ」のみ格納し、それ以外の犬種が指定された場合は「雑種」とする。
 * colorには「白」「黒」「茶」のみ格納し、それ以外の色が指定された場合は「茶」とする。
 * 
 * 【アクセス修飾子】public 【メソッド名】info 【戻り値】void 【引数】なし 【処理内容】 各フィールドの値を下記の形式で表示する "犬の名前は" + name + "です。"
 * "犬種は" + type + "雑種です。" "色は" + color + "です。"
 */

public class Dog {
    private String name;
    private String type;
    private String color;

    Dog(String name, String type, String color) {
        this.name = name;
        if ("プードル".equals(type) || "チワワ".equals(type) || "プレーリードッグ".equals(type)
                || "ブルドッグ".equals(type)) {
            this.type = type;
        } else {
            this.type = "雑種";
        }

        if ("白".equals(color) || "黒".equals(color)) {
            this.color = color;
        } else {
            this.color = "茶";
        }
    }

    public void info() {
        System.out.println("犬の名前は" + name + "です。");
        System.out.println("犬種は" + type + "です。");
        System.out.println("色は" + color + "です。");
    }
}
