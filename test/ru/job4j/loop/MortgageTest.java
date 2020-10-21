package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

class MortgageTest {

    @Test
    void year1WhenCredit1000() {
        int year = Mortgage.year(1000, 1200, 1);
        assertThat(year, is(1));
    }

    @Test
    void year2WhenCredit100() {
        int year = Mortgage.year(100, 120, 50);
        assertThat(year, is(2));
    }

    @Test
    void year3WhenCredit10000() {
        int year = Mortgage.year(10000, 5000, 10);
        assertThat(year, is(3));
    }
}