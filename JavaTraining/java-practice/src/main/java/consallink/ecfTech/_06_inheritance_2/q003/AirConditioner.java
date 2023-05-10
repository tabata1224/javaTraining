package consallink.ecfTech._06_inheritance_2.q003;

public class AirConditioner extends Cooler {
    AirConditioner(int nowTemp) {
        super(nowTemp);
    }

    public void adjust() {
        if (this.goalTemp < this.nowTemp) {
            System.out.println("室温を1度下げました。");
            nowTemp--;
        } else if (this.nowTemp < this.goalTemp) {
            System.out.println("室温を1度上げました。");
            this.nowTemp++;
        } else {
            System.out.println("適温です。");
        }
    }
}
