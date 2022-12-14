package consallink.chapter3;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;

public class Training3_3_Test {
    private StandardOutputSnatcher sos;

    public Training3_3_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void practice1() throws Exception {

        Training3_3.practice1();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "田中さんの国語の点数は85点です。\n田中さんの数学の点数は66点です。\n田中さんの平均点は75.5点です。\n合格です。\n";

        assertEquals(actual, expected);
    }
}
