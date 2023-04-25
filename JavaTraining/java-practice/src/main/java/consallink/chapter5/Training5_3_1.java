package consallink.chapter5;

import java.util.ArrayList;
import java.util.Collections;

public class Training5_3_1 {
    public static void main(String[] args) {
        // 実行したい練習問題のコメントアウトを外そう
        practice1();
        practice2();
    }

    public static void practice1() {
        /*
        * 以下のListを作成してください。
        * 
        * データ：5,30,4,15,9,20,1,8,11
        * 
        * 上記のリストを小さい順（昇順）に並び変えて表示するプログラムを作成してください。
        * 並び替えはCollectionsクラスのメソッドのようなAPIを使用すること。
        * 
        * 実行結果は以下のようにしてください。
        * 1 4 5 8 9 11 15 20 30
        */

        int[] array = {5, 30, 4, 15, 9, 20, 1, 8, 11};

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.println(list.get(i));
            } else {
                System.out.print(list.get(i) + " ");
            }
        }
    }

    public static void practice2() {
        /*
        * 以下のように実行すると線形合同法を用いて疑似乱数を表示するプログラムを作成してください。
        * 
        * 線形合同法の漸化式をプログラムの式に落とし込み、繰り返し処理で乱数を表示します。
        * 実行結果は、漸化式に当てはめる数値を以下のようにしています。
        * A = 25、B = 5、X = 9、M = 16
        * 
        * プログラムにはMathクラスのAPIを使用すること。
        * 
        * 実行結果は以下のようにしてください。
        * 6 11 8 13 10 15 12 1 14 3 0 5 2 7 4 9 6 11 8 13
        */
        double A = 25;
        double B = 5;
        double x = 9;
        double M = 16;
        for (int i = 0; i < 20; i++) {
            x = (A * x + B) % M;
            if (i == 19) {
                System.out.print((int) x);
            } else {
                System.out.print((int) x + " ");
            }
        }
        System.out.println();
    }
}
