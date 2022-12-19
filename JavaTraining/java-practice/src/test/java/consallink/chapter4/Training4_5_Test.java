package consallink.chapter4;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;
import consallink.chapter4.Training4_5.section1.Exam4_5_1;
import consallink.chapter4.Training4_5.section2.Exam4_5_2;
import consallink.chapter4.Training4_5.section3.Exam4_5_3;
import consallink.chapter4.Training4_5.section4.Exam4_5_4;

public class Training4_5_Test {
    private StandardOutputSnatcher sos;

    public Training4_5_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void training4_5_1() throws Exception {

        Exam4_5_1.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "加藤は30番です\n";

        assertEquals(actual, expected);
    }

    @Test
    public void training4_5_2() throws Exception {

        Exam4_5_2.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "10を受け取りました\n0.9を受け取りました\n文字列を受け取りました\n";

        assertEquals(actual, expected);
    }

    @Test
    public void training4_5_3() throws Exception {

        Exam4_5_3.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "38257\n19.572\nprogram\n";

        assertEquals(actual, expected);
    }

    @Test
    public void training4_5_4() throws Exception {

        Exam4_5_4.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "現在のカウントは2です\n";

        assertEquals(actual, expected);
    }
}
