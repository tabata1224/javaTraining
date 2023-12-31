package consallink.chapter3;

public class Training3_7 {

    public static void main(String[] args) {
        // 実行したい練習問題のコメントアウトを外そう
        practice1();
        practice2();
        practice3();
        practice4();
        practice5();
        practice6();
        practice7();
        practice8();
    }

    public static void practice1() {

        /*
         * 以下の変数を作成してください。表示や演算には作成した変数を利用すること。
         * 【型】int 【変数名】number01 【初期値】25
         * 【型】int 【変数名】number02 【初期値】2
         * 【型】String 【変数名】operator 【初期値】"/"
         * 
         * 実行結果は以下のようにしてください。
         * 25/2=12.5
         */
        int number01 = 25;
        int number02 = 2;
        String operator = "/";
        System.out.println(number01 + operator + number02 + "=" + (double) number01 / number02);
    }

    public static void practice2() {

        /*
         * 以下の変数を作成してください。表示や演算には作成した変数を利用すること。
         * 【型】int 【変数名】price 【初期値】980 【概要】金額を保存する
         * 【型】int 【変数名】tax_rate 【初期値】8 【概要】消費税率を保存する
         * 
         * 実行結果は以下のようにしてください。
         * 商品の金額は980円です
         * 消費税率は8%です
         * 税込み金額は1058円です
         */
        int price = 980; //金額を保存する
        int tax_rate = 8; //消費税率を保存する

        System.out.println("商品の金額は" + price + "円です");
        System.out.println("消費税率は" + tax_rate + "%です");
        System.out.println("税込み金額は" + (int) (price * (1 + (tax_rate / 100.0))) + "円です");
    }

    public static void practice3() {

        /*
         * 以下の変数を作成してください。表示や演算には作成した変数を利用すること。
         * 【型】int 【変数名】price 【初期値】9260 【概要】金額を保存する
         * 【型】int 【変数名】discount_rate 【初期値】33 【概要】割引率を保存する
         * 
         * 実行結果は以下のようにしてください。
         * 商品の金額は9260円です
         * 割引率は33%です
         * 割引される金額は3055.8円です
         */
        int price = 9260; //消費税率を保存する
        int discount_rate = 33; //割引率を保存する

        System.out.println("商品の金額は" + price + "円です");
        System.out.println("割引率は" + discount_rate + "%です");
        System.out.println("割引される金額は" + price * (discount_rate / 100.0) + "円です");
    }

    public static void practice4() {

        /*
         * 以下の変数を作成してください。表示や演算には作成した変数を利用すること。
         * 【型】int 【変数名】price 【初期値】9260 【概要】金額を保存する
         * 【型】int 【変数名】discount_rate 【初期値】33 【概要】割引率を保存する
         * 【型】char 【変数名】day_of_week 【初期値】'土' 【概要】曜日を保存する
         * 【型】int 【変数名】day_of_month 【初期値】1 【概要】日を保存する
         * 
         * 以下の条件でプログラムを分岐処理させてください。
         * 条件：曜日が'土'の場合
         * 処理： 割引率を1.2倍し、追加表示「土曜日は割引率アップ！」
         * 
         * 条件：曜日が'土'でかつ、5の付く日の場合（5日、15日、25日）
         * 処理：割引率を1.5倍し、追加表示「5の付く日で土曜日は割引率更にアップ！！」
         * 
         * 「day_of_month」の値を変更して各条件を正しく判定できているか確認してください。
         * 最終的には「day_of_month」の値を「5」に変更して実行し、以下の結果が出る状態で保存してください。
         * 今日は5日(土)
         * 商品の金額は9260円です
         * 5の付く日で土曜日は割引率更にアップ！！
         * 割引率は49%です
         * 割引される金額は4537.4円です
         */
        int price = 9260; //金額を保存する
        int discount_rate = 33; //割引率を保存する
        char day_of_week = '土'; //曜日を保存する
        int day_of_month = 5; //日を保存する
        double discount_rate2 = 0.0; //変更後の割引率

        System.out.println("今日は" + day_of_month + "日" + "(" + day_of_week + ")");
        System.out.println("商品の金額は" + price + "円です");

        if (day_of_week == '土' && (day_of_month == 5 || day_of_month == 15 || day_of_month == 25)) {
            System.out.println("5の付く日で土曜日は割引率更にアップ！！");
            discount_rate2 = Math.floor(1.5 * discount_rate);
            System.out.println("割引率は" + (int) discount_rate2 + "%です");
            System.out.println("割引される金額は" + price * (discount_rate2 / 100.0) + "円です");
        } else if (day_of_week == '土') {
            System.out.println("土曜日は割引率アップ！");
            discount_rate2 = Math.floor(1.2 * discount_rate);
            System.out.println("割引率は" + (int) discount_rate2 + "%です");
            System.out.println("割引される金額は" + price * (discount_rate2 / 100.0) + "円です");
        } else {
            System.out.println("割引率は" + discount_rate + "%です");
            System.out.println("割引される金額は" + price * (discount_rate / 100.0) + "円です");
        }
    }

