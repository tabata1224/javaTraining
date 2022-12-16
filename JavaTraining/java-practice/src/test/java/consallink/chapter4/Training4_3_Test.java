package consallink.chapter4;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;
import consallink.chapter4.Training4_3.section1.Exam4_3_1;
import consallink.chapter4.Training4_3.section2.Exam4_3_2;
import consallink.chapter4.Training4_3.section3.Exam4_3_3;
import consallink.chapter4.Training4_3.section4.Exam4_3_4;

public class Training4_3_Test {
    private StandardOutputSnatcher sos;

    public Training4_3_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void training4_3_1() throws Exception {

        Exam4_3_1.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "method01()が実行されました\nmethod02()が実行されました\n";

        assertEquals(actual, expected);
    }

    @Test
    public void training4_3_2() throws Exception {

        Exam4_3_2.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "3を受け取りました\n1.584を受け取りました\nプログラムを受け取りました\n5と4.1を受け取りました\n5と4を掛け算すると20となります\n5.2と4.3を割り算すると1.2093023255813955となります\nnumberの値は「199」です\nnameの値は「言語」です\n";

        assertEquals(actual, expected);
    }

    @Test
    public void training4_3_3() throws Exception {

        Exam4_3_3.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "100\n20.5\n戻り値\n199\n言語\n3628800\n1\n";

        assertEquals(actual, expected);
    }

    @Test
    public void training4_3_4() throws Exception {

        Exam4_3_4.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "2.0846153846153843\nfalse\n39\n";

        assertEquals(actual, expected);
    }

}
