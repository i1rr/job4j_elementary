package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class MatrixCheckTest {

    @Test
    void monoHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {'X', 'X', 'Z'}
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }

    @Test
    void monoHasNotMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {'X', 'X', 'Z'}
        };
        boolean result = MatrixCheck.monoHorizontal(input, 2);
        assertThat(result, is(false));
    }
}