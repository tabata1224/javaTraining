package consallink.chapter4.Training4_9.section2;

/*
 * 指示に従ってクラスを完成させてください。
 * 
 * フィールド 【アクセス修飾子】private 【型】String[] 【変数名】countries 【初期値】{"usa","spa","fra","ger","ita","por"}
 * 【アクセス修飾子】private 【型】String[] 【変数名】thanks_data
 * 【初期値】{"Thank you","Gracias","Merci","Danke schon","Grazie","Obrigado"} 【アクセス修飾子】private
 * 【型】String[] 【変数名】kana_data 【初期値】{"サンキュー","グラシアス","メルシー","ダンケ・シェーン","グラッツィエ","オブリガード"}
 * 【アクセス修飾子】private 【型】int 【変数名】cursor 【初期値】なし 【概要】現在選択されている国のインデックスを格納
 * 
 * メソッド ※処理内容内の引数名や{{ 計算結果 }}は適切に処理に置き換えてください。
 * 
 * 【アクセス修飾子】public 【メソッド名】convert 【戻り値】String 【引数】String country 【処理内容】
 * 引数で取得した国名を元に、対応するthanks_data配列のデータを戻り値で返す。 該当するデータがない場合は「"該当なし"」を返す。
 * 
 * 【アクセス修飾子】public 【メソッド名】convert 【戻り値】String 【引数】String country, boolean isKana 【処理内容】
 * 第一引数で取得した国名を元に、対応する配列のデータを戻り値で返す。
 * ただし、第二引数の値がtrueの場合は、kana_data配列のデータを、falseの場合はthanks_data配列のデータを返す。 該当するデータがない場合は「"該当なし"」を返す。
 */

public class ThanksConverter {
    private String[] countries = {"usa", "spa", "fra", "ger", "ita", "por"};
    private String[] thanks_data =
            {"Thank you", "Gracias", "Merci", "Danke schon", "Grazie", "Obrigado"};
    private String[] kana_data = {"サンキュー", "グラシアス", "メルシー", "ダンケ・シェーン", "グラッツィエ", "オブリガード"};
    private int cursor;

    public String convert(String country) {
        return convert(country, false);
    }

    public String convert(String country, boolean isKana) {
        for (cursor = 0; cursor < countries.length; cursor++) {
            if (country.equals(countries[cursor])) {
                if (isKana) {
                    return kana_data[cursor];
                } else {
                    return thanks_data[cursor];
                }
            }
        }
        return "該当なし";
    }
}

