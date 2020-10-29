package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int lL = 0; //leftLength index
        int rL = 0; //rightLength index
        int[] leftRight = new int[left.length + right.length];

        for (int lrL = 0; lrL < leftRight.length; lrL++) { //lrL = leftRight Length
            if (lL > left.length - 1) {
                leftRight[lrL] = right[rL];
                rL++;

            } else if (rL > right.length - 1) {
                leftRight[lrL] = left[lL];
                lL++;

            } else if (left[lL] <= right[rL]) {
                leftRight[lrL] = left[lL];
                lL++;
            } else {
                leftRight[lrL] = right[rL];
                rL++;
            }
        }
        return leftRight;
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