package consallink.chapter2;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class Training2_1_Test {
    @Test
    public void Practice1() throws Exception {
        Training2_1 training2_1 = new Training2_1();
        int expected = 4;
        int actual = training2_1.practice1();
        assertThat(actual, is(expected));
    }
}
