package consallink.chapter5;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;

public class Training5_1_Test {
    private StandardOutputSnatcher sos;

    public Training5_1_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void training5_1_1() throws Exception {

        Training5_1_1.practice1();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected =
                "日曜日は英語ではSun.です\n月曜日は英語ではMon.です\n火曜日は英語ではTue.です\n水曜日は英語ではWed.です\n木曜日は英語ではThu.です\n金曜日は英語ではFri.です\n土曜日は英語ではSat.です\n";

        assertEquals(actual, expected);
    }

    @Test
    public void training5_1_2() throws Exception {

        String actual = Training5_1_1.practice2("赤");
        String expected = "Red\n";
        assertEquals(actual, expected);

        String actual2 = Training5_1_1.practice2("黒");
        String expected2 = "Black\n";
        assertEquals(actual2, expected2);
    }
}
