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

    @Test
    public void whenMax9among129() {
        int result = Max.max(1, 2, 9);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax7among177() {
        int result = Max.max(1, 7, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax6among1226() {
        int result = Max.max(1, 2, 2, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax19among11119() {
        int result = Max.max(1, 1, 1, 19);
        assertThat(result, is(19));
    }
}