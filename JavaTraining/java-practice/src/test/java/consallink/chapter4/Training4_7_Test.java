package consallink.chapter4;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;
import consallink.chapter4.Training4_7.section1.Exam4_7_1;
import consallink.chapter4.Training4_7.section2.Exam4_7_2;

public class Training4_7_Test {
    private StandardOutputSnatcher sos;

    public Training4_7_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void training4_7_1() throws Exception {

        Exam4_7_1.execute("システム");
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "1件ヒットしました\n1番目にありました\n";

        assertEquals(actual, expected);

        Exam4_7_1.execute("営業");
        sos.clearOutput();
        String actual2 = sos.getOutput();
        String expected2 = "2件ヒットしました\n0番目にありました\n";

        assertEquals(actual2, expected2);
    }

    @Test
    public void training4_7_2() throws Exception {

        Exam4_7_2.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "30%で1回抽選すると\n当たる確率は[30.000000000000004]%です\n30%で2回抽選すると\n当たる確率は[51.0]%です\n30%で3回抽選すると\n当たる確率は[65.7]%です\n30%で4回抽選すると\n当たる確率は[75.99000000000001]%です\n30%で5回抽選すると\n当たる確率は[83.19300000000001]%です\n30%で6回抽選すると\n当たる確率は[88.23510000000002]%です\n30%で7回抽選すると\n当たる確率は[91.76457]%です\n30%で8回抽選すると\n当たる確率は[94.23519900000001]%です\n30%で9回抽選すると\n当たる確率は[95.9646393]%です\n30%で10回抽選すると\n当たる確率は[97.17524751]%です\n";

        assertEquals(actual, expected);
    }
}
