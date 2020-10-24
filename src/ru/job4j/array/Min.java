package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int result = array[0];
        for (int i : array) {
            if (result > i) {
                result = i;
            }
        }
        return result;
    }
}