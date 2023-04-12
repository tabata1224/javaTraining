package consallink.chapter3;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class Training3_2_Test {
    private Training3_2 training3_2 = new Training3_2();

    @Test
    public void practice1() throws Exception {
        int expected = 2;
        int actual = training3_2.practice1();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice2() throws Exception {
        int expected = 4;
        int actual = training3_2.practice2();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice3() throws Exception {
        int expected = 1;
        int actual = training3_2.practice3();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice4() throws Exception {
        int expected = 4;
        int actual = training3_2.practice4();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice5() throws Exception {
        int expected = 3;
        int actual = training3_2.practice5();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice6() throws Exception {
        int expected = 2;
        int actual = training3_2.practice6();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice7() throws Exception {
        int expected = 1;
        int actual = training3_2.practice7();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice8() throws Exception {
        int expected = 4;
        int actual = training3_2.practice8();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice9() throws Exception {
        int expected = 4;
        int actual = training3_2.practice9();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice10() throws Exception {
        int expected = 1;
        int actual = training3_2.practice10();
        assertThat(actual, is(expected));
    }

    @Test
    public void practice11() throws Exception {
        int expected = 4;
        int actual = training3_2.practice11();
        assertThat(actual, is(expected));
    }
}
