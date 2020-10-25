package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {
                {1},
                {1, 2},
                {1, 2, 3},
                {1, 2, 3, 4}
        };

        for (int row = 0; row < numbers.length; row++) {
            System.out.println(numbers[row].length);
        }
    }
}
