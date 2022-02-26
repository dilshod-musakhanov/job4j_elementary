package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double res = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return res;
    }

    public static void main(String[] args) {
        double distance = Point.distance(5, 7, 7, 5);
        System.out.println(distance);
    }
}
