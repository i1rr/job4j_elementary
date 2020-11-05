package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int one, int two, int three) {
        int temp = max(one, two);
        return max(temp, three);
    }

    public static int max(int one, int two, int three, int four) {
        int temp = max(one, two, three);
        return max(temp, four);
    }
}
