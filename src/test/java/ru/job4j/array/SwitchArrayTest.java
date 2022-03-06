package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void swap() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 2, 3, 4, 1};
        Assert.assertArrayEquals(expected, result);
    }
}