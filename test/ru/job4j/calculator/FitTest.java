package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenmanWeight() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womenWeight() {
        short in = 170;
        double expected = 69;
        double out  = Fit.womenWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}