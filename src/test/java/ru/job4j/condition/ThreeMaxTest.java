package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class ThreeMaxTest {

    @Test
    public void firstMax() {
        int first = 20;
        int second = 5;
        int third = 1;
        int expected = 20;
        int result = ThreeMax.max(first, second, third);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void secondMax() {
        int first = 10;
        int second = 50;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 50;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void thirdMax() {
        int first = 1;
        int second = 5;
        int third = 100;
        int result = ThreeMax.max(first, second, third);
        int expected = 100;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void allEq() {
        int first = 1;
        int second = 1;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

}