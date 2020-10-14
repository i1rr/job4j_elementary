package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class FactorialTest {

    @Test
    void whenCalc0rsl1() {
        int rsl = Factorial.calc(0);
        int expectation = 1;
        assertThat(rsl, is(expectation));
    }

    @Test
    void whenCalc8rsl40320() {
        int rsl = Factorial.calc(8);
        int expectation = 40320;
        assertThat(rsl, is(expectation));
    }

    @Test
    void whenCalc12rsl479001600() {
        int rsl = Factorial.calc(12);
        int expectation = 479001600;
        assertThat(rsl, is(expectation));
    }

}