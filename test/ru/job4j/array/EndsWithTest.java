package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

class EndsWithTest {

    @Test
    void whenPostIsTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'l', 'o'};
        assertThat(EndsWith.endsWith(word, post), is(true));
    }

    @Test
    void whenPostIsFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'e', 'l', 'o'};
        assertThat(EndsWith.endsWith(word, post), is(false));
    }
}