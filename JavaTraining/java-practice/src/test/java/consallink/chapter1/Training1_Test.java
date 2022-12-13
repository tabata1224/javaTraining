package consallink.chapter1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class Training1_Test {
    @Test
    public void Practice1() throws Exception {
        Training1 training1_1 = new Training1();
        int expected = 1;
        int actual = training1_1.practice1();
        assertThat(actual, is(expected));
    }
}
