package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 8;
        double ac = 8;
        double bc = 8;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotExist() {
        double ab = 6;
        double ac = 6;
        double bc = 12;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}