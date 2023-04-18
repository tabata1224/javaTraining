package consallink.chapter4.Training4_4.section3;

public class Exam4_4_3 {

    public static void main(String[] args) {
        execute();
    }

    public static void execute() {

        double height = 1.71;
        double weight = 65.5;

        /*
         * 以下のプログラミングを記述してください
         * 1.Inspection4_4_3クラスからインスタンスを生成してください
         * 2.作成したインスタンスの各種メソッドを利用してBMI計算を行ってください
         * このクラス内のBMI計算では算術演算は利用しないこと
         * 3.計算した結果はdouble型のbmi変数に格納してください
         * 4.各変数の値を表示してください
         * 
         * 参考（BMI計算式）：体重kg / (身長[m] * 身長[m])
         * BMI計算式の例： 65.5 / (1.71 * 1.71)
         * 
         * 実行結果は以下のようにしてください。
         * 身長は1.71mです
         * 体重は65.5kgです
         * BMI値は22.400054717690917です
         */
        Inspection4_4_3 inspection4_4_3 = new Inspection4_4_3();
        System.out.println("身長は" + height + "mです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("BMI値は"
                + inspection4_4_3.division(weight, inspection4_4_3.multiplication(height, height))
                + "です");


    }

}
