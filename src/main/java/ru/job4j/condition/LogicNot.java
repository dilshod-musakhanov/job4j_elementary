package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }

    public static void main(String[] args) {
        boolean notEvenRes = LogicNot.notEven(11);
        boolean notPositiveRes = LogicNot.notPositive(-1);
        boolean notEvenAndPositiveRes = LogicNot.notEvenAndPositive(7);
        boolean evenOrNotPositive = LogicNot.evenOrNotPositive(-5);
        System.out.println(notEvenRes);
        System.out.println(notPositiveRes);
        System.out.println(notEvenAndPositiveRes);
        System.out.println(evenOrNotPositive);
    }
}
