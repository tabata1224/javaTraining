package consallink.chapter2;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Training2_3_Test {

    @Test
    public void Practice1() throws Exception {

        final List<String> actual = new ArrayList<String>();
        PrintStream fakePrintStream = new PrintStream("aaa") {
            @Override
            public void println(String str) {
                actual.add(str);
            }
        };

        // Act
        System.setOut(fakePrintStream);
        Training2_3 training2_3 = new Training2_3();
        training2_3.practice1();

        // Assert
        List<String> expected = Arrays.asList("プログラミング言語の種類", "「Java」「C言語」「PHP」などがあります。");
        assertEquals(actual, expected);
    }
}
