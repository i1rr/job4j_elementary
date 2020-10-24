package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinDiapasonTest {

    @Test
    void among1n4is3() {
        int[] array = {9, 8, 3, 4, 5, 6, 7};
        int start = 1;
        int finish = 4;
        int result = MinDiapason.findMin(array, start, finish);
        assertThat(result, is(3));
    }

    @Test
    void among4n6is5() {
        int[] array = {9, 8, 3, 4, 5, 6, 7};
        int start = 4;
        int finish = 6;
        int result = MinDiapason.findMin(array, start, finish);
        assertThat(result, is(5));
    }

    @Test
    void among0n6is3() {
        int[] array = {9, 8, 3, 4, 5, 6, 7};
        int start = 0;
        int finish = 6;
        int result = MinDiapason.findMin(array, start, finish);
        assertThat(result, is(3));
    }
}