package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] whatever = new int[5];
        for (int i = 0; i < whatever.length; i++) {
            whatever[i] = i * 2 + 3;
        }

        for (int we : whatever) {
            System.out.println(we);
        }
    }
}
