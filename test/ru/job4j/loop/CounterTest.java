package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

class CounterTest {

    @Test
    void whenSumByEven1to10is30() {
        int rsl = Counter.sumByEven(0, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    void whenSumByEven1to1is0() {
        int rsl = Counter.sumByEven(1, 1);
        int expected = 0;
        assertThat(rsl, is(expected));
    }

    @Test
    void whenSumByEven100to200is7650() {
        int rsl = Counter.sumByEven(100, 200);
        int expected = 7650;
        assertThat(rsl, is(expected));
    }

}