package consallink.chapter5;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;

public class Training5_2_Test {
    private StandardOutputSnatcher sos;

    public Training5_2_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void training5_2_1() throws Exception {

        Training5_2_1.practice1();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "配列内の最も小さい数値は「3」です\n配列内の最も大きい数値は「68」です\n";

        assertEquals(actual, expected);
    }

    @Test
    public void training5_2_2() throws Exception {

        Training5_2_1.practice2();
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected =
                "配列内の偶数は以下の数値です\n32\n82\n34\n16\n配列内の奇数は以下の数値です\n79\n35\n25\n77\n61\n39\n";

        assertEquals(actual, expected);
    }
}
