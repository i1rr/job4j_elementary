package ru.job4j.loop;

public class Mortgage {
    public static int year(int credit, int returns, double percent) {
        double thisYearCredit = credit;
        int amountOFYears = 0;
        while (thisYearCredit > 0) {
            thisYearCredit = (thisYearCredit + (thisYearCredit * (percent / 100)) - returns);
            amountOFYears++;
        }
        return amountOFYears;
    }
}
