package com.company;

import java.util.Scanner;
/*
Напишите программу, в которой Пользователь последовательно вводит
название текущего дня недели, название месяца и дату (номер дня в месяце).
       */
public class Task1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели:");
        String day = in.nextLine();
        System.out.println("Введите месяц:");
        String month = in.nextLine();
        System.out.println("Введите число месяца:");
        String day_number = in.nextLine();
        System.out.println(day + " " + day_number + " " + month);
        in.close();
    }
}
