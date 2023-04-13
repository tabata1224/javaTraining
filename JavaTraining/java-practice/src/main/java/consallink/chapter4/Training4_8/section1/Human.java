package consallink.chapter4.Training4_8.section1;

public class Human implements ICharacter {
    private String name;
    private String type;
    private String job;
    private int speed;

    /*
     * 各種フィールドを初期化するコンストラクタ
     * name: "ななし"
     * type: "人間"
     * job: "なし"
     * speed: 16
     */
    Human() {
        this.name = "ななし";
        this.type = "人間";
        this.job = "なし";
        this.speed = 16;
    }

    /*
     * ICharacterからの実装を行います
     * コメントの指示にしたがってメソッドをオーバーライドして記述してください
     */

    /*
     * 【メソッド名】setName
     * 【処理内容】引数で渡された値をnameフィールドに格納する
     */

    /*
     * 【メソッド名】getName
     * 【処理内容】nameフィールドをreturnする
     */

    /*
     * 【メソッド名】getType
     * 【処理内容】typeフィールドをreturnする
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void speedCorrection(int value) {
        if (value >= -5 && value <= 10) {
            speed = (int) (speed * (1 + (0.1 * value)));
        }
    }

    @Override
    public void printStatus() {
        System.out.println("タイプ：" + type);
        System.out.println("名前：" + name + "さん");
        System.out.println("職業：" + job);
        System.out.println("速度：" + speed + "km/h");
    }

    public void setJob(String job) {
        this.job = job;
    }
}
