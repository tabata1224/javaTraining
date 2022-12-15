package consallink.chapter3;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;

public class Training3_7_Test {
    private StandardOutputSnatcher sos;

    public Training3_7_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void practice1() throws Exception {

        Training3_7.practice1();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "25/2=12.5\n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice2() throws Exception {

        Training3_7.practice2();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "商品の金額は980円です\n消費税率は8%です\n税込み金額は1058円です\n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice3() throws Exception {

        Training3_7.practice3();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "商品の金額は9260円です\n割引率は33%です\n引される金額は3055.8円です\n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice4() throws Exception {

        Training3_7.practice4();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "今日は5日(土)\n商品の金額は9260円です\n5の付く日で土曜日は割引率更にアップ！！\n割引率は49%です\n割引される金額は4537.400000000001円です\n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice5() throws Exception {

        Training3_7.practice5();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "25/2=12.5\n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice6() throws Exception {

        Training3_7.practice6();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "残金は1000円です\n残金があと少しです\n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice7() throws Exception {

        Training3_7.practice7();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "計算結果は25684560です\n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice8() throws Exception {

        Training3_7.practice8();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "1000 5832 35937 778688 103823\n";

        assertEquals(actual, expected);
    }
}
