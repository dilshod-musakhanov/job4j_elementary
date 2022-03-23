package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float in2 = 120;
        float expected2 = 2;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("120 rubles are 2 dollar. Test result : " + passed2);
        float dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollar.");
        float in3 = 1;
        float expected3 = 60;
        float out3 = Converter.dollarToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("1 доллар = 60 рублей. Test result : " + passed3);
        float dollarRubble = Converter.dollarToRuble(1);
        System.out.println("1 доллар = " + dollarRubble + " рублей.");
        float in4 = 1;
        float expected4 = 70;
        float out4 = Converter.euroToRuble(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("1 евро = 70 рублей. Test result : " + passed4);
        float euroRuble = Converter.euroToRuble(1);
        System.out.println("1 евро = " + euroRuble + " рублей.");
    }
}
