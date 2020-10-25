package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SkipNegativeTest {

    @Test
    void skip() {
        int[][] array = {
                {1, -1, 2},
                {2, -2, 2},
                {3, 4, -1}
        };
        int[][] expect = {
                {1, 0, 2},
                {2, 0, 2},
                {3, 4, 0}
        };
        int[][] result = SkipNegative.skip(array);
        assertThat(expect, is(result));
    }
}