package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

        for (int l = 0; l < left.length; l++) {
            rsl[l] = left[l];
        }

        for (int r = 0; r < right.length; r++) {
            rsl[left.length + r] = right[r];
        }
        int wtf = 1;

        while (wtf > 0) {
            --wtf;
        for (int rslt = 1; rslt < rsl.length; rslt++) {
            if (rsl[rslt - 1] > rsl[rslt]) {
                int temp = rsl[rslt - 1];
                rsl[rslt - 1] = rsl[rslt];
                rsl[rslt] = temp;
                wtf = 1;
            }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] test = {1, 3, 5, 7};
        int[] test2 = {0, 1, 4};
        int[] merge = merge(test, test2);
        for (int wee : merge) {
            System.out.println(wee);
        }
    }
}