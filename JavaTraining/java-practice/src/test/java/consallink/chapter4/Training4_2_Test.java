package consallink.chapter4;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class Training4_2_Test {
    private Training4_2 training4_2 = new Training4_2();

    @Test
    public void practice1() throws Exception {
        int expected = 1;
        int actual = training4_2.practice1();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice2() throws Exception {
        int expected = 4;
        int actual = training4_2.practice2();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice3() throws Exception {
        int expected = 1;
        int actual = training4_2.practice3();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice4() throws Exception {
        int expected = 3;
        int actual = training4_2.practice4();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice5() throws Exception {
        int expected = 4;
        int actual = training4_2.practice5();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice6() throws Exception {
        int expected = 3;
        int actual = training4_2.practice6();
        assertThat(actual, is(expected));
    }
}
