package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double calcArea = (a + b + c) / 2;
        double rsl = Math.sqrt(calcArea * (calcArea - a) * (calcArea - b) * (calcArea - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rslArea = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rslArea);
    }
}
