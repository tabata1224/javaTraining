package consallink.chapter4;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;
import consallink.chapter4.Training4_10.section1.Exam4_10_1;
import consallink.chapter4.Training4_10.section2.Exam4_10_2;

public class Training4_10_Test {
    private StandardOutputSnatcher sos;

    public Training4_10_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void training4_10_1() throws Exception {

        Exam4_10_1.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "名前:ななし ひろ\n職業:勇者\nレベル:3\nHP:14\nMP:10\n攻撃:14\n魔法威力:10\n防御:10\n魔法防御:9\n\n名前:せん つよし\n職業:戦士\nレベル:2\nHP:18\nMP:0\n攻撃:15\n魔法威力:0\n防御:12\n魔法防御:6\n";

        assertEquals(actual, expected);
    }

    @Test
    public void training4_10_2() throws Exception {

        Exam4_10_2.execute();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "名前:ななし ひろ\n職業:勇者\nレベル:3\nHP:14\nMP:10\n攻撃:19\n魔法威力:10\n防御:10\n魔法防御:9\n";

        assertEquals(actual, expected);
    }
}
