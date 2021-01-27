package com.company;
import java.util.Calendar;
import java.util.Scanner;
/*
   Напишите программу, в которой Пользователь вводит имя и год рождения,
в программа отображает сообщение содержащее имя пользователя и его
возраст.
        */
public class Task1_6 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Scanner input_user_information = new Scanner(System.in);

        System.out.println("Введите Ваше имя и Ваш год рождения:");
        String[] about_user = input_user_information.nextLine().split(" ");
        System.out.println("Имя пользователя: " + about_user[0] +
                "\nВозраст пользователя: " + getCorrectEndingsYears(calendar.get(Calendar.YEAR) - Integer.parseInt(about_user[1])));


    }

    private static String getCorrectEndingsYears(int year_user) {
        String year_correct = null;

        if (year_user % 10 > 4 || year_user == 0 ||
                (year_user >= 10 && year_user <= 20)) {
            year_correct = year_user + " лет.";
        } else {
            year_correct = year_user + " год.";
            if (year_user % 10 != 1) {
                year_correct = year_user + " года.";
            }
        }
        return year_correct;
    }
}
