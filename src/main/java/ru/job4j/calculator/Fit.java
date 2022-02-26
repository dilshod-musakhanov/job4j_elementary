package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short manHeight = 180;
        double perfectWeightForMan = Fit.manWeight(manHeight);
        System.out.println(perfectWeightForMan + " kg is the ideal weight for man with height of " + manHeight + " sm");
        short womanHeight = 170;
        double perfectWeightForWoman = Fit.womanWeight(womanHeight);
        System.out.println(perfectWeightForWoman + " kg is the ideal weight for woman with height of " + womanHeight + " sm");
    }
}
