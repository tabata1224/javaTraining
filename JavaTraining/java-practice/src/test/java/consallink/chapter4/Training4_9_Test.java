package consallink.chapter4;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;
import consallink.chapter4.Training4_9.section1.Exam4_9_1;
import consallink.chapter4.Training4_9.section2.Exam4_9_2;
import consallink.chapter4.Training4_9.section3.Exam4_9_3;
import consallink.chapter4.Training4_9.section4.Exam4_9_4;

public class Training4_9_Test {
    private StandardOutputSnatcher sos;

    public Training4_9_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void training4_9_1() throws Exception {

        Exam4_9_1.execute("太郎", "プードル", "白");
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "犬の名前は太郎です。\n犬種はプードルです。\n色は白です。\n";

        assertEquals(actual, expected);

        Exam4_9_1.execute("太郎", "ゴールデンレトリバー", "赤");
        sos.clearOutput();
        String actual2 = sos.getOutput();
        String expected2 = "犬の名前は太郎です。\n犬種は雑種です。\n色は茶です。\n";

        assertEquals(actual2, expected2);
    }

    @Test
    public void training4_9_2() throws Exception {

        Exam4_9_2.execute("ita", false);
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "itaのありがとう\nGrazie\n";

        assertEquals(actual, expected);

        Exam4_9_2.execute("fra", true);
        sos.clearOutput();
        String actual2 = sos.getOutput();
        String expected2 = "fraのありがとう\nメルシー\n";

        assertEquals(actual2, expected2);

        Exam4_9_2.execute("hoge", false);
        sos.clearOutput();
        String actual3 = sos.getOutput();
        String expected3 = "hogeのありがとう\n該当なし\n";

        assertEquals(actual3, expected3);
    }

    @Test
    public void training4_9_3() throws Exception {

        Exam4_9_3.execute("太郎", "プードル", "白");
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "犬の名前は太郎です。\n犬種はプードルです。\n色は白です。\n";

        assertEquals(actual, expected);

        Exam4_9_3.execute("太郎", "ゴールデンレトリバー", "赤");
        sos.clearOutput();
        String actual2 = sos.getOutput();
        String expected2 = "犬の名前は太郎です。\n犬種は雑種です。\n色は茶です。\n";

        assertEquals(actual2, expected2);
    }

    @Test
    public void training4_9_4() throws Exception {

        Exam4_9_4.execute("太郎", "プードル", "白");
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "犬の名前は太郎です。\n犬種はプードルです。\n色は白です。\n犬の名前は太郎です。\n犬種はプードルです。\n色は茶です。\n犬の名前は太郎です。\n犬種は雑種です。\n色は茶です。\n";

        assertEquals(actual, expected);

        Exam4_9_4.execute("太郎", "ゴールデンレトリバー", "赤");
        sos.clearOutput();
        String actual2 = sos.getOutput();
        String expected2 = "犬の名前は太郎です。\n犬種は雑種です。\n色は茶です。\n犬の名前は太郎です。\n犬種は雑種です。\n色は茶です。\n犬の名前は太郎です。\n犬種は雑種です。\n色は茶です。\n";

        assertEquals(actual2, expected2);
    }
}
