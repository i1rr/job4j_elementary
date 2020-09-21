package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }
    public static void hello() {
        System.out.println("There is nothing to display");
    }
    public static void hello (String name, int age) {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
    public static void hello(int age) {
        System.out.println("My penis length is " + age + " mm.");
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello();

        ArgMethod.hello(name, age);

        ArgMethod.hello(age);

        ArgMethod.hello(name);
    }
}