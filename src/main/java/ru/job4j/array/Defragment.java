package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int order = 0;
        String word;
        for (int index = 0; index < array.length; index++) {
            if (array[index] != null) {
                word = array[index];
                array[index] = null;
                array[order] = word;
                order += 1;

            }
        }
        return array;
    }
}
