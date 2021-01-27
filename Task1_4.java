package com.company;

import java.util.Scanner;
/*
  Напишите программу, в которой пользователю предлагается ввести
название месяца и количество дней в этом месяце. Программа выводит
сообщение о том, что соответствующий месяц содержит указанное количество
дней.
        */

public class Task1_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите название месяца:");
        String month = in.nextLine();
        System.out.println("Количество дней в этом месяце:");
        String day = in.nextLine();
        System.out.printf("месяц %s содержит  %s день/ней",month,day);
        in.close();
    }
}
