package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void whenDistance0020then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance2000then2() {
        int expected = 2;
        Point a = new Point(2, 0);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

        @Test
        public void whenDistance0002then2() {
            int expected = 2;
            Point a = new Point(0, 0);
            Point b = new Point(0, 2);
            double out = a.distance(b);
            Assert.assertEquals(expected, out, 0.01);
        }

}