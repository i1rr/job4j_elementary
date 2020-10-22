package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Fedja";
        names[1] = "Petja";
        names[2] = "Stjopa";
        names[3] = "Volodja";

        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
        System.out.println();

        for (String name : names) {
            System.out.println(name);
        }
    }
}