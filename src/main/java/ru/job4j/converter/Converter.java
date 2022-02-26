package ru.job4j.converter;

public class Converter {

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float dollarRubble = Converter.dollarToRuble(1);
        System.out.println("1 доллар = " + dollarRubble + " рублей.");
        float euroRuble = Converter.euroToRuble(1);
        System.out.println("1 евро = " + euroRuble + " рублей.");
    }
}
