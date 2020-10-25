package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class MatrixTest {

    @Test
    void when2x2() {
        int[][] input = Matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(input, is(expect));
    }

    @Test
    void when4x4() {
        int[][] input = Matrix.multiple(4);
        int[][] expect = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12},
                {4, 8, 12, 16}
        };
        assertThat(input, is(expect));
    }
}