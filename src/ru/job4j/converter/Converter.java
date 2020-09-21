package ru.job4j.converter;

public class Converter {
    public static int rubToEur (int value) {
        int result = value/70;
        return result;
    }

    public static int rubToDlr (int value) {
        int result = value/60;
        return result;
    }

    public static void main (String[] args) {
        int euro = Converter.rubToEur(140);
        System.out.println("140RUB = " + euro + "EUR.");

        int dollar = Converter.rubToDlr(320);
        System.out.println("320RUB = $" + dollar);
    }
}
