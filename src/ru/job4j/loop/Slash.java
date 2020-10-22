package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 1; row <= size; row++) {
            for (int cell = 1; cell <= size; cell++) {
                if (row == cell || cell == (size - row + 1)) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println();
        System.out.println("Draw by 5");
        draw(5);
    }
}