package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp;
        int hz = 1;

        while (hz != 0) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    hz++;
                }
            }
            hz--;
        }

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}