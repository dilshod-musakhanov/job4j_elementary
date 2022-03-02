package ru.job4j.condition;

public class Triangle {
    public static boolean existAbAc(double ab, double ac, double bc) {

        boolean trg = ab + ac > bc;
        return trg;
    }

    public static boolean existAcBc(double ab, double ac, double bc) {

        boolean trg = ac + bc > ab;
        return trg;
    }

    public static boolean existAbBc(double ab, double ac, double bc) {

        boolean trg = ab + bc > ac;
        return trg;
    }

    public static void main(String[] args) {
        System.out.println(existAbAc(8, 8, 8));
        System.out.println(existAcBc(7, 7, 7));
        System.out.println(existAbBc(6, 6, 6));
    }
}
