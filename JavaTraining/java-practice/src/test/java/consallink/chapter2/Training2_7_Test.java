package consallink.chapter2;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;

public class Training2_7_Test {
    private StandardOutputSnatcher sos;

    public Training2_7_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void practice1() throws Exception {

        Training2_7.practice1();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "0\n18\n14\n6\n26\n59\n2\n10\n8\n4\n4\n12\n99\n7\n0\n1\n0\n10\n32\n0\n9\n2\n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice2() throws Exception {

        Training2_7.practice2();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "7\n8\n127\n-128\n5.199999809265137\n5.2\n5.2\n6.0\n0.0\n1.0\n1.75\n4.0\n-3.0\n-2\n9.0\n-3.0\n128\n7.0\n9\n5\n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice3() throws Exception {

        Training2_7.practice3();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "12\n24\n16\n16\n29\n24\n5\n1\n27\n19\n16\n30\n13\n22\n56\n10\n9\n16\n";

        assertEquals(actual, expected);
    }
}
