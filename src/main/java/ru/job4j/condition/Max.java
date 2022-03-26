package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int maxSecondNum(int first, int second) {
        return first < second ? second : first;
    }

    public static int equalNum(int first, int second) {
        return first == second ? first : second;
    }

    public static void main(String[] args) {
        int resMax = Max.max(7, 5);
        int resSecNum = Max.maxSecondNum(8, 9);
        int resEqualNum = Max.equalNum(3, 3);
        int resMaxMax = Max.max(7, 5, 8);
        System.out.println(resMax);
        System.out.println(resSecNum);
        System.out.println(resEqualNum);
        System.out.println(resMaxMax);
    }

}
