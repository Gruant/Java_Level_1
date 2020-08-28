package ru.grutsinanton.lesson1;

public class lesson1 {
    //Задание 2: создание и инициализация примитивных типов данных
    byte val1 = 100;
    short val2 = 20000;
    int val3 = 1500000;
    long val4 = 548549858;
    float val5 = 1.434f;
    double val6 = 544.343434343;
    char val7 = '!';
    boolean val8 = true;

    // Задание 1: создан класс main
    public static void main(String[] args){
        System.out.println("Задание 2: " + calculate(4, 5, 3,2));
        System.out.println("Задание 3: " + range(12,3));
        System.out.println("Задание 4: " + range(2,1));
        System.out.print("Задание 5: ");
        plusMinus(10);
        System.out.println("Задание 6: " + lookForMinus(-1));
        System.out.print("Задание 7: ");
        helloName("Ivan");
        System.out.print("Задание 8: " + leapYear(400));
    }

    /*
    Задание 3:
    Метод вычисляющий выражение a * (b + (c / d)) и
    возвращающий результат,где a, b, c, d – входные параметры этого метода;
    */
    public static float calculate(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    /*
    Задание 4:
    Метод, принимающий на вход два числа, и проверяющий что их
    сумма лежит в пределах от 10 до 20(включительно),
    если да – вернуть true, в противном случае – false;
     */

    public static boolean range(float a, float b){
        float sum = a + b;
        return sum >= 10f & sum <= 20f;
    }

    /*
    Задание 5:
    Метод, которому в качестве параметра передается целое число, метод должен напечатать
    в консоль положительное ли число передали, или отрицательное;
    Замечание: ноль считаем положительным числом.
     */
    public static void plusMinus(int val){
        if (val >=0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    /*
    Задание 6:
    Метод, которому в качестве параметра передается целое число,
    метод должен вернуть true, если число отрицательное;
     */
    public static boolean lookForMinus(int val){
        return val < 0;
    }

    /*
    Задание 7:
    Метод, которому в качестве параметра передается строка, обозначающая имя,
    метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
     */
    public static void helloName(String val){
        System.out.println("Привет, " + val);
    }

    /*
    Задание 8:
    Метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static String leapYear(int year){
        if (year % 4 != 0 || year % 100 == 0) {
            if (year % 400 == 0){
                return "Год високосный";
            }
            return "Год не високосный";
        }
        return "Год високосный";
    }
}

