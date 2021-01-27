package com.company;
import java.util.Scanner;
public class Task1_2 {
    public static void main(String[] args) {
 /*
 Напишите программу, в которой Пользователь вводит имя и возраст.
Программа отображает сообщение об имени и возрасте пользователя.

        */
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя и возраст:");
        String name = in.nextLine();
        System.out.println(name);
        in.close();
    }

}
