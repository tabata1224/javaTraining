package consallink.chapter2;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;

public class Training2_3_Test {
    private Training2_3 training2_3 = new Training2_3();
    private StandardOutputSnatcher sos;

    public Training2_3_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void practice1() throws Exception {

        training2_3.practice1();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "プログラミング言語の種類\n「Java」「C言語」「PHP」などがあります。\n";

        assertEquals(actual, expected);
    }

    @Test
    public void practice2() throws Exception {

        training2_3.practice2();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "研修の講師はとても優しくて、\n真面目ないい人です。\n";

        assertEquals(actual, expected);
    }
}
