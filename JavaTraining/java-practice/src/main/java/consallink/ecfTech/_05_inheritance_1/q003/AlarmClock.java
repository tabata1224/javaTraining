package consallink.ecfTech._05_inheritance_1.q003;

public class AlarmClock extends Clock {
    String alarmTime;

    AlarmClock(String time) {
        super(time);
    }

    public void alarm() {
        if (time == alarmTime) {
            System.out.println("アラームが鳴りました!");
        }
    }

    public void setAlarm(String time) {
        this.alarmTime = time;
    }
}
