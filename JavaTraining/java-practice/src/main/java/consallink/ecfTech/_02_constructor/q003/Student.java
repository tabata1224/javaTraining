package consallink.ecfTech._02_constructor.q003;

public class Student {
    String name;
    int koku;
    int su;
    int ei;

    Student(String name, int koku, int su, int ei) {
        this.name = name;
        this.koku = koku;
        this.su = su;
        this.ei = ei;
    }

    Student(String name) {
        this(name, 0, 0, 0);
    }

    public void show() {
        System.out.println(name + ":" + koku + "," + su + "," + ei);
    }
}
