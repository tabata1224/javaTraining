package consallink.chapter5;

import java.util.LinkedHashMap;
import java.util.Map;

public class Training5_1_1 {
    public static void main(String[] args) {
        // 実行したい練習問題のコメントアウトを外そう
        practice1();
        practice2("赤");
    }

    public static void practice1() {
        /*
         * 以下のMapを作成してください。
         * 
         * キー, 値
         * "日", "Sun."
         * "月", "Mon."
         * "火", "Tue."
         * "水", "Wed."
         * "木", "Thu."
         * "金", "Fri."
         * "土", "Sat."
         * 
         * 「○曜日は英語では○です」という表示を全曜日分表示されるようにしてください。
         * ただし、作成したMap、文字列連結はStringBuilder、ループ文を利用して表示してください。
         * 
         * 実行結果は以下のようにしてください。
         * 日曜日は英語ではSun.です
         * 月曜日は英語ではMon.です
         * 火曜日は英語ではTue.です
         * 水曜日は英語ではWed.です
         * 木曜日は英語ではThu.です
         * 金曜日は英語ではFri.です
         * 土曜日は英語ではSat.です
         */

        Map<String, String> map = new LinkedHashMap<>();
        map.put("日", "Sun.");
        map.put("月", "Mon.");
        map.put("火", "Tue.");
        map.put("水", "Wed.");
        map.put("木", "Thu.");
        map.put("金", "Fri.");
        map.put("土", "Sat.");

        StringBuilder val = new StringBuilder();

        for (String key : map.keySet()) {
            val.append(key);
            val.append("曜日は英語では");
            val.append(map.get(key));
            val.append("です\n");
        }
        System.out.print(val);
    }

    public static String practice2(String specified_color) {
        /*
        * 以下のMapを作成してください。
        * 
        * キー, 値
        * "赤", "Red"
        * "青", "Blue"
        * "黄", "Yellow"
        * "緑", "Green"
        * "白", "White"
        * "黒", "Black"
        * "灰", "Gray"
        * "紫", "Purple"
        * 
        * 引数で指定された色の英語を戻り値として渡すプログラムを作成してください。
        */

        Map<String, String> map = new LinkedHashMap<>();
        map.put("赤", "Red");
        map.put("青", "Blue");
        map.put("黄", "Yellow");
        map.put("緑", "Green");
        map.put("白", "White");
        map.put("黒", "Black");
        map.put("灰", "Gray");
        map.put("紫", "Purple");

        return map.get(specified_color) + "\n";
    }
}
