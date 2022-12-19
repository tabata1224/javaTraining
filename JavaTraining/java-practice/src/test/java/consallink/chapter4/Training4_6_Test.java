package consallink.chapter4;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;
import consallink.chapter4.Training4_6.section1.Exam4_6_1;
import consallink.chapter4.Training4_6.section2.Exam4_6_2;
import consallink.chapter4.Training4_6.section3.Exam4_6_3;
import consallink.chapter4.Training4_6.section4.Exam4_6_4;

public class Training4_6_Test {
    private StandardOutputSnatcher sos;

    public Training4_6_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void training4_6_1() throws Exception {

        Exam4_6_1.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "飛ぶことを練習中です\n";

        assertEquals(actual, expected);
    }

    @Test
    public void training4_6_2() throws Exception {

        Exam4_6_2.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "そのアクションは現在設定できません\n現在アクションは設定されていません\n";

        assertEquals(actual, expected);
    }

    @Test
    public void training4_6_3() throws Exception {

        Exam4_6_3.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "現在配列には以下の数値が保存されています\n1\n現在配列には以下の数値が保存されています\n5 6 7 8 9 10\nsetNumbers(int a, int b)の引数はa < bとなるように設定してください\n";

        assertEquals(actual, expected);
    }

    @Test
    public void training4_6_4() throws Exception {

        Exam4_6_4.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "1 2 3 4 5 6 7 8 9 10\n配列の最後は15です\n";

        assertEquals(actual, expected);
    }
}
