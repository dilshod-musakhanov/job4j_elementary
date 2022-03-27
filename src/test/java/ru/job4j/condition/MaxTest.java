package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax7To5Then7() {
        int first = 7;
        int second = 5;
        int expected = 7;
        int result = Max.max(first, second);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSecondMax8To9Then9() {
        int first = 8;
        int second = 9;
        int expected = 9;
        int result = Max.max(first, second);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax7To5To8Then8() {
        int first = 7;
        int second = 5;
        int third = 8;
        int expected = 8;
        int result = Max.max(first, second, third);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax7To5To8To9Then9() {
        int first = 7;
        int second = 5;
        int third = 8;
        int forth = 9;
        int expected = 9;
        int result = Max.max(first, second, third, forth);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenEqual3to3Then3() {
        int first = 3;
        int second = 3;
        int expected = 3;
        int result = Max.max(first, second);
        Assert.assertEquals(expected, result);
    }
}