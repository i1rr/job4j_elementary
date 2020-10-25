package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MatrixSumTest {

    @Test
    void whenSingle() {
        int[][] array = {
                {10}
        };
        int expect = 10;
        int result = MatrixSum.sum(array);
        assertThat(result, is(expect));
    }

    @Test
    void whenDouble() {
        int[][] array = {
                {10, 11},
                {2, 3}
        };
        int expect = 26;
        int result = MatrixSum.sum(array);
        assertThat(result, is(expect));
    }

    @Test
    void whenTriple() {
        int[][] array = {
                {10, 11, 12},
                {1, 2, 3},
                {4, 5, 6}
        };
        int expect = 54;
        int result = MatrixSum.sum(array);
        assertThat(result, is(expect));
    }
}