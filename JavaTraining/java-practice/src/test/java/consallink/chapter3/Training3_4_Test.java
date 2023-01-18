package consallink.chapter3;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;

public class Training3_4_Test {
    private StandardOutputSnatcher sos;

    public Training3_4_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void practice1() throws Exception {

        Training3_4.practice1();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice2() throws Exception {

        Training3_4.practice2();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "合計は5050です\n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice3() throws Exception {

        Training3_4.practice3();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "2 4 8 16 32 64 \n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice4() throws Exception {

        Training3_4.practice4();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "100 50 25 12 6 3 1 \n";

        assertEquals(actual, expected);
    }
}
