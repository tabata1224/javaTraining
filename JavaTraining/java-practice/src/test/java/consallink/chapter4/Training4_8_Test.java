package consallink.chapter4;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;
import consallink.chapter4.Training4_8.section1.Exam4_8_1;

public class Training4_8_Test {
    private StandardOutputSnatcher sos;

    public Training4_8_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void training4_8_1() throws Exception {

        Exam4_8_1.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "タイプ：人間\n名前：ななしさん\n職業：なし\n速度：16km/h\nタイプ：人間\n名前：鈴木さん\n職業：陸上選手\n速度：28km/h\n";

        assertEquals(actual, expected);
    }
}
