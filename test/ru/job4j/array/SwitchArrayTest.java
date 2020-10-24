package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SwitchArrayTest {

    @Test
    void when1to2() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 3, 2, 4};
        int[] rsl = SwitchArray.swap(input, 1, 2);
        assertThat(rsl, is(expect));
    }

    @Test
    void when3to8() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expect = {1, 2, 3, 9, 5, 6, 7, 8, 4 };
        int[] rsl = SwitchArray.swap(input, 3, 8);
        assertThat(rsl, is(expect));
    }

    @Test
    void when0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, 3);
        assertThat(rsl, is(expect));
    }
}