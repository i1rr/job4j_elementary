package ru.job4j.array;

import org.junit.jupiter.api.Test;

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

    @Test
    void monoHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {'X', 'X', 'X'},
                {'X', 'X', 'X'}
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }

    @Test
    void monoHasNotMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {'X', 'X', 'X'},
                {'X', 'X', 'X'}
        };
        boolean result = MatrixCheck.monoVertical(input, 1);
        assertThat(result, is(false));
    }

    @Test
    void extractDiagonal() {
        char[][] input = {
                {'X', 'Z', 'H'},
                {'O', 'X', 'P'},
                {'A', '!', 'X'}
        };
        char[] expect = {'X', 'X', 'X'};
        char[] result = MatrixCheck.extractDiagonal(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }
}