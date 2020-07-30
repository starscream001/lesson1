package ru.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {
        byte a = -128;
        int a1 = 100;
        long a2 = 123456;

        float d1=11.1f;
        double d2 = 11.1d;

        char c = 1;
        boolean yes = true;
        boolean no = false;

        System.out.println("Второе задание");

    }
}



   /* Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – входные параметры этого метода;
   */
    private static float calculate(int a, int b, int c, int d) {
        int i = a * (b + (c / d));
        return i;
    }

    /* Написать метод, принимающий на вход два числа,
    и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    если да – вернуть true, в противном случае – false;
     */

    private static boolean Check2Numbers (int first , int second) {
        int sum = first + second;
        return sum <= 20 && sum >= 10;
    }

   /* Написать метод, которому в качестве параметра передается целое число,
   метод должен напечатать в консоль положительное ли число передали,
   или отрицательное; Замечание: ноль считаем положительным числом.
    */

    private static boolean good(int variable) {
        return variable >=0;
    }

    /* Написать метод, которому в качестве параметра передается целое число,
     метод должен вернуть true, если число отрицательное
     */
    private static boolean good1(int variable) {
        if (variable <= 0) return true;
        else return false;
    }

    /* Написать метод, которому в качестве параметра передается строка, обозначающая имя,
     метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
     */

    private static String Hello(String name) {
        System.out.println("Привет,  указанное имя");
        return "Привет, " + name + "!";
    }

    /* Написать метод, который определяет является ли год високосным,
     и выводит сообщение в консоль. Каждый 4-й год является високосным,
     кроме каждого 100-го, при этом каждый 400-й – високосный
     */

    private static boolean WhatYear (int year) {
        boolean b = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        return b;
    }


