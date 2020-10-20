package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

class CheckPrimeNumberTest {

    @Test
    void checkIf5Prime() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    void checkIf4Prime() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    void checkIf1Prime() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }
}