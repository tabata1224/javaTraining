package consallink.chapter4;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;
import consallink.chapter4.Training4_4.section1.Exam4_4_1;
import consallink.chapter4.Training4_4.section2.Exam4_4_2;
import consallink.chapter4.Training4_4.section3.Exam4_4_3;

public class Training4_4_Test {
    private StandardOutputSnatcher sos;

    public Training4_4_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void training4_4_1() throws Exception {

        Exam4_4_1.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "メソッドが実行されました\nnumberには100が保存されています\n";

        assertEquals(actual, expected);
    }

    @Test
    public void training4_4_2() throws Exception {

        Exam4_4_2.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "500\n501\n502\n503\n504\n";

        assertEquals(actual, expected);
    }

    @Test
    public void training4_4_3() throws Exception {

        Exam4_4_3.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "身長は1.71mです\n体重は65.5kgです\nBMI値は22.400054717690917です\n";

        assertEquals(actual, expected);
    }
}
