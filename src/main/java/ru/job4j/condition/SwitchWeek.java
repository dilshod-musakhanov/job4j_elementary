package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int number) {
        String name;
        switch (number) {
            case 1 :
                name = "Понедельник";
                break;
            case 2 :
                name = "Вторник";
                break;
            case 3 :
                name = "Среда";
                break;
            case 4 :
                name = "Четверг";
                break;
            case 5 :
                name = "Пятница";
                break;
            case 6 :
                name = "Суббота";
                break;
            case 7 :
                name = "Воскресенье";
                break;
            default:
                name = "Ошибка";
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        String res = SwitchWeek.nameOfDay(1);
        String res2 = SwitchWeek.nameOfDay(8);
        System.out.println(res);
        System.out.println(res2);
    }
}
