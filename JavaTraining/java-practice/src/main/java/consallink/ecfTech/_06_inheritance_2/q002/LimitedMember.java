package consallink.ecfTech._06_inheritance_2.q002;

public class LimitedMember extends Member {
    int startTime;
    int endTime;

    LimitedMember(String name, int startTime, int endTime) {
        super(name);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getMonthlyFee() {
        return (int) (super.getMonthlyFee() * 0.6);
    }

    public boolean isUsable(int hour) {
        if (startTime <= endTime) {
            if (startTime <= hour && hour <= endTime) {
                return true;
            }
            return false;
        } else {
            if ((startTime <= hour && hour <= 23) || (0 <= hour && hour <= endTime)) {
                return true;
            }
            return false;
        }
    }
}
