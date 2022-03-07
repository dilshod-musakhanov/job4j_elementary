package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To4() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 2, 3, 4, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwapMid2ThenMinus2() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int midSource = 2;
        int midDest = input.length - 2;
        int[] result = SwitchArray.swapMid(input, midSource, midDest);
        int[] expected = {1, 2, 7, 4, 5, 6, 3, 8};
        Assert.assertArrayEquals(expected, result);
    }
}