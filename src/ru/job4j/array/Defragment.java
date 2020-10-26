package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int nullCheck = 0; nullCheck < array.length; nullCheck++) {
            if (array[nullCheck] == null) {
                for (int nextValue = nullCheck; nextValue < array.length; nextValue++) {
                    if (array[nextValue] != null) {
                        SwitchArray.swapString(array, nullCheck, nextValue);
                        break;
                        }
                    }
                }
            }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}