package consallink.chapter4.Training4_3.section3;

/*
 * 指示に従ってクラスを完成させてください。
 * 
 * フィールド 【型】int 【変数名】number 【初期値】なし 【型】String 【変数名】name 【初期値】なし
 * 
 * メソッド ※処理内容内の引数名や{{ 計算結果 }}は適切に処理に置き換えてください。
 * 
 * 【メソッド名】re01 【戻り値】int 【引数】なし 【処理内容】100をreturnする
 * 
 * 【メソッド名】re02 【戻り値】double 【引数】なし 【処理内容】20.5をreturnする
 * 
 * 【メソッド名】re03 【戻り値】String 【引数】なし 【処理内容】"戻り値"をreturnする
 * 
 * 【メソッド名】re04 【戻り値】int 【引数】なし 【処理内容】フィールドnumberの値をreturnする
 * 
 * 【メソッド名】re05 【戻り値】String 【引数】なし 【処理内容】フィールドnameの値をreturnする
 * 
 * 【メソッド名】re06 【戻り値】int 【引数】なし 【処理内容】1から10まで乗算した結果をreturnする
 * 
 * 【メソッド名】re07 【戻り値】int[] 【引数】なし 【処理内容】配列{8,3,7,1,4,11}をreturnする
 */

public class Inspection4_3_3 {
    // フィールド
    int number;
    String name;

    // メソッド
    public int re01() {
        return 100;
    }

    public double re02() {
        return 20.5;
    }

    public String re03() {
        return "戻り値";
    }

    public int re04() {
        number = 199;
        return number;
    }

    public String re05() {
        name = "言語";
        return name;
    }

    public int re06() {
        int result = 1;
        for (int i = 2; i <= 10; i++) {
            result = result * i;
        }
        return result;
    }

    public int[] re07() {
        int x[] = {8, 3, 7, 1, 4, 11};
        return x;
    }

}
