package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double halfP = (a + b + c) / 2;
        double result = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
        return result;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("Площадь треугольника со сторонами 2, 2, 2 = " + rsl);
    }
}
