package com.company;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
    /*
 Напишите программу, в которой Пользователь вводит сначала фамилию,
затем имя, затем отчество. После ввода программа выводит сообщение «Hallo
<ФАМИЛИЯ, ИМЯ, ОТЧЕСТВО>».
        */
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String family = in.nextLine();
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите отчество: ");
        String middlename = in.nextLine();
        System.out.printf(" Hallow %s %s %s",family,name,middlename);
        in.close();
    }
}
