package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k+1));
        double l = h * k;
        double result = l * h;
        return result;
    }
    public static void main (String[] args) {
        double result1 = SqArea.square(6,2);
        System.out.println("Площадь равна " + result1);
    }
}