package consallink.ecfTech._06_inheritance_2.q002;

public class LimitedMember extends Member {
    private int startTime;
    private int endTime;

    public LimitedMember(String name, int startTime, int endTime) {
        super(name);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getMonthlyFee() {
        return (int) (super.getMonthlyFee() * 0.6);
    }

    public boolean isUsable(int hour) {
        if (this.startTime <= this.endTime) {
            if (this.startTime <= hour && hour <= this.endTime) {
                return true;
            }
            return false;
        } else {
            if ((this.startTime <= hour && hour <= 23) || (0 <= hour && hour <= this.endTime)) {
                return true;
            }
            return false;
        }
    }
}
