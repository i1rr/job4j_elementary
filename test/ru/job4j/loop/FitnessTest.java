package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

class FitnessTest {

    @Test
    void whenI95N90Month0() {
        int month = Fitness.calc(95, 90);
        int expectation = 0;
        assertThat(month, is(expectation));
    }

    @Test
    void whenI90N95Month1() {
        int month = Fitness.calc(90, 95);
        int expectation = 1;
        assertThat(month, is(expectation));
    }

    @Test
    void whenI50N90Month2() {
        int month = Fitness.calc(50, 90);
        int expectation = 2;
        assertThat(month, is(expectation));
    }

    @Test
    void whenI90N90Month1() {
        int month = Fitness.calc(90, 90);
        int expectation = 1;
        assertThat(month, is(expectation));
    }

}