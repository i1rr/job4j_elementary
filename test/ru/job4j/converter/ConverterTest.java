package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140rubThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubToEur(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180rubThen3Dlr() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubToDlr(in);
        Assert.assertEquals(expected, out);
    }
}