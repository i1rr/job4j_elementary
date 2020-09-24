package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        assertThat(
                DummyBot.answer("Hi, bot."),
                is("Hello, smartass!")
        );
    }

    @Test
    public void whenByeBot() {
        assertThat(
                DummyBot.answer("Bye."),
                is("See you later!")
        );
    }

    @Test
    public void whenUnknownBot() {
        assertThat(
                DummyBot.answer("Сколько будет 2 + 2?"),
                is("I didn't understand it. Please ask something else.")
        );
    }

}