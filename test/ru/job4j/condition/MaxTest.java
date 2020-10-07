package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1to2then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5to2then5() {
        int result = Max.max(5, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax9to9then9() {
        int result = Max.max(9, 9);
        assertThat(result, is(9));
    }
}