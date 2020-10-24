package ru.job4j;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SortSelectedTest {

    @Test
    void sortWhen946721() {
        int[] array = {9, 4, 6, 7, 2, 1};
        int[] result = SortSelected.sort(array);
        int[] expect = {1, 2, 4, 6, 7, 9};
        assertThat(result, is(expect));
    }

    @Test
    void sortWhen96721() {
        int[] array = {9, 6, 7, 2, 1};
        int[] result = SortSelected.sort(array);
        int[] expect = {1, 2, 6, 7, 9};
        assertThat(result, is(expect));
    }

    @Test
    void sortWhen921() {
        int[] array = {9, 2, 1};
        int[] result = SortSelected.sort(array);
        int[] expect = {1, 2, 9};
        assertThat(result, is(expect));
    }
}