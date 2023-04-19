package consallink.ecfTech._05_inheritance_1.q003;

public class Clock {
    String time;

    Clock(String time) {
        this.time = time;
    }

    public void showTime() {
        System.out.println(time + "です。");
    }
}
