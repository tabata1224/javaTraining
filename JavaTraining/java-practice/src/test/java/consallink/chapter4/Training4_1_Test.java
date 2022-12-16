package consallink.chapter4;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class Training4_1_Test {
    private Training4_1 training4_1 = new Training4_1();

    @Test
    public void practice1() throws Exception {
        int expected = 3;
        int actual = training4_1.practice1();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice2() throws Exception {
        int expected = 1;
        int actual = training4_1.practice2();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice3() throws Exception {
        int expected = 3;
        int actual = training4_1.practice3();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice4() throws Exception {
        int expected = 4;
        int actual = training4_1.practice4();
        assertThat(actual, is(expected));
    }
}
