package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int result = Integer.MAX_VALUE;
        for (int i = start; i <= finish; i++) {
            if (result > array[i]) {
                result = array[i];
            }
        }
        return result;
    }
}
