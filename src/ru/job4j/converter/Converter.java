package ru.job4j.converter;

public class Converter {
    public static int rubToEur(int value) {
        return value / 70;
    }

    public static int rubToDlr(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubToEur(140);
        System.out.println("140RUB = " + euro + "EUR.");

        int dollar = Converter.rubToDlr(320);
        System.out.println("320RUB = $" + dollar);

        //Test
        System.out.println();
        System.out.println(">>>TEST<<<");

        int inEUR = 210;
        int expectedEUR = 3;
        int outEUR = Converter.rubToEur(inEUR);
        boolean passed = expectedEUR == outEUR;
        System.out.println("EUR test: " + passed);

        int inDLR = 3000;
        int expectedDLR = 50;
        int outDLR = Converter.rubToDlr(inDLR);
        passed = expectedDLR == outDLR;
        System.out.println("$Test: " + passed);
    }
}
