package consallink.chapter3;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class Training3_1_Test {
    private Training3_1 training3_1 = new Training3_1();

    @Test
    public void practice1() throws Exception {
        int expected = 4;
        int actual = training3_1.practice1();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice2() throws Exception {
        int expected = 3;
        int actual = training3_1.practice2();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice3() throws Exception {
        int expected = 4;
        int actual = training3_1.practice3();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice4() throws Exception {
        int expected = 1;
        int actual = training3_1.practice4();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice5() throws Exception {
        int expected = 3;
        int actual = training3_1.practice5();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice6() throws Exception {
        int expected = 3;
        int actual = training3_1.practice6();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice7() throws Exception {
        int expected = 2;
        int actual = training3_1.practice7();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice8() throws Exception {
        int expected = 2;
        int actual = training3_1.practice8();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice9() throws Exception {
        int expected = 3;
        int actual = training3_1.practice9();
        assertThat(actual, is(expected));
    }
}
