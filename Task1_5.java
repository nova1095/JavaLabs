package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
/*
   Напишите программу, в которой по году рождения определяется возраст
пользователя.
        */
public class Task1_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату рождения:");
        System.out.println("день:");
        int day = in.nextInt();
        System.out.println("месяц:");
        int month = in.nextInt();
        System.out.println("год:");
        int year = in.nextInt();
        LocalDate birthDate = LocalDate.of(year, month, day), currentDate = LocalDate.now();
        System.out.println(Period.between(birthDate, currentDate).getYears());
        in.close();
    }
}
