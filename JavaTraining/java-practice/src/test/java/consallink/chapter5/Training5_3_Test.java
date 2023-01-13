package consallink.chapter5;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;

public class Training5_3_Test {
    private StandardOutputSnatcher sos;

    public Training5_3_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void training5_3_1() throws Exception {

        Training5_3_1.practice1();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "1 4 5 8 9 11 15 20 30\n";

        assertEquals(actual, expected);
    }

    @Test
    public void training5_3_2() throws Exception {

        Training5_3_1.practice2();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "6 11 8 13 10 15 12 1 14 3 0 5 2 7 4 9 6 11 8 13\n";

        assertEquals(actual, expected);
    }
}
