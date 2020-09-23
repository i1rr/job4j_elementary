package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age > 20) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("Grow up and come back.");
        }
    }

    public static void main(String[] args) {
        Cinema.access(21);
        Cinema.access(16);
    }
}
