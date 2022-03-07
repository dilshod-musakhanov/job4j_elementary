package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int el = 1; el < data.length; el++) {
            if (data[0] != data[el]) {
                return false;
            }
        }
        return result;
    }
}
