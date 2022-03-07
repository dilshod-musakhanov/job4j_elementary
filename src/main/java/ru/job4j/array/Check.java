package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (int el = 1; el < data.length; el++) {
            if (data[0] != data[el]) {
                return false;
            }
        }
        return true;
    }
}
