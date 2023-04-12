package consallink.chapter3;

import static org.junit.Assert.*;
import org.junit.Test;
import consallink.StandardOutputSnatcher;

public class Training3_8_Test {
    private StandardOutputSnatcher sos;

    public Training3_8_Test() {
        sos = StandardOutputSnatcher.getInstance();
        sos.snatch();
    }

    @Test
    public void practice1() throws Exception {

        Training3_8.practice1(5);
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "1 2 3 4 5 \n";

        assertEquals(actual, expected);

        Training3_8.practice1(10);
        sos.clearOutput();
        String actual2 = sos.getOutput();
        String expected2 = "1 2 3 4 5 6 7 8 9 10 \n";

        assertEquals(actual2, expected2);

        Training3_8.practice1(-1);
        sos.clearOutput();
        String actual3 = sos.getOutput();
        String expected3 = "引数には正の整数値を設定してください\n";

        assertEquals(actual3, expected3);
    }

    @Test
    public void practice2() throws Exception {

        Training3_8.practice2(7);
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "7は素数です\n";

        assertEquals(actual, expected);

        Training3_8.practice2(10);
        sos.clearOutput();
        String actual2 = sos.getOutput();
        String expected2 = "10は素数ではありません\n";

        assertEquals(actual2, expected2);

        Training3_8.practice2(-1);
        sos.clearOutput();
        String actual3 = sos.getOutput();
        String expected3 = "引数には3以上の数値を設定してください\n";

        assertEquals(actual3, expected3);
    }

    @Test
    public void practice3() throws Exception {

        Training3_8.practice3(12);
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "12\n";

        assertEquals(actual, expected);

        Training3_8.practice3(1234);
        sos.clearOutput();
        String actual2 = sos.getOutput();
        String expected2 = "1,234\n";

        assertEquals(actual2, expected2);

        Training3_8.practice3(12345);
        sos.clearOutput();
        String actual3 = sos.getOutput();
        String expected3 = "12,345\n";

        assertEquals(actual3, expected3);

        Training3_8.practice3(123456);
        sos.clearOutput();
        String actual4 = sos.getOutput();
        String expected4 = "123,456\n";

        assertEquals(actual4, expected4);

        Training3_8.practice3(123456789);
        sos.clearOutput();
        String actual5 = sos.getOutput();
        String expected5 = "123,456,789\n";

        assertEquals(actual5, expected5);
    }

    @Test
    public void practice4() throws Exception {

        Training3_8.practice4(4);
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "100\n";

        assertEquals(actual, expected);

        Training3_8.practice4(255);
        sos.clearOutput();
        String actual2 = sos.getOutput();
        String expected2 = "11111111\n";

        assertEquals(actual2, expected2);
    }

    @Test
    public void practice5() throws Exception {

        Training3_8.practice5(30, 10);
        sos.clearOutput();
        String actual = sos.getOutput();
        String expected = "ツル=5,カメ=5\n";

        assertEquals(actual, expected);

        Training3_8.practice5(30, 8);
        sos.clearOutput();
        String actual2 = sos.getOutput();
        String expected2 = "ツル=1,カメ=7\n";

        assertEquals(actual2, expected2);

        Training3_8.practice5(12, 3);
        sos.clearOutput();
        String actual3 = sos.getOutput();
        String expected3 = "";

        assertEquals(actual3, expected3);
    }

}
