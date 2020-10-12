package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int maxOfTwo = first > second ? first : second;
        return maxOfTwo > third ? maxOfTwo : third;
    }
}
