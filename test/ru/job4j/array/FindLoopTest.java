package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class FindLoopTest {

    @Test
    void whenArray5432expect0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    void whenArray5432expect2() {
        int[] input = {5, 4, 3, 2};
        int value = 3;
        int result = FindLoop.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    void whenArray5432expectNone() {
        int[] input = {5, 4, 3, 2};
        int value = 1;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    void whenArray54321from1to4exp4() {
        int[] input = {5, 4, 3, 2, 1};
        int value = 1;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    void whenArray54321from0to2exp1() {
        int[] input = {5, 4, 3, 2, 1};
        int value = 4;
        int start = 0;
        int finish = 2;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 1;
        assertThat(result, is(expect));
    }

    @Test
    void whenArray54321from0to4expNone() {
        int[] input = {5, 4, 3, 2, 1};
        int value = 6;
        int start = 0;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}