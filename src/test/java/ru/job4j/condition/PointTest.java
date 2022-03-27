package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when32to20then2dot23() {
        Point a = new Point(3, 2);
        Point b = new Point(2, 0);
        double expected = 2.23;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when32to23then1dot41() {
        Point a = new Point(3, 2);
        Point b = new Point(2, 3);
        double expected = 1.41;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when023to035then2dot23() {
        Point a = new Point(0, 2, 3);
        Point b = new Point(0, 3, 5);
        double expected = 2.23;
        double out = a.distance3(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}