package consallink.chapter2;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;

public class Training2_5_Test {
    private StandardOutputSnatcher sos;

    public Training2_5_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void practice1() throws Exception {

        Training2_5.practice1();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "11\n2\n12355\n5.0\n2\n2.0\n1.0\n";

        assertEquals(actual, expected);
    }
}
