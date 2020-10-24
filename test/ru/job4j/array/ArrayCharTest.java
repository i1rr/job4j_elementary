package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrayCharTest {

    @Test
    void whenPrefixTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e', 'l', 'l'};
        boolean rsl = ArrayChar.startsWith(word, pref);
        assertThat(rsl, is(true));
    }

    @Test
    void whenPrefixFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'P', 'e', 'l', 'l'};
        boolean rsl = ArrayChar.startsWith(word, pref);
        assertThat(rsl, is(false));
    }
}