    public static void practice5() {

        /*
         * 以下の変数を作成してください。表示や演算には作成した変数を利用すること。
         * 【型】String 【変数名】operator 【初期値】"*" 【概要】演算子指定用
         * 
         * 以下の条件でプログラムを分岐処理させてください。
         * 条件：変数「operator」が"/"の場合
         * 処理：割り算の計算式と結果を表示
         * 
         * 条件：変数「operator」が"*"の場合
         * 処理：掛け算の計算式と結果を表示
         * 
         * 条件：変数「operator」が"+"の場合
         * 処理：足し算の計算式と結果を表示
         * 
         * 条件：変数「operator」が"-"の場合
         * 処理：引き算の計算式と結果を表示
         * 
         * 計算には整数値の「25」と「2」を使用してください。
         * 「operator」の値を変更して各条件を正しく判定できているか確認してください。
         * 最終的には「operator」の値を「/」に変更して実行し、以下の結果が出る状態で保存してください。
         * 25/2=12.5
         */
        String operator = "/";
        if ("/".equals(operator)) {
            System.out.println("25/2=" + (25 / 2.0));
        } else if ("*".equals(operator)) {
            System.out.println("25*2=" + (25 * 2));
        } else if ("+".equals(operator)) {
            System.out.println("25+2=" + (25 + 2));
        } else {
            System.out.println("25-2=" + (25 - 2));
        }
    }

    public static void practice6() {

        /*
         * 以下の変数を作成してください。表示や演算には作成した変数を利用すること。
         * 【型】int 【変数名】money 【初期値】8000 【概要】手持ちの金額を保存する
         * 【型】int 【変数名】meal_price 【初期値】2300 【概要】食事に使用した金額
         * 
         * 上記の手持ち金額から食事に使った金額を引いてください。
         * さらに、元々の手持ち金額と残金を比べ、以下のような条件でプログラムを分岐処理させてください。
         * 条件：残金が60%以上の場合
         * 処理：残金の表示に追加して「残金には余裕があります」と表示
         * 
         * 条件：残金が59-30%の場合
         * 処理：残金の表示に追加して「残金が少なくなっています」と表示
         * 
         * 条件：残金が29%以下の場合
         * 処理：残金の表示に追加して「残金があと少しです」と表示
         * 
         * 「meal_price」の値を変更して各条件を正しく判定できているか確認してください。
         * 最終的には「meal_price」の値を「7000」に変更して実行し、以下の結果が出る状態で保存してください。
         * 残金は1000円です
         * 残金があと少しです
         */
        int money = 7000; //手持ちの金額を保存する
        int meal_price = 6000; //食事に使用した金額
        int balance = money - meal_price; //残金

        if (0.6 * money <= balance) {
            System.out.println("残金は" + balance + "円です");
            System.out.println("残金には余裕があります");
        } else if (0.3 * money <= balance) {
            System.out.println("残金は" + balance + "円です");
            System.out.println("残金が少なくなっています");
        } else {
            System.out.println("残金は" + balance + "円です");
            System.out.println("残金があと少しです");
        }
    }

    public static void practice7() {

        /*
         * 以下の配列および変数を作成してください。配列はnewでも初期化子でもかまいません。
         * 【型】int[] 【変数名】numbers 【初期値】10,18,33,92,47 【概要】乗算に利用する数値
         * 【型】int 【変数名】result 【初期値】1 【概要】乗算結果を保存する
         * 
         * 上記配列内の数値を全て乗算して結果を表示するプログラムを作成してください。
         * 実行結果は以下のようにしてください。
         * 計算結果は25684560です
         */
        int[] numbers = {10, 18, 33, 92, 47}; //乗算に利用する数値
        int result = 1; //乗算結果を保存する

        for (int i = 0; i < numbers.length; i++) {
            result = result * numbers[i];
        }
        System.out.println("計算結果は" + result + "です");
    }

    public static void practice8() {

        /*
         * 以下の変数を追加してください。
         * 【型】int[] 【変数名】numbers 【初期値】10,18,33,92,47
         * 【型】int 【変数名】power 【初期値】3 【概要】累乗する回数
         * 
         * 「numbers」の各数値を「power」の回数分だけ累乗して、その結果を表示してください。
         * 実行結果は以下のようにしてください。
         * 1000 5832 35937 778688 103823 
         */
        int[] numbers = {10, 18, 33, 92, 47};
        int power = 3; //累乗する回数
        int result;

        for (int i = 0; i < numbers.length; i++) {
            result = numbers[i];
            for (int j = 0; j < power - 1; j++) {
                result = result * numbers[i];
            }
            System.out.print(result + " ");
        }
        System.out.println();
    }
}
