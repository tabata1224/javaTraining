package consallink.ecfTech._02_constructor.q003;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        //ここにプログラムを書きます。
        students[0] = new Student("タロウ", 80, 75, 90);
        students[1] = new Student("ハナコ", 90, 70, 80);
        students[2] = new Student("ジロウ");

        System.out.println("成績表");
        for (int i = 0; i < students.length; i++) {
            //ここにプログラムを書きます。
            students[i].show();
        }
    }
}
