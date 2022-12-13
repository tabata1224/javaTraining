package consallink.chapter2;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class Training2_2_Test {
    @Test
    public void Practice1() throws Exception {
        Training2_2 training2_2 = new Training2_2();
        int expected = 2;
        int actual = training2_2.practice1();
        assertThat(actual, is(expected));
    }
}
