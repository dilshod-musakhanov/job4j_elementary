package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSum1To10then55() {
        int start = 1;
        int finish = 10;
        int expected = 55;
        int result = Counter.sum(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumByEvenNumbersFrom1to10Then30() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int result = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumByNotEvenNumbersFrom1To10Then25() {
        int start = 1;
        int finish = 10;
        int expected = 25;
        int result = Counter.sumByNotEven(start, finish);
        Assert.assertEquals(expected, result);
    }
}