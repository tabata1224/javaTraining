package consallink.chapter3;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;

public class Training3_6_Test {
    private StandardOutputSnatcher sos;

    public Training3_6_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void practice1() throws Exception {

        Training3_6.practice1();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "日曜日は英語ではSun.です\n月曜日は英語ではMon.です\n火曜日は英語ではTue.です\n水曜日は英語ではWed.です\n木曜日は英語ではThu.です\n金曜日は英語ではFri.です\n土曜日は英語ではSat.です\n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice2() throws Exception {

        Training3_6.practice2();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "配列内の最も小さい数値は「3」です\n配列内の最も大きい数値は「68」です\n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice3() throws Exception {

        Training3_6.practice3();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "配列内の偶数は以下の数値です\n32\n82\n34\n16\n配列内の奇数は以下の数値です\n79\n35\n25\n77\n61\n39\n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice4() throws Exception {

        Training3_6.practice4();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "日曜日は英語ではSun.です\n月曜日は英語ではMon.です\n火曜日は英語ではTue.です\n水曜日は英語ではWed.です\n木曜日は英語ではThu.です\n金曜日は英語ではFri.です\n土曜日は英語ではSat.です\n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice5() throws Exception {

        Training3_6.practice5();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "Purple\n";

        assertEquals(actual, expected);
    }

}
