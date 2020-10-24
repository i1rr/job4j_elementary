package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] first, int[] second) {
        return first[first.length - 1] == second[second.length - 1];
    }
}