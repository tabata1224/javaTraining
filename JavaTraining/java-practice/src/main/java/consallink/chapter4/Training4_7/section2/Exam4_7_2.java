package consallink.chapter4.Training4_7.section2;

public class Exam4_7_2 {

    public static void main(String[] args) {
        execute();
    }

    public static void execute() {

        /*
         * 以下のプログラミングを記述してください
         * 1.30%の確率を10回まで繰り返したときの確率を表示します
         * ※独立試行の確率
         * 
         * 実行結果は以下のようにしてください。
         * 30%で1回抽選すると
         * 当たる確率は[30.000000000000004]%です
         * 30%で2回抽選すると
         * 当たる確率は[51.0]%です
         * 30%で3回抽選すると
         * 当たる確率は[65.7]%です
         * 30%で4回抽選すると
         * 当たる確率は[75.99000000000001]%です
         * 30%で5回抽選すると
         * 当たる確率は[83.19300000000001]%です
         * 30%で6回抽選すると
         * 当たる確率は[88.23510000000002]%です
         * 30%で7回抽選すると
         * 当たる確率は[91.76457]%です
         * 30%で8回抽選すると
         * 当たる確率は[94.23519900000001]%です
         * 30%で9回抽選すると
         * 当たる確率は[95.9646393]%です
         * 30%で10回抽選すると
         * 当たる確率は[97.17524751]%です
         */
        int number = 30;
        Inspection4_7_2 inspection4_7_2 = new Inspection4_7_2();
        for (int i = 1; i <= 10; i++) {
            double result = inspection4_7_2.execute(number, i);
            System.out.println(number + "%で" + i + "回抽選すると");
            System.out.println("当たる確率は[" + result + "]%です");
        }

    }

}
