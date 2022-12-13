package consallink.chapter2;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Training2_3_Test {
    private Training2_3 training2_3 = new Training2_3();

    @Test
    public void practice1() throws Exception {

        final List<String> actual = new ArrayList<String>();
        PrintStream fakePrintStream = new PrintStream("aaa") {
            @Override
            public void println(String str) {
                actual.add(str);
            }
        };

        // Act
        System.setOut(fakePrintStream);
        training2_3.practice1();

        // Assert
        List<String> expected = Arrays.asList("プログラミング言語の種類", "「Java」「C言語」「PHP」などがあります。");
        assertEquals(actual, expected);
    }

    @Test
    public void practice2() throws Exception {

        final List<String> actual = new ArrayList<String>();
        PrintStream fakePrintStream = new PrintStream("aaa") {
            @Override
            public void println(String str) {
                actual.add(str);
            }
        };

        // Act
        System.setOut(fakePrintStream);
        training2_3.practice2();

        // Assert
        List<String> expected = Arrays.asList("研修の講師はとても優しくて、", "真面目ないい人です。");
        assertEquals(actual, expected);
    }
}
