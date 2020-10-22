package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void whenBound3Then014() {
        int[] rsl = Square.calculate(3);
        int[] expected = {0, 1, 4};
        assertThat(rsl, is(expected));
    }

    @Test
    void whenBound5Then0149n16() {
        int[] rsl = Square.calculate(5);
        int[] expected = {0, 1, 4, 9, 16};
        assertThat(rsl, is(expected));
    }
}