package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EqLastTest {

    @Test
    void whenLastDigitsAreTrue() {
        int[] first = {1, 2, 3, 4, 5, 29};
        int[] second = {23, 29};
        assertThat(EqLast.check(first, second), is(true));
    }

    @Test
    void whenLastDigitsAreFalse() {
        int[] first = {1, 2, 3, 4, 5, 29};
        int[] second = {23, 29, 11};
        assertThat(EqLast.check(first, second), is(false));
    }
}