package consallink.chapter5;

import java.util.ArrayList;

public class Training5_2_1 {
    public static void main(String[] args) {
        // 実行したい練習問題のコメントアウトを外そう
        practice1();
        practice2();
    }

    public static void practice1() {
        /*
         * 以下のListを作成してください。
         * 
         * データ：21,54,19,68,49,37,3,15,34,6
         * 
         * List内で最も小さい数値と最も大きい数値を検索し表示してください。
         * ただし、文字列連結はStringBuilderを利用して表示してください。
         * 
         * 実行結果は以下のようにしてください。
         * 配列内の最も小さい数値は「3」です
         * 配列内の最も大きい数値は「68」です
         */
        int[] array = {21, 54, 19, 68, 49, 37, 3, 15, 34, 6};

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        StringBuilder numStr = new StringBuilder();

        int max = list.get(0);
        int min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        numStr.append("配列内の最も小さい数値は「");
        numStr.append(min);
        numStr.append("」です\n");
        numStr.append("配列内の最も大きい数値は「");
        numStr.append(max);
        numStr.append("」です\n");
        System.out.print(numStr);
    }

    public static void practice2() {
        /*
         * 以下のListを作成してください。
         * 
         * データ：32,79,35,25,82,77,34,16,61,39
         * 
         * List内で偶数を検索し表示してください。
         * 
         * 実行結果は以下のようにしてください。
         * 配列内の偶数は以下の数値です
         * 32
         * 82
         * 34
         * 16
         * 配列内の奇数は以下の数値です
         * 79
         * 35
         * 25
         * 77
         * 61
         * 39
         */
        int[] array = {32, 79, 35, 25, 82, 77, 34, 16, 61, 39};

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        System.out.println("配列内の偶数は以下の数値です");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.println(list.get(i));
            }
        }
        System.out.println("配列内の奇数は以下の数値です");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                System.out.println(list.get(i));
            }
        }
    }
}
