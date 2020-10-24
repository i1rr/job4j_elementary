package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TurnTest {

    @Test
    void when12345() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expect = {5, 4, 3, 2, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }

    @Test
    void when123456() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expect = {6, 5, 4, 3, 2, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }

    @Test
    void when123745() {
        int[] input = {1, 2, 3, 7, 4, 5};
        int[] expect = {5, 4, 7, 3, 2, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }
}