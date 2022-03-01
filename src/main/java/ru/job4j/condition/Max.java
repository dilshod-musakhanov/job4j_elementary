package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int maxSecondNum(int first, int second) {
        int result = first < second ? second : first;
        return result;
    }

    public static int equalNum(int first, int second) {
        int result = first == second ? first : second;
        return result;
    }

    public static void main(String[] args) {
        int resMax = Max.max(7, 5);
        int resSecNum = Max.maxSecondNum(8, 9);
        int resEqualNum = Max.equalNum(3, 3);
        System.out.println(resMax);
        System.out.println(resSecNum);
        System.out.println(resEqualNum);

    }

}
