package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subtractDivide(double first, double second) {
        return subtract(first, second) + divide(first, second);
    }

    public static double crazyCalc(double first, double second) {
        return sum(first, second) + multiply(first, second) + subtract(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(20, 10));
        System.out.println("Результат расчета равен: " + subtractDivide(20, 10));
        System.out.println("Результат расчета равен: " + crazyCalc(20, 10));
    }
}
