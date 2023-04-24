package consallink.chapter4.Training4_10.section1;

public class Exam4_10_1 {

    public static void main(String[] args) {
        execute();
    }

    public static void execute() {

        /*
         * 他クラスを実装し、下記処理のコメントを外して実行してください。
         * 
         * 実行結果は以下のようにしてください。
         * 名前:ななし ひろ
         * 職業:勇者
         * レベル:3
         * HP:14
         * MP:10
         * 攻撃:14
         * 魔法威力:10
         * 防御:10
         * 魔法防御:9
         * 
         * 名前:せん つよし
         * 職業:戦士
         * レベル:2
         * HP:18
         * MP:0
         * 攻撃:15
         * 魔法威力:0
         * 防御:12
         * 魔法防御:6
         */

        Hero hero = new Hero();
        Warrior warrior01 = new Warrior();

        hero.levelUp();
        hero.levelUp();
        System.out.println("名前:" + hero.getName());
        System.out.println("職業:" + hero.getType());
        System.out.println("レベル:" + hero.getStatus(0));
        System.out.println("HP:" + hero.getStatus(1));
        System.out.println("MP:" + hero.getStatus(2));
        System.out.println("攻撃:" + hero.getStatus(3));
        System.out.println("魔法威力:" + hero.getStatus(4));
        System.out.println("防御:" + hero.getStatus(5));
        System.out.println("魔法防御:" + hero.getStatus(6));

        System.out.println();

        warrior01.levelUp();
        System.out.println("名前:" + warrior01.getName());
        System.out.println("職業:" + warrior01.getType());
        System.out.println("レベル:" + warrior01.getStatus(0));
        System.out.println("HP:" + warrior01.getStatus(1));
        System.out.println("MP:" + warrior01.getStatus(2));
        System.out.println("攻撃:" + warrior01.getStatus(3));
        System.out.println("魔法威力:" + warrior01.getStatus(4));
        System.out.println("防御:" + warrior01.getStatus(5));
        System.out.println("魔法防御:" + warrior01.getStatus(6));
    }
}
