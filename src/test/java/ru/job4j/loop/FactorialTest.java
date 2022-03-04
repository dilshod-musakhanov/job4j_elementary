package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialFor5ThenOneHundredTwenty() {
        int n = 5;
        int expected = 120;
        int res = Factorial.calc(n);
        Assert.assertEquals(expected, res);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int expected = 1;
        int res = Factorial.calc(n);
        Assert.assertEquals(expected, res);
    }
}