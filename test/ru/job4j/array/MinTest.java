package ru.job4j.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.hamcrest.core.Is.is;

class MinTest {

    @Test
    void when96743is3() {
        int[] input = {9, 6, 7, 4, 3};
        int expect = 3;
        int rsl = Min.findMin(input);
        Assert.assertThat(rsl, is(expect));
    }

    @Test
    void when96743n12n1is3() {
        int[] input = {9, 6, 7, 4, 3, 12, 1};
        int expect = 1;
        int rsl = Min.findMin(input);
        Assert.assertThat(rsl, is(expect));
    }

    @Test
    void when96743n12n10n0is3() {
        int[] input = {9, 6, 7, 4, 3, 12, 10, 0};
        int expect = 0;
        int rsl = Min.findMin(input);
        Assert.assertThat(rsl, is(expect));
    }
}