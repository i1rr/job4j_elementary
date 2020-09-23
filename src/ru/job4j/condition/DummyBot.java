package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String rsl = "I didn't understand it. Please ask something else.";
        if ("Hi, bot.".equals(question)) {
            rsl = "Hello, smartass!";
        } else if ("Bye.".equals(question)) {
            rsl = "See you later!";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Hi, bot.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Un-Kun-Cha");
        System.out.println(rsl);
        rsl = DummyBot.answer("Bye.");
        System.out.println(rsl);
    }
}
