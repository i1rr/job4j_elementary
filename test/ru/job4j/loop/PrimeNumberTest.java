package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

class PrimeNumberTest {

    @Test
    void calcWhen5() {
        int count = PrimeNumber.calc(5);
        assertThat(count, is(3));
    }

    @Test
    void calcWhen11() {
        int count = PrimeNumber.calc(11);
        assertThat(count, is(5));
    }

    @Test
    void calcWhen2() {
        int count = PrimeNumber.calc(2);
        assertThat(count, is(1));
    }
}