package ru.job4j.calculator;

public class Fit {
    public static double manWeight (short value) {
        double result = (value - 100) * 1.15;
        return result;
    }

        public static double womenWeight (short value) {
            double result = (value - 110) * 1.15;
            return result;
        }

    public static void main (String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Идеальный вес для мужчины ростом " + height + "см, является " + man + "кг.");
    }
}
