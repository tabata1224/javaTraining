package consallink.chapter2;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;

public class Training2_4_Test {
    Training2_4 training2_4 = new Training2_4();
    private StandardOutputSnatcher sos;

    public Training2_4_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void practice1() throws Exception {

        training2_4.practice1();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "形状：円\n直径：30\n円周率：3.1415927\n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice2() throws Exception {

        training2_4.practice2();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "変数binaryのデータ\n30\n変数octalのデータ\n15\n変数hexadecimalのデータ\n175\n";

        assertEquals(actual, expected);
    }
}