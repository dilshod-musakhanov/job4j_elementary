package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100;
        double debt = amount;
        while (debt > 0) {
            debt = debt + (debt * percent) - salary;
            year++;
        }
        return year;
    }
}
