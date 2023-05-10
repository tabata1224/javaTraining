package consallink.ecfTech._06_inheritance_2.q003;

public class Cooler {
    public int nowTemp;
    public int goalTemp;

    Cooler(int nowTemp) {
        this.nowTemp = nowTemp;
    }

    public void setGoalTemp(int goalTemp) {
        this.goalTemp = goalTemp;
    }

    public void adjust() {
        if (this.goalTemp < this.nowTemp) {
            System.out.println("室温を1度下げました。");
            nowTemp--;
        } else {
            System.out.println("適温です。");
        }
    }
}
