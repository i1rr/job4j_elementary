package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] array, int value) {
        int rsl = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}